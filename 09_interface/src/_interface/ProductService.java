package _interface;

import java.util.Scanner;

//일하는애
public class ProductService implements Product{

	private ProductDTO[] ar = new ProductDTO[5];
	
	public void menu() {
		Scanner scan = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("*********************");
			System.out.println("   1. 물건 담기");
			System.out.println("   2. 담은 물건 보기");
			System.out.println("   3. 종료");
			
			System.out.println("*********************");
			System.out.print("   번호 선택 : ");
			num = scan.nextInt();
			System.out.println();
			
			if(num==3) break; //while을 벗어나라
			
			
			if(num == 1) {
				insertProduct();
			}else if(num == 2){
				displayProduct();
			}
			
		}//while  
	}//menu()
	

	public void insertProduct() {
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<ar.length; i++) {//빈장바구니인지 체크
			if(ar[i]==null) {
				
				ar[i] = new ProductDTO();

				System.out.print("물건이름:");
				ar[i].setItem(scan.next());
				System.out.print("가격:");
				ar[i].setPrice(scan.nextInt());
				System.out.print("수량:");
				ar[i].setQty(scan.nextInt());
				
				ar[i].calc();
				break;
			}
		}//for
	}//insertProduct
	
	
	public void displayProduct() {
		
		for( int i=0; ar[i]!=null; i++) {
			System.out.printf("%s\t%d\t%d ",ar[i].getItem(),ar[i].getQty(),ar[i].getTotal());
			System.out.println();
		}
	}




	
	

	
}
