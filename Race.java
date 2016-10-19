package name.yuris;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Rain on 04-Oct-16.
 */
public class Race {
    public static void RunLap(int[] track) throws IOException {

        int step = 0;
        int speed = 0;


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int inputSpeed = 0;
        while(step < Road.distance)
        {
            for (Byker byker : Referee.racers)
            {

                if (byker.isRun)
                {
                    System.out.println("\n" + "The roadCurvature is: " + track[step] + "\n" + byker.name + ",\n" + "Input desired speed:");


                    try
                    {
                        inputSpeed = Integer.parseInt(reader.readLine());
                    }
                    catch (IOException e)
                    {
                        System.out.println(byker.name + "! You input unfit speed value. Reenter, please, suited one");

                    }

                    speed = byker.byke.getSpeed(inputSpeed, track[step]);
                    if (!Referee.isRetired(byker)) {

                        byker.time = byker.time + 1.0/speed;
                            System.out.println(byker.name + "! Your speed is: " + speed);
                            System.out.println(byker.name + "! Your time score is: " + byker.time);


                    }
                }
                else
                {
                    byker.time += 1.0;
                }
                Referee.list.put(byker, Referee.list.get(byker) + byker.time);

            }
                step++;

        }
        reader.close();
        // rank should used here
        System.out.println("Congratulations!!! You reach the finish!");
    }
}
