package com.oes.service;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oes.entity.Buy;
import com.oes.entity.Review;
import com.oes.repository.OrderRepository;
import com.oes.repository.ReviewRepository;
import com.oes.repository.UserRepository;
@Service
public class OrderServiceImp implements OrderService{
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	UserRepository userRepository;

	@Override
	public Buy addOrder(Buy order) {
		Buy savedOrder = orderRepository.save(order);
		return savedOrder;
	}

	@Override
	public List<Buy> getAllOrderbyUser(String username) throws Exception {
        User user = (User) userRepository.getUsersByUsername(username);
		
		
		return null;
	}

}
