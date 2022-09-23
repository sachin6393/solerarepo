package Assignment3_p1;
import java.util.*;
public class problem1 {

	public static void main(String[] args) {

		Student student[] =new Student[5];
		
		student[0]=new Student(1,"sachin",7.5);
		student[1]=new Student(2,"Deepak",6.3);
		student[2]=new Student(3,"Mohit",4.5);
		student[3]=new Student(4,"Saket",6.6);
		student[4]=new Student(5,"Aniket",5.4);
		
		
		for(Student stu:student) {
			
			System.out.println(stu);
			
		}
		
		
	}

}
