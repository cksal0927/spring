package com.example.bookTest.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LibraryDto {
	private int bookId;
	private String bookTitle;  // 책 제목
	private String bookAuthor;  // 저자
	private int bookPrice;  // 가격
	private int bookPage;  // 페이지 수
	private String publisher;  // 출판사
}