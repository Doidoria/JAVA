package JavaProblem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class 문제2 {

	private static String id="root";
	private static String pw="1234";
	private static String url="jdbc:mysql://localhost:3306/tmpdb";
	
	private static Connection conn;			//JDBC 드라이버가 정상 로딩되면 DriverManager를 통해 데이터베이와 연결되는 세션인 Connection 객체를 생성
	private static PreparedStatement pstmt; //Statement 객체는 작성된 SQL 쿼리문을 실행하기 위한 객체로 정적 SQL 쿼리 문자열을 입력으로 가진다.
	private static ResultSet rs;			//select 조회 결과 값 받아옴
	
	public static void conn() throws SQLException{  //외부+우선+예외선언 JDBC-(SQLException)
		
	}
	public static List<BookDto> selectAll() throws SQLException{
		return null;
	}
	public static BookDto select(Long bookCode) throws SQLException{
		return null;
	}
	public static int insertBook(BookDto bookDto) throws SQLException{
		return -1;
	}
	public static int updateBook(BookDto bookDto) throws SQLException{
		return -1;
	}
	public static int deleteBook(long l) throws SQLException{
		return -1;
	}
	
	
	
	public static void main(String[] args) {
		try {
			//DBConn
			conn();
			//Tx start
			//Insert
			insertBook(new BookDto(1L,"도서명1","출판사명1","isbn-1"));
			insertBook(new BookDto(2L,"도서명2","출판사명2","isbn-2"));
			insertBook(new BookDto(3L,"도서명3","출판사명3","isbn-3"));
			
			//SelectAll
			List<BookDto> allBook=selectAll();
			System.out.println("selectAll : ");
			allBook.forEach(el->System.out.println(el));
			
			//Select
			BookDto dto=select(1L);
			System.out.println("select : "+dto);
			
			//Update
			dto.setBookName("수정도서명-2");
			dto.setPublisher("수정출판사명-2");
			int r1=updateBook(dto);
			if(r1>0) {
				System.out.println("수정완료 : "+r1);
			}
			int r2=deleteBook(2L);
			if(r2>0) {
				System.out.println("삭제완료 : "+r2);
			}
			
			//Tx End
		}catch(Exception e) {
			//Tx RollbacAll
		}

	}

}
