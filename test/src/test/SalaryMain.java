package test;

import java.util.ArrayList;
import java.util.List;

public class SalaryMain {
	
	public static void main(String[] args) {
		
		SalaryServiceImpl salaryServiceImpl = new SalaryServiceImpl();
		salaryServiceImpl.menu();
		System.out.println("프로그램을 종료합니다."); 
		
	}

}
