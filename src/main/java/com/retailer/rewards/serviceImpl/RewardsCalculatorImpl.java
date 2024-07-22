package com.retailer.rewards.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.retailer.rewards.repository.CustomerRepository;
import com.retailer.rewards.repository.TransationRepository;
import com.retailer.rewards.response.Rewards;
import com.retailer.rewards.services.RewardsCalculator;

public class RewardsCalculatorImpl implements RewardsCalculator {

	
	@Autowired
	CustomerRepository customerRepo;
	
	@Autowired
	TransationRepository transactionRepo;
	
	@Override
	public Rewards getTotalRewardsbyId(long CustomerId) {
		
		return null;
	}

}
