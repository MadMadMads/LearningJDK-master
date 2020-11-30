package test.luo;

import java.util.HashMap;

/**
 * @author: Luo
 * @description:
 * @time: 2020/9/24 22:48
 * Modified By:
 */
public class Interge {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("1",1);
        Integer i = map.get("1");
        i++;
        System.out.println(i+map.get(1));
    }
}
