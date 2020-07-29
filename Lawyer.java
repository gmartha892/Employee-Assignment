/*Martha Gonzalez
*CSCI 1302
*Assignment #3
*July 24, 2020
*/

/**
 *  This class represents the <em>lawyer</em>. Lawyers have 
 *  a name, address, pay rate, employee ID , billable hours and practice.
 *  @author Martha Gonzalez
 *  @version 1.0 
 */
public class Lawyer extends Employee{
   //attributes
   //viability type name;
   private int billableHour;
   private String practice;
   
   /** Constructs a new Lawyer object with the given name, address
 *  , pay rate and billable hours and practice.
 *  @param name the first name of the employee 
 *  @param address the address of the employee
 *  @param payRate the amount of money the employee is paid
 *  @param billableHour the amount of hours that are billable
 *  @param practice the type of practice the lawyers specialize in */
   
   public Lawyer(int billableHour, String practice,String name, Address address, int payRate){
      super(name, address, payRate); 
      this.billableHour = billableHour;
      this.practice = practice;         
      }
      
   public void setBillabHour(int billableHour){
      this.billableHour=billableHour;}

   public int getBillableHour(){
      return billableHour;}

   public void setPractice(String practice){
      this.practice =practice;}

   public String getPractice(){
      return practice;}
/**
 * Simply informs that each lawyer is handling a certain type of case and the billable's hours
 * it returns nothing and it overrides the work method
 */

     public void work(){
       System.out.println("Handling a " + practice + " case for " + billableHour + " hour/s.");
   }

      }