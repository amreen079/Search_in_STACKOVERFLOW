package com.bayestree.assesment.service;

import java.util.Scanner;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.bayestree.assesment.model.Item;
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
		try {
			ItemsModel response = res.getForObject(url, ItemsModel.class);
			System.out.println(response.getItems().size()+" record(s) found for your search : " +query );
			System.out.println(
					"========================================================================================");
			if (response.getItems().size() < 5) {
				for (Item resp : response.getItems()) {
					System.out.println("Title :" + resp.getTitle() + ", URL :" + resp.getLink());
				}
			} else {
				for (int i = 0; i < 5; i++) {
					System.out.println("Top 5 findings are :");
					System.out.println("Title :" + response.getItems().get(i).getTitle() + ", URL :"
							+ response.getItems().get(i).getLink());
				}
			}
		} catch (HttpClientErrorException ex) {
			ex.getMessage();
		}

	}
}
