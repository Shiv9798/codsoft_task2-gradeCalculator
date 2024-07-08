import java.util.Scanner;
public class gradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Student Grade Calculator");
        System.out.println("Enter no of subjects");
        int num_sub=sc.nextInt();
        int total=0;
        for(int i=0;i<num_sub;i++)
        {
            System.out.println("enter marks obtained in "+(i+1)+":");
            int marks=sc.nextInt();
            total=total+marks;
        }
        double average_per=(double)total/num_sub;
        char grade;
        if(average_per>=90){
            grade='o';
        }
        else if(average_per>=80){
            grade='A';
        }
        else if(average_per>=70){
            grade='B';
        }
        else if(average_per>=60){
            grade='C';
        }
        else if(average_per>=50){
            grade='D';
        }
        else if(average_per>=40){
            grade='E';
        }
       else{
        grade='F';
       }
       System.out.println("Total marks scored "+total);
       System.out.println("Average percentage is"+average_per+"%");
       System.out.println("Grade :"+grade);
    }
}
