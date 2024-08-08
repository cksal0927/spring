package com.example.bookTest.DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CoffeeDto {
	private int coffeeId;
	private String itemName;
	private int price;
	private String decaffein;
}
