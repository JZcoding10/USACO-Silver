import java.util.*;

public class Distinct {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numValues = read.nextInt();
        HashSet<Integer> holder = new HashSet<>();
        for (int i = 0; i < numValues; i++) {
            holder.add(read.nextInt());
        }
        System.out.println(holder.size());
    }
}