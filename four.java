//Return the second largest element of an array
import java.util.*;
public class four {
    public static void main(String[] args) {
        int[] arr = {11,22,13,84,45};
        int[] temp = arr;
        Arrays.sort(temp);
        System.out.println("The second largest element is: "+temp[3]);
    }
}
