package eda.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class CustomerLogger implements ItemWriter<Customer> {

	public void write(List<? extends Customer> customers) throws Exception {
		for (Customer customer : customers) {
			System.out.println("id: " + customer.getId()
					+ ", name: " + customer.getName()
					+ ", email: " + customer.getEmail());	
		}
	}

}
