import java.util.Scanner;

public class Student {
    private String first_name;
    private String middle_name;
    private String last_name;
    private String suffix;
    
    public Student(String first_name, String middle_name, String last_name, String suffix) {
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.suffix = suffix;
    }

    public String getFirstName() {
        return first_name;
    }

    public String getMiddleName() {
        return middle_name;
    }

    public String getLastName() {
        return last_name;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public void setMiddleName(String middle_name) {
        this.middle_name = middle_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
    
    public String getFullName() {
        String fullName = first_name + " ";
        
        if (middle_name != null && !middle_name.isEmpty()) {
            fullName += middle_name + " ";
        }
        
        fullName += last_name;
        
        if (suffix != null && !suffix.isEmpty()) {
            fullName += " " + suffix;
        }
        
        return fullName;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String first_name = scanner.nextLine();

        System.out.print("Enter Middle Name: ");
        String middle_name = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String last_name = scanner.nextLine();

        System.out.print("Enter Suffix: ");
        String suffix = scanner.nextLine();

        Student student = new Student(first_name, middle_name, last_name, suffix);

        System.out.println("\nFirst Name: " + student.getFirstName());
        System.out.println("Middle Name: " + student.getMiddleName());
        System.out.println("Last Name: " + student.getLastName());
        System.out.println("Suffix: " + student.getSuffix());
        System.out.println("Full Name: " +student.getFullName());

        scanner.close();
    }
}