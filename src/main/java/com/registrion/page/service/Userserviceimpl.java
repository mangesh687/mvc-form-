package com.registrion.page.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registrion.page.entity.UserFormEntity;
import com.registrion.page.repository.Userrepo;
@Service
public class Userserviceimpl implements UserService {
	
	@Autowired 
	private Userrepo userrepo;

	@Override
	public UserFormEntity cretedd(UserFormEntity userFormEntity) {
		// TODO Auto-generated method stub
		return userrepo.save(userFormEntity) ;
		
	}

	@Override
	public UserFormEntity check(String email, String password) {
		// TODO Auto-generated method stub
		UserFormEntity user =userrepo.findByEmailAndPassword(email, password);
		return user;
	}

}
