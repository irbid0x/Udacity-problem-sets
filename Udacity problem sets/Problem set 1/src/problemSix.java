class problemSix
{
    public static void main(String []args)
    {
        String firstName="Ahmad",lastName="Alkhateeb";
        String fullName=firstName+" "+lastName;
        System.out.println("Hello, my name is "+fullName+".");
        System.out.println("There are "+(fullName.length()-1)+" letters in my name.");
        // the (-1) to delete the space in fullName variable
    }
}