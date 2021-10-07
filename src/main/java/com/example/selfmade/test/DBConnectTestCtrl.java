package com.example.selfmade.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.selfmade.userRegisteration.UserRegisterationModel;
import com.example.selfmade.userRegisteration.userRegisterationDAO;

@RestController
@RequestMapping("/api")
public class DBConnectTestCtrl {

	@Autowired
    private userRegisterationDAO userDAO;

    @GetMapping("/hello")
    public List<UserRegisterationModel> HelloWorld() {
    	List<UserRegisterationModel> list = userDAO.getTestData();
        System.out.println(list.toString());
    	return list;
    }
}
