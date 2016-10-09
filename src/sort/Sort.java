package sort;

public class Sort {
	
	//Bundle Sort
	public static void bundleSort(int[] a){
		for(int i = 0; i < a.length - 1; i++){
			for(int j = 0; j < a.length - 1 - i; j++){
				if(a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	
	//Selection Sort
	public static void selectionSort(int[] a){
		for(int i = 0; i < a.length - 1; i++){
			int minIndex = i;
			int minValue = a[i];
			for(int j = i + 1; j < a.length; j++){
				if(a[j] < minValue){
					minIndex = j;
					minValue = a[j];
				}
			}
			if(a[minIndex] != a[i] && minIndex != i){
				a[minIndex] = a[i];
				a[i] = minValue;
			}
		}
	}
	
	//Insertion Sort
	public static void InsertionSort(int[] a) {
		for(int i = 0; i < a.length; i++){
			for(int j = i; j > 0; j--){
				if(a[j] < a[j-1]){
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args){
		int[] a = {20,10,5,30,3};
		//bundleSort(a);
		//selectionSort(a);
		InsertionSort(a);
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
	}

}
