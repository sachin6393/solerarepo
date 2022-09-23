package daytwo;

public class Calculateareamain {

	public static void main(String[] args) {

		Calculatearea cal=new Calculateareaimpl();
		Calculateareaimpl cal2=new Calculateareaimpl();
		int are=cal.calculatearea(5,2 );
		System.out.println(are);
		int re2=cal2.calculateparameter(3, 4);
		System.out.println(re2);
		
		 cal2.display();
		 Calculatearea.display();
		
	}

}
