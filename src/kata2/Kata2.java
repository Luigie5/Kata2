package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] data={1,1,-3,7,7,7,2};
        Histogram histo=new Histogram(data);
        
        for (int key : histo.getHistogram().keySet()) {
            System.out.println(key+" ==> "+histo.getHistogram().get(key));
        }
    }
}
