import java.util.Arrays;

public class AnArraytoRemember {
    public static void main(String[] args) {
        String[] tenPresidents = {"Johnson", "Nixon", "Ford", "Carter", "Reagan", "Bush", "Clinton", "Bush", "Obama", "Trump"};

        System.out.println("Original Array: " + Arrays.toString(tenPresidents));

        for (int i = tenPresidents.length - 1; i >= 0; i--) {
            System.out.println(tenPresidents[i]);
        }


    }
}





