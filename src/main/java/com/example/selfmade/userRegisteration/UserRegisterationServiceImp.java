package com.example.selfmade.userRegisteration;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegisterationServiceImp implements UserRegisterationService {

	@Autowired
	userRegisterationDAO userRegisterDAO;

	@Override
	public List<UserRegisterationModel> findUser() {

		List<UserRegisterationModel> userRegist = userRegisterDAO.getTestData();
		return userRegist;
	}

	public void joinMember(UserRegisterationModel userModel) {
		userRegisterDAO.joinMember(userModel);
	}

}
