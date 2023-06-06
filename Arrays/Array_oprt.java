import java.util.*;
class Array_oprt{

    public static void left_rotation(){
        int A[]={12,5,8,9,7,6};
        int temp=A[0];
        for(int i=1;i<A.length;i++){
            A[i-1]=A[i];
        }
        A[A.length-1]=temp;
        System.out.println("Rotated array : ");
        for(int x:A){
            System.out.print(x+" ");
        }
    }

     public static void right_rotation(){
        int A[]={12,5,8,9,7,6};
        int temp=A[A.length-1];
        for(int i=A.length-2;i>=0;i--){
            A[i+1]=A[i];
        }
        A[0]=temp;
        System.out.println("Rotated array : ");
        for(int x:A){
            System.out.print(x+" ");
        }
    }

    public static void sec_max(){
        int A[]={12,5,8,9,7,6};
        int max1=A[0],max2=-1;
        for(int i:A){
            if(i>max1){
                max2=max1;
                max1=i;
            }
            if(i<max1 && i>max2){
                max2=i;
            }
        }
        System.out.println("Second max element of an array : "+max2);
    }
    public static int sum()
    {   
        int A[]={5,6,8,9,3};
        int sum=0;
        for(int i:A){
            sum+=i;
        }
        return sum;
        

    }
    public static void Search(){
        int A[]={5,6,8,9,3};
        boolean flag=false;
        Scanner a=new Scanner(System.in);
        System.out.print("Value to be search : ");
        int val=a.nextInt();
        for(int i:A){
            if(i==val){
                flag=true;
                break;
            }
                
            
        }
        if(flag)
            System.out.println("Value is present");
        else
            System.out.println("Value is not is present in array");
    }
    public static void main(String srgs[]){
        
        // int res=sum();
        // System.out.println("Sum: "+res);

        // Search();
        //sec_max();
        //left_rotation();
        right_rotation();
    }
}