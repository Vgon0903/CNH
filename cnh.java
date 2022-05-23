import java.util.Scanner;
public class cnh 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int op; //variavel criada para ler respostas
		System.out.println("CARTEIRA NACIONAL DE HABILITACAO\n"); //exibir mensagem "CARTEIRA NACIONAL DE HABILITACAO" e quebrar uma linha
		
		System.out.println("Para proseguir com a solcitacao da carta e preciso reponder as seguinte perguntas \n Responda com: (1) Sim  ou  (2) Nao "); //exibir mesagem para que usuario responda com "1"para sim e "2" para nao
		
		System.out.println("\n Voce foi aprovado no exame psicotecnico?"); //Pedido para o usuario informar responder com sim ou nao essa pergunta
		op = sc.nextInt(); //armazena resposta na variavel
		System.out.println("\n Voce foi aprovado no exame de direcao?");//Pedido para o usuario informar responder com sim ou nao essa pergunta
		op = sc.nextInt();//armazena resposta na variavel
		System.out.println("\n Voce foi aprovado no exame de legislacao?");//Pedido para o usuario informar responder com sim ou nao essa pergunta
		op = sc.nextInt();//armazena resposta na variavel

		
		if(op == 1) //condicao criada para se a resposta for sim em todas apresentar mensagem a baixo
		{
			System.out.printf("\n Voce foi aprovado em todos os quesitos sua carteria de hablitacao esta liberada!!!"); 
		}
		else //se em alguma resposta houver um nao sera apresentada a resposta a seguir
			System.out.printf("\n Voce foi reprovado em algum quesito, sua carteira de habilitacao nao esta liberada");
	
	}

}
