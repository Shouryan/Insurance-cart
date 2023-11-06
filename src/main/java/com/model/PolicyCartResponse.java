package com.model;

import java.util.List;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class PolicyCartResponse {
	private String userName;
	private Integer cartId;
	private Double totalPremium;
	private String policies;
}
