package provaEst1Bim;

public class SelectionSort {
	int i, menor, indiceMenor, j;
	int countVezes = 1;
	
	public void algoritmoSelectionSort(int lista[]) {
		int n = lista.length;
		
		for (i = 0; i < n - 1; i++) {
			// antes de comparar, considera-se como menor o valor no �ndice atual do loop, ou seja, o valor inserido
			// no �ndice que o loop est�.
			menor = lista[i];
			indiceMenor = i;
			//O la�o for seguinte j� � para a compara��o. Ele pega o elemento seguinte ao atual (definido pela vari�vel i acima)
			for (j = i + 1; j < n; j++) {
				//Aqui inicia-se a compara��o. Se o elemento seguinte for menor que o elemento na vari�vel menor (que � o elemento atual)...
				if (lista[j] < menor) {
					//1 - A vari�vel menor o armazena
					menor = lista[j];
					//E tamb�m � armazenada sua posi��o na lista
					indiceMenor = j;
				}
			}
			//2 - Realiza a troca dos elementos quando o elemento comparado (o elemento seguinte ao atual) � menor que o elemento atual  
			lista[indiceMenor] = lista[i]; //
			lista[i] = menor;
		}
		// OUTPUT
		if (countVezes == 1) {System.out.println("SELECTION SORT:"); countVezes++;};
		System.out.print("[");
		for (i = 0; i < n; i++) {
			System.out.print(" " + lista[i] + " ");
		}
		System.out.println("];");
	}
}
