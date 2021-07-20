package com.xworkz.datastore.tester;

import java.util.Collection;

import com.xworkz.datastore.dao.HighwayDAO;
import com.xworkz.datastore.dao.HighwayDAOImpl;
import com.xworkz.datastore.dto.HighwayDTO;
import com.xworkz.datastore.dto.constants.HighwayType;

public class HighwayTester {

	public static void main(String[] args) {
		HighwayDTO dto1 = new HighwayDTO("NH04", 4, HighwayType.NATIONAL, "Karnataka", 1235d, true, "NHIDCL");
		HighwayDTO dto2 = new HighwayDTO("NH44", 44, HighwayType.NATIONAL, "MadyaPradesh", 3745d, true, "NHIDCL");
		HighwayDTO dto3 = new HighwayDTO("MDR686", 17, HighwayType.DISTRICTROADS, "Bangalore(Urban)", 930d, true,
				"DPWD");
		HighwayDTO dto4 = new HighwayDTO("SH14", 14, HighwayType.STATE, "Maharastra", 845d, false, "SPWD");

		HighwayDAO dao = new HighwayDAOImpl();
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);
		dao.save(dto4);
		
		int totalItems=dao.tottalItems();
		System.out.println("totalItems:"+totalItems);
		
		Collection<HighwayDTO> findall=dao.findAll();
		for (HighwayDTO highwayDTO : findall) {
			System.out.println("find All:"+highwayDTO);
			
		}
		Collection<Integer> findNumber=dao.findAllNumber();
		for (Integer integer : findNumber) {
			System.out.println("find number:"+integer);
			
		}
		Collection<HighwayDTO> highwayType= dao.findByHighwayType(HighwayType.STATE);
		for (HighwayDTO highwayDTO : highwayType) {
	        System.out.println("type"+highwayDTO);

		}
        
        Collection<HighwayDTO> state=dao.findByStateName("Karnataka");
        for (HighwayDTO highwayDTO : state) {
		System.out.println(" by state name:"+highwayDTO);
        }
        
        Collection<HighwayDTO> collect=dao.findNumberByStateName("MadyaPradesh");
        for (HighwayDTO highwayDTO : collect) {
		System.out.println("number by stateName:"+highwayDTO);
        }
        
        boolean contain=dao.exist(dto4);
        System.out.println("found:"+contain);
        
        boolean condition=dao.isCondition(44);
        System.out.println("condition highway:"+condition);
        
        double length=dao.findLengthByNumber(44);
        System.out.println("length:"+length);
        
        HighwayDTO max=dao.findByMaxLength();
        System.out.println("max length:"+ max);

		HighwayDTO min=dao.findByMinLength();
		System.out.println("min length:"+min);
        
        
	}
	

}
