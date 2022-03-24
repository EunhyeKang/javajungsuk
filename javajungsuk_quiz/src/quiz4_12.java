
public class quiz4_12 {
	public static void main(String[] args) {
		int x=2;
		for(int k=0; k<3; k++,x+=3) {
			for(int i=1; i<=3; i++) {
				int count=0;
				for( int j=x; j<=9; j++) {
					System.out.printf("%d*%d=%d\t",j,i,i*j);
					count++;
					if(count==3) {break;}
				}
				System.out.println();
			}
			System.out.println();
		}
		/*
		for(int i=1; i<=3; i++) {
			int count=0;
			for(int j=2; j<=9; j++) {
				System.out.printf("%d*%d=%d\t",j,i,i*j);
				count++;
				
				if(count==3)break;
			}
			System.out.println();
		
		}
		System.out.println();
		
		for(int i=1; i<=3; i++) {
			int count=0;
			for(int j=5; j<=9; j++) {
				System.out.printf("%d*%d=%d\t",j,i,i*j);
				count++;
				
				if(count==3)break;
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1; i<=3; i++) {
			int count=0;
			for(int j=8; j<=9; j++) {
				System.out.printf("%d*%d=%d\t",j,i,i*j);
				count++;
				
				if(count==3)break;
			}
			System.out.println();
		
		}
		*/
		
		
	}
}
