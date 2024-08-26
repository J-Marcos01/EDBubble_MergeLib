package view;

import controller.Operacoes;
import javax.swing.JOptionPane;


public class Principal
{

	public static void main(String[] args) 
	{
		Operacoes op = new Operacoes();
		
		int []vet= {74,20,74,87,81,16,25,99,44,58};
		
		int[] vet2= {44,43,42,41,40,39,38};
		
		int[] vet3= {101,102,103,125,124,123,104,105,106,122};
		
		int tamanho=0;
		int opc=0;
		
		while(opc!=9)
		{
			opc= Integer.parseInt(JOptionPane.showInputDialog("Selecione vetor 1 , 2 ou 3"));
		switch (opc)
		{
			case 1:
			{
				tamanho=vet.length;
				for(int i =0;i<tamanho;i++)
				{
					System.out.println(vet[i]);
				}
				op.ordenacao(vet);
				op.ordenacaoMerge(vet);
				break;
			}
			case 2:
			{
				tamanho=vet2.length;
				for(int i =0;i<tamanho;i++)
				{
					System.out.println(vet2[i]);
				}
				op.ordenacao(vet2);
				op.ordenacaoMerge(vet2);
				break;
			}
			case 3:
			{
				tamanho=vet3.length;
				for(int i =0;i<tamanho;i++)
				{
					System.out.println(vet3[i]);
				}
				op.ordenacao(vet3);
				op.ordenacaoMerge(vet3);
				break;
			}
			case 9:
			{
				System.err.println("Fim");
				break;
			}
			default:
				System.out.println("Valor invalido :digite 01 , 02 ,03");
			}
			
		}
				
	}

}
