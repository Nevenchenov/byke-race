package name.yuris;

import java.util.Random;

/**
 * Created by Rain on 03-Oct-16.
 */
public class Road {
    protected static int distance = 100;
    protected static int maxCurvature = 60;

    public static int[] zigzags = new int[distance];



    public static int[] generate()
    {
        {
        final Random random = new Random();

        for(int i = 0; i<distance; i++)
        {
            zigzags[i] = random.nextInt(maxCurvature + 1);
        }
    }
        return zigzags;
    }
}
