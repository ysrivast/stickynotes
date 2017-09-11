package org.byn.stickynotes.services;

import org.byn.stickynotes.dao.UserDao;
import org.byn.stickynotes.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	//below code is just for json conversion practice 
	//User user = new User("ABC","abc@abc.com","abc","12345");
	public boolean validateUser(String uname, String pwd){
		 if(userDao.checkUserExistence(uname)){
		 if(pwd.equals(userDao.retrievePassword(uname))) return true;
		 }
		return false;
	}
	public String getJsonObject(String uname){
		if(userDao.checkUserExistence(uname)){
			System.out.println(userDao.convertIntoJson(userDao.retrieveUser(uname)));
			return userDao.convertIntoJson(userDao.retrieveUser(uname));
		}
		return "error 420 : user not exist";
	}
}
