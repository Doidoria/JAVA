//package ex;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class 문제2 {
//	// DB CONN DATA
//	private static String id = "root"; 	// DB 사용자 계정(이름)
//	private static String pw = "1234"; 	// DB 사용자 비밀번호
//	private static String url = "jdbc:mysql://localhost:3306/tmpdb";	// (JDBC) DB 연결/URL(동일 호스트)/스키마명
//
//	// JDBC참조변수
//	private static Connection conn = null; // DBMS 의 특정 DB와 연결되는 객체
//	private static PreparedStatement pstmt = null; // SQL Query 전송 및 실행 객체
//	private static ResultSet rs = null; // Select 결과를 저장 객체
//
//	// DB 연결 메서드
//	public static void conn() throws Exception { // 예외발생을 (conn) 메인으로 던짐 (업케스팅 - 모든 예외를 다 던질 수 있음)
//		Class.forName("com.mysql.cj.jdbc.Driver"); 			// JDBC 드라이버 로딩
//		System.out.println("Driver Loading Success...");	// JDBC 정상 로딩 확인 출력
//		conn=DriverManager.getConnection(url,id,pw);		// 드라이버 매니저를 통해 객체 -> DB 연결처리 Connection
//		System.out.println("DB CONNECTED...");				// DB 연결 확인 출력
//	}
//
//	// 전체조회 (SELECT * FROM tbl_book)
//	public static List<BookDto> selectAll() throws SQLException {
//		pstmt=conn.prepareStatement("SELECT * FROM tbl_book"); // SELECT *=(전체) FROM 테이블명 -> 해당 테이블 전체 조회
//		rs=pstmt.executeQuery();  // 실행 → 결과 (ResultSet) 반환 Select
//		
//		List<BookDto> list=new ArrayList(); // 결과를 담을 리스트 생성
//		BookDto dto=null; 	// "dto"변수에 null(아무것도 없는 값)지정
//		if(rs!=null) {
//			while(rs.next()) {
//				dto=new BookDto();
//				dto.setBookCode(rs.getLong("bookCode"));
//				dto.setBookName(rs.getString("bookname"));
//				dto.setPublisher(rs.getString("publisher"));
//				dto.setIsbn(rs.getString("isbn"));
//				list.add(dto);
////				System.out.print(rs.getInt("bookCode")+" ");
////				System.out.print(rs.getString("bookname")+" ");
////				System.out.print(rs.getString("publisher")+" ");
////				System.out.println(rs.getString("isbn"));
//			}
//		}
//		return list;
//	}
//
//	public static BookDto select(Long bookCode) throws SQLException {
//		pstmt=conn.prepareStatement("SELECT * FROM tbl_book where bookCode=?");
//        pstmt.setLong(1, bookCode);
//		rs=pstmt.executeQuery();  //표의 형태의 오브젝트를 가져옴 (ResultSet) Select
//		
//		BookDto dto=null;
//		if(rs!=null) {
//			rs.next();
//			dto = new BookDto();
//			dto.setBookCode(rs.getLong("bookCode"));
//			dto.setBookName(rs.getString("bookname"));
//			dto.setPublisher(rs.getString("publisher"));
//			dto.setIsbn(rs.getString("isbn"));
//		}
//		return dto;
//	}
//
//	public static int insertBook(BookDto bookDto) throws SQLException {
//		pstmt=conn.prepareStatement("insert into tbl_book values(?,?,?,?)"); //INSERT INTO 테이블명 VALUES(no, 내용)
//		pstmt.setLong(1, bookDto.getBookCode());
//		pstmt.setString(2, bookDto.getBookName());
//		pstmt.setString(3, bookDto.getPublisher());
//		pstmt.setString(4, bookDto.getIsbn());
//		
//		// SQL를 DBMS로 전달
//		int result=pstmt.executeUpdate();	//executeUpdate - DML (INSERT)
//		return result; 	//result 값 리턴
//	}
//
//	public static int updateBook(BookDto bookDto) throws SQLException {
//		pstmt=conn.prepareStatement("update tbl_book set bookname=?,publisher=?,isbn=? where bookCode=?"); //UPDATE
//		pstmt.setString(1, bookDto.getBookName());
//		pstmt.setString(2, bookDto.getPublisher());
//		pstmt.setString(3, bookDto.getIsbn());
//		pstmt.setLong(4, bookDto.getBookCode());
//		
//		// SQL를 DBMS로 전달
//		int result=pstmt.executeUpdate();
//		return result;
//	}
//
//	public static int deleteBook(BookDto bookDto) throws SQLException {
//		pstmt=conn.prepareStatement("delete from tbl_book where bookCode=?"); //
//		pstmt.setLong(1, bookDto.getBookCode());
//		
//		// SQL를 DBMS로 전달
//		int result=pstmt.executeUpdate();	//executeUpdate - DML (INSERT)
//		return result;
//	}
//
//	public static void main(String[] args) {
//		try {
//			// DBCONN
//			conn();
//			
//			//TX START
//			conn.setAutoCommit(false);
//			
//			// INSERT
////			insertBook(new BookDto(1L, "도서명1", "출판사명1", "isbn-1"));
////			insertBook(new BookDto(2L, "도서명1", "출판사명1", "isbn-1"));
////			insertBook(new BookDto(3L, "도서명1", "출판사명1", "isbn-1"));
////			insertBook(new BookDto(4L, "도서명1", "출판사명1", "isbn-1"));
//			
//			// SELECTALL
////			List<BookDto> allBook = selectAll();
////			System.out.println("SelectAll : ");
////			allBook.forEach(System.out::println);
//			
//			// SELECT
//			BookDto dto = select(1L);
//			System.out.println("select : " + dto);
//			
//			// UPDATE
////			dto.setBookName("수정도서명-1");
////			dto.setPublisher("수정출판사명-1");
////			int r1 = updateBook(dto);
////			if (r1 > 0)
////				System.out.println("수정완료 : " + r1);
//			
////
////			// DELETE
////			int r2 = deleteBook(dto);
////			if (r2 > 0)
////				System.out.println("삭제완료 : " + r2);
//
//			//TX END
//			conn.commit();
//			
//		} catch (Exception e) {
//			//TX ROLLBACKALL
//			try{conn.rollback();}catch(Exception e2){}
//		} finally {
//			//자원제거
//			try{rs.close();}catch(Exception e3){}
//			try{pstmt.close();}catch(Exception e3){}
//			try{conn.close();}catch(Exception e3){}
//		}
//
//	}
//
//}
