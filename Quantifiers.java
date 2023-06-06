class Quantifiers{
	public static void main(String agrs[])
	{
		String s="abc";
		System.out.println(s.matches(".*"));
		System.out.println(s.matches(".+"));
		System.out.println(s.matches("[a-z]{8}"));
		System.out.println(s.matches("[a-z]{5,7}"));
		System.out.println(s.matches("[a-z]?"));

	}
}