package com.example.bookTest.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.bookTest.DTO.LibraryDto;

@Repository
public class BookDao {
	
	private final JdbcTemplate jt;
	
	@Autowired
	public BookDao(JdbcTemplate jdbcTemplate) {
		this.jt = jdbcTemplate;
	}
	
	// book 테이블 전체 데이터 가져오기 - 첫 화면에 목록으로 출력하기 위해
	public List<LibraryDto> select(){
		String sql = "select * from book";
		List<LibraryDto> list = jt.query(sql, new BookDtoRowMapper());
		return list;
	}
	
	public void insert(LibraryDto libraryDto) {  // 도서 정보 데이터베이스에 저장
		String sql = "insert into book(book_title, book_author, book_price, book_page, publisher) values(?,?,?,?,?)";
		jt.update(sql, libraryDto.getBookTitle(), libraryDto.getBookAuthor(), libraryDto.getBookPrice(), 
				libraryDto.getBookPage(), libraryDto.getPublisher());
	}
	
	public class BookDtoRowMapper implements RowMapper<LibraryDto>{
		@Override
		public LibraryDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			LibraryDto libraryDto = new LibraryDto();
			libraryDto.setBookAuthor(rs.getString("book_author"));
			libraryDto.setBookPrice(rs.getInt("book_price"));
			libraryDto.setBookPage(rs.getInt("book_page"));
			libraryDto.setBookTitle(rs.getString("book_title"));
			libraryDto.setPublisher(rs.getString("publisher"));
			libraryDto.setBookId(rs.getInt("book_id"));
			return libraryDto;
		}
	}
	
}