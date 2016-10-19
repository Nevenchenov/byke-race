package name.yuris;

import java.util.Random;

/**
 * Created by Rain on 03-Oct-16.
 */
public class Weather {
    public static String weather;
    public static int weatherIndex;
    static short number = 3;
    static String[] weatherSet =  new String[number];


    public Weather()
    {
        weather = getTheWeather();
        weatherIndex =  WeatherIndex();

    }

    final static Random random = new Random();

    public static String getTheWeather()
    {
        weatherSet[0] = "sun";
        weatherSet[1] = "rain";
        weatherSet[2] = "ice";

        int i = random.nextInt(number);
        System.out.println("It's " + weatherSet[i]);
        return weatherSet[i];
    }

    public static int WeatherIndex()
    {
        int ind = 1;
        switch (weather)
        {
            case "sun":
                ind = 1;
            case "rain":
                ind = 2;
            case "ice":
                ind = 3;
        }
        return ind;
    }
}
