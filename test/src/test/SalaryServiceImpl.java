package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SalaryServiceImpl implements SalaryService {

	Scanner scan = new Scanner(System.in);
	List<SalaryDTO> list;

	SalaryServiceImpl() {
		list = new ArrayList<SalaryDTO>();
	}

	@Override
	public void menu() {

		int num = 0;

		while (true) {
			System.out.println("********************");
			System.out.println("1. 사원 등록");
			System.out.println("2. 전체 출력");
			System.out.println("3. 사원 정보 수정");
			System.out.println("4. 퇴사");
			System.out.println("5. 정렬");
			System.out.println("6. 종료");
			System.out.println("********************");

			try {
				scan = new Scanner(System.in);
				System.out.print(" 번호 입력 : ");
				num = scan.nextInt();

				if (!(1 <= num && num <= 6)) {
					System.out.println("잘못입력하셨습니다.(1~6)\n");
				}

			} catch (InputMismatchException e) {
				System.out.println("잘못입력하셨습니다.(1~6)\n");
			}

			if (num == 1) insertEmp();
			if (num == 2) displayEmp();
			if (num == 3) updateEmp();
			if (num == 4) deleteEmp();
			if (num == 5) sortEmp();
			if (num == 6) break;
		}
	}

	@Override
	public void insertEmp() {

		int num, basePay, extraPay;
		String name, title;

		System.out.print("사원번호 입력 : ");
		num = scan.nextInt();
		System.out.print("사원명 입력 : ");
		name = scan.next();
		System.out.print("직급 입력 : ");
		title = scan.next();
		System.out.print("기본급 입력 : ");
		basePay = scan.nextInt();
		System.out.print("수당 입력 : ");
		extraPay = scan.nextInt();

		SalaryDTO dto = new SalaryDTO(num, name, title, basePay, extraPay);
		list.add(dto);

		System.out.println("등록 완료");

	}

	@Override
	public void displayEmp() {

		System.out.println("사원번호\t이름\t직급\t기본급\t수당\t세율\t세금\t월급");

		for (SalaryDTO dto : list) {
			System.out.println(dto);
		}
		System.out.println();
	}

	@Override
	public void updateEmp() {
	
		
		displayEmp();
		System.out.print("사원 번호 입력 :");
		int n = scan.nextInt();
		
		boolean b = false;
		
		for (SalaryDTO dto : list) {
			if (dto.getNum() == n) {
				b = true;
				System.out.println(dto.toString());

				System.out.print("직급 입력 : ");
				dto.setTitle(scan.next());
				System.out.print("기본급 입력 : ");
				dto.setBasePay(scan.nextInt());
				System.out.print("수당 입력 : ");
				dto.setExtraPay(scan.nextInt());
				dto.calc();
				System.out.println("수정이 완료되었습니다.");
			}		
		}//for
		if(b==false) {
			System.out.println("찾고자하는 사원이 없습니다.");
		}

	}

	@Override
	public void deleteEmp() {
		
		displayEmp();
		System.out.print("사원 번호 입력 :");
		boolean b = false;
		int n = scan.nextInt();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNum() == n) {
				b = true;
				list.remove(i);
				System.out.println("퇴사처리 되었습니다.");
				break;
			}
		} // for
		if(b==false) {
			System.out.println("찾고자하는 사원이 없습니다.");
		}

	}

	@Override
	public void sortEmp() {

		int num = 0;

		while (true) {
			System.out.println("******************");
			System.out.println("  1. 이름 오름차순");
			System.out.println("  2. 월급 내림차순");
			System.out.println("  3. 이전 메뉴");
			System.out.println("*****************");
			System.out.println(" 번호 입력 :");
			num = scan.nextInt();

			if (num == 1) { 

				Comparator<SalaryDTO> com = new Comparator<SalaryDTO>() {
					@Override
					public int compare(SalaryDTO s1, SalaryDTO s2) {
						return s1.getName().compareTo(s2.getName());
					}
				};

				Collections.sort(list, com);
				displayEmp();

			}

			else if (num == 2) {

				Collections.sort(list);
				this.displayEmp();

			} else if (num == 3) {
				break;
			} else
				continue;

		} // while

	}

}
