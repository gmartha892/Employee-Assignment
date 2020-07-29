/*Martha Gonzalez
*CSCI 1302
*Assignment #2
*July 5, 2020
*/
import java.util.Scanner;
import java.util.ArrayList;

/**
 *  This class represents the <em>employee</em>. Employees have 
 *  a name, address, pay rate and an employee ID.
 *  @author Martha Gonzalez
 *  @version 1.0 
 */
 
class Employee{
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
/**
 *  This class represents the <em>address</em>. Employees have 
 *  a house number, street name and city.
 *  @author Martha Gonzalez
 *  @version 1.0 
 */

class Address{
   //attributes
   //visibility type name;
   private String houseNum;
   private String streetName;
   private String city; 

/** Constructs a new Address object with the given house number,
 *  street name and city.
 *  @param houseNum the number of the of the employee's home 
 *  @param streetName the street name of the employee
 *  @param city the city of the employee
 */
public Address(String houseNum, String streetName, String city){
   this.houseNum=houseNum;
   this.streetName=streetName;
   this.city=city;
   }

public void setHouseNum(String houseNum){
   this.houseNum=houseNum;}

public String getHouseNum(){
   return houseNum;}

public void setStreetName(String streetName){
   this.streetName=streetName;}

public String getStreetName(){
   return streetName;}

public void setCity(String city){
   this.city=city;}

public String getCity(){
   return city;}

//copy constructor
/** Constructs a copy of the Address object of this house number,
 *  street name and city to the other house number, street name and city.
 *  @param other the copy of the number of the of the employee's home 
 */
public Address(Address other){
   this(other.houseNum, other.streetName, other.city);
   }

//added a toString method
/**
 * A string representation of an address. It will display the
 * house number of the employee, the street name of the employee, 
 * and the city of the employee.
 * @return string representation of a {@code Address} object.
 */
public String toString(){
   return houseNum+ " " + streetName+ " " + city;
   }
   } 

public class DriverEmployee0{
public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);   
      ArrayList<Employee> employeeData= new ArrayList <>();
         for(int i=0; i<3; i++){//might have to fix this number
    
    System.out.print("Enter employee's house number : ");
    String houseNum = keyboard.nextLine();  // house number
   
    System.out.print("Enter employee street name: ");
    String streetName = keyboard.nextLine();  // street name
    
    System.out.print("Enter employee city: ");
    String city = keyboard.nextLine();  // city

    System.out.print("Enter employee first name: ");
    String name = keyboard.nextLine();  // name
         
    System.out.print("Enter employee's pay rate " );
    int payRate = keyboard.nextInt();  // payRate 
    keyboard.nextLine();       
    
    Address address= new Address(houseNum, streetName, city);
    Employee employeeInfo = new Employee(name, address, payRate);
    
    employeeData.add(employeeInfo);    
    }
    
    //print the array list
    for(int i=0; i<employeeData.size(); i++){
    System.out.println(employeeData.get(i));
    employeeData.get(i).work();
    }
   
    }}