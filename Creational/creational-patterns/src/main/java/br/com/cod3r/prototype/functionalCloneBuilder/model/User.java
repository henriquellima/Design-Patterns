package br.com.cod3r.prototype.functionalCloneBuilder.model;

import java.util.Locale;

public class User implements Cloneable{
	private final String name;
	private final Integer age;
	private final Address address;
	
	public User(String name, Integer age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public Address getAddress() {
		return address;
	}

	public Builder CloneBuilder(){
		return new Builder(name, age, address);
	}

	@Override
	public User clone() throws CloneNotSupportedException {
		Address cloneAdress = address.clone();
		return new User(name, age, address);
	}

	public static class Builder{
		private String name;
		private Integer age;
		private Address address;


		public Builder(String name, Integer age, Address address) {
			this.name = name;
			this.age = age;
			this.address = address;
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setAge(Integer age) {
			this.age = age;
			return this;
		}

		public Builder setAddress(Address address) {
			this.address = address;
			return this;
		}

		public User now(){
			return new User(name, age, address);
		}
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
}
