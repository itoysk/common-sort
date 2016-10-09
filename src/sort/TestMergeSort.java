package sort;

public class TestMergeSort {
	
	public static void sort(int[] a, int start, int end){
		if(start < end){
			int mid = (start + end) / 2;
			sort(a, start, mid);
			sort(a, mid+1, end);
			merge(a, start, mid, end);
		}
	}
	
	public static void merge(int[] a, int start, int mid, int end){
		int[] temp = new int[end - start + 1];
		int i = start;
		int j = mid + 1;
		int k = 0;
		
		while(i <= mid && j <= end){
			if(a[i] < a[j]){
				temp[k++] = a[i++];
			}else{
				temp[k++] = a[j++];
			}
		}
		
		while(i <= mid){
			temp[k++] = a[i++];
		}
		
		while(j <= end){
			temp[k++] = a[j++];
		}
		
		for(k = 0, i = start; k < temp.length; k++,i++){
			a[i] = temp[k];
		}
	}
	
	public static void main(String[] args){
		int[] a = {20,10,5,30,3};
		sort(a, 0, a.length - 1);
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
	}
	
	
}
