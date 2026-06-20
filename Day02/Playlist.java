import java.util.*;

public class Playlist {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        long[] songs = new long[n];
        for (int i = 0; i < n; i++) {
            songs[i] = read.nextLong();
        }

        HashSet<Long> set = new HashSet<>();
        int left = 0;
        int max = 0;

        for (int right = 0; right < n; right++) {
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
