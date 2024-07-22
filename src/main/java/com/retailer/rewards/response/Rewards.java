package com.retailer.rewards.response;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Rewards {
	
	private long customerId;
//	private long totalrewards;
	private long lastMonthRewards;
	private long secondLastMonthRewards;
	private long thirdLastMonthRewards;
	private int month;
	private int year;
	private long rewardPoints;
	
	

}
