package exercicios_prof_ohata;
import java.util.Scanner;

public class votos_eleicao {

	public static void main(String[] args) {
		//Titulo exercicio
		System.out.println("Exercício - Contagem de votos da eleição");
		
		//Declaracao de variaveis
		int cod_voto, pt = 0, pdt = 0, pl= 0, psdb = 0, voto_nulo = 0, voto_branco = 0;
		
		//Declaracao de Scanner para entrada de dados
		Scanner input = new Scanner(System.in);	
		
		//Looping para fazer a contagem de 50 votos		
		for (int i = 0; i < 50; i++){
			
			//Entrada de dados cod_voto, pt, pdt, pl, psdb, voto_nulo, voto_branco
			System.out.println("\nDigite o código do candidato que deseja votar: \n- 1 - (13) PT\n- 2 - (12) PDT\n- 3 - (22) PL\n- 4 - (45) PSDB\n- 5 - voto nulo\n- 6 - voto em branco");
			cod_voto = input.nextInt();
			
			//Switch para armazenar valores dos votos do usuário as variaveis 
			switch (cod_voto) {
			case 1: 
				System.out.print("Voto feito!");
				pt++;
				break;
			case 2: 
				System.out.print("Voto feito!");
				pdt++;
				break;
			case 3: 
				System.out.print("Voto feito!");
				pl++;
				break;
			case 4: 
				System.out.print("Voto feito!");
				psdb++;
				break;
			case 5: 
				System.out.print("Voto feito!");
				voto_nulo++;
				break;
			case 6: 
				System.out.print("Voto feito!");
				voto_branco++;
				break;
			default: 
				System.out.print("Digite apenas os códigos permitidos.");
			}	
		}
		//Exibir resultados dos votos
		System.out.printf("\nTotal de votos:\n(13)PT - %d\n(12)PDT - %d\n(22)PL - %d\n(45)PSDB- %d\nVoto nulo - %d\nVoto em branco - %d", pt, pdt, pl, psdb, voto_nulo, voto_branco);
	}
}
