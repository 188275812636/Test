package exercise2;

public class Substr {
    public static void main(String[] args) {
        String str1 = "aabCDef";
        String str2 = "bbcDEfg";
        String s1 = str1.substring(2,5);//截取到的子串是：bCD
        String s2 = str2.substring(1,4);//截取到的子串是：bCd
        if (s1.equalsIgnoreCase(s2)){//不区分大小写比较
            System.out.println("两个子串相同");
        }else{
            System.out.println("两个子串不同");
        }
    }
}
