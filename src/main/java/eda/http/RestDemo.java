package eda.http;

import org.springframework.web.client.RestTemplate;

public class RestDemo {

	public static void main(String[] args) {
		RestTemplate template = new RestTemplate();
		String response = template.getForObject("http://127.0.0.1:8124", String.class);
		System.out.println(response);
	}
}
