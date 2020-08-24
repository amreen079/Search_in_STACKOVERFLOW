package com.bayestree.assesment.service;

import java.util.Scanner;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import com.bayestree.assesment.model.ItemsModel;

public class Stackservice {

	public void res() {
		System.out.println("enter your search query:");
		Scanner sc = new Scanner(System.in);
		String query = sc.nextLine();
		String url = "https://api.stackexchange.com/2.2/search?order=desc&sort=activity&intitle=" + query
				+ "&site=stackoverflow";
		RestTemplate res = new RestTemplate();
		res.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
		ItemsModel response = res.getForObject(url, ItemsModel.class);
		System.out.println("========================================================================================");
		System.out.println("Here are the top-5 results of your search :" + query);
		for (int i = 0; i < 5; i++) {

			System.out.println("Title :" + response.getItems().get(i).getTitle() + ", URL :"
					+ response.getItems().get(i).getLink());
		}
	}
}
