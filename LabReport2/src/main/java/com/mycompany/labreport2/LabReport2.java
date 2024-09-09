
package com.mycompany.labreport2;

class Addition{
    int num1, num2, num3;
    Addition(){
        num1 = 10;
        num2 = 20;
    }
    Addition(int n1, int n2){
        num1 = n1;
        num2 = n2;
    }
    Addition(int num1, int num2, int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    int add(){
        int result = num1+num2+num3;
        return result;
    }  
}

public class LabReport2 {
    public static void main(String[] args) {
        
       Addition obj1 = new Addition();
       System.out.println(obj1.add());
       
       Addition obj2 = new Addition(12, 14);
       System.out.println(obj2.add());
       
       Addition obj3 = new Addition(1,2,3);
        System.out.println(obj3.add());
    }
}
