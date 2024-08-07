package com.example.bookTest.DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BookDto {
	private String title;
	private String writer;
	private String publish;
}