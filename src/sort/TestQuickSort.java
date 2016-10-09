package sort;

public class TestQuickSort {
	public static void sort(int[] a, int low, int high){
		if(low < high){
			int middle = getMiddle(a,low,high);
			sort(a, low, middle-1);
			sort(a, middle+1, high);
		}
	}
	
	private static int getMiddle(int[] a, int low, int high) {
		int temp = a[low];
		while(low < high){
			while(low < high && a[high] >= temp){
				high--;
			}
			a[low] = a[high];
			while(low < high && a[low] <= temp){
				low++;
			}
			a[high] = a[low];
		}
		a[low] = temp;
		return low;
	}

	public static void main(String[] args){
		int[] a = {20,10,5,30,3,2};
		sort(a, 0, a.length - 1);
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
	}
}
