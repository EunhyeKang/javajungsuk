package inheritance;

class AA {
	
	protected int a = 3; 

	public void disp() {
		a += 5;
		System.out.print("AA : "+ a + " ");
	}
	
}


class BB extends AA{
	
	public int a = 8;
	
	public void disp() {
		this.a += 5; //this.a = this.a + 5
		System.out.print("BB : " + a + " ");
	}
}

public class TestMain2 {
	public static void main(String[] args) {
		
		BB aa = new BB();
		aa.disp(); // 8 + 5; BB : 13
		System.out.println("aa : " + aa.a); // aa : 13
		
		System.out.println("-------------------------");
		
		AA bb = new BB(); //   부모 bb = new 자식();
		bb.disp(); // 13
		System.out.println("bb : " + bb.a); // 3   //a는 오버라이드 아니다. 그런거 없다~.
		System.out.println();
		
		System.out.println("-------------------------");
		
		AA cc = new AA();
		cc.disp(); // 8
		System.out.println("cc : " + cc.a); // 8
	
		System.out.println("-------------------------");
		
		
		
//		현재 BB의 a =13 인상태
		
		BB dd = (BB)bb; //    지금 자식 = ( ) 부모  상태임   참조변수 bb는 BB()를 가리키고있다.
//		BB dd = (BB)cc;  	//캐스팅불가	 -error, casting X			//참조변수 dd는 AA()를 가리키고 있다.
		dd.disp(); // 13				메모리에 잡혀있느냐에 따라 달라진다.
		
		
		System.out.println("dd : " + dd.a); //
		System.out.println();
	}
}
