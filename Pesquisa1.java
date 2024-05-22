package entities;

import java.util.Scanner;

public class Pesquisa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

int []vetor = {5,6,7,8,1};


System.out.println("Digite o numero de pesquisa");
int pesquisa = sc.nextInt();
int pos =-1;
for (int i=0; i<vetor.length;i++) {
	
	if(pesquisa == vetor[i] ){
		
	pos = i;	
	break;
	}
}
	if(pos >-1) {
		System.out.println("Achei o número");
	}else {
		System.out.println("Não achamos o número");
	}

	

}
}
