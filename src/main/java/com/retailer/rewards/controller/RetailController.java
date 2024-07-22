package com.retailer.rewards.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retailer.rewards.entity.Customer;
import com.retailer.rewards.repository.CustomerRepository;
import com.retailer.rewards.response.Rewards;
import com.retailer.rewards.services.RewardsCalculator;

@RestController
@RequestMapping("/retail/rewards")
public class RetailController {

	@Autowired
	RewardsCalculator rewardsCalculator;
	
	@Autowired
	CustomerRepository customerRepo;
	
	@GetMapping(value="/user/{customerId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity retailRewardsbyCustomerId(@PathVariable("customerId") long cId) {
		
		Customer cust = this.customerRepo.findCustomerById(cId);
		if(cust==null) {
			//throw Ill
		}
		Rewards rew = this.rewardsCalculator.getTotalRewardsbyId(cId);
		
		return new ResponseEntity<>(rew,HttpStatus.OK);
	}

}
