package com.nojoum.al.malaeb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nojoum.al.malaeb.entities.Member;

public interface IMember extends JpaRepository<Member, Long> {

}
