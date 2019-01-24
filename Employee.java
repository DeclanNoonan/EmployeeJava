public abstract class Employee{
   private final String firstName;
   private final String lastName;
   private final String socialSecurityNumber;
   
   //constructor
   public Employee(String firstName, String lastName, String socialSecurityNumber){
      this.firstName = firstName;
      this.lastName = lastName;
      this.socialSecurityNumber = socialSecurityNumber;
   }
   
   //return first name
   public String getFirstName(){
      return firstName;
   }
   
   //return last name
   public String getLastName(){
      return lastName;
   }
   
   //return social security number
   public String getSocialSecurity(){
      return socialSecurityNumber;
   }
   
   @Override
   public String toString(){
      return String.format("%s %s%nsocial security number: %s",getFirstName(), getLastName(), getSocialSecurity());
   }

   //abstract method must be overridden by concrete subclasses
   public abstract double earnings();
   
   
}//end class