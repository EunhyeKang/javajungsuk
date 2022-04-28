package collection;

public class PersonDTO implements Comparable<PersonDTO>{
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	private String name;
	private int age;
	
	
	public PersonDTO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	public static void main(String[] args) {
		
	}


//	@Override   //오름차순
//	public int compareTo(PersonDTO p) {
//		if(this.age < p.age) return -1;
//		else if(this.age > p.age) return 1;
////		else if(this.age == p.age) return 0;
//		else return 0;
//		
//	}
	
	
	@Override  //내림차순
	public int compareTo(PersonDTO p) {
		if(this.age < p.age) return 1;
		else if(this.age > p.age) return -1;
//		else if(this.age == p.age) return 0;
		else return 0;
		
	}
	
	
	
	
	@Override
	public String toString() {
		return "[" + name + ", " + age + "]";
	}
}
