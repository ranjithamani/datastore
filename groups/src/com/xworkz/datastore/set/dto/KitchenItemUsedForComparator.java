package com.xworkz.datastore.set.dto;

import java.util.Comparator;

public class KitchenItemUsedForComparator implements Comparator<KitchenItemDTO> {
	@Override
	public int compare(KitchenItemDTO o1, KitchenItemDTO o2) {
		return o1.getUsedFor().compareTo(o2.getUsedFor());
	}
  
}
