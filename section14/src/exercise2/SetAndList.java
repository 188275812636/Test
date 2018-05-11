package exercise2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetAndList {
    public static void main(String[] args) {
        Set s = new HashSet();
        s.add("a");
        s.add("c");
        s.add("A");
        s.add("a");
        s.add("C");
        List<String> l = new ArrayList<>();
        l.add("a");
        l.add("c");
        l.add("A");
        l.add("a");
        l.add("C");
        System.out.println(s);//没有重复元素
        System.out.println(l);//允许出现重复元素
    }
}
