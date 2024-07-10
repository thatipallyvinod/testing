package com.NetBanking.FsF.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.NetBanking.FsF.Model.Applicant;



@Repository
public interface UserRepository extends JpaRepository<Applicant, Long> {

}