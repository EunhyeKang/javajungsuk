
public class ReferenceExample {

   public static void main(String[] args) {

      
      Product p1 = new Product();
      int q = 0;
      
      System.out.println("이름 = " + p1.name);
      System.out.println("가격 = " + p1.price);
      System.out.println("갯수 = " + q);

      updateProduct(    p1    );
      addQuantity(q);
      
      System.out.println("이름 = " + p1.name);
      System.out.println("가격 = " + p1.price);
      System.out.println("갯수 = " + q);
      
      
   }   
   
   static void updateProduct(Product p) {
      p.name = "아이패드";
      p.price = 300000;
   }
   
   static void addQuantity(int q) {
	   q = 1000;
   }
}


class Product{
   String name = "없음";
   int price = 0;
   
}