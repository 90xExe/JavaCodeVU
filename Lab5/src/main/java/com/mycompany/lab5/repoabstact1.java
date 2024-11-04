
package com.mycompany.lab5;


abstract class University{
 public String universityname;
 public int noOfDept;
 
 abstract int getUniversityRanking();
 abstract int getStudentCount();
 
}

//ruet
class RUET extends University{
    public int UniversityRank;
    public int StudentName;
    
void selfinfo(String n, int d, int r,int s){
   universityname = n;
   noOfDept = d;
   UniversityRank = r;
   StudentName = s;
}
   
int getUniversityRanking(){
 return UniversityRank;
}
int getStudentCount(){
 return StudentName;
}

void show(){
    System.out.println("Ruet Information..");
    System.out.println("University Name: " + universityname);
    System.out.println("Total Of DepertMent: "+ noOfDept);
    System.out.println("University Rank: "+ getUniversityRanking() );
    System.out.println("Total of student: "+ getStudentCount());
}
}

//ruet
class RU extends University{
    public int UniversityRank;
    public int StudentName;
    
void selfinfo(String n, int d, int r,int s){
   universityname = n;
   noOfDept = d;
   UniversityRank = r;
   StudentName = s;
}
   
int getUniversityRanking(){
 return UniversityRank;
}
int getStudentCount(){
 return StudentName;
}

void show(){
    System.out.println("RU Information..");
    System.out.println("University Name: " + universityname);
    System.out.println("Total Of DepertMent: "+ noOfDept);
    System.out.println("University Rank: "+ getUniversityRanking() );
    System.out.println("Total of student: "+ getStudentCount());
}
}

//Vu
class VU extends University{
    public int UniversityRank;
    public int StudentName;
    
void selfinfo(String n, int d, int r,int s){
   universityname = n;
   noOfDept = d;
   UniversityRank = r;
   StudentName = s;
}
   
int getUniversityRanking(){
 return UniversityRank;
}
int getStudentCount(){
 return StudentName;
}

void show(){
    System.out.println("VU Information..");
    System.out.println("University Name: " + universityname);
    System.out.println("Total Of DepertMent: "+ noOfDept);
    System.out.println("University Rank: "+ getUniversityRanking() );
    System.out.println("Total of student: "+ getStudentCount());
}
}

public class repoabstact1 {
     public static void main(String[] args) {
        VU uni1 = new VU();
        uni1.selfinfo("Varendra University", 11, 2, 8000);
        uni1.show();
        
        RU uni2 = new RU();
        uni2.selfinfo("Rajshahi University", 22, 5, 20000);
        uni2.show();
        
        RUET uni3 = new RUET();
        uni3.selfinfo("R.U.E.T.", 9, 1, 30000);
        uni3.show();
    }
}
