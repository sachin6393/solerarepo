package daythree;

public class stringmodification {

	public static void main(String[] args) {
//		String x ="abc";
//		x=x.concat("def");
//		System.out.println(x);
		StringBuffer sb=new StringBuffer("fgh");
		//System.out.println(sb);
		System.out.println(sb);
		
		System.out.println(sb.capacity());
		//default capacity of string buffer is 16;
		//(old*2)+2    oldcapacity=16;
		//(16*2)+2=34
		//sb.reverse();
		
		//sb.delete(0, 2);
		sb=sb.append("abcd fgfjhkj jlkjj");
		//System.out.println(sb.length());
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		System.out.println(sb);

	}

}
