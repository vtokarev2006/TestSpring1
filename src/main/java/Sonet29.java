/**
 * Created by Vyacheslav on 18.06.2015.
 */
public class Sonet29 implements Poem {
    private static String[] LINES = {
        "bla1",
        "bla2",
        "bla3"
    };

    public Sonet29 (){

    };

    public void recite() {
        for (String LINE : LINES) {
            System.out.println(LINE);
        }

    }
}
