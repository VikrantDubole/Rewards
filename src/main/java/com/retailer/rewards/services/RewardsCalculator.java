package com.retailer.rewards.services;

import com.retailer.rewards.response.Rewards;

public interface RewardsCalculator {
	
	public Rewards getTotalRewardsbyId(long CustomerId);

}
