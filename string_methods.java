import java.util.*;
class string_methods{
    public static void main(String args[]){
        int num,SI,DI;


        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        int a=s.length();
        System.out.println("Length of string "+a);

        s=s.toUpperCase();
        System.out.println("Changing to uppercase : "+s);

        s=s.toLowerCase();
        System.out.println("Changing to uppercase : "+s);

        s=s.trim();
        System.out.println("Trimmed string : "+s);

        System.out.print("Enter the starting index of substring : ");
        Scanner n=new Scanner(System.in);
        num=n.nextInt();
        s=s.substring(num);
        System.out.println("Substring : "+s);


        System.out.print("Enter the starting & end index of substring : ");
        SI=n.nextInt();
        DI=n.nextInt();
        s=s.substring(SI,DI);
        System.out.println("Substring : "+s);

        s=s.replace('a','e');
        System.out.println("String after replacement : "+s);


        

    }
}