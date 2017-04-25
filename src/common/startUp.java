/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author roshann
 */
public class startUp {
    public static void main(String[] args) {
//        Address address1 = new Address();
//        address1.setAddress1("University Dr");
//        address1.setCity("Waukesha");
//        address1.setState("WI");
//        address1.setZipCode("53188");
//        
//        Address address2 = new Address();
//        address2.setAddress1("University Dr");
//        address2.setCity("Waukesha");
//        address2.setState("WI");
//        address2.setZipCode("53188");
//        
//        
//        if (address1.equals(address2)){
//            System.out.println("Both object equal");
//        }
//        else {
//            System.out.println("Both object not equal");
//        }
//        
//        System.out.println(" Address : " + address2.toString());
//        
        Dog dog1 = new Dog("Brown", 1);
        Dog dog2 = new Dog("Tomy", 2);
        Dog dog3 = new Dog("Saggy", 3);
        Dog dog4 = new Dog("Brown", 1);
//        
//        if (dog1.equals(dog2)){
//            System.out.println("Both dog are same");
//        } else {
//            System.out.println("Both dog are NOT same");
//        }
        
        //Lab #2 
        
        Employee emp1 = new Employee("Tom", "Brady", "123456789");
        Employee emp2 = new Employee("John", "Smith", "123456789");
        Employee emp3 = new Employee("Tony", "Blair", "123456789");
        Employee emp4 = new Employee("Tony", "Greg", "123456789");
        Employee emp5 = new Employee("Daniel", "Morris", "123456789");
        Employee emp6 = new Employee("Jack", "Daniel", "123456789");
        
        List empList = new ArrayList();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
        empList.add(emp6);
        
//        empList.forEach((e) -> {
//            System.out.println("Emplopee name : " + ((Employee) e).getFirstName());
//        });
    
        for(Object emp : empList){
//            System.out.println("Emp Name : " + ((Employee) emp).getFirstName() + ", " + ((Employee) emp).getLastName());
            System.out.println("Emp Name : " + ((Employee) emp).toString());
        }
        
        List <Employee> empListGeneric = new ArrayList<>();
        empListGeneric.add(emp1);
        empListGeneric.add(emp2);
        empListGeneric.add(emp3);
        empListGeneric.add(emp4);
        empListGeneric.add(emp1);
        System.out.println("=======================================================\n");
        empListGeneric.forEach((e) -> {
            System.out.println("Employee :" + e.toString());
        });
        
        
        List <Dog> dogListGeneric = new ArrayList<>();
        dogListGeneric.add(dog1);
        dogListGeneric.add(dog2);
        dogListGeneric.add(dog3);
        dogListGeneric.add(dog4);
        
        System.out.println("=======================================================\n");
        
        dogListGeneric.forEach((d) -> {
            System.out.println("Dog :" + d.toString());
        });
        
        Set <Dog> dogHastGeneric = new HashSet<>(dogListGeneric);
        
        List <Dog> dogListGeneric1 = new ArrayList<>(dogHastGeneric);
        
        System.out.println("=======================================================\n");
        
        dogListGeneric1.forEach((d) -> {
            System.out.println("Dog :" + d.toString());
        });


    }   
}
