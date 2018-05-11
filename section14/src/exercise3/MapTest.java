package exercise3;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Emp emp = new Emp("001", "张三");
        Emp emp2 = new Emp("002", "李四");
        Emp emp3 = new Emp("003", "王五");
        Emp emp5 = new Emp("015", "赵六");
        map.put(emp.getId(), emp.getName());
        map.put(emp2.getId(), emp2.getName());
        map.put(emp3.getId(), emp3.getName());
        map.put(emp5.getId(), emp5.getName());
        map.remove("015");
        for (String string : map.keySet()) {
            System.out.println(map.get(string));
        }
    }
}
