import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int hold = read.nextInt();
        long[] songs = new long[hold];
        for (int i = 0; i < hold; i++) {
            songs[i] = read.nextLong();
        }

        HashSet<Long> set = new HashSet<>();
        int left = 0;
        int max = 0;

        for (int right = 0; right < hold; right++) {
            while (set.contains(songs[right])) {
                set.remove(songs[left]);
                left++;
            }
            set.add(songs[right]);
            max = Math.max(max, right - left + 1);
        }

        System.out.println(max);
    }
}
