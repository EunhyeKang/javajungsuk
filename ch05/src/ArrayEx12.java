
public class ArrayEx12 {

	public static void main(String[] args) {
		
	String[] names = {"kim","park","yi"};
	
	for(int i=0; i<names.length; i++) {
		System.out.println("names[" +i+ "]:"+names[i]);
		
	}
	/*for(String temp:names) {
		System.out.println(temp);
	}*/
	String tmp = names[2];
	System.out.println("tmp:"+tmp);
	names[0]="yu";
	
	for(String str:names)
		System.out.println(str);


	
	}
}
