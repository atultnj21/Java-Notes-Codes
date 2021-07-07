/* Similar to dictionaries in python
    : not ordered */
package com.JavaCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap(); // generic

        //put method
        map.put("myName","Atul Taneja");
        map.put("favMovie","avengersEndgame");
        map.put("favChar","TonyStark");
        System.out.println(map);
        //{favChar=TonyStark, favMovie=avengersEndgame, myName=Atul Taneja}

        System.out.println(map.get("favChar"));//TonyStark
        //for any key which is not present it will display null

        /* keySet() method in Java is used to create a set out of the
         key elements contained in the hash map.

         thisMap.get()
         The method takes one parameter key_element of object type and
         refers to the key whose associated value is supposed to be
         fetched.
         */

        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.println(key+" " + map.get(key));
        }

        map.put("favChar","IronMan");
        System.out.println(map.get("favChar"));//IronMan

        System.out.println(map);
        //{favChar=IronMan, favMovie=avengersEndgame, myName=Atul Taneja}
    }
}
