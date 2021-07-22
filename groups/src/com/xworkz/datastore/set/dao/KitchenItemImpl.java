package com.xworkz.datastore.set.dao;

import java.util.*;

import com.xworkz.datastore.set.dto.KitchenItemDTO;
import com.xworkz.datastore.set.dto.KitchenItemNameComparator;
import com.xworkz.datastore.set.dto.KitchenItemPriceComparator;
import com.xworkz.datastore.set.dto.KitchenItemUsedForComparator;

public class KitchenItemImpl implements KitchenItemDAO {

	public Set<KitchenItemDTO> set = new HashSet<KitchenItemDTO>();

	@Override
	public boolean saveUnique(KitchenItemDTO dto) {
		boolean added = set.add(dto);
		System.out.println(dto);
		return added;
	}

	@Override
	public Collection<KitchenItemDTO> findAllSortByUsedFor() {
		List<KitchenItemDTO> list = new ArrayList<KitchenItemDTO>(this.set);
		KitchenItemUsedForComparator comp = new KitchenItemUsedForComparator();

		Collections.sort(list, comp);
		return list;
	}

	@Override
	public Collection<KitchenItemDTO> findAllSortUsedForDesc() {
		List<KitchenItemDTO> list = new ArrayList<KitchenItemDTO>(this.set);
		KitchenItemUsedForComparator comp = new KitchenItemUsedForComparator();
		Collections.sort(list,comp.reversed());
		return list;
	}
	@Override
	public Collection<KitchenItemDTO> findAllSortByName() {
		List<KitchenItemDTO> list = new ArrayList<KitchenItemDTO>(this.set);
		KitchenItemNameComparator comp = new KitchenItemNameComparator();
		Collections.sort(list,comp);
		return list;
	}
	@Override
	public Collection<KitchenItemDTO> findAllSortByPriceDesc() {
		List<KitchenItemDTO> list = new ArrayList<KitchenItemDTO>(this.set);
		KitchenItemPriceComparator comp = new KitchenItemPriceComparator();
		Collections.sort(list,comp.reversed());
		return list;
	}

}
