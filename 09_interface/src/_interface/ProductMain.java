package _interface;

//프로그램 시작 끝
public class ProductMain {
	
	public static void main(String[] args) {
	
		
		Product ps = new ProductService(); //다형성    부모  =   new 자식
		ps.menu();
		System.out.println("프로그램을 종료합니다.");
		
	}
}
