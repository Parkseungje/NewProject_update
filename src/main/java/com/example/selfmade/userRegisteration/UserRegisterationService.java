package com.example.selfmade.userRegisteration;

import java.util.List;


public interface UserRegisterationService {

	public List<UserRegisterationModel> findUser();

	public void joinMember(UserRegisterationModel userModel);
}
