class return_obj{
    static String UserName(String mail){
        int a=mail.indexOf('@');
        return mail.substring(0,a);
    }
    public static void main(String args[]){
        String email="adarsh324@gmail.com";
        String user=UserName(email);
        System.out.print("User name is "+user);
    }
}