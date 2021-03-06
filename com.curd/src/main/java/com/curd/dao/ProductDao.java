package com.curd.dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.curd.Entities.Product;

@Component
public class ProductDao {
@Autowired
	private HibernateTemplate hibernateTemplate;
@Transactional
public void createProduct(Product product) {
	this.hibernateTemplate.saveOrUpdate(product);
}

public List<Product> getStudent(){
	
	List<Product> loadAll = this.hibernateTemplate.loadAll(Product.class);
	return loadAll;
}
@Transactional
public void deleteProduct(int pid) {
	Product load = this.hibernateTemplate.load(Product.class,pid);
	this.hibernateTemplate.delete(load);
		
	
}
public Product getProduct(int pid) {
	Product product = this.hibernateTemplate.get(Product.class,pid);
	return product;
	
}
}
