package name.yuris;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException
    {


        int[] road = Road.generate();

        Weather weather = new Weather();

       Referee.register();

        Referee.announceAndProtocall();


        Race.RunLap(road);




    }
}
