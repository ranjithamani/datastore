package com.xworkz.datastore.tester;

import java.util.Collection;
import java.util.Collections;

import com.xworkz.datastore.set.dao.KitchenItemDAO;
import com.xworkz.datastore.set.dao.KitchenItemImpl;
import com.xworkz.datastore.set.dto.KitchenItemDTO;

public class KitchenItemTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KitchenItemDTO dto1 = new KitchenItemDTO("Pan", 2500d, "Frying", "teflon");
		KitchenItemDTO dto2 = new KitchenItemDTO("Chopping board", 500d, "Chopping", "wood");
		KitchenItemDTO dto3 = new KitchenItemDTO("Tongs", 200d, "Holding", "Steel");
		KitchenItemDTO dto4 = new KitchenItemDTO("Knife", 250d, "Cut", "stainless steel");

		KitchenItemDAO dao = new KitchenItemImpl();
		dao.saveUnique(dto4);
		dao.saveUnique(dto3);
		dao.saveUnique(dto2);
		dao.saveUnique(dto1);

		Collection<KitchenItemDTO> find = dao.findAllSortByUsedFor();
		for (KitchenItemDTO kitchenItemDTO : find) {
			System.out.println("find:" + kitchenItemDTO);
		}

		Collection<KitchenItemDTO> desc=dao.findAllSortUsedForDesc();
		for (KitchenItemDTO kitchenItemDTO : desc) {
			System.out.println(kitchenItemDTO);
		}
		Collection<KitchenItemDTO> name=dao.findAllSortByName();
		for (KitchenItemDTO kitchenItemDTO : name) {
			System.out.println(kitchenItemDTO);
		}
		Collection<KitchenItemDTO> price=dao.findAllSortByPriceDesc();
		for (KitchenItemDTO kitchenItemDTO : price) {
			System.out.println(kitchenItemDTO);
		}
	}

}
