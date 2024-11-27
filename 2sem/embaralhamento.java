import java.util.Random;
public static void main(String [ ] args) {
    int[] array = {1,2,3,4,5};
    Random random = new Random();
    for (int i = array.length - 1; i > 0; i--) {
    int j = random.nextInt(i + 1);
    swap(array, i, j);
    }
}