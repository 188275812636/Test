package exercise1;

import java.lang.reflect.Array;

public class ExtendLength {
    public static int[] arr = { 1, 2, 3 };
    public static void main(String[] args) {
        System.out.println("扩容前数组长度："+arr.length);
        arr = (int[]) extendLength(arr, 5);
        System.out.println("扩容后数组长度："+arr.length);
    }
    public static Object extendLength(Object array, int newLength) {
        Object newArray = null;
        Class componentType = array.getClass().getComponentType();
        newArray = Array.newInstance(componentType, newLength);
        System.arraycopy(array, 0, newArray, 0, Array.getLength(array));//获得新数组
        return newArray;
    }
}
