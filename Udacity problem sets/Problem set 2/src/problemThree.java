public class problemThree
{
    public static void main (String []args)
    {
        boolean canSeePlayer=true, playerPowerUp=true;

        if (canSeePlayer&&!playerPowerUp)
        {
            System.out.println("Attack!");
        }
        else if (canSeePlayer&&playerPowerUp)
        {
            System.out.println("Run away!");
        }
        else if(!canSeePlayer)
        {
            System.out.println("Wander.");
        }
    }
}
