package exercise3;

public class MyException extends Exception{
    String message;
    public MyException(String message) {
        super(message);
        message = this.message;
    }
    public String getMassage(){
        return message;
    }
}
