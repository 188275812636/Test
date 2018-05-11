package exercise2;

public class Rectangle {
    int length;
    int width;
    public Rectangle(int length,int width){//构造方法
        this.length = length;
        this.width = width;
    }
    public int area(){//计算面积
        int s;
        s = length * width;
        return s;
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4,6);
        System.out.println(r.area());
    }
}
