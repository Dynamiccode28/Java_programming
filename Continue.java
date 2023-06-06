class Continue{
	public static void main(String args[])
	{
		for(int i=0;i<=11;i++){
			if(i==0||i==11){
				continue;//skipped the process declared value of iterator in loop
			}
			System.out.println(i);
		}
	}
}