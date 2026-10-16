// Search class uses Linear Search to find route distance
public class SearchRoute {
    static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) return i;
        }
        return -1;
    }
}
