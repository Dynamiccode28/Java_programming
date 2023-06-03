public class Regular_expression{
	public static void main(String[] args) {
		String s1="A";
		String s2="a4";
		//System.out.println(s1.matches("."));//is it  a single character
		//System.out.println(s1.matches("[abc]"));//is same any one of the character define in set ie. a|b|c(more than one character not allowed )		
		//System.out.println(s1.matches("[^abc]"));//except charaters defines in set
		//System.out.println(s1.matches("[a-z0-9]"));//is the character within the specified range
		System.out.println(s1.matches("[a-zA-Z0-9]"));
		System.out.println(s2.matches("[a-z][0-5]"));
	}
}