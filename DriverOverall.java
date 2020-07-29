import java.util.Scanner;
import java.util.ArrayList;

public class DriverOverall{
public static void main(String[] args){
    Employee employeeInfo = null;
    String practice = " ";
    int billableHour = 0;
    String officeLocation = " ";
    
    Scanner keyboard = new Scanner(System.in);   
      ArrayList<Employee> employeeData= new ArrayList <>();
         for(int i=0; i<5; i++){
    
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
    
    System.out.print("Employee type [1]Lawyer [2]Secretary: ");
    int employeeType = keyboard.nextInt();  // employeeType
    keyboard.nextLine();
    
       if (employeeType ==1){
    
          System.out.print("Enter practice of Lawyer: ");
          practice = keyboard.nextLine();  // practice
          
          System.out.print("Enter billable hours of Lawyer: ");
          billableHour = keyboard.nextInt();  // billableHours
          keyboard.nextLine();
          }
             if (employeeType==2){
             System.out.print("Enter secretary's office number: ");
             officeLocation = keyboard.nextLine();  // officeLocation
             }
               
    
    Address address= new Address(houseNum, streetName, city);
    // what to add to the employee depending on type
    switch(employeeType){
    case 1:
    employeeInfo = new Lawyer(billableHour, practice, name, address, payRate);
    break;
    
    case 2:
    employeeInfo =  new Secretary(officeLocation, name, address, payRate);
    break;
    } 
        
    employeeData.add(employeeInfo);    
    }
    
//print the array list
    for(int i=0; i<employeeData.size(); i++){
    System.out.println(employeeData.get(i));
     
    employeeData.get(i).work();
    }
    
    //add boolean to search here
    boolean searchEmployee = false;
    System.out.println("Enter the name of the employee you're searching for");
    
    String searchName = keyboard.nextLine(); //searchName
     
      for(int i=0; i<employeeData.size(); i++){
         if(employeeData.get(i).getName().equals(searchName)){
            employeeData.get(i).work();
            searchEmployee=true;  }}
         if(!searchEmployee){
            System.out.println("The employee has not been found.");}
    }
}