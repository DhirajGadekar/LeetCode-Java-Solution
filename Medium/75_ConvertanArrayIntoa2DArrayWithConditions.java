/*
 * 75] Convert an Array Into a 2D Array With Conditions
 */
import java.util.*;
class Solution {
    List<Integer> creation(Hashtable<Integer, Integer> ht) {

        List<Integer> l = new ArrayList<>();
        // for(Map.Entry<Integer, Integer> e : ht.entrySet()) {

        //     int val = e.getValue();
        //     if(!l.contains(val)) {

        //         l.add(val);
        //         ht.remove(e.getKey());
        //     }
        // }
        Enumeration<Integer> keys = ht.keys();
        while (keys.hasMoreElements()) {
            int key = keys.nextElement();
            if(!l.contains(ht.get(key))) {

                l.add(ht.get(key));
                ht.remove(key);
            }
        }
        return l;
    }
    public List<List<Integer>> findMatrix(int[] nums) {

        List<List<Integer>> al = new ArrayList<>();
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        for(int i = 0; i < nums.length; i++) {

            ht.put(i, nums[i]);
        }
        while(!ht.isEmpty()) {

            List<Integer> l = creation(ht);
            al.add(l);
        }
        return al;
    }
}
