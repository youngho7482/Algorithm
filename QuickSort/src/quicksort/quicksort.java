package quicksort;

public class quicksort {

	public static int partition(int[] array, int left, int right) {
	    //중앙을 찾아 
		int mid = (left + right) / 2;
		
		//swap 함수로 배열에서 맨앞인 left와 가운데요소인 mid를 바꿔
	    swap(array, left, mid);
	    
	    //가운데로 온 left를 선택하는 방식으로 피벗 할당 
	    int pivot = array[left];
	    
	    //가운데 요소인 left를 i로 맨 끝에있는 right를 j로 할당 
	    int i = left, j = right;
	    
	    //가운데 요소인 left보다 맨보다 작을 동안
	    while (i < j) {
	    	//
	        while (pivot < array[j]) {
	        	//오른쪽에서 왼쪽으로 가면서 피벗보다 작은 수 찾아 
	            j--;
	        }
	 
	        while (i < j && pivot >= array[i]) {
	           //왼쪽에서부터 오른쪽으로 가면서 피벗보다  큰수 찾아 
	        	i++;
	        }
	        //swap 함수로 배열에서 각 i,j에 대한 요소 교환 
	        swap(array, i, j);
	    }
	    //피벗과 i를 교차해 
	    array[left] = array[i];
	    array[i] = pivot;
	    return i;
	}
	 //swqp 함수
	public static void swap(int[] array, int a, int b) {
	    //배열의 b에 해당하는 값을 temp에 담아 
		int temp = array[b];
		//배열의 a에 해당하는 값을 배열의 b에 담아 
	    array[b] = array[a];
	    //temp를 배열 a에 담아 값을 바꿔 
	    array[a] = temp;
	}
	 //quicksort 함수 
	public static void quicksort(int[] array, int left, int right) {
	    if (left >= right) {
	        return;
	    }
	    
	    //partition()함수로 피벗을 분리하고 pi에 할당 
	    int pi = partition(array, left, right);
	    //재귀적으로 quicksort수를 호출
	    quicksort(array, left, pi - 1);
	    quicksort(array, pi + 1, right);
	}

	public static void main(String args[]) {
	    int[] array = { 100, 80, 70, 60, 50, 40, 30, 20, 90 };
	    //array를 0부터 주어진 배열끝까지 quicksort함수를 사용
	    quicksort(array, 0, array.length - 1);
	    
	    for (int v : array) {
	        System.out.println(v);
	    }
	}
	
}
