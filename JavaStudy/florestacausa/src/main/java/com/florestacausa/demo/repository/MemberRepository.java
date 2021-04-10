package com.florestacausa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.florestacausa.demo.bean.Member;
@Repository
public interface MemberRepository extends JpaRepository<Member,Integer>{

}
