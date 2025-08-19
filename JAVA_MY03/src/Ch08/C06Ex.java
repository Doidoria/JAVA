package Ch08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C06Ex {

	public static void main(String[] args) {
		
		//00.charge_station.sql 을 dbms 에 복원하세요(opendatadb.tbl_charge)
		String id="root";
		String pw="1234";
		String url="jdbc:mysql://localhost:3306/opendatadb";
		
		Connection conn=null;			// DBMS 의 특정 DB와 연결되는 객체
		PreparedStatement pstmt=null;	// SQL Query 전송용 객체
		ResultSet rs=null;				// Select 결과물 저장 객체
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading Success...");
			conn=DriverManager.getConnection(url,id,pw);
			System.out.println("DB CONNECTED...");
			
			//01.tbl_charge에 insert 코드 실행
			pstmt=conn.prepareStatement("insert into charge_station values(?,?,?,?,?,?)");
			pstmt.setInt(1, Integer.parseInt(args[0]));
			pstmt.setString(2, args[1]);
			pstmt.setString(3, args[2]);
			pstmt.setString(4, args[3]);
			pstmt.setInt(5, Integer.parseInt(args[4]));
			pstmt.setString(6, args[5]);
			
			int result=pstmt.executeUpdate();
			if(result>0) {
				System.out.println("INSERT 성공!");
			} else
				System.out.println("INSERT 실패..");
			
		}catch(ClassNotFoundException e1) {
			System.out.println("클래스 부재 예외발생!");
		}catch(SQLException e2) {
			System.out.println("SQL 예외발생!");
		}finally {
			try {conn.close();} catch (SQLException e) {e.printStackTrace();}
		}
		
		
		
		//02.tbl_charge에 update 코드 실행
		
		
		//03.tbl_charge에 delete 코드 실행
		
		
		//04.tbl_charge의 내용을 Select한 결과 console에서 확인
		
		
		
	}
}
