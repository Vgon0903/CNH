import java.util.Scanner;
public class cnh 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int op;
		System.out.println("CARTEIRA NACIONAL DE HABILITACAO\n");
		
		System.out.println("Para proseguir com a solcitacao da carta e preciso reponder as seguinte perguntas \n Responda com: (1) Sim  ou  (2) Nao ");
		
		System.out.println("\n Voce foi aprovado no exame psicotecnico?");
		op = sc.nextInt();
		System.out.println("\n Voce foi aprovado no exame de direcao?");
		op = sc.nextInt();
		System.out.println("\n Voce foi aprovado no exame de legislacao?");
		op = sc.nextInt();

		
		if(op == 1)
		{
			System.out.printf("\n Voce foi aprovado em todos os quesitos sua carteria de hablitacao esta liberada!!!");
		}
		else
			System.out.printf("\n Voce foi reprovado em algum quesito, sua carteira de habilitacao nao esta liberada");
	
	}

}
