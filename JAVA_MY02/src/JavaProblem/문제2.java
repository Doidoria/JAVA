package JavaProblem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class 문제2 {

	private static String id="root";
	private static String pw="1234";
	private static String url="jdbc:mysql://localhost:3306/tmpdb";
	
	private static Connection conn;
	private static PreparedStatement pstmt;
	private static ResultSet rs;
	
	public static void conn() throws SQLException{
		
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
	public static int deleteBook(BookDto bookDto) throws SQLException{
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
			List<BookDto> allBook=selectALL();
			System.out.println("selectAll : ");
			allBook.forEach(el->System.out.println(el));
			
			//Select
			BookDto dto=select(1L);
			System.out.println("select : "+dto);
			
			//Update
			dto.setBookName("수정도서명-2");
			dto.setPublisher("수정출판사명-2");
			int r1=updataBook(dto);
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
