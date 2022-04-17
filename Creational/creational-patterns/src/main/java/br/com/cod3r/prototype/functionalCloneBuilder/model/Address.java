package br.com.cod3r.prototype.functionalCloneBuilder.model;

public class Address implements Cloneable{
	private final String street;
	private final Integer number;
	
	public Address(String street, Integer number) {
		super();
		this.street = street;
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public Integer getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", number=" + number + "]";
	}

	@Override
	public Address clone() throws CloneNotSupportedException {
			return (Address) super.clone();
	}

	public Builder cloneBuilder(){
		return new Builder(this.street, this.number);
	}

	public static class Builder {
		private String street;
		private Integer number;

		private Builder(String street, Integer number){
			this.number = number;
			this.street = street;
		}

		public Builder setStreet(String street) {
			this.street = street;
			return this;
		}

		public Builder setNumber(Integer number) {
			this.number = number;
			return this;
		}

		public Address now(){
			return new Address(street, number);
		}
	}
}
