import java.util.Map;


public class TestMap {

    private Map<Integer,String> map;


    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    public void prMap(){
        for(Integer i: map.keySet()){

            System.out.println("Key = "+i+", Value="+map.get(i));


        }



    }



}
