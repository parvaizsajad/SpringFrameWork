package com.spring.standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {

	public List<String> friends;
	public Map<String, Integer> feeStructure;
	public Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Map<String, Integer> getFeeStructure() {
		return feeStructure;
	}

	public void setFeeStructure(Map<String, Integer> feeStructure) {
		this.feeStructure = feeStructure;
	}



	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feeStructure=" + feeStructure + "]";
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
}
