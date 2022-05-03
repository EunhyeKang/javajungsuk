package dbtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateTest {

	private String driver = "oracle.jdbc.driver.OracleDriver";     // 이부분은 나중에 xml로 뺄꺼다. 
	private String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
	private String username = "c##java";
	private String password = "oracle";
	private Connection conn;
	private PreparedStatement pstmt;
	
	

	public UpdateTest() {
		
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
	
	public void updateArticle() {
		Scanner scan = new Scanner(System.in);
		String name;
		int age;
		double height;
		
		System.out.print("수정할 이름 입력 : ");
		name = scan.next();
		
		this.getConnection();
		
		
		try {  
			//**************************************************************************************
			String sql = "update dbtest set age=age+1, height=height+1 where name like ?";

			pstmt = conn.prepareStatement(sql);	// 생성		
			pstmt.setString(1, "%"+name+"%");
			
			int su = pstmt.executeUpdate(); //실행
												//혹시 안들어가지면, lock걸린 상태기때문에 갱신이 안된다. commit해주기~
			System.out.println(su + " 개의 행을 수정하였습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {  //뭐가쌓인하고 하신거지~?    버퍼, 메모리누수 ? 
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		UpdateTest ut = new UpdateTest();
		ut.updateArticle();
	}
	
	
}

/*
[문제] 홍이 들어간 레코드를 찾아서 나이, 키 1씩 증가
수정할 이름 입력 : 홍
2개의 행을 수정하였습니다.
*/
