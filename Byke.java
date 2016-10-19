package name.yuris;

/**
 * Created by Rain on 03-Oct-16.
 */
public class Byke {
    private static final int MAX_SPEED = 100;
    private int currentSpeed = 0;
    private static final int CRITICAL_DELTA_SPEED = 50;


    public int getSpeed(int sentSpeed, int roadCurvature)
    {
        int produsedSpeed = speedClamping(sentSpeed);
        if(this.isOnRoad(produsedSpeed, roadCurvature)) {
            this.currentSpeed = produsedSpeed;
        }
        else
        {
            this.currentSpeed = 0;

            System.out.println("You overdrive your byke! And your byke is crashed!");
        }
        return this.currentSpeed;
    }
    public int getSpeed()
    {
        return this.currentSpeed;
    }

    public boolean isOnRoad(int testedSpeed, int roadCurvature)
    {
        boolean is = true;
        int performance = testedSpeed*Weather.weatherIndex*roadCurvature;
        if (performance > MAX_SPEED*Road.maxCurvature/2)
        {
            is = false;
        }
        return is;
    }

    // Check does rider try to exceed the speed limit
    private int speedClamping(int desiredSpeed)
    {
        if((desiredSpeed - this.currentSpeed) > CRITICAL_DELTA_SPEED)
        {
            System.out.println("Don't quicken so hard! Your byke is become goat and overturn! You lose");
            return 0;
        }
        else
        {
            if (desiredSpeed > MAX_SPEED)
            {
                System.out.println("Don't quicken so hard! Your byke is able to reach up to 100 yet!");
                return MAX_SPEED;
            }
            else
            {
                return desiredSpeed;
            }

        }

    }
}
