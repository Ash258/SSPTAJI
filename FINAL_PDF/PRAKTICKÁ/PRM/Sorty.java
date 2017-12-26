package FinalMaturitaCodes;

/**
 * Created by Ash258 on 16.04.2016.
 */
public class _Sorty{
	public static void bubble(int[] array){
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length - 1 - i; j++) {
				//if(array[j] < array[j+1]){ směr řazení
				if(array[j] > array[j + 1]) {
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}
	}

	public static void select(int[] array){
		for(int i = 0; i < array.length - 1; i++) {
			int max = array.length - i - 1;
			for(int j = 0; j < array.length - i; j++) {
				//if(array[j] < array[max]){ směr řazení
				if(array[j] > array[max]) {
					max = j;
				}
			}
			int tmp = array[array.length - 1 - i];
			array[array.length - 1 - i] = array[max];
			array[max] = tmp;
		}
	}

	public static void insert(int[] array){
		for(int i = 0; i < array.length; i++) {
			int tmp = array[i];
			int j   = i - 1;
			//while((j>=0) && (array[j] < tmp)){směř řazení
			while((j >= 0) && (array[j] > tmp)) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = tmp;
		}
	}

	public static void quick(int[] array, int left, int right){
		int i     = left;
		int j     = right;
		int pivot = array[(left + right) / 2];
		do {
			//while(array[i] > pivot) i++;
			//while(array[j] < pivot) j--;
			while(array[i] < pivot) i++;
			while(array[j] > pivot) j--;
			if(i <= j) {
				int tmp = array[i];
				array[i] = array[j];
				array[j] = tmp;
				i++;
				j--;
			}
		} while(i < j);
		if((j - left) > 0) {
			quick(array, left, j);
		}
		if((right - i) > 0) {
			quick(array, i, right);
		}
	}
}
