import java.util.Scanner;

public class taboada {
	public static void main(String[] args) {
		int multiplicador = 0;
		int limite = 10;
		System.out.println("Digite o n�mero que voce deseja fazer o c�lculo: ");
		Scanner ler = new Scanner( System.in );
		int numeroLido = ler.nextInt();
		System.out.println("O n�mero declarado � " + numeroLido);
		while(multiplicador<=limite) {
			int resultado = numeroLido*multiplicador;
			System.out.println(numeroLido+ "x" + multiplicador + "=" + resultado);
			multiplicador++;
				
		}
	}
}
