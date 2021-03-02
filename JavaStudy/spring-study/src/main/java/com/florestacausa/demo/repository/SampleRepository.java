package com.florestacausa.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.florestacausa.demo.bean.Samplebean;
@Repository
public interface SampleRepository extends JpaRepository<Samplebean,Integer>{
    List<Samplebean> findAllOrderById();
}
