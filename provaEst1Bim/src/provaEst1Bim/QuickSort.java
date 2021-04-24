package provaEst1Bim;

public class QuickSort {
		int countVezes = 1;
		int i;
		
		//Por conta da complexidade, � preciso entender o seguinte:
		//Ele � composto por duas linha verticais imagin�rias, dois par�metros respons�veis por determinar o in�cio e o fim de uma
		//lista que exclui um elemento chamado piv� (qualquer elemento da lista escolhido). Esses dois par�metros iniciam-se no in�cio
		//da lista e v�o se movendo conforme forem feitas as compara��es. No final, todos os termos anteriores � vari�vel inicio s�o
		//menores que o piv� e todos os termos seguintes � vari�vel inicio at� a vari�vel fim s�o maiores que o piv�. Ap�s a vari�vel fim
		//chegar ao elemento anterior ao elemento piv�, as compara��es s�o paradas e o piv� troca de lugar com o primeiro termo seguinte 
		//ao valor da vari�vel in�cio; 
		//Depois desse processo,o m�todo � chamado novamente, por�m em duas sub-listas. Duas listas formadas a partir da execu��o do al-
		//goritmo. A primeira sub-lista � composta pelos elementos anteriores ao piv�, e a segunda, aos posteriores ao piv�. Assim sendo,
		//o algoritmo s� termina quando todos os elementos estiverem devidamente ordenados;
		
		//Por conta de sua complexidade, o Quick Sort necessita que alguns m�todos sejam feitos at� que a ordena��o esteja completa.
		//O primeiro m�todo � respons�vel por organizar o funciomaneto do algoritmo.
		//O m�todo recebe como par�metros a lista, a vari�vel inicio e a vari�vel fim. Que no come�o, estar�o ambas no in�cio da lista;
		void algoritmoQuickSort(int lista[], int inicio, int fim) {
			int n = lista.length;
			//Essa primeira verifica��o � para caso o elemento da vari�vel in�cio seja igual o da vari�vel fim n�o seja feito nada.
			//No restante dos casos, o normal, ele entra para o algoritmo em si.
			if (inicio < fim) {
				//1 - a posi��o do pivo � dada a partir de um c�lculo realizado pelo outro m�todo, o partition(), que recebe tamb�m a lista, a vari�vel in�cio e
				//a vari�vel fim. A fun��o partition escolhe um piv�, faz as compara��es e trocas e faz a separa��o da lista em duas sub-listas a partir do piv�.
				//Os elementos � esquerda dele e os elementos � direita. Ent�o, ao final desse processo, o piv� estar� na posi��o correta, � sua esquerda estar�o
				//elementos menores que ele (mas n�o necessariamente ordenados) e � sua direita, elementos maiores.
				int indicePivo = partition(lista, inicio, fim);
				//Ap�s esse processo, o algoritmo � executado novamente para os elementos � esquerda do piv�...
				algoritmoQuickSort(lista, inicio, indicePivo - 1);
				//E os elementos � direita do piv�
				algoritmoQuickSort(lista, indicePivo + 1, fim);
			}	
			//Ao final desse processo, a lista estar� ordenada;
		}	

		int partition(int lista[], int inicio, int fim) {
			int pivo = lista[inicio]; //Escolha do elemento pivo para as compara��es
			//Declara��o da vari�vel i para fazer as compara��es. Essa vari�vel � uma posi��o, a posi��o seguinte � linha imagin�rio
			//in�cio at� a linha fim
			int i = inicio + 1, f = fim; 
			//Aqui � onde come�a o la�o para caminhar a lista inteira
			while (i <= f) {
				//Com essa compara��o, ele separa os n�meros menores que o piv� � esquerda
				if (lista[i] <= pivo)
					i++;
				//O break da compara��o:
				else if (pivo < lista[f])
					f--;
				//Agora o pivo precisa trocar de lugar com o primeiro elemento ap�s a linha imagin�ria in�cio, a vari�vel in�cio.
				else {
					int troca = lista[i];
					lista[i] = lista[f];
					lista[f] = troca;
					i++;
					f--;
				}
			}
			//Feito todo o processo � preciso salvar a posi��o do piv� utilizado para que possa ser feita o processo nas sub-listas
			lista[inicio] = lista[f];
			lista[f] = pivo;
			//Retorna a posi��o para a vari�vel �ndicePivo;
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

