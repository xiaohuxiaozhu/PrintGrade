 

import java.util.Scanner;
public class PrintGrades {

    public static void main(String[] args) {




        String reply;
        int x = 0;





   do {
       System.out.print(" Enter an exam score ");

       Scanner grades = new Scanner(System.in);
       x = grades.nextInt();

       if (x <= 100 && x >= 97)
           System.out.print("Good job. Your grade is A+");

       if (x <= 96 && x >= 94)
           System.out.print("Good job. Your grade is A");

       if (x <= 93 && x >= 90)
           System.out.print("Good job. Your grade is A-");

       if (x <= 89 && x >= 87)
           System.out.print("Good job. Your grade is B+");

       if (x <= 86 && x >= 84)
           System.out.print("Good job. Your grade is B");


       if (x <= 83 && x >= 80)
           System.out.print("Good job. Your grade is B-");

       if (x <= 79 && x >= 77)
           System.out.print("Need imporovement. Your grade is C+");

       if (x <= 76 && x >= 74)
           System.out.print("Need imporovement. Your grade is C");

       if (x <= 73 && x >= 70)
           System.out.print("Need imporovement. Your grade is C-");

       if (x <= 69 && x >= 60)
           System.out.print("Need imporovement. Your grade is D");

       if (x < 60)
           System.out.print("Go back to School if you get below 60");

       System.out.println("\n" + "Do you want to enter another score (Y/N)");
       reply = new Scanner(System.in).next();
   } while (reply.equals("Y"));














    }

}

