/**
 *  This class represents the <em>employee</em>. Employees have 
 *  a name, address, pay rate and an employee ID.
 *  @author Martha Gonzalez
 *  @version 1.0 
 */
public class Employee{
   //attributes
   //viability type name;
   private String name;
   private Address address; //calling address class
   private int payRate;
   private static int employeeCounter = 1; //static variable counter
   private String employeeID;

public void setName(String name){
   this.name=name;}

public String getName(){
   return name;}

public void setPayRate(int payRate){
   this.payRate=payRate;}

public int getPayRate(){
   return payRate;}

/** Constructs a new Employee object with the given name, address
 *  and pay rate.
 *  @param name the first name of the employee 
 *  @param address the address of the employee
 *  @param payRate the amount of money the employee is paid
 */

public Employee(String name, Address address, int payRate){
   this.name=name;
   this.address = new Address(address);
   this.payRate=payRate;
   this.employeeID = Integer.toString(employeeCounter); 
   employeeCounter++;
   }

/**
 * Simply informs that each employee is working 
 * it returns nothing
 */
public void work(){
   System.out.println("Workin' for the man");
   }

//added an equals method
/**
 * Indicates whether an employee is equal to another employee 
 * @param other the other employee object 
 * @return boolean of a {@code Employee other} object 
 */
public boolean equals (Employee other){
       return (this.name.equals(other.name) && this.employeeID==other.employeeID);
       }
    
//added a toString method
/**
 * A string representation of an employee. It will display the
 * name of the employee, the current address of the employee, 
 * the pay rate of the employee and the employee's ID.
 * @return string representation of a {@code Employee} object.
 */
public String toString(){
       return "First Name: " + this.name + "\n"+
               "Address: " + this.address +  "\n" +
               "Pay rate: " + this.payRate +  "\n" + 
               "Employee ID: " + this.employeeID + "\n";
       }
       }