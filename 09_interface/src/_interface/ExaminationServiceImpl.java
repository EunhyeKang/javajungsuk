package _interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExaminationServiceImpl implements ExaminationService {
//	private List<ExaminationDTO> list;
	private List<ExaminationDTO> list;
	Scanner scan = new Scanner(System.in);
	int num;

	public ExaminationServiceImpl() {
		list = new ArrayList<ExaminationDTO>(); // 부모 = 자식
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
			
		}//while
		
	}//menu()
	
	
	
	@Override
	public void insertArticle() {
		
		
		System.out.print("인원수 입력 : ");
		num = scan.nextInt();
		
		
		
		System.out.print("이름 입력 :");
		String name = scan.next();
		System.out.print("답 입력 : ");
		String dap = scan.next();
		
//		ExaminationDTO dto = new ExaminationDTO();
//		dto.setName(name);
//		dto.setDap(dap);
		
		ExaminationDTO dto = new ExaminationDTO(name,dap);
		dto.compare();
		
		list.add(dto);
		System.out.println("입력이 완료되었습니다.");
		
		
		
	}

	@Override
	public void printArticle() {
		System.out.println("이름\t1 2 3 4 5  점수");
		
		//for(int i=0; i<list.size(); i++)
		for(ExaminationDTO dto : list) {
			
			System.out.print(dto.getName() +"\t");
			for(int i=0; i<dto.getOx().length; i++) {
				System.out.print(dto.getOx()[i] + " ");
				
			}
			
			
			System.out.println(dto.getScore());
		}
		
		
		System.out.println();System.out.println();
		
		for(ExaminationDTO dto : list) {
			System.out.println(dto);
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