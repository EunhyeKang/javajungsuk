package dbtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertTest {
	private String driver = "oracle.jdbc.driver.OracleDriver";     // 이부분은 나중에 xml로 뺄꺼다. 
	private String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
	private String username = "c##java";
	private String password = "oracle";
	
	
	
	//오라클 드라이버가 인터페이스인지 클래스인지 뭔지 모르기때문에 몽타주가  필요하다. 그때 사용하는 것이 Class !! 임.
//	class Object{
//	class Integer{
//	class Class{  인터페이스인지 뭔지 모르겠다. 그럴때 Class타입으로 몰아붙임. 	
	
	

	//디비 3단계 변화.  1 오늘공부하는거 2 xml 로 넘길거임. 
	
	
	
	private Connection conn;      //원래 이렇게 전역 잡으면 안됌.   //나중에 properties나 xml로 빼버릴거임
									//import요청뜨는데 java.sql에 속한다.
	private PreparedStatement pstmt; // 오라클의 명령어를 처리해주는 애들. 
	
	
	public InsertTest() {
		//풀쿼리네임은 패키지이름까지 써서 다 만들어써줘야한다는것이다/
//		Class.forName("oracle.jdbc.driver.OracleDriver.class");
		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName(driver);
			System.out.println("드라이버 로딩...");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//접속.     여기서 한번만 접속 ?  노노 그럼 한번만 접속한다는거라 생성자에 두면 안됌!!
	}
	
	
	public void getConnection() {		
		//url  오라클 url     그래픽드라이버 이름 : 지포스
		//											amd
		// 오라클 드라이버에도 이름이 있는데 우리가 사용할 것은 thin 이다. 
		// thin - 오라클 드라이버 이름.   (오라클 드라이버에 이름 3가지나 있다. ) 그리고 각자꺼쓰니까 localhost, portnum  데이터베이스이름 써주기
		
		try {
//			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##java", "oracle");
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //http: https: 이건 웹이고 rmi: 원격
		System.out.println("접속");		
	}
	
	
	public void insertArticle() {
		 //접속했다끊었다가 해야하기 때문에  메인에다 안만들고 여기다 만듬.
		this.getConnection();
		
		//insert into dbtest value()  이거하고싶은데 자바파일은 모른다. 그래서 가이드 Statement가 필요한거다
		// pstmt가 오라클 명령어들을 실행할수있도록 해준다.
		// pstmt도 인터페이스이다.    커넥션보다도 메소드가 2배이상 더 많다. 그럼 누굴통해 생성하지 ? ? ? 
		// 어차피 이미 커넥션 통해서 만들어놨으니 커넥션통해서 만들자.
		
		
		
		Scanner scan = new Scanner(System.in);
		String name=""; 
//		String logtime=""; 
		int age=0;
		double height=0;
			

		try { 
			System.out.print("이름 : ");
			name = scan.next();
			System.out.print("나이 : ");
			age = scan.nextInt();
			System.out.print("키 : ");
			height = scan.nextDouble();
//			System.out.print("날짜 : ");
//			logtime = scan.next();
			
//																	이부분 데이터노출되니 ? 로 . 웹보안!!필요
//																	오라클은 1번부터 (0번아님!!)
//																	?에 데이터 매핑 필요
//			pstmt = conn.prepareStatement("insert into dbtest values('"+name+"', "+age+","+height+",sysdate)"); //문자열들어갈땐 ' ' 필요한거!!! ** 
			//자바는 자동커밋된다. 그래서 바로 확인 가능하다.
			
			String sql = "insert into dbtest values(?,?,?,sysdate)"; 
			
//			pstmt = conn.prepareStatement("insert into dbtest values(?,?,?,sysdate)"); // 
			pstmt = conn.prepareStatement(sql); // 
			//?에 데이터 주입
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setDouble(3, height);
			
			//만약 자동커밋 안하고싶으면 set commit=false ; 로 지정 가능.
			
			
			
			
			//오라클에 insert문법처리해주는 가이드 생성했음.
//			pstmt = conn.prepareStatement("오라클 sql"); //여기에 오라클 sql명령어를 넣으면 얘를 전담마크하는 가이드가 만들어지는것이다.
//			pstmt = conn.prepareStatement("insert into dbtest values('홍길동', 25, 175.567)"); //가이드 만들었음 생성만 한것임. - 컬럼수비일치해서 에러발생.
//			pstmt = conn.prepareStatement("insert into dbtest values('홍길동', 25, 175.567, sysdate)"); //가이드 만들었음 생성만 한것임.
				
			
			
			//실행
			int su = pstmt.executeUpdate(); // 실행   //항상 개수를 리턴해준다.      insert는 1개씩 하니까. 
			
			System.out.println(su+"개의 행이 만들어졌습니다.");
			
			// ORA-00947: 값의 수가 충분하지 않습니다  ---- 오라클 에러는 ORA 라고 뜸.
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
				try { //꼭 close해줘야한다. close순서는 꺼꾸로 해주기.
					
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
		}
		
		
	}
	
	
	public static void main(String[] args) {
		InsertTest it = new InsertTest();
		it.insertArticle();
	}
	
	
	
	
}
