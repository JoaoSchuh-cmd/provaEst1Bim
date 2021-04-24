package provaEst1Bim;

public class InsertionSort {
	int countVezes = 1;
	int i, key, j;
	public void algoritmoInsertionSort(int lista[]) {
        int n = lista.length;
        //Primeiramente, ele precisa armazenar um n�mero na vari�vel key para poder fazer as compara��es a partir dela
        //Para isso, um la�o for que inici�ria a partir da segunda posi��o do array.
        for (j = 1; j < n; j++) {
        	//A vari�vel kei recebe o elemento da segunda posi��o do array
        	key = lista[j];
        	//� determinado � vari�vel i, a posi��o anterior, para que o pr�ximo la�o, onde iniciar� a compara��o, inicie corretamente.
        	i = j-1;
        	//Aqui � o la�o para pegar todos os elementos anteriores � key menores que ele ent�o...
        	//Enquanto algum elemento anterior (determinado pela vari�vel i) for maior que o valor armazenado na vari�vel key (que � um elemento seguinte)...
            while ( (i > -1) && ( lista [i] > key ) ) {
            	//O elemento seguinte recebe o elemento atual da vari�vel i
                lista [i+1] = lista [i];
                //Essa declara��o: i--, � s� para que todos os elementos anteriores � key sejam comparados
                i--;
            }
            //O pr�ximo elemento recebe o valor que deve estar nessa posi��o, armazenado na vari�vel key anterior ao processo.
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
