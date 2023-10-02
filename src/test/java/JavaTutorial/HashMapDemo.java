package JavaTutorial;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[]args){
        HashMap<String, String> hm = new HashMap<String, String>();

        //Adding items in Hash map
        hm.put("qa", "www.qa.com");
        hm.put("uat", "www.uat1.com");
        hm.put("quews", "www.qauews.com");
        hm.put("uawert", "www.uawerty.com");

        System.out.println(hm);

        //removing items from hash map
        hm.remove("qa");
        System.out.println(hm);

        Set s = hm.keySet();

        //for each loop
        for(String key:hm.keySet()){
            System.out.println("Key is : " + key + "Value is : " + hm.get(key));
        }

        Iterator<String> itr = s.iterator();
        while (itr.hasNext()){
            String key = itr.next();
            System.out.println("Key is : " + key + "Value is : " + hm.get(key));

        }
    }
}
