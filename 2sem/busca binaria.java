public class Main {
	public static int busca(int target, int[] array) {
	    int inicio = 0;
	    int fim = array.length - 1;
	    while (inicio <= fim){
	        int meio = (inicio + fim) / 2;
	        
	        if (array[meio] == target){
	            return meio;
	        }
	        else if (array[meio] < target){
	            inicio = meio + 1;
	        }
	        else if (array[meio] > target){
	            fim = meio - 1;
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