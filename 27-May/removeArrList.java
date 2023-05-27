import java.util.ArrayList;
import java.util.Arrays;

public class removeArrList {
 
    public static void main(String[] args) {
        ArrayList<Integer> worker =new ArrayList<Integer>();
        worker.add(1);
        worker.add(2);
        worker.add(3);
        System.out.println(worker.toString());
        worker.remove(2);
        System.out.println(worker.toString());


    }
}
