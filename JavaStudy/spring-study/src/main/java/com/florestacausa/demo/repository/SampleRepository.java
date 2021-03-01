package com.florestacausa.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.florestacausa.demo.bean.Samplebean;
@Repository
public interface SampleRepository extends JpaRepository<Samplebean,Integer>{
	@Query("SELECT u FROM spstudy ORDER BY u.id")
    List<Samplebean> findAllOrderById();

}
