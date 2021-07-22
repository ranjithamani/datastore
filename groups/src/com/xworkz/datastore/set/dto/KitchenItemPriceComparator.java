package com.xworkz.datastore.set.dto;

import java.util.Comparator;

public class KitchenItemPriceComparator implements Comparator<KitchenItemDTO>{

	@Override
	public int compare(KitchenItemDTO o1, KitchenItemDTO o2) {
		Double price1=o1.getPrice();
		Double priec2=o2.getPrice();
		return price1.compareTo(priec2);
	}
}
