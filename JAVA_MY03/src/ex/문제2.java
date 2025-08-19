package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//private : 접근제한 다른패키지에서는 생성자 호출x
//static : 변수의 값 공유
public class 문제2 {
	// DB CONN DATA
	private static String id = "root"; 	// DB 사용자 계정(이름)
	private static String pw = "1234"; 	// DB 사용자 비밀번호
	private static String url = "jdbc:mysql://localhost:3306/tmpdb";	// (JDBC) DB 연결/URL(동일 호스트)/스키마명

	// JDBC참조변수
	private static Connection conn = null; 	// DBMS 의 특정 DB와 연결되는 객체
	private static PreparedStatement pstmt = null; 	// SQL Query 전송 및 실행 객체
	private static ResultSet rs = null; 	// Select 결과를 저장 객체

	// DB 연결 메서드
	public static void conn() throws Exception { 	// 예외발생을 (conn) 메인으로 던짐 (업케스팅 - 모든 예외를 다 던질 수 있음)
		Class.forName("com.mysql.cj.jdbc.Driver"); 			// JDBC 드라이버 로딩
		System.out.println("Driver Loading Success...");	// JDBC 정상 로딩되면 확인용으로 출력
		conn=DriverManager.getConnection(url,id,pw);		// 드라이버 매니저를 통해 객체 -> DB 연결처리 Connection
		System.out.println("DB CONNECTED...");				// DB 연결 확인 출력
	}

	// 전체조회 (SELECT * FROM tbl_book)
	public static List<BookDto> selectAll() throws SQLException {	// 모든 도서 조회 메소드
		pstmt=conn.prepareStatement("select * FROM tbl_book"); 	
		// SELECT *=(전체) FROM 테이블명(tbl_book) -> 해당 테이블 전체 조회
		rs=pstmt.executeQuery();  // 실행 → 결과 (ResultSet) 반환 Select
		
		List<BookDto> list=new ArrayList();		// 결과를 담을 리스트 생성
		BookDto dto=null;	// BookDto 객체 선언 - "dto"변수에 null(아무것도 없는 값) 지정
		if(rs!=null) { 		// 다음 행으로 이동. "rs"데이터 있으면 true 반환
			while(rs.next()) {		// 반복문 : rs값을 반복으로 입력
				dto=new BookDto();	// 한 행의 데이터를 BookDto 객체에 매핑
				dto.setBookCode(rs.getLong("bookCode"));	 //bookCode 값 세팅
				dto.setBookName(rs.getString("bookname"));	 //bookname 값 세팅
				dto.setPublisher(rs.getString("publisher")); //publisher 값 세팅
				dto.setIsbn(rs.getString("isbn"));			 //isbn 값 세팅
				list.add(dto);	//리스트에 추가
			}
		}
		return list; // 리스트 반환
	}

	// 특성 도서 1건 조회 메소드
	public static BookDto select(Long bookCode) throws SQLException { 
		pstmt=conn.prepareStatement("SELECT * FROM tbl_book where bookCode=?");
		// SELECT *=(전체) FROM 테이블명(tbl_book) 조건문(where) 조건 참조할(대표 열이름=?) -> 해당 테이블 전체 조회
        pstmt.setLong(1, bookCode);		// bookCode 값 바인딩
		rs=pstmt.executeQuery();  // SQL 실행
		
		BookDto dto=null;	
		if(rs!=null) {		
			rs.next();		// 첫 번째 행으로 이동
			dto = new BookDto();	//새 객체 "dto"생성
			dto.setBookCode(rs.getLong("bookCode"));
			dto.setBookName(rs.getString("bookname"));
			dto.setPublisher(rs.getString("publisher"));
			dto.setIsbn(rs.getString("isbn"));
		}
		return dto;	//dto 반환
	}
	
	// 도서 삽입 메소드
	public static int insertBook(BookDto bookDto) throws SQLException { 
		pstmt=conn.prepareStatement("insert INTO tbl_book values(?,?,?,?)"); 
		//INSERT INTO 테이블명(tbl_book) VALUES(삽입할 열(column) 값)
		pstmt.setLong(1, bookDto.getBookCode());	//첫번째 값
		pstmt.setString(2, bookDto.getBookName());	//두번째 값
		pstmt.setString(3, bookDto.getPublisher());	//세번째 값
		pstmt.setString(4, bookDto.getIsbn());		//네번째 값
		
		// SQL를 DBMS로 전달
		int result=pstmt.executeUpdate();	//executeUpdate - DML (INSERT) SQL 실행 (영향 받은 행 수 반환)
		return result; 	//result (결과)반환
	}

	// 도서 수정 메소드
	public static int updateBook(BookDto bookDto) throws SQLException {
		pstmt=conn.prepareStatement("update tbl_book SET bookname=?,publisher=?,isbn=? where bookCode=?"); 
		//UPDATE 테이블명(tbl_book) SET 수정할 열(열이름=?) 조건문(where) 조건 참조할(열이름=?)
		pstmt.setString(1, bookDto.getBookName());
		pstmt.setString(2, bookDto.getPublisher());
		pstmt.setString(3, bookDto.getIsbn());
		pstmt.setLong(4, bookDto.getBookCode());
		
		// SQL를 DBMS로 전달
		int result=pstmt.executeUpdate(); //executeUpdate - DML (UPDATE) SQL 실행 (영향 받은 행 수 반환)
		return result; //result (결과)반환
	}

	// 도서 삭제 메소드
	public static int deleteBook(BookDto bookDto) throws SQLException {
		pstmt=conn.prepareStatement("delete FROM tbl_book where bookCode=?");
		//DELETE FROM 테이블명(tbl_book) 조건문(where) 조건 참조할(대표 열이름=?)
		pstmt.setLong(1, bookDto.getBookCode());
		
		// SQL를 DBMS로 전달
		int result=pstmt.executeUpdate(); //executeUpdate - DML (DELETE) SQL 실행 (영향 받은 행 수 반환)
		return result;
	}

	public static void main(String[] args) {
		try {
			// DBCONN
			conn();
			
			//TX START
			conn.setAutoCommit(false);
			
			// INSERT
//			insertBook(new BookDto(1L, "도서명1", "출판사명1", "isbn-1"));
//			insertBook(new BookDto(2L, "도서명1", "출판사명1", "isbn-1"));
//			insertBook(new BookDto(3L, "도서명1", "출판사명1", "isbn-1"));
//			insertBook(new BookDto(4L, "도서명1", "출판사명1", "isbn-1"));
			
			// SELECTALL
//			List<BookDto> allBook = selectAll();
//			System.out.println("SelectAll : ");
//			allBook.forEach(System.out::println);
			
			// SELECT
			BookDto dto = select(2L);
			System.out.println("select : " + dto);
			
			// UPDATE
//			dto.setBookName("수정도서명-2");
//			dto.setPublisher("수정출판사명-2");
//			int r1 = updateBook(dto);
//			if (r1 > 0)
//				System.out.println("수정완료 : " + r1);
			
//
//			// DELETE
//			int r2 = deleteBook(dto);
//			if (r2 > 0)
//				System.out.println("삭제완료 : " + r2);

			//TX END
			conn.commit();
			
		} catch (Exception e) {
			//TX ROLLBACKALL
			try{conn.rollback();}catch(Exception e2){}
		} finally {
			//자원제거
			try{rs.close();}catch(Exception e3){}
			try{pstmt.close();}catch(Exception e3){}
			try{conn.close();}catch(Exception e3){}
		}

	}

}
