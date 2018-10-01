package com.niit.Model;


	import java.io.Serializable;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

	import org.springframework.stereotype.Component;

	@Component
	@Entity
	public class User implements Serializable{
		@Id   //primary key
		@GeneratedValue(strategy=GenerationType.SEQUENCE)
		private int customerId;
		private String customerName;
		private String customerDescription;
		private String customerPrice;
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getCustomerDescription() {
			return customerDescription;
		}
		public void setCustomerDescription(String customerDescription) {
			this.customerDescription = customerDescription;
		}
		public String getCustomerPrice() {
			return customerPrice;
		}
		public void setCustomerPrice(String customerPrice) {
			this.customerPrice = customerPrice;
		}
		public String getCustomerQuantity() {
			return customerQuantity;
		}
		public void setCustomerQuantity(String customerQuantity) {
			this.customerQuantity = customerQuantity;
		}
		private String customerQuantity;

		
		
		
		
	}


