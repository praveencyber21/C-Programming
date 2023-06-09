package Learnings;

import java.util.Scanner;


class Students {

  int roll;
  String name;

  //Get the student details

  int getRoll() {
    return roll;
  }

 

  String getName() {
    return name;
  }



  //Set the details
  void setRoll(int roll) {
    this.roll = roll;
  }

 

  void setName(String name) {
  this.name = name;
  }
  
  void setdetails( String name, int roll) {

    this.name = name;
    this.roll = roll;
   
  }

  //Print the Student details
  void print() {
    System.out.println("Name : "+ name);
    System.out.println("Roll : "+ roll);
    
   
  }

}




public class Main {
    public static void main(String args[]) {

    Scanner s = new Scanner(System.in);
   
    String name;
    int roll;
    String stu[] = new String[2];

    
    for (int i=0; i<stu.length; i++){
      System.out.print("Enter the name: ");
      name = s.nextLine();
      
      System.out.println("Enter the roll: ");
      roll = s.nextInt();
      s.nextLine();
      Students sc= new Students();
      
      sc.setdetails(name, roll);
     // stu[i]=sc;
      
      
    }
     // Printing the student details
     for (int i = 0; i < stu.length; i++) {
      System.out.println("Student " + (i + 1) + " details:");
      //stu[i].print();
      System.out.println();
    }

    s.close();
  }
}
