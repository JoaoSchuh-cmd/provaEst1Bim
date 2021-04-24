package provaEst1Bim;

public class InsertionSort {
	int countVezes = 1;
	int i, key, j;
	public void algoritmoInsertionSort(int lista[]) {
        int n = lista.length;
        //Primeiramente, ele precisa armazenar um número na variável key para poder fazer as comparações a partir dela
        //Para isso, um laço for que iniciária a partir da segunda posição do array.
        for (j = 1; j < n; j++) {
        	//A variável kei recebe o elemento da segunda posição do array
        	key = lista[j];
        	//É determinado à variável i, a posição anterior, para que o próximo laço, onde iniciará a comparação, inicie corretamente.
        	i = j-1;
        	//Aqui é o laço para pegar todos os elementos anteriores à key menores que ele então...
        	//Enquanto algum elemento anterior (determinado pela variável i) for maior que o valor armazenado na variável key (que é um elemento seguinte)...
            while ( (i > -1) && ( lista [i] > key ) ) {
            	//O elemento seguinte recebe o elemento atual da variável i
                lista [i+1] = lista [i];
                //Essa declaração: i--, é só para que todos os elementos anteriores à key sejam comparados
                i--;
            }
            //O próximo elemento recebe o valor que deve estar nessa posição, armazenado na variável key anterior ao processo.
            lista[i+1] = key;
        }
    	// OUTPUT
        if (countVezes == 1) {System.out.println("INSERTION SORT:"); countVezes++;};
		System.out.print("[");
		for (i = 0; i < n; i++) {
			System.out.print(" " + lista[i] + " ");
		}
		System.out.println("];");
    }
}
