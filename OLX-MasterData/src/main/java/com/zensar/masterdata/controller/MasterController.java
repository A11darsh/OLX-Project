package com.zensar.masterdata.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.masterdata.entity.MasterData;
import com.zensar.masterdata.service.MasterDataService;

@RestController
@RequestMapping(produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE }, consumes = {
		MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
public class MasterController {
	@Autowired
	private MasterDataService masterDataService;

	@PostMapping(value = "/advertise")
	public List<MasterData> postNewAdvertise(@RequestBody MasterData masterData,
			@RequestHeader("auth-token") String token) {
		return masterDataService.postNewAdvertise(masterData, token);
	}

	@PutMapping(value = "/advertise/{id}")
	public MasterData updateAdvertise(@PathVariable int id, @RequestBody MasterData masterData1,
			@RequestHeader("auth-token") String token) {
		return masterDataService.updateAdvertise(id, masterData1, token);
	}

	@GetMapping(value = "/user/advertise")
	public List<MasterData> Get(@RequestHeader("auth-token") String token) {
		return masterDataService.Get(token);
	}

	@GetMapping(value = "/user/advertise/{id}")
	public MasterData getSpecificAdvertise(@PathVariable int id, @RequestHeader("auth-token") String token) {
		return masterDataService.getSpecificAdvertise(id, token);
	}

	@DeleteMapping("/user/advertise/{id}")
	public boolean deleteSpecificAdvertise(@PathVariable int id, @RequestHeader("auth-token") String token) {
		return masterDataService.deleteSpecificAdvertise(id, token);
	}

	@GetMapping(value = "/advertise/search/{filtercriteria}")
	public List<MasterData> searchAdvertisementsByCriteria(@PathVariable long filtercriteria, String category,
			String toDate, String fromDate) {
		return masterDataService.searchAdvertisementsByCriteria(filtercriteria, category, toDate, fromDate);
	}

	@GetMapping(value = "/advertise/search")
	public List<MasterData> searchAdvertisementsByText(@PathVariable long filtercriteria, String category,
			String toDate, String fromDate) {
		return masterDataService.searchAdvertisementsByText(filtercriteria, category, toDate, fromDate);
	}

	@GetMapping(value = "/advertise/{postId}")
	public MasterData ReturnAdvertiseDetails(@PathVariable int postId, @RequestHeader("auth-token") String token) {
		return masterDataService.ReturnAdvertiseDetails(postId, token);
	}
}
