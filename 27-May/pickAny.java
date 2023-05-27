import java.util.Random;

public class pickAny {
    public static void main(String[] args) {
        Random picker =new Random();
        int random=picker.nextInt(100);
        System.out.println(random);
    }
}
