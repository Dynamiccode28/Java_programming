//The program is for showing various method of declaring strings
import java.lang.*;
class string{
	public static void main(String args[]){
		//1
		String s1=new String("Hello world"); //s1 is reference to object HEllo world
		String s2="This program is about string";

		System.out.println(s1);
		System.out.println(s2);

		//2
		char a[] ={'A','D','A','R','S','H'};
		String s3= new String(a);
		System.out.println(s3);

		String st="ADARSH";
		String b=new String("ADARSH");
		System.out.println(st==b);
		//3
		char s[]={'A','B','C','D','E'};
		String str=new String(s,1,3);
		System.out.println(str);//BCD will print




	}
}