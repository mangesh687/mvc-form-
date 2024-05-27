//package com.registrion.page.castomuserservice;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.registrion.page.entity.UserFormEntity;
//import com.registrion.page.repository.CastomRepo;
//@Service
//public class Usersservicess implements UserDetailsService {
//
//	@Autowired
//	private CastomRepo castomRepo;
//	
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		
//		
//	UserFormEntity usersss=	castomRepo.findByEmail(username);
//		return usersss;
//	}
//
//}
