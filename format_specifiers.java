import java.lang.*;
class format_specifiers{
	public static void main(String args[]){
		int a=10,b=-5;
		float f=(float)12.52;
		char c='b';
		String s="JAVA"; 

		System.out.printf("HELLO %d %f %b WORLD \n",a,f,b);
		System.out.printf("Hey %o %e ADARSH \n",a,f);
		System.out.printf("Hello I am learning %s \n",s);

		//argument index - tells about argument number,provides liberty to pass argument in any order

		System.out.printf("%2$s %1$d %3$f \n",a,s,f);

		//width and flags.....

		System.out.printf("%05d",a);
		System.out.printf("%+5d",a);//a will print in 10 spaces & 0 is a flag all thw white spaces filled with 0;
		System.out.printf("%5d",a);
		System.out.printf("%(5d \n",b);
		System.out.printf("%5s \n",s);
		System.out.printf("%-5s \n",s);


	}
}