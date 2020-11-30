package test.luo.Array;

import java.util.LinkedList;

/**
 * @author: Luo
 * @description:
 * @time: 2020/2/29 13:16
 * Modified By:
 */
public class Code1 {
    void code1() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.forEach(System.out::print);
    }
    //  Java的引用 equal比较值 ==比较内存地址
     void code2() {
        String i = new String("1");
        String j = new String("1");
        String i1 = "1";
        String j1 = "1";
        System.out.println(i.equals(j));
        i=j;
        System.out.println(i.equals(j));
        System.out.println(i1.equals(j1));
    }
    static void code3() {
        int i=50;
        int j=50;
        j++;
        System.out.println(i);
    }
    public static void main(String[] args) {
        code3();
    }
}
