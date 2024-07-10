package com.NetBanking.FsF.Service;

import java.util.List;


import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NetBanking.FsF.Model.Account;
import com.NetBanking.FsF.Repository.AccountRepository;




@Service
public class AccountService {
	
	@Autowired
	private AccountRepository accountRepository;

	public List<Account> getAllAccounts() {
		return accountRepository.findAll() ;
	}

	public Optional<Account> getAccountById(Long id) {
		return accountRepository.findById(id);
	}

	public Account createAccount(Account account) {
		return accountRepository.save(account);
	}

	public void deleteAccount(Long id) {
        accountRepository.deleteById(id);

	}

	  
}

