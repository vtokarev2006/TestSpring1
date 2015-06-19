import java.util.Random;

/**
 * Created by vtokarev on 18.06.2015.
 */
public class Ticket {
    private int number;

    public Ticket(){
        Random r = new  Random();
        number = r.nextInt();
    }

    public int getNumber() {
        return number;
    }
}
