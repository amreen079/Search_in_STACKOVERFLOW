package com.bayestree.assesment.model;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Item {

	private List<String> tags;
	private Owner owner;
	private boolean is_answered;
	private int view_count;
	private int answer_count;
	private int score;
	private int last_activity_date;
	private int creation_date;
	private int question_id;
	private String content_license;
	private String link;
	private String title;
	
	
}
