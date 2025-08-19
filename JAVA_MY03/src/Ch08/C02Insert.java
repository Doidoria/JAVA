package Ch08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C02Insert {

	public static void main(String[] args) {
		//DB CONN DATA
		String id="root";
		String pw="1234";
		String url="jdbc:mysql://localhost:3306/opendatadb"; //JDBC/mySQL/서비스번호/DB명
		
		//JDBC참조변수
		Connection conn=null;			// DBMS 의 특정 DB와 연결되는 객체
		PreparedStatement pstmt=null;	// SQL Query 전송용 객체
		ResultSet rs=null;				// Select 결과물 저장 객체
		
		//연결작업
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 			//JDBC 드라이버 로딩
			System.out.println("Driver Loading Success...");	
			conn=DriverManager.getConnection(url,id,pw);		//드라이버 매니저를 통해 객체 -> DB 연결처리 Connection
			System.out.println("DB CONNECTED...");
			
			// SQL query(쿼리) 객체 생성
			pstmt=conn.prepareStatement("insert into tbl_a values(?,?)");
			pstmt.setInt(1, Integer.parseInt(args[0]));
            pstmt.setString(2, args[1]);
			// SQL를 DBMS로 전달
			int result=pstmt.executeUpdate();	//executeUpdate - DML (INSERT)
			// 결과값으로 java에서 처리
			if(result>0) {
				System.out.println("INSERT 성공!");
			} else
				System.out.println("INSERT 실패..");
			
			
		}catch(ClassNotFoundException e1) {
			System.out.println("클래스 부재 예외발생!");
		}catch(SQLException e2) {
			System.out.println("SQL 예외발생!");
		}finally {		//채점 항목 필수!!! (오류발생 위치에 마우스 가져다대고 "서라운드" 클릭)
			try {conn.close();} catch (SQLException e) {e.printStackTrace();}
		}
	}

	private static PreparedStatement setString(int i, String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static PreparedStatement setInt(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
}
