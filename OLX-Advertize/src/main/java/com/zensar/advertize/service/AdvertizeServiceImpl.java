package com.zensar.advertize.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.zensar.advertize.entity.Categories;
import com.zensar.advertize.entity.Status;

@Service
public class AdvertizeServiceImpl implements AdvertizeService {

	HashMap<String, List<Categories>> map1 = new HashMap<String, List<Categories>>();
	static List<Categories> cat = new ArrayList<Categories>();

	static {
		cat.add(new Categories(1, "Furniture"));
		cat.add(new Categories(2, "cars"));
		cat.add(new Categories(3, "Mobiles"));
		cat.add(new Categories(4, "Real Estate"));
		cat.add(new Categories(5, "Sports"));
	}

	@Override
	public HashMap<String, List<Categories>> returnAllCategories() {
		map1.put("Categories", cat);
		return map1;
	}

	HashMap<String, List<Status>> map2 = new HashMap<String, List<Status>>();
	static List<Status> status = new ArrayList<Status>();

	static {
		status.add(new Status(1, "Open"));
		status.add(new Status(2, "Closed"));

	}

	@Override
	public HashMap<String, List<Status>> returnAllStatus() {
		map2.put("StatusList", status);
		return map2;
	}

}
