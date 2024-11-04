
package com.mycompany.lab5;
class Employee{
    int id;
    String name;
    double basic, bonus, overtime, insurance, tax, netSalary;
    
    void display(){
        System.out.println("Employee Id: "+id);
        System.out.println("Employee name: "+name);
        System.out.println("Basic salary: "+basic);
        System.out.println("Overtime pay: "+ overtime);
        System.out.println("Insurance: "+insurance);
        System.out.println("Tax: "+tax);
        System.out.println("Net salary: "+calculateNetSalary());
    }
    double calculateNetSalary(){
        netSalary = (basic+bonus+overtime) - (insurance+tax);
        return netSalary;
    }
}

public class repo1 {
        public static void main(String[] args) {
        
        Employee emp1 = new Employee();
        
        emp1.id = 1;
        emp1.name = "Kamal";
        emp1.basic = 20000;
        emp1.bonus = 10000;
        emp1.overtime = 5000;
        emp1.insurance = 2000;
        emp1.tax = 1000;
        
        
        
        emp1.display();
    
    }
}
