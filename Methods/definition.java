import java.util.*;
class definition{
    static int max(int a ,int b){//as main is static we declared this function as STATIC
        if(a>b)
            return a;
        else
            return b;
    }
    void sum(int  a,int b){//non static method
        System.out.print("Addition of numbers : "+(a+b));
    }
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter two numbers : ");
        num1=a.nextInt();
        num2=a.nextInt();
        System.out.println("Greater number is : "+max(num1,num2));//direct calling without obj. creation


        definition obj=new definition();
        obj.sum(num1,num2);//calling non static method from main(Static) method
    }


    
}