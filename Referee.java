package name.yuris;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Rain on 04-Oct-16.
 */
public class Referee {
    private static double minTime = Road.distance + 10.0;

// list of participants. Accommodative to use in calculations where Map isn't needed
    protected static ArrayList<Byker> racers = new ArrayList<>();

    public static ArrayList<Byker> register() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter racers names. One name in one line. To stop input enter 'stop':");
        while(true)
        {
            String gamerInput = reader.readLine();
            if(!"stop".equals(gamerInput))
                racers.add(new Byker(gamerInput));
            else
            {
  //              reader.close();
                break;
            }
        }

        return racers;
    }

// list of participants with time score of them. Used to store time score of each
    public static  Map<Byker, Double> list = new HashMap<Byker, Double>();

    public static void announceAndProtocall()
    {
        for(Byker racer : racers)
        {
            System.out.print(racer.name + ", ");
            list.put(racer, 0.0);
        }
        System.out.println("let's start!");
    }


    public static boolean isRetired(Byker byker)
    {
        if(byker.isRun)
        {
            if (byker.byke.getSpeed() == 0)
            {
                byker.isRun = false;
                System.out.println(byker.name + ", Your byke is outward of road. Unfortunatelly, You are retired from race.");
                return true;
            }

            else return false;
        }
        else return true;

    }
    public int rank(double time, Byker racer)
    {
        int rank = 1;
        return rank;

    }
}
