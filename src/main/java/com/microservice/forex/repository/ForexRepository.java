package com.microservice.forex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.forex.entity.ForexEntity;

public interface ForexRepository extends JpaRepository<ForexEntity, Long>{

	ForexEntity findByFromAndTo(String from, String to);

}
