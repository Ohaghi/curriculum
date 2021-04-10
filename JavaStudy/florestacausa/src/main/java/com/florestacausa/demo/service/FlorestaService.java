package com.florestacausa.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.florestacausa.demo.bean.Member;
import com.florestacausa.demo.repository.MemberRepository;

@Service
public class FlorestaService {
	@Autowired
	MemberRepository memberRepository;

	public List<Member> findAll(){
		return memberRepository.findAll();
	}

	public Optional<Member> findOne(Integer roomno) {
		return memberRepository.findById(roomno);
	}

	public Member save(Member member) {
		return memberRepository.save(member);
	}
	public void update(Member member) {
		memberRepository.save(member);
	}
	public void delete(Member member) {
		memberRepository.delete(member);
	}
}
