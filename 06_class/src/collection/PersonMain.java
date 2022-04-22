package collection;

import java.util.ArrayList;

public class PersonMain {
	
	public ArrayList <PersonDTO> init() {
		
		
		
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("네오", 30);
		PersonDTO cc = new PersonDTO("프로도", 35);
		System.out.println(aa.getName() + "," + aa.getAge());
		System.out.println(bb.getName() + "," + bb.getAge());
		System.out.println(cc.getName() + "," + cc.getAge());
		
		
		
//		PersonDTO [] p = new PersonDTO[3];
//		p[0] = aa;
//		p[1] = bb;
//		p[2] = cc;
		
		//**************************
		
		ArrayList<PersonDTO> list = new ArrayList();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		
		
		
		return list;
		
	}
	
	
	
	public static void main(String[] args) {
		PersonMain pm = new PersonMain();
//		pm.init();
//		System.out.println();
//		
//
//		PersonDTO [] p = pm.init();
//		System.out.println();
		
//		
//		System.out.println(p[0].getName() + "," +p[0].getAge());
//		System.out.println(bb.getName() + "," + bb.getAge());
//		System.out.println(cc.getName() + "," + cc.getAge());
//		for(int i=0; i<3; i++) {
//			System.out.println(p[i].getName() + "," +p[i].getAge());
//		}
//		
		//***************************
		
		ArrayList<PersonDTO> ar = pm.init();
		System.out.println("list = " + ar);
		
		System.out.println();
		
		System.out.println(ar.get(0).getName() + "," + ar.get(0).getAge());
		
		
		for(PersonDTO p : ar) {
			System.out.println(p.getName() + ", " + p.getAge());
		}
		
		
		
		
		
		
		
		
		
		
	}
}
