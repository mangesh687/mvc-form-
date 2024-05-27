package com.registrion.page.service;

import com.registrion.page.entity.UserFormEntity;

public interface UserService {
UserFormEntity cretedd(UserFormEntity userFormEntity);
UserFormEntity check(String email, String password);
}
