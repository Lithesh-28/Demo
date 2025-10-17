import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(1);
        aList.add(1);
        aList.add(1);
        aList.add(1);


        List<Integer>lList = new LinkedList<>(aList);
    }
}
