public class Main {
    public static int busca(int target, int[] array) {
        for (int i = 0; i < array.length; i++){
            if (i == target){
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }        
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int target = 2;
        int x = busca(target, array);
        System.out.println(x);
    }
}
