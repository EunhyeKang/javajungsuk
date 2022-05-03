package student.dao;

public class StudentMain {
	
	public static void main(String[] args) {
		
		StudentDAOImpl studentDAOImpl = new StudentDAOImpl();
		studentDAOImpl.menu();
		System.out.println("프로그램을 종료합니다.");
	}
	
}


//Project  : student
//Package : student.dao
//Interface : StudentDAO.java
//Class     : StudentDAOImpl.java
//            StudentMain.java