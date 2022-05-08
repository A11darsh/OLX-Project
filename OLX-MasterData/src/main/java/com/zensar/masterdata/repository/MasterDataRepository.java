package com.zensar.masterdata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.zensar.masterdata.entity.MasterData;


@Repository
public interface MasterDataRepository extends JpaRepository<MasterData, Integer> {

	@Query(value = "select * from master where category=:category", nativeQuery = true)
	List<MasterData> asd(@Param("category") String category);

	
	
	List<MasterData> searchByText(String searchText);

	List<MasterData> searchByFilterCriteria(String searchText, String category);
	
}
