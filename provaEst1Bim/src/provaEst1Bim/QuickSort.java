package provaEst1Bim;

public class QuickSort {
		int countVezes = 1;
		int i;
		
		//Por conta da complexidade, é preciso entender o seguinte:
		//Ele é composto por duas linha verticais imaginárias, dois parâmetros responsáveis por determinar o início e o fim de uma
		//lista que exclui um elemento chamado pivô (qualquer elemento da lista escolhido). Esses dois parâmetros iniciam-se no início
		//da lista e vão se movendo conforme forem feitas as comparações. No final, todos os termos anteriores à variável inicio são
		//menores que o pivô e todos os termos seguintes à variável inicio até a variável fim são maiores que o pivô. Após a variável fim
		//chegar ao elemento anterior ao elemento pivô, as comparações são paradas e o pivô troca de lugar com o primeiro termo seguinte 
		//ao valor da variável início; 
		//Depois desse processo,o método é chamado novamente, porém em duas sub-listas. Duas listas formadas a partir da execução do al-
		//goritmo. A primeira sub-lista é composta pelos elementos anteriores ao pivô, e a segunda, aos posteriores ao pivô. Assim sendo,
		//o algoritmo só termina quando todos os elementos estiverem devidamente ordenados;
		
		//Por conta de sua complexidade, o Quick Sort necessita que alguns métodos sejam feitos até que a ordenação esteja completa.
		//O primeiro método é responsável por organizar o funciomaneto do algoritmo.
		//O método recebe como parâmetros a lista, a variável inicio e a variável fim. Que no começo, estarão ambas no início da lista;
		void algoritmoQuickSort(int lista[], int inicio, int fim) {
			int n = lista.length;
			//Essa primeira verificação é para caso o elemento da variável início seja igual o da variável fim não seja feito nada.
			//No restante dos casos, o normal, ele entra para o algoritmo em si.
			if (inicio < fim) {
				//1 - a posição do pivo é dada a partir de um cálculo realizado pelo outro método, o partition(), que recebe também a lista, a variável início e
				//a variável fim. A função partition escolhe um pivô, faz as comparações e trocas e faz a separação da lista em duas sub-listas a partir do pivô.
				//Os elementos à esquerda dele e os elementos à direita. Então, ao final desse processo, o pivô estará na posição correta, à sua esquerda estarão
				//elementos menores que ele (mas não necessariamente ordenados) e à sua direita, elementos maiores.
				int indicePivo = partition(lista, inicio, fim);
				//Após esse processo, o algoritmo é executado novamente para os elementos à esquerda do pivô...
				algoritmoQuickSort(lista, inicio, indicePivo - 1);
				//E os elementos à direita do pivô
				algoritmoQuickSort(lista, indicePivo + 1, fim);
			}	
			//Ao final desse processo, a lista estará ordenada;
		}	

		int partition(int lista[], int inicio, int fim) {
			int pivo = lista[inicio]; //Escolha do elemento pivo para as comparações
			//Declaração da variável i para fazer as comparações. Essa variável é uma posição, a posição seguinte à linha imaginário
			//início até a linha fim
			int i = inicio + 1, f = fim; 
			//Aqui é onde começa o laço para caminhar a lista inteira
			while (i <= f) {
				//Com essa comparação, ele separa os números menores que o pivô à esquerda
				if (lista[i] <= pivo)
					i++;
				//O break da comparação:
				else if (pivo < lista[f])
					f--;
				//Agora o pivo precisa trocar de lugar com o primeiro elemento após a linha imaginária início, a variável início.
				else {
					int troca = lista[i];
					lista[i] = lista[f];
					lista[f] = troca;
					i++;
					f--;
				}
			}
			//Feito todo o processo é preciso salvar a posição do pivô utilizado para que possa ser feita o processo nas sub-listas
			lista[inicio] = lista[f];
			lista[f] = pivo;
			//Retorna a posição para a variável índicePivo;
			return f;
		}
		//Somente para o print das respostas
		void printQuickSort (int lista[]) {
			// OUTPUT
			int n = lista.length;	
			if (countVezes == 1) {System.out.println("QUICK SORT:"); countVezes++;}
			System.out.print("[");
				for (i = 0; i < n; i++) {
					System.out.print(" " + lista[i] + " ");
				}
			System.out.println("];");
			}
			
	}

