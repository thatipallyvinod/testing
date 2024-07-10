package com.NetBanking.FsF.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.NetBanking.FsF.Model.Account;


@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}
