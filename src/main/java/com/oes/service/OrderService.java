package com.oes.service;
import java.util.List;


import org.springframework.stereotype.Service;

import com.oes.entity.Buy;
import com.oes.entity.Review;


@Service
public interface OrderService {
public Buy addOrder(Buy order);
	
	public List<Buy> getAllOrderbyUser(String username)throws Exception;


}
