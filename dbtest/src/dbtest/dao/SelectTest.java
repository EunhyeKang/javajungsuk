package dbtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {

	private String driver = "oracle.jdbc.driver.OracleDriver";     // 이부분은 나중에 xml로 뺄꺼다. 
	private String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
	private String username = "c##java";
	private String password = "oracle";
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs; // 갯수아니고 결과받아내는거!

	
	public SelectTest(){
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			}	
	}


	public void getConnection() {
		try {
			conn = DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void selectArticle() {
//		select * from dbtest;
		getConnection();
		String sql = "select * from dbtest";
		
		try {
			pstmt = conn.prepareStatement(sql);//select를 처리해줄 가이드.
			rs = pstmt.executeQuery(); // 데이터를 끌고오는것임. 실행 - ResultSet라는 인터페이스를 리턴한다.
			//*****************
			
//			System.out.println(rs); //주소값찍힘
			//현재위치 레코드에서 데이터가 있나없다 확인 후 (유True 무False)
			//다음 레코드 이동
			
			//이름을 꺼내올 때 => rs.getString("name") 또는 rs.getString(1)
			//나이를 꺼내올 때 => rs.getInt("age") 또는 rs.getInt(2) 			----------컬럼 번호 비추천. 가독성떨어짐
			//키 를 꺼내올 때 => rs.getDouble("height") 또는 rs.getDouble(3)
			//날짜를 꺼내올 때 => rs.getString("logtime")
//								계산하고싶을땐 rs.getDate("logtime") //오늘부터하루뒤 +1 이틀뒤 +2
			
			while(rs.next()) {
				System.out.println(rs.getString("name") + "\t"
								+ rs.getInt("age") + "\t"
									+ rs.getDouble("height") + "\t"
									+ rs.getString("logtime"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close(); // ********************!!!!!!!!!!!! // 
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	public static void main(String[] args) {
		SelectTest st = new SelectTest();
		st.selectArticle();
	}
	
	
	
	
}
