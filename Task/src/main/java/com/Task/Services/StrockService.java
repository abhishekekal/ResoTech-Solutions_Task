package com.Task.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Task.Entity.stockInfo;
import com.Task.Repository.StockRepository;

@Service
public class StrockService {

	@Autowired
	private StockRepository stockRepository;
	 public List<stockInfo> getAllUsers() {
	        return stockRepository.findAll();
	    }

	 
	   

}
