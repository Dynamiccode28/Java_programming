import java.lang.*;
class bitwise{
	public static void main(String args[]){
	 	int a,x;
	 	a=-0b1010; //10
	 	x=a<<1;//left shift
	 	System.out.println(String.format("%32s",Integer.toBinaryString(a)));//binary form of numbers will printed
	 	System.out.println(String.format("%32s",Integer.toBinaryString(x)));

		System.out.println("a : "+a);
		System.out.println("x : "+x);

		int n1,n2;
		n1=10;
		n2=~n1;
		System.out.println("n2 : "+n2);



	}
}