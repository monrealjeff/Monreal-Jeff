import java.util.Scanner;
public class RoutesToMoalboal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome Come!");
        System.out.println("Here are the default routes:");

        displayDefaultRoutes(); 

        System.out.print("Is Barili obstructed? (1 = Yes, 0 = No): ");
        int isBariliObstructed = input.nextInt();

        double distance;
        double speed;
        double eta;
        int isDumanjugObstructed = 0; 
        
        if (isBariliObstructed == 1) {  
            System.out.print("Is Dumanjug obstructed? (1 = Yes, 0 = No): ");
            isDumanjugObstructed = input.nextInt();
           
            if (isDumanjugObstructed == 1) {
                distance =102 ;
            } else {
                distance = 97 ;
            }
        } else {
            distance = 85;
        }
       
        System.out.print("Enter the speed (in km/h): ");
        speed = input.nextDouble();
        eta = distance / speed;

        int hours = (int) eta;
        int minutes = (int) ((eta - hours) * 60);
      
        printRecommendedRoute(isBariliObstructed, isDumanjugObstructed);
       
        System.out.println("==========Additional Data============");
        System.out.println("    Distance: " + distance + " km");
        System.out.println("    Speed: " + speed + " km/h");
        System.out.println("    Estimated Time of Arrival (ETA): " + hours + " hours " + minutes + " minutes");

        input.close();
    }

    private static void displayDefaultRoutes() {
        System.out.println("==========Default Routes============");
        System.out.println("     Cebu City    (Start)");
        System.out.println("     Minglanilla  (Route 1)");
        System.out.println("     San Fernando (Route 2)");
        System.out.println("     Carcar       (Route 3)");
        System.out.println("     Barili       (Route 4)");
        System.out.println("     dumanjug     (Route 4.1.1)");
        System.out.println("     Alcantara    (Route 4.1.2)");
        System.out.println("     Moalboal     (End)");
           }

    private static void printRecommendedRoute(int isBariliObstructed, int isDumanjugObstructed) {
        System.out.println("==========Recommended Route==========");

        if (isBariliObstructed == 1) {
            if (isDumanjugObstructed == 1) {
            System.out.println("    Cebu City     (Start)");
            System.out.println("    Minglanilla   (Route 1)");
            System.out.println("    San Fernando  (Route 2)");
            System.out.println("    Carcar        (Route 3)");
            System.out.println("    Sibonga       (Route 4.2)");
            System.out.println("    Argao         (Route 5)");
            System.out.println("    Ronda         (Route 5.1)");
            System.out.println("    Alcantara     (Route 5.2)");
            System.out.println("    Moalboal      (End)");
            
                          } else {         
            System.out.println("    Cebu City     (Start)");
            System.out.println("    Minglanilla   (Route 1)");
            System.out.println("    San Fernando  (Route 2)");
            System.out.println("    Carcar        (Route 3)");
            System.out.println("    Sibonga       (Route 4.2)");
            System.out.println("    Dumanjug      (Route 4.1.1)");
            System.out.println("    Alcantara     (Route 4.2.2)");
            System.out.println("    Moalboal      (End)");
            }
            
        } else {
            System.out.println("    Cebu City    (Start)");
            System.out.println("    Minglanilla  (Route 1)");
            System.out.println("    San Fernando (Route 2)");
            System.out.println("    Carcar       (Route 3)");
            System.out.println("    Barili       (Route 4.1)");
            System.out.println("    Dumanjug     (Route 4.1.1)");
            System.out.println("    Moalboal     (End)");
            
         }
    }
}