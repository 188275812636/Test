package exercise3;

public class Regular {
    /**
     * 手机号由11个数字组成
     */
    public static void main(String[] args) {
        String text = "18827512636";
        String reg = "\\d{11}";
        if(text.matches(reg)){
            System.out.println("这个手机号合法");
        }else{
            System.out.println("这个手机号不合法");
        }
    }
}
