class Definition{
    public static void main(String[] args){
        int A[]=new int[5];
        int i=1;
        for(int x=0;x<A.length;x++){
            A[x]=i;
            i++;
        }
        System.out.print("Accessing elements of an array : ");
        for(int j:A){
            System.out.print(j+" ");
        }
    }
}