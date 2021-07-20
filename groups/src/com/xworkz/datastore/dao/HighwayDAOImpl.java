package com.xworkz.datastore.dao;

import java.util.*;

import com.xworkz.datastore.dto.HighwayDTO;
import com.xworkz.datastore.dto.constants.HighwayType;

public class HighwayDAOImpl implements HighwayDAO{
	private List<HighwayDTO> list = new ArrayList<>();

	@Override
	public boolean save(HighwayDTO dto) {
		boolean added = list.add(dto);
		System.out.println("dto:" + dto);
		System.out.println("dto was added:" + added);
		return added;
	}

	@Override
	public int tottalItems() {
		int total = list.size();
		System.out.println("tatal size:" + total);
		return total;
	}

	@Override
	public Collection<HighwayDTO> findAll() {

		return this.list;
	}

	@Override
	public Collection<Integer> findAllNumber() {
		Collection<Integer> collection = new ArrayList<>();
		Iterator<HighwayDTO> iterator = this.list.iterator();
		while (iterator.hasNext()) {
			HighwayDTO highway = iterator.next();
			collection.add(highway.getNumber());
			System.out.println("find all numbers:" + highway.getNumber());
		}

		return collection;
	}

	@Override
	public Collection<HighwayDTO> findByHighwayType(HighwayType type) {
		Collection<HighwayDTO> collection = new ArrayList<>();
		Iterator<HighwayDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			HighwayDTO high = itr.next();
			if (high.getType().equals(type)) {
				System.out.println("find by HighwayType:" + high);
				collection.add(high);

			}

		}
		return collection;
	}

	@Override
	public Collection<HighwayDTO> findByStateName(String sname) {
		Collection<HighwayDTO> collect = new ArrayList<>();
		Iterator<HighwayDTO> iter = this.list.iterator();
		while (iter.hasNext()) {
			HighwayDTO sta = iter.next();
			if (sta.getStateName().equals(sname)) {
				System.out.println("find by state name:" + sta);
				collect.add(sta);
			}
		}
		return collect;
	}

	@Override
	public Collection<HighwayDTO> findNumberByStateName(String sname) {
		Collection<HighwayDTO> collection = new ArrayList<>();
		Iterator<HighwayDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			HighwayDTO number = itr.next();
			if (number.getStateName().equals(sname)) {
				System.out.println("find number by state name:" + number);
				collection.add(number);

			}
		}
		return collection;
	}

	@Override
	public boolean exist(HighwayDTO dto) {
		boolean contain = this.list.contains(dto);
		System.out.println("found" + contain);
		return contain;
	}

	@Override
	public boolean isCondition(int number) {

		Iterator<HighwayDTO> itr = this.list.iterator();
		boolean condition=false;
		while (itr.hasNext()) {
			HighwayDTO no = itr.next();
			if (no.getNumber() == (number)) {
				System.out.println("conidtion:" + no.isCondition());
				condition = no.isCondition();
				//return true;
			}
		}
		return condition;
	}
	@Override
	public double findLengthByNumber(int no) {
		Iterator<HighwayDTO> iterator= this.list.iterator();
		double len=0;
		while(iterator.hasNext()) {
			HighwayDTO length=iterator.next();
			if(length.getNumber()==(no)) {
				System.out.println("find length:"+length);
				len=length.getLength();
			}
		}
		
		return len;
	}
	@Override
	public HighwayDTO findByMaxLength() {
	 HighwayDTO tem=null;
	 tem=Collections.max(this.list);
	 System.out.println("max length:"+tem);
		return tem;
	}
	@Override
	public HighwayDTO findByMinLength() {
		HighwayDTO min=null;
		min=Collections.min(this.list);
		System.out.println("min length:"+min);
		return min;
	}
}
