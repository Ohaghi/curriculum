package com.florestacausa.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.florestacausa.demo.bean.Samplebean;
import com.florestacausa.demo.repository.SampleRepository;

@Service
@Transactional
public class SampleService {
	@Autowired
	SampleRepository sampleRepository;

	public List<Samplebean> findAll(){
		return sampleRepository.findAll();
	}
	public void insert(Samplebean samplebean) {
        sampleRepository.save(samplebean);
    }

    public void update(Samplebean samplebean) {
        sampleRepository.save(samplebean);
    }

    public void delete(Integer id) {
        sampleRepository.deleteById(id);
    }

    public Optional<Samplebean> selectById(Integer id) {
        return sampleRepository.findById(id);
    }
}
