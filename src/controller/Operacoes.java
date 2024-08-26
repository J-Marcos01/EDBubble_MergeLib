package controller;
import br.edu.fateczl.bubblesort.*;
import br.edu.fateczl.megesort.*;
public class Operacoes 
{

	public Operacoes() 
	{
		super();	
	}
	
	public void ordenacao (int[]vet)
	{
		br.edu.fateczl.bubblesort.Operacoes bubble = new br.edu.fateczl.bubblesort.Operacoes();
		int tamanho=vet.length;
		vet=bubble.bubbleSort(vet);
		System.out.println("Ordenação por bubble sort:");
		for(int i=0;i<tamanho;i++)
		{
			System.out.println(vet[i]);
		}
		System.out.println("*****************************************");
	}
		
		public void ordenacaoMerge (int[]vet)
		{
			br.edu.fateczl.megesort.Operacoes mege = new br.edu.fateczl.megesort.Operacoes();
			int tamanho=vet.length;
			vet=mege.megeSort(vet,0,tamanho-1);
			System.out.println("Ordenação por mergesort:");
			for(int i=0;i<tamanho;i++)
			{
				System.out.println(vet[i]);
			}
			System.out.println("*****************************************");
		
	}

}
