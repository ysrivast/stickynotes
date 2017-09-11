package org.byn.stickynotes.controllers;

import org.byn.stickynotes.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class JsonController {
	@Autowired
	UserService userService;
	@RequestMapping(value="/{name}", method=RequestMethod.GET)
	public String getName(@PathVariable String name){
		String result =userService.getJsonObject(name);
		return result;
	}

}
