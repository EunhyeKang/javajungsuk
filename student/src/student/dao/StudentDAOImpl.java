package student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentDAOImpl implements StudentDAO{
	private String driver = "oracle.jdbc.driver.OracleDriver";   
	private String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
	private String username = "c##java";
	private String password = "oracle";
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	Scanner scan = new Scanner(System.in);
	
	
	public StudentDAOImpl(){
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
	
	public void menu() {
		
		while(true) {
			System.out.println("****************");
			System.out.println(" 관리");
			System.out.println("****************");
			System.out.println(" 1. 입력");
			System.out.println(" 2. 검색");
			System.out.println(" 3. 삭제");
			System.out.println(" 4. 종료");
			System.out.println("****************");
			System.out.print(" 번호선택 : ");
			int num = scan.nextInt();
			
			if(num==1) insertArticle();
			else if(num==2) selectArticle();
			else if(num==3) deleteArticle();
			else if(num==4) break;
			else System.out.println("다시입력하세요.");
		}
	}
	
	
	@Override
	public void insertArticle() {
		this.getConnection();
		
		String name="";
		String value="";
		
		System.out.println("****************");
		System.out.println(" 1. 학생");
		System.out.println(" 2. 교수");
		System.out.println(" 3. 관리자");
		System.out.println(" 4. 이전메뉴");
		System.out.println("****************");
		System.out.print(" 번호선택 : ");
		
		try {
			int num = scan.nextInt();
			String sql = "insert into student values(?,?,?)";
			
			System.out.print("이름입력 : ");
			name=scan.next();
			if(num==1) {
				System.out.print("학번입력 : ");
				value=scan.next();
			}
			if(num==2) {
				System.out.print("과목입력 : ");
				value=scan.next();
			}
			if(num==3) {
				System.out.print("부서입력 : ");
				value=scan.next();
			}
			if(num==4) {
				return;
			}
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, value);
			pstmt.setInt(3, num);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeJdbc();
		}
	}

	@Override
	public void selectArticle() {
		this.getConnection();
		String sql="";
		String name="";
		
		System.out.println("****************");
		System.out.println(" 1. 이름 검색");
		System.out.println(" 2. 전체검색");
		System.out.println(" 3. 이전메뉴");
		System.out.println("****************");
		System.out.print(" 번호선택 : ");
		int num = scan.nextInt();
			
		if(num==1) {
			System.out.print("검색할 이름 입력 : ");
			name = scan.next();
			sql = "select * from student where name like ?";
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, "%"+name+"%");
				rs = pstmt.executeQuery();
				
				while(rs.next()) {

					if(rs.getInt("code")==1) {
						System.out.println("이름 = " + rs.getString("name")+"\t학번 = "+rs.getString("value") ); 
					}else if(rs.getInt("code")==2){
						System.out.println("이름 = " + rs.getString("name")+"\t과목 = "+rs.getString("value") );
					}else if(rs.getInt("code")==3){
						System.out.println("이름 = " + rs.getString("name")+"\t부서"+rs.getString("value") );
					}
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				closeJdbc();
			}
		}
		else if(num==2) {
			sql = "select * from student";
			try {
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					System.out.println(rs.getString("name")+"\t"
									+rs.getString("value")+"\t"
									+rs.getInt("code"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				closeJdbc();
			}	
		}
		else if(num==3) {
			return;
		}
		else {
			System.out.println("다시 입력하세요.");
		}
	}

	@Override
	public void deleteArticle() {
		this.getConnection();
		String sql="";
		System.out.print("삭제를 원하는 이름 입력 : ");
		String name = scan.next();
		sql = "delete student where name = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeJdbc();
		}	
	}
	
	public void closeJdbc() {
		try {
			if(rs != null) rs.close();  
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
