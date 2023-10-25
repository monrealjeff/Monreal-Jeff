import java.util.Scanner;

public class Activity3Monreal {
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      double phpToDollar = 56.00;
      double c1 = 100.00;
      double c2 = 150.00;
      double c3 = 200.00;
      double r1 = 35.00;
      double r2 = 50.00;
   
      System.out.println("Menu: ");
      System.out.println("1. C1 = Php" + c1);
      System.out.println("2. C2 = Php" + c2);
      System.out.println("3. C3 = Php" + c3);
   
      System.out.println("Add-Ons: ");
      System.out.println("4. R1 = Php" + r1);
      System.out.println("5. R2 = Php" + r2);
   
      double totalOrderPrice = 0.0;
      int quantityC1 = 0;
      int quantityC2 = 0;
      int quantityC3 = 0;
      int quantityR1 = 0;
      int quantityR2 = 0;
      
      while(true) {
         System.out.print("Place Your Orders or (0 to finish): ");
         int Order = input.nextInt();
      
         if (Order == 0) {
            break;
         }
      
         System.out.print("Enter The Quantity: ");
         int Quantity = input.nextInt();
      
         double itemPrice = 0.0;
      
         switch (Order) {
            case 1:
               itemPrice = c1 * Quantity;
               quantityC1 += Quantity;
               break;
            case 2:
               itemPrice = c2 * Quantity;
               quantityC2 += Quantity;
               break;
            case 3:
               itemPrice = c3 * Quantity;
               quantityC3 += Quantity;
               break;
            case 4:
               itemPrice = r1 * Quantity;
               quantityR1 += Quantity;
               break;
            case 5:
               itemPrice = r2 * Quantity;
               quantityR2 += Quantity;
               break;
            default:
               System.out.println("Invalid choice.");
         }
      
         totalOrderPrice += itemPrice;
      }
   
      input.close();
   
      double totalOrderInDollars = totalOrderPrice / phpToDollar;
   
      System.out.println("\nTotal Order Price (PHP): Php " + String.format("%.2f", totalOrderPrice));
      System.out.println("Total Order Price (USD): $ " + String.format("%.2f", totalOrderInDollars));
      
      System.out.println("Quantity Ordered:");
      System.out.println("C1: " + quantityC1);
      System.out.println("C2: " + quantityC2);
      System.out.println("C3: " + quantityC3);
      System.out.println("R1: " + quantityR1);
      System.out.println("R2: " + quantityR2);
   }
}