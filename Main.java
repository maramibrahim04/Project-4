import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    String name;
    System.out.println("Enter your name:");
    name = scan.next();
    int gradeLevel;
    System.out.println("Enter your grade?");
    gradeLevel = scan.nextInt();

    int numOfClass = classAmount(gradeLavel); //Returns the number of classes the student will take 

    System.out.println(name + " ,based on your grade level, you will take " + numOfClasses + "classes");

    double gpa;
    bool advance; 

    System.out.println("Enter your current gpa: ");
    gpa = scan.nextDouble();
    System.out.println("Do you wish to take advanced classes? true/false: ");  
  }
}
static int classAmount(int gradeLevel)
{
        if(gradeLevel == 9 )
                return 7;
        else if(gradeLevel == 10 || gradeLevel == 11)
                return 6;
        else if(gradeLevel == 12)
                return 5;
  }
  static string scheduleGenerator(String name, int grade, double gpa, bool advance)
{
  String schedule = "";

  // a series of if-else statements that will print out the student's schedule if(grade == 9)
}
         if(bool == true && gpa >= 3.5)
         {
                 schedule = "Algebra 1 Honors\nBiology Honors\nEnglish 1 Honors\nAP Human Geography\nAnd 3 electives of your choice"; 
                 return schedule;
         }
         else if (bool == true && gpa < 3.5)
         {
                  schedule = "Sorry, but your gpa does not meet the requirment to take advace classes\n";
                  schedule += "Algebra 1\nBiology\nEnglish 1\nU.S. Government\nAnd 3 electives of your choice";
                  return schedule;
         }
         else
         {
                  schedule ="Algebra 1\nBiology\nEnglish 1\nU.S. Government\nAnd 3 electives of your choice";
                  return schedule;
         }
         else if(grade == 10)
         {
                if(bool == true && gpa >= 3.5)
                {
                     schedule = "Geometry Honors\nAP Chemistry\nEnglish 2 Honors\nAnd 2 electives of your choice";
                     return schedule;
                }
                else if(bool == true && gpa < 3.5)
                {
                      schedule = "Sorry, but your gpa does not meet the requirements\n";
                      schedule += "Geometry\nChemistry\nEnglish 2\nU.S.History\nAnd 2 electives of your choice";
                      return schedule;
                }
                else 
                {
                      schedule = "1\nBiology\nEnglish\nU.S. Government\nAnd 2 electives of your choice";
                      return schedule;
                }
         }
         else if(grade == 11)
         {
                  if(bool == true && gpa >= 3.5)
                  {
                    
                  }
         }