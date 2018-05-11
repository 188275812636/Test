package exercise4;

public class Builder {
    public static void main(String[] args) {
        StringBuilder bf = new StringBuilder();
        for (int i = 1; i <=10 ; i++) {
            bf.append(i);
        }
        System.out.println(bf.toString());
    }
}
