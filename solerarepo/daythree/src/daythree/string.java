package daythree;

public class string {

	public static void main(String[] args) {
//	String hello="Hello";
//	System.out.println("lenghth or size  "+hello.length());
//	System.out.println("Index of e "+hello.indexOf('e'));
//	System.out.println("last index of l  "+hello.lastIndexOf('l'));
//	System.out.println("substring  "+hello.substring(1, 3));
//		
//	String str="Hi   ";
//	System.out.println("before trim  "+str);
//    System.out.println("Remove spaces  "+str.trim());
//    
//    
//    int num=12;
//    String numstr=String.valueOf(num);
//    System.out.println(numstr instanceof String);
//    Integer n=Integer.parseInt(numstr);
//    System.out.println(n instanceof Integer);
//    System.out.println(n*5);
    
    
    String nstr="Sachin";
    
   // System.out.println(nstr.isEmpty());
    //this was introduced in jdk 6;
//    System.out.println(nstr.hashCode());
//    
//    String str=nstr.concat(" verma");
//    System.out.println(str);
//    System.out.println(nstr.stripLeading());
//    System.out.println(nstr.strip());
    
   // System.out.println(nstr.toUpperCase());
    
//    String ans=nstr.replaceAll("S", "P");
//    System.out.println(ans);
    
    String para="Hello Everyone, today is very wonderful sunny day. We are learning String concepts. Here we are learning now about paragraph.";
   
    String splitpara[]=para.split("[.]");
    
    for(String sentence :splitpara)
    {
    	System.out.println(sentence);
    }
	}

}
