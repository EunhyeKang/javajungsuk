package _interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExaminationServiceImpl implements ExaminationService {
//	private List<ExaminationDTO> list;
	private List<ExaminationDTO> list = new ArrayList<ExaminationDTO>();
	Scanner scan = new Scanner(System.in);
	int num;

	@Override
	public void insertArticle() {
		System.out.print("인원수 입력 : ");
		num = scan.nextInt();
		
		
		
		System.out.print("이름 입력 :");
		
		
		
		
	}

	@Override
	public void printArticle() {
		
	}
	
	
	public void menu() {
		
		while (true) {
			System.out.println("*****************");
			System.out.println("  1. 입력");
			System.out.println("  2. 출력");
			System.out.println("  3. 끝");
			System.out.println("*****************");
			System.out.print("  번호 : ");
			int select = scan.nextInt();
			System.out.println();
			
			if(select == 1) insertArticle();
			if(select == 2) printArticle();
			if(select == 3) break;
			else continue;
		}
		
	}
}



//부모 = 자식
//List<ExaminationDTO> list = new ArrayList<ExaminationDTO>();



//이름 입력 : 홍길동
//답 입력 : 14123
//
//이름 입력 : 코난
//답 입력 : 11111
//
//이름 입력 : 또치
//답 입력 : 13242
//
//이름      1 2 3 4 5   점수
//홍길동   O X O X X   40
//코난      O O O O O   100
//또치      O X X X X   20