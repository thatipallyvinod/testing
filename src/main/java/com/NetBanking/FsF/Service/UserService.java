package com.NetBanking.FsF.Service;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NetBanking.FsF.Model.Applicant;
import com.NetBanking.FsF.Repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public List<Applicant> getAllUsers() {
	
		return userRepository.findAll();
	}

	public Optional<Applicant> getUserById(Long id) {
		
		return userRepository.findById(id);
	}

	public Applicant createUser(Applicant user) {
		
		return userRepository.save(user);
	}

	public void deleteUser(Long id) {
		 userRepository.deleteById(id);
		
	}
	
	

}

