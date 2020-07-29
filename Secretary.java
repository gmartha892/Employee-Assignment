/*Martha Gonzalez
*CSCI 1302
*Assignment #3
*July 24, 2020
*/

/**
 *  This class represents the <em>secretary</em>. Secretaries have 
 *  a name, address, pay rate, employee ID and an office location.
 *  @author Martha Gonzalez
 *  @version 1.0 
 */

public class Secretary extends Employee{
   //attributes
   //viability type name;
   private String officeLocation;
  
/**
 * Simply informs that each secretary is filing a legal brief
 * it returns nothing and it overrides the work method
 */
   @Override
   public void work(){
       System.out.println("Filing a legal brief");
   }
   
/** Constructs a new Secretary object with the given name, address
 *  , pay rate and office location.
 *  @param name the first name of the employee 
 *  @param address the address of the employee
 *  @param payRate the amount of money the employee is paid
 *  @param officeLocation the room number of secretary office
 */

   public Secretary(String officeLocation,String name, Address address, int payRate){
      super(name, address, payRate); 
      this.officeLocation = officeLocation;        
      }
   
   public void setOfficeLocation(String officeLocation){
      this.officeLocation =officeLocation;}

   public String getOfficeLocation(){
      return officeLocation;}
}