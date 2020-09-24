package application;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
import entities.Pessoa;

//Programa calcula IMC
//Devenvolvido para atividade 07 
public class Principal {

	public static void main(String[] args) {	

		try (Scanner ler = new Scanner(System.in)){ 
			double peso, alt;
			    
	    System.out.printf("Informe o peso corporal (em kg):\n");
	    peso = ler.nextDouble();
	    System.out.printf("\nInforme a altura (em metros: 1,77 por exemplo):\n");
	    alt = ler.nextDouble();
	    System.out.print("Sexo (1 para 'H' ou 2 outro numero para 'M'): ");
		byte sexo = (byte) ler.nextShort();
		
	    
	    Pessoa p = new Pessoa(alt, peso, sexo);
	    p.setAlt(alt);
	    p.setPeso(peso);
	    p.setSexo(sexo);
	    
	    NumberFormat format = new DecimalFormat("#0.000"); 
	    System.out.printf("\nResultados...:\n");
		
	    
	    System.out.println("Peso ideal        :  " +(format.format(p.calcularPeso())));
	    System.out.println("Diagnóstico: " +p.verificarPeso());
	    }
	}
}
