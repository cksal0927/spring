package com.example.bookTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookTest.DAO.CoffeeDao;
import com.example.bookTest.DTO.CoffeeDto;

@Service
public class CoffeeService {
	
	private final CoffeeDao coffeeDao;
	
	@Autowired
	public CoffeeService(CoffeeDao coffeeDao) {
		this.coffeeDao = coffeeDao;
	}
	
	public List<CoffeeDto> selectAll(){
		return coffeeDao.select();
	}
	
	public void coffeeSave(CoffeeDto coffeeDto) {
		if(coffeeDto != null) {
			coffeeDao.insert(coffeeDto);
		}
	}
	
	public CoffeeDto getCoffee(int id) {
		if(id != 0) {
			return coffeeDao.findId(id);
		}
		return null;
	}
	
}
