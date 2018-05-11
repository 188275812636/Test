package exercise1;

import java.util.ArrayList;
import java.util.List;

public class Remove {
    public static void main(String[] args) {
        List l = new ArrayList();
        for (int i = 1; i <=100 ; i++) {
            l.add(i);
        }
        l.remove(l.get(10));
        System.out.println(l);
    }
}
