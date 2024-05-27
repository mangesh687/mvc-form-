package com.registrion.page.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registrion.page.entity.UserFormEntity;
@Repository
public interface Userrepo extends JpaRepository<UserFormEntity, Integer> {
	 UserFormEntity findByEmailAndPassword(String email, String password);
}
