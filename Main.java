import java.util.Scanner;
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
} 
