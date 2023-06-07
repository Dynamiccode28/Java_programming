import java.util.*;
class Call_by_obj{
    int max(int a ,int b){
        if(a>b)
            return a;
        else
            return b;
    }
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter two numbers : ");
        num1=a.nextInt();
        num2=a.nextInt();
        Call_by_obj obj=new Call_by_obj();
        System.out.println("Greater number is : "+obj.max(num1,num2));
    }
}