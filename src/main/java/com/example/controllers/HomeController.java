/**
 * 
 */
package com.example.controllers;

import java.util.ArrayList;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.ShareHub;
import com.example.services.HomeService;

/**
 * @author panka
 *
 */
@CrossOrigin("*")
@RequestMapping("/share")
@RestController
public class HomeController {
	
	@Autowired
	private HomeService homeService;
	
	static {
		System.out.println("***************************************in controller***************************************");
	}
	
	
	@GetMapping(value = "/getMutualFunds")
	@RolesAllowed({"sharehub-user", "sharehub-admin"})
	public ArrayList<ShareHub> getMutualFunds(){
		
		return homeService.getMutualFunds();
	}
	
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String Test() {
		
		return "success";
	}

}
