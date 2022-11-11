package com.oes.service;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oes.entity.Buy;
import com.oes.entity.Product;
import com.oes.entity.Review;
import com.oes.repository.ProductRepository;
import com.oes.repository.ReviewRepository;
import com.oes.repository.UserRepository;
@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	UserRepository userRepository;
	
	

	@Override
	public List<Product> getAllProductbyUser(String username) throws Exception {

		User user = (User) userRepository.getUsersByUsername(username);
		
		
		return null;
	}

	
	@Override
	public Product addProduct(Product product) {
		Product savedProduct = productRepository.save(product);
		return savedProduct;
	
	}


	

}
