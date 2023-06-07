import java.util.*;
class GCD{
    static int gcd(int a,int b){
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        return a;
    }
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        int num1=a.nextInt();
        int num2=a.nextInt();
        System.out.print("GCD : "+gcd(num1,num2));

    }
}