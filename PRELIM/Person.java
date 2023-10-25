public class Person {
   private String FirstName ;
   private String MiddleName;
   private String LastName;
   private int Age;
   private String Birthday;
   private String Address;
   
   public void Student(){
   
   }
   
   public void setFirstName(String FirstName){
      this.FirstName = FirstName;
   }
   public String getFirstName(){
      return FirstName;
   }
   public void setMiddleName(String MiddleName){
      this.MiddleName = MiddleName;
   }
   public String getMiddleName(){
      return MiddleName;
   }
   public void setLastName(String LastName){
      this.LastName = LastName;
   }
   public String getLastName(){
      return LastName;
   }
   public void setAge(int Age){
      this.Age = Age;
   }
   public int getAge(){
      return Age;
   }
   public void setBirthday(String Birthday){
      this.Birthday = Birthday;
   }
   public String getBirthday(){
      return Birthday;      
   }
   public void setAddress(String Address){
      this.Address = Address;
   }
   public String getAddress(){
      return Address;      
   }
   
   public static void main(String[] args){
      Person a = new Person();
      a.setFirstName("Jeff");
      a.setMiddleName("Ranido");
      a.setLastName("Monreal");
      a.setAge(21);
      a.setBirthday("08-08-2002");
      a.setAddress("Gudalupe Cebu City");
         
      System.out.println("First Name: " + a.getFirstName());  
      System.out.println("MIddle Name: " + a.getMiddleName());
      System.out.println("Last Name: " + a.getLastName());
      System.out.println("Age: " + a.getAge());
      System.out.println("Birthday: " + a.getBirthday());
      System.out.println("Address: " + a.getAddress()); 
         
   }   
}