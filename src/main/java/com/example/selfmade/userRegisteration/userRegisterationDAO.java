package com.example.selfmade.userRegisteration;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface userRegisterationDAO {

	List<UserRegisterationModel> getTestData();

	void joinMember(UserRegisterationModel userModel);
}
