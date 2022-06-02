import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		
		Double C;
		Double K;
		Double F;
		Double Re;
		Double Ra;
		char resp;
		Scanner entrada = new Scanner(System.in);
		do {
		System.out.print("Informe a temperatura em graus Celsius>>");
		C = entrada.nextDouble();
		K = C + 273.15;
		F = C * 1.8 + 32;
		Re = C * 0.8;
		Ra = C * 1.8 + 32 + 459.67;
		
		System.out.printf("Kelvin>>%.2f%n",K);
		System.out.printf("Fahrenheit>>%.2f%n",F);
		System.out.printf("Réaumur>>%.2f%n",Re);
		System.out.printf("Rankine>>%.2f%n",Ra);
		System.out.print("Deseja continuar?(s/n)>>>");
		System.out.println("");
		System.out.println("##########################");
	    resp = entrada.next().charAt(0); 
		}while(resp != 'n');
		System.err.println("Fim da execução!");
		entrada.close();
	}

}
