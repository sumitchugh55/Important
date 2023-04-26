package stringbufferdemo;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());// 16
		sb.append("hello");
		System.out.println(sb.capacity());// 16

		sb.append("deepak javaa");
		System.out.println(sb.capacity());// (old capacity*2)+2,(old capacity+1)*2)

		StringBuffer sb1=new StringBuffer("deepak java");
		System.out.println(sb1.append("sumit"));
		System.out.println(sb1.delete(2, 5));
		System.out.println(sb1.deleteCharAt(3));
		System.out.println(sb1.insert(3, "zzzz"));
	}
}
