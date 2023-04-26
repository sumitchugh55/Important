package stringAdditionSubstring;

public class StringAdditionSybstring {
public static void main(String[] args) {
	String s1="sumit";
	String s2="java";
	String s3="this is demo";
	System.out.println(s1+s2);//sumitjava
	System.out.println(s1+10);//sumit10
	System.out.println(s1+10+20);//sumit1020
	System.out.println(10+s1+20);//10sumit20
	System.out.println(10+20+s1);//30sumit
	System.out.println(s1+20/10);//sumit2
	System.out.println(s1+20*10);//sumit200
//	System.out.println(s1+10-20);
	System.out.println(s1.concat(s2));//sumitjava
	System.out.println(String.join(";",s1,s2));//sumit;java
	System.out.println(s3.subSequence(3, 9));
	System.out.println(s3.substring(3));
	System.out.println(s3.substring(3, 11));
	System.out.println(s3 .replace("is", "was"));
	System.out.println(s3.replaceFirst("is", "was"));
	System.out.println(s3.replaceAll("is(.)", "was"));
	System.out.println(s3.replaceAll("is(.*)", "was"));
}
}
