package provaEst1Bim;

public class BubbleSort {
	int j, i, aux;
	int countVezes = 1;
	
	public void algoritmoBubbleSort(int lista[]) {
		int n = lista.length;
		//A variável j serve para analisar cada elemento do array, sendo que ao final, todos os elementos passarão pelo próximo laço (explicado abaixo) 
			for (j = 0; j < n; j++) {  
		//A variável i percorre o array até o penúltimo elemento pois essa leitura inlfuenciará na comparação. 
		//Como não há elementos após o último elemento, ele não deve entrar na comparação, até por que ele já estará na posição correta,
		//por isso a variável i vai até a posição n-1 (quantidade de elementos total - 1 = penúltima posição)		
				for (i = 0; i < n - 1; i++) { 
					//Aqui inicia-se as comparações:
					//Se o elemento atual for maior que o próximo...
					if (lista[i] > lista[i + 1]) {
						//1 - uma variável auxiliar só para ajudar no processo, vai receber o elemento atual
						aux = lista[i];
						//2 - o elemento atual vai receber o próximo elemento da lista, que é menor
						lista[i] = lista[i + 1];
						//3 - e o próximo elemento vai receber a auxiliar, que no começo recebeu o elemento atual que era maior
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