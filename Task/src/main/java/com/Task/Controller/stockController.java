package com.Task.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.ui.Model;
import com.Task.Entity.stockInfo;
import com.Task.Repository.StockRepository;



@Controller

public class stockController {

	   @Autowired
	    private StockRepository stockRepository;
	   @GetMapping("/getStockInfo")
	    public String getAllStockInfo(Model model) {
	        // Fetch all stock info from the database
	        List<stockInfo> stockList = stockRepository.findAll();
	        
	        // Add the stock data to the model to be rendered in the view
	        model.addAttribute("stockList", stockList);
	        
	        // Return the Thymeleaf template name
	        return "stock";
	    }
	
}
	    
	   

