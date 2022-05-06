package com.zensar.advertize.service;

import java.util.HashMap;
import java.util.List;

import com.zensar.advertize.entity.Categories;
import com.zensar.advertize.entity.Status;

public interface AdvertizeService {

	public HashMap<String, List<Categories>> returnAllCategories();
	
	public HashMap<String, List<Status>> returnAllStatus();
}
