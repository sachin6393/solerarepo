package Assignment3_p1;
import java.util.*;
public class problem1 {

	public static void main(String[] args) {
		
		
		List<Student>list=new ArrayList<>();

		list.add(new Student(1,"sachin",7.5));
		list.add(new Student(2,"deepak",3.2));
		list.add(new Student(3,"Mohit",4.5));
		list.add(new Student(4,"Saket",6.6));
		list.add(new Student(5,"Aniket",5.4));
		
		
		
		
		Collections.sort(list,new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if(o2.getCgpa()>o1.getCgpa())
					return 1;
				else if(o2.getCgpa()<o1.getCgpa())
				{
					return -1;
				}
				else
				{
					return o1.getFname().compareTo(o2.getFname());
				}
			}
		});
		
		
		for(Student st:list)
		{
			System.out.println(st.getFname());
		}
		
		
	}

}
