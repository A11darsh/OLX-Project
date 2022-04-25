package com.zensar.masterdata.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.zensar.masterdata.entity.MasterData;
@Service
public interface MasterDataService {

	public List<MasterData> postNewAdvertise(MasterData masterData, String token);

	public MasterData updateAdvertise(int id, MasterData masterData1, String token);

	public List<MasterData> Get(String token);

	public MasterData getSpecificAdvertise(int id, String token);

	public boolean deleteSpecificAdvertise(int id, String token);

	public List<MasterData> searchAdvertisementsByCriteria(long filtercriteria, String category, String toDate,
			String fromDate);

	public List<MasterData> searchAdvertisementsByText(long filtercriteria, String category, String toDate,
			String fromDate);

	public MasterData ReturnAdvertiseDetails(int postId, String token);

}
