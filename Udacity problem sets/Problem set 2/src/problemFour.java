public class problemFour
{
    public static void main(String []args)
    {
        boolean isSnowing=true,isRaining=true;
        double temperature=40.0;//Fahrenheit
        if(isSnowing||isRaining||temperature<50) {
            System.out.println("Let's stay home.");
        } else {
            System.out.println("Let's go out!");
        }
    }
}
