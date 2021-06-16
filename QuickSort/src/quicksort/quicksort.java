package quicksort;

public class quicksort {

	public static int partition(int[] array, int left, int right) {
	    //�߾��� ã�� 
		int mid = (left + right) / 2;
		
		//swap �Լ��� �迭���� �Ǿ��� left�� �������� mid�� �ٲ�
	    swap(array, left, mid);
	    
	    //����� �� left�� �����ϴ� ������� �ǹ� �Ҵ� 
	    int pivot = array[left];
	    
	    //��� ����� left�� i�� �� �����ִ� right�� j�� �Ҵ� 
	    int i = left, j = right;
	    
	    //��� ����� left���� �Ǻ��� ���� ����
	    while (i < j) {
	    	//
	        while (pivot < array[j]) {
	        	//�����ʿ��� �������� ���鼭 �ǹ����� ���� �� ã�� 
	            j--;
	        }
	 
	        while (i < j && pivot >= array[i]) {
	           //���ʿ������� ���������� ���鼭 �ǹ�����  ū�� ã�� 
	        	i++;
	        }
	        //swap �Լ��� �迭���� �� i,j�� ���� ��� ��ȯ 
	        swap(array, i, j);
	    }
	    //�ǹ��� i�� ������ 
	    array[left] = array[i];
	    array[i] = pivot;
	    return i;
	}
	 //swqp �Լ�
	public static void swap(int[] array, int a, int b) {
	    //�迭�� b�� �ش��ϴ� ���� temp�� ��� 
		int temp = array[b];
		//�迭�� a�� �ش��ϴ� ���� �迭�� b�� ��� 
	    array[b] = array[a];
	    //temp�� �迭 a�� ��� ���� �ٲ� 
	    array[a] = temp;
	}
	 //quicksort �Լ� 
	public static void quicksort(int[] array, int left, int right) {
	    if (left >= right) {
	        return;
	    }
	    
	    //partition()�Լ��� �ǹ��� �и��ϰ� pi�� �Ҵ� 
	    int pi = partition(array, left, right);
	    //��������� quicksort���� ȣ��
	    quicksort(array, left, pi - 1);
	    quicksort(array, pi + 1, right);
	}

	public static void main(String args[]) {
	    int[] array = { 100, 80, 70, 60, 50, 40, 30, 20, 90 };
	    //array�� 0���� �־��� �迭������ quicksort�Լ��� ���
	    quicksort(array, 0, array.length - 1);
	    
	    for (int v : array) {
	        System.out.println(v);
	    }
	}
	
}
