package provaEst1Bim;

public class BubbleSort {
	int j, i, aux;
	int countVezes = 1;
	
	public void algoritmoBubbleSort(int lista[]) {
		int n = lista.length;
		//A vari�vel j serve para analisar cada elemento do array, sendo que ao final, todos os elementos passar�o pelo pr�ximo la�o (explicado abaixo) 
			for (j = 0; j < n; j++) {  
		//A vari�vel i percorre o array at� o pen�ltimo elemento pois essa leitura inlfuenciar� na compara��o. 
		//Como n�o h� elementos ap�s o �ltimo elemento, ele n�o deve entrar na compara��o, at� por que ele j� estar� na posi��o correta,
		//por isso a vari�vel i vai at� a posi��o n-1 (quantidade de elementos total - 1 = pen�ltima posi��o)		
				for (i = 0; i < n - 1; i++) { 
					//Aqui inicia-se as compara��es:
					//Se o elemento atual for maior que o pr�ximo...
					if (lista[i] > lista[i + 1]) {
						//1 - uma vari�vel auxiliar s� para ajudar no processo, vai receber o elemento atual
						aux = lista[i];
						//2 - o elemento atual vai receber o pr�ximo elemento da lista, que � menor
						lista[i] = lista[i + 1];
						//3 - e o pr�ximo elemento vai receber a auxiliar, que no come�o recebeu o elemento atual que era maior
						lista[i + 1] = aux;
					}
				}
			}
			// OUTPUT
			if (countVezes == 1) {System.out.println("BUBBLE SORT:"); countVezes++;};	
			System.out.print("[");
			for (i = 0; i < n; i++) {
				System.out.print(" " + lista[i] + " ");
			}
			System.out.println("]; ");
	}
}