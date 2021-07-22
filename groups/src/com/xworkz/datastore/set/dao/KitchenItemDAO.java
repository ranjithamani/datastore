package com.xworkz.datastore.set.dao;

import java.util.Collection;
import com.xworkz.datastore.set.dto.KitchenItemDTO;

import com.xworkz.datastore.set.dto.KitchenItemDTO;

public interface KitchenItemDAO {

	boolean saveUnique(KitchenItemDTO dto);

	Collection<KitchenItemDTO> findAllSortByUsedFor();
	Collection<KitchenItemDTO> findAllSortUsedForDesc();
	Collection<KitchenItemDTO> findAllSortByName();
	Collection<KitchenItemDTO> findAllSortByPriceDesc();
}
