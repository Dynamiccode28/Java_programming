import java.lang.*;
class meta_char{
	public static void main(String args[]){
		String s1="8";
		String s2=" ";
		System.out.println(s1.matches("\\d"));//isdigit
		System.out.println(s1.matches("\\D"));//not a digit
		System.out.println(s2.matches("\\s"));//isSpace
		System.out.println(s2.matches("\\S"));//not a space

	}
}
