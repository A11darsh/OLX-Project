package com.zensar.masterdata.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.zensar.masterdata.entity.MasterData;
@Service
public class MasterDataServiceimpl implements MasterDataService {

	static List<MasterData> data = new ArrayList<MasterData>();
	static {
		data.add(new MasterData(1, "laptop sale", 54000, "Electronic goods", "intel core 3 Sony Vaio", "anand", 2020,
				2022, "OPEN"));

	}

	@Override
	public List<MasterData> postNewAdvertise(MasterData masterData, String token) {
		if (token.equalsIgnoreCase("am222")) {
			return data;

		} else

			return null;
	}

	@Override
	public MasterData updateAdvertise(int id, MasterData masterData1, String token) {
		if (token.equals("am222")) {
			System.out.println("hello");
			Optional<MasterData> findAny = data.stream().filter(MasterData -> MasterData.getId() == id).findAny();

			if (findAny.isPresent()) {
				MasterData obj = findAny.get();
				obj.setTitle(masterData1.getTitle());
				obj.setPrice(masterData1.getPrice());
				obj.setId(masterData1.getId());
				obj.setDescription(masterData1.getDescription());
				return obj;
			} else {
				return findAny.orElseGet(() -> new MasterData());
			}
		} else
			return null;
	}

	static {
		data.add(new MasterData(2, "Sofa available for sale", 30000, "Furniture",
				"Sofa 5 years old available for Sale in Pune", "anand", 2020, 2022, "OPEN"));
	}

	@Override
	public List<MasterData> Get(String token) {
		if (token.equals("am222")) {
			return data;
		} else {
			return null;
		}
	}

	@Override
	public MasterData getSpecificAdvertise(int id, String token) {
		MasterData md = new MasterData();
		if (token.equals("am222")) {
			for (MasterData Data : data) {
				if (Data.getId() == id) {
					return Data;
				}
			}
		}
		return null;
	}

	@Override
	public boolean deleteSpecificAdvertise(int id, String token) {
		if (token.equals("am222")) {
			Optional<MasterData> findAny = data.stream().filter(MasterData -> MasterData.getId() == id).findAny();

			if (findAny.isPresent()) {
				MasterData MasterData = findAny.get();
				data.remove(MasterData);
				return true;
			} else {
				return false;
			}
		} else
			return false;
	}

	@Override
	public List<MasterData> searchAdvertisementsByCriteria(long filtercriteria, String category, String toDate,
			String fromDate) {
		return data;
	}

	@Override
	public List<MasterData> searchAdvertisementsByText(long filtercriteria, String category, String toDate,
			String fromDate) {
		return data;
	}

	@Override
	public MasterData ReturnAdvertiseDetails(int postId, String token) {
		if (token.equals("am222")) {
			for (MasterData Data : data) {
				if (Data.getId() == postId) {
					return Data;
				}
			}
		}
		return null;
	}

}
