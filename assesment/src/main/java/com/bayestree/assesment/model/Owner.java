package com.bayestree.assesment.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Owner {

	private int reputation;
	private int user_id;
	private String user_type;
	private String profile_image;
	private String display_name;
	private String link;
	
	
}
