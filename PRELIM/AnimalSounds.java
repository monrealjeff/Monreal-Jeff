import java.util.Scanner;

class Animal {
String sound;

Animal(String sound) {
this.sound = sound;

}

void speak() {
System.out.println("The animal you pick sound like this: " + sound);
}
}
class Lion extends Animal {
Lion() {
super("Roooaaarrrrrrrrrr!!!!!!");
}
}
class Snake extends Animal {
Snake() {
super("Hhhssssssssssss!!!!!!!!");
}
}
class Bird extends Animal {
Bird() {
super("Chirp!!Chirp!!cheep!!cheep!!");
}
}
class Elephant extends Animal {
Elephant() {
super("Pawooo!Pawooo!Pawooo!Pawooo!");
}
}

public class AnimalSounds {
public static void main(String[] args) {
System.out.println("====== Activity One: What Does Animal Say? =======");
System.out.println("Select an Animal:");
System.out.println("1. Lion");
System.out.println("2. Snake");
System.out.println("3. Bird");
System.out.println("4. Elephant");

Scanner scanner = new Scanner(System.in);
int choice = scanner.nextInt();
scanner.close();

Animal animal;

switch (choice) {
case 1:                                             
animal = new Lion ();
break;
case 2:
animal = new Snake ();
break;
case 3:
animal = new Bird();
break;
case 4:
animal = new Elephant();
break;
default:
System.out.println("Invalid choice. Please select a valid option.");
return;
}

animal.speak();
}
}