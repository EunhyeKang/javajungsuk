import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}

public class CardTest {
	public static void main(String[] args) {
		System.out.println("card.width = "+Card.width);
		System.out.println("card.hight = "+Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.printf("c1은 %s %d   %d %d%n",c1.kind,c1.number,c1.width,c1.height);
		System.out.printf("c2은 %s %d   %d %d%n%n",c2.kind,c2.number,c2.width,c2.height);
		
		c1.width = 50;
		c1.height = 80;
		
		System.out.printf("c1은 %s %d   %d %d%n",c1.kind,c1.number,c1.width,c1.height);
		System.out.printf("c2은 %s %d   %d %d%n",c2.kind,c2.number,c2.width,c2.height);
		
		
		
		
		
	}
}
