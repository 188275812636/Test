package exercise2;

public class Equals {
    public static void main(String[] args) {
        Character character1 = new Character('a');
        Character character2 = new Character('b');
        System.out.println(compare(character1,character2));
    }
    public static boolean compare(Character c1,Character c2){
        if(c1.equals(c2)){
            return true;
        }else{
            return false;
        }
    }
}
