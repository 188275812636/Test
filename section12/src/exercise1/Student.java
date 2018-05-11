package exercise1;

public class Student {
    public static void speak(int m) throws MyException {
        if(m>1000){
            throw new MyException("数字太大");
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        try {
            s.speak(1001);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
