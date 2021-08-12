import java.util.Scanner;

public class taboada {
	public static void main(String[] args) {
		int multiplicador = 0;
		int limite = 10;
		System.out.println("Digite o número que voce deseja fazer o cálculo: ");
		Scanner ler = new Scanner( System.in );
		int numeroLido = ler.nextInt();
		System.out.println("O número declarado é " + numeroLido);
		while(multiplicador<=limite) {
			int resultado = numeroLido*multiplicador;
			System.out.println(numeroLido+ "x" + multiplicador + "=" + resultado);
			multiplicador++;
				
		}
	}
}
