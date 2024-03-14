import java.util.Random;

import javax.swing.RowFilter.Entry;

import java.util.HashMap;
public class App {
    public static void main(String[] args) throws Exception {
        Random ran = new Random();
        int[] list = new int[10];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {

            int rand = ran.nextInt(11);
            list[i] = rand;
            System.out.println(list[i]);
        } 
        
        for (int i = 0; i < list.length; i++) {
            if(map.containsKey(list[i])){
                int x = map.get(list[i]);
                x++;
                map.replace(list[i], x);
            }else{
                map.put(list[i], 1);
            }
        }

        for (HashMap.Entry<Integer, Integer> e : map.entrySet()) {
            int key = e.getKey();
            int value = e.getValue();

            System.out.println("The number " + key + " occurs " + value + " times in the array.");
        }

    }
}
