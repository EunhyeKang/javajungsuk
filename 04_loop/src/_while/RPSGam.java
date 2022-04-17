package _while;
import java.util.Scanner;
public class RPSGam {

	   public static void main(String[] args) {

	      int money = 100; // 내가 가진 금액
	      
	      Scanner scan = new Scanner(System.in);
	      
	      while (true) {
	         
	      System.out.println();
	      System.out.print("가위(1), 바위(2), 보(3) 중 번호 입력 : ");
	      int num = scan.nextInt(); // 내가 낸 수
	      
	      int com = (int)(Math.random() *3) + 1; // 컴퓨터 수 
	      
	      System.out.print("배팅금액 입력 : ");
	      int batMoney = scan.nextInt(); // 배팅금액
	      
	      if (com == 1) { // 1 : 가위 2: 바위 3: 보
	         if (num ==1) {
	            System.out.println("컴 : 가위 나 : 가위 ");
	            System.out.println("비겼다");
	            System.out.println("당신의 금액은 "+ money + "입니다.");
	         } else if (num ==2) {
	            System.out.println("컴 : 가위 나 : 바위 ");
	            System.out.println("이겼다");
	            money += batMoney;
	            System.out.println("당신의 금액은 " + money + "입니다.");
	         }
	            else if (num ==3) {
	            System.out.println("컴 : 가위 나 : 보 ");
	            System.out.println("졌다");
	            money -= batMoney;
	            System.out.println("당신의 금액은 "+ money + "입니다.");
	         }
	      }
	      if (com == 2 ) {// 1 : 가위 2: 바위 3: 보
	         if (num ==1) {
	            System.out.println("컴 : 바위 나 : 가위 ");
	            System.out.println("졌다");
	            money -= batMoney;
	            System.out.println("당신의 금액은 "+ money + "입니다.");
	         } else if (num ==2) {
	            System.out.println("컴 : 바위 나 : 바위 ");
	            System.out.println("비겼다");
	            System.out.println("당신의 금액은 "+ money + "입니다.");
	         } else if (num == 3) {
	            System.out.println("컴 : 바위 나 : 보  ");
	            System.out.println("이겼다");
	            money += batMoney;
	            System.out.println("당신의 금액은 "+ money + "입니다.");
	         }
	      }
	      
	      if (com == 3 ) { // 1 : 가위 2: 바위 3: 보
	         if (num ==1) {
	            System.out.println("컴 : 보 나 : 가위  ");
	            System.out.println("이겼다");
	            money += batMoney;
	            System.out.println("당신의 금액은 "+ money + "입니다.");
	         } else if (num ==2) {
	            System.out.println("컴 : 보 나 : 바위  ");
	            System.out.println("졌다.");
	            money -= batMoney;
	            System.out.println("당신의 금액은 "+ money + "입니다.");
	         } else if (num == 3) {
	            System.out.println("컴 : 보 나 : 보 ");
	            System.out.println("비겼다");
	            System.out.println("당신의 금액은 "+ money + "입니다.");
	         }
	      } // if 

	       if (money < 0) {
	          System.out.print("또 하시겠습니까?(y/n) : ");
	          String ans = scan.next();
	          if (ans == "Y" || ans == "y") {
	        	  System.out.println("yyyyyyyyy");
	             money = 1000;
	            continue;
	          } else if (ans == "N" || ans == "n") {
	              System.out.println("종료됨.");
	             break;
	          }
	          
	       } // if

	      } //while
	      
	      } // main 
	   }