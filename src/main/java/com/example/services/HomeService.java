/**
 * 
 */
package com.example.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.ShareHub;
import com.example.dao.HomeDao;

/**
 * @author panka
 *
 */
@Service
public class HomeService {
	
	@Autowired
	private HomeDao homeDao;
	
	public ArrayList<ShareHub> getMutualFunds(){
		
		return homeDao.getMutualFunds();
	}

}
