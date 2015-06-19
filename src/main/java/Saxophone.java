import java.util.Random;

/**
 * Created by vtokarev on 18.06.2015.
 */
public class Saxophone implements Instrument {

    private int number;


    public Saxophone (){
        Random r = new Random();
        number = r.nextInt();
    }


    public void play() {
        System.out.println("Saxo play " + number);

    }
}