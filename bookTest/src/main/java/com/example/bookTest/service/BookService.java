package com.example.bookTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookTest.DAO.BookDao;
import com.example.bookTest.DTO.LibraryDto;

@Service
public class BookService {

	private final BookDao bookDao;
	
	@Autowired
	public BookService(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	
	// 도서 정보 전체 데이터베이스에서 가져와서 List에 저장되어 있는 것 받아서 controller에 넘겨주기
	public List<LibraryDto> selectAll(){
		return bookDao.select();
	}
	
	// 도서 정보 저장
	public void bookSave(LibraryDto libraryDto) {
		if(libraryDto != null) {
			// 도서 코드가 이미 데이터베이스에 저장되어 있는지 확인 후 저장 (중복 방지)
			bookDao.insert(libraryDto);  // DAO 클래스의 insert 메서드 실행해서 저장
		}
	}
	
}
