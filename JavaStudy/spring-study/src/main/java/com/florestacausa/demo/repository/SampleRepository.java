package com.florestacausa.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.florestacausa.demo.bean.Samplebean;
@Repository
public interface SampleRepository extends JpaRepository<Samplebean,Integer>{

}
