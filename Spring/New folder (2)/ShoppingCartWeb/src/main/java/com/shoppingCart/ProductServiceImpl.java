package com.shoppingCart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ProductServiceImpl implements ProductService {
	 @Autowired
	    private ProductDAO productDAO;
	 
	@Transactional
	public void addProduct(Product product) {
		productDAO.addProduct(product);
	}

	 
    @Transactional
	public void FindByProductId(int id) {
		productDAO.findByProductId(id);
	}

    @Transactional

	public void deleteByProductId(int id) {
		productDAO.deleteByProductId(id);
	}

	 
	public void updateByProductId(int id) {
		productDAO.updateByProductId(id);
	}

	 
	public List<Product> allProduct() {
		return productDAO.allProduct();
		 
		
	}

	 
    @Transactional

	public void FindByCategory(String name) {
		productDAO.findByCategory(name);
	}

}
