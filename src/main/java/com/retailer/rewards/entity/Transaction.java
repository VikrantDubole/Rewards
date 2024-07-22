package com.retailer.rewards.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Transactions")
@Getter
@Setter
@NoArgsConstructor
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long transactionId;

	@Column(name = "Transaction_Amount")
	private long transactionAmount;

	@Column(name = "Transaction_Date")
	private Timestamp transactionDate;

	
	@Column(name = "Customer_Id")
	private long customerId;

}
