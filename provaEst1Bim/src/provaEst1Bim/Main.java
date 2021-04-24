package provaEst1Bim;

public class Main {
	public static void main (String args[]) {
	InsertionSort executeInsertionSort = new InsertionSort();
	QuickSort executeQuickSort = new QuickSort();
	SelectionSort executeSelectionSort = new SelectionSort();
	BubbleSort executeBubbleSort = new BubbleSort();
	
	int vetorBubbleSort1[] = {3, 2, 1, 5, 4};
	int vetorBubbleSort2[] = {1, 6, 8, 5, 4}; 
	
	int vetorSelectionSort1[] = {3, 10, 12, 24, 9};
	int vetorSelectionSort2[] = {2, 1, 5, 9, 6};
	
	int vetorInsertionSort1[] = {1, 2, 4, 6, 3};
	int vetorInsertionSort2[] = {10, 11, 1, 2, 3};
	
	int vetorQuickSort1[] = {2, 3, 1, 5, 9};
	int vetorQuickSort2[] = {3, 7, 1, 3, 4};
	
	int n1 = vetorQuickSort1.length;
	int n2 = vetorQuickSort2.length;
	
	executeInsertionSort.algoritmoInsertionSort(vetorInsertionSort1); //esperado 1, 2, 3, 4, 6
	executeInsertionSort.algoritmoInsertionSort(vetorInsertionSort2); //esperado  1, 2, 3, 10, 11
	
	executeSelectionSort.algoritmoSelectionSort(vetorSelectionSort1);//esperado 3, 9, 10, 12, 24
	executeSelectionSort.algoritmoSelectionSort(vetorSelectionSort2);//esperado 1, 2, 5, 6, 9
	
	executeQuickSort.algoritmoQuickSort(vetorQuickSort1, 0, n1 - 1);//esperado 1, 2, 3, 5, 9
	executeQuickSort.printQuickSort(vetorQuickSort1);
	executeQuickSort.algoritmoQuickSort(vetorQuickSort2, 0, n2 - 1);//esperado 1, 3, 3, 4, 7
	executeQuickSort.printQuickSort(vetorQuickSort2);
	
	executeBubbleSort.algoritmoBubbleSort(vetorBubbleSort1);//esperado 1, 2, 3, 4, 5
	executeBubbleSort.algoritmoBubbleSort(vetorBubbleSort2);//esperado 1, 4, 5, 6, 8
	
	}
	
}
