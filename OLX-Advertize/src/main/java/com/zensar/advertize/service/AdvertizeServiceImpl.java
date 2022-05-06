package com.zensar.advertize.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.advertize.entity.Categories;
import com.zensar.advertize.entity.Status;
import com.zensar.advertize.repository.AdvetiseRepository;
import com.zensar.advertize.repository.StatusRepository;

@Service
public class AdvertizeServiceImpl implements AdvertizeService {

	@Autowired
	AdvetiseRepository advetiseRepository;
	@Autowired
	StatusRepository statusRepository;

	// HashMap<String, List<Categories>> map1 = new HashMap<>();
	/*
	 * List<Categories>>(); static List<Categories> cat = new
	 * ArrayList<Categories>();
	 * 
	 * static { cat.add(new Categories(1, "Furniture")); cat.add(new Categories(2,
	 * "cars")); cat.add(new Categories(3, "Mobiles")); cat.add(new Categories(4,
	 * "Real Estate")); cat.add(new Categories(5, "Sports")); }
	 */
	HashMap<String, List<Categories>> map1 = new HashMap<>();

	@Override
	public HashMap<String, List<Categories>> returnAllCategories() {
		List<Categories> data = advetiseRepository.findAll();
		map1.put("Categories", data);
		return map1;
		// map1.put("Categories", cat);
		// return map1;
	}

	/*
	 * static List<Status> status = new ArrayList<Status>();
	 * 
	 * static { status.add(new Status(1, "Open")); status.add(new Status(2,
	 * "Closed"));
	 * 
	 * }
	 */

	HashMap<String, List<Status>> map2 = new HashMap<>();
	@Override
	public HashMap<String, List<Status>> returnAllStatus() {
		List<Status> data1 = statusRepository.findAll();
		map2.put("statusList", data1);
		return map2;
		// map2.put("StatusList", status);
		// return map2;
	}

}
