package com.example.jwt.controllers;

import javax.validation.Valid;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jwt.entity.Usuario;

@CrossOrigin(origins = "*")
@RestController
public class UserController {

	@RequestMapping("/users")
	@ResponseBody
	public String getUsers() {
		return "{\"users\":[{\"name\":\"Lucas\", \"country\":\"Brazil\"}," +
		           "{\"name\":\"Jackie\",\"country\":\"China\"}]}";
	}
	

	@RequestMapping("/home")
	public String hello() {
		return "Hello buddy!";
	}
	
	@RequestMapping("/login")
	public String loginPessoa(@RequestBody @Valid Usuario Pessoa) {
		return "logou";
		
	}
	
}
