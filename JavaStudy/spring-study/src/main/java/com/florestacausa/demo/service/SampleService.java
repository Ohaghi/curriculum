package com.florestacausa.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.florestacausa.demo.bean.Samplebean;
import com.florestacausa.demo.repository.SampleRepository;

@Service
public class SampleService {
	@Autowired
	private SampleRepository sampleRepository;

	public List<Samplebean> findAll(){
		return sampleRepository.findAll();
	}
	public Optional<Samplebean> findOne(Integer id) {
		return sampleRepository.findById(id);
	}
	public Samplebean save(Samplebean samplebean) {
		return sampleRepository.save(samplebean);
	}
    public void update(Samplebean samplebean) {
        sampleRepository.save(samplebean);
    }
    public void delete(Integer id) {
    	sampleRepository.deleteById(id);
    }
}
