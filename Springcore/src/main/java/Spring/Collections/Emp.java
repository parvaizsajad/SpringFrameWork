package Spring.Collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
	int id;
	String name;
	List<String> phoneNumbers;
	Set<String> addresses;
	Map<String,String> empDetails;
	Properties location;
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", phoneNumbers=" + phoneNumbers + ", addresses=" + addresses
				+ ", empDetails=" + empDetails + ", location=" + location + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getEmpDetails() {
		return empDetails;
	}
	public void setEmpDetails(Map<String, String> empDetails) {
		this.empDetails = empDetails;
	}
	public Properties getLocation() {
		return location;
	}
	public void setLocation(Properties location) {
		this.location = location;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int id, String name, List<String> phoneNumbers, Set<String> addresses, Map<String, String> empDetails,
			Properties location) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumbers = phoneNumbers;
		this.addresses = addresses;
		this.empDetails = empDetails;
		this.location = location;
	}
	

}
