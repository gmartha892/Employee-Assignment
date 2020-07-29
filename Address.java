/**
 *  This class represents the <em>address</em>. Employees have 
 *  a house number, street name and city.
 *  @author Martha Gonzalez
 *  @version 1.0 
 */

public class Address{
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