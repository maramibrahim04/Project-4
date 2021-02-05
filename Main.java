import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the High School Class Scheduler!");

        String name;
        int gradeLevel;

        System.out.println("Enter your name: ");
        name = scan.next();
        System.out.println("Enter your grade level (9,10,11,or 12): ");
        gradeLevel = scan.nextInt();

        int numOfClasses = classAmount(gradeLevel); //Returns the number of classes the student will take

        System.out.println(name + " ,based on your grade level, you will take " + numOfClasses + " classes");

        double gpa;
        boolean advance;

        System.out.println("Enter your current gpa: ");
        gpa = scan.nextDouble();
        System.out.println("Do you wish to take advanced classes? true/false: ");
        advance = scan.nextBoolean();

        System.out.println(name  + ", your schedule for " + gradeLevel + "th grade is:\nClass Schedule\n"
                + scheduleGenerator(name, gradeLevel, gpa, advance));


    }


    public static int classAmount(int gradeLevel)
    {
        if(gradeLevel == 9)
            return 7;
        else if(gradeLevel == 10 || gradeLevel == 11)
            return 6;
        else if(gradeLevel == 12)
            return 5;
    
        return 0;
    }

    public static String scheduleGenerator(String name, int grade, double gpa, boolean advance)
    {

        String schedule = "";

        // a series of if-else statements that will print out the student's schedule
        if(grade == 9)
        {
            if(advance == true && gpa >= 3.5)
            {
                schedule = "Algebra 1 Honors\nBiology Honors\nEnglish 1 Honors\nAP Human Geography\nAnd 3 electives of your choice";
                return schedule;
            }
            else if(advance == true && gpa < 3.5)
            {
                schedule = "Sorry, but your gpa does not meet the requirement to take advance classes\n";
                schedule += "Algebra 1\nBiology\nEnglish 1\nU.S. Government\nAnd 3 electives of your choice";
                return schedule;
            }
            else
            {
                schedule = "Algebra 1\nBiology\nEnglish 1\nU.S. Government\nAnd 3 electives of your choice";
                return schedule;
            }

        }
        else if(grade == 10)
        {
            if(advance == true && gpa >= 3.5)
            {
                schedule = "Geometry Honors\nAP Chemistry\nEnglish 2 Honors\nAP World Geography\nAnd 2 electives of your choice";
                return schedule;
            }
            else if(advance == true && gpa < 3.5)
            {
                schedule = "Sorry, but your gpa does not meet the requirement\n";
                schedule += "Geometry\nChemistry\nEnglish 2\nU.S. History\nAnd 2 electives of your choice";
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
            if(advance == true && gpa >= 3.5)
            {
                schedule = "Algebra 2 Honors\nAP Physics\nAP Language and Composition\nAP Psychology\nnAnd 2 electives of your choice";
                return schedule;
            }
            else if(advance == true && gpa < 3.5)
            {
                schedule = "Sorry, but your gpa does not meet the requirement\n";
                schedule += "Algebra 2\nPhysics\nEnglish 3\nEconomics\nAnd 2 electives of your choice";
                return schedule;
            }
            else
            {
                schedule += "Algebra 2\nPhysics\nEnglish 3\nEconomics\nAnd 2 electives of your choice";
                return schedule;
            }
        }
        else if(grade == 12)
        {
            if(advance == true && gpa >= 3.5)
            {
                schedule = "AP Calculus AB\nAn AP Science Elective\nAP Literature and Composition\nAn AP Social Studies elective\nnAnd another elective of your choice";
                return schedule;
            }
            else if(advance == true && gpa < 3.5)
            {
                schedule = "Sorry, but your gpa does not meet the requirement\n";
                schedule += "Pre-Calculus\nPhysics\nEnglish 4\nSociology\nAnd another elective of your choice";
                return schedule;
            }
            else
            {schedule += "Pre-Calculus\nPhysics\nEnglish 4\nSociology\nAnd another elective of your choice";
                return schedule;
            }

        }
        return "there was an error";

    }
}