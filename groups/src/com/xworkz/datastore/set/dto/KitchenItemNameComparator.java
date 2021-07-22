package com.xworkz.datastore.set.dto;

import java.util.Comparator;

public class KitchenItemNameComparator implements Comparator<KitchenItemDTO>{

	@Override
	public int compare(KitchenItemDTO o1, KitchenItemDTO o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
}
