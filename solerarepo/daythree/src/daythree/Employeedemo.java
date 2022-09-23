package daythree;

public class Employeedemo {

	public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee();
        
        e1.setEmpId(1);
        e2.setEmpId(1);
        
        
        /*
         * if two objects are wqual according to the equals() method ,then calling the
         * hashcode() on each of the 
         */
        
        System.out.println(e1.equals(e2));
        System.out.println(e1.hashCode());

        System.out.println(e2.hashCode());
        System.out.println(e1);

        

	}

}
