import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args){
		Paciente paciente = new Paciente();
		
		float massa = 0;
		float altura = 0;
		boolean val;
		String nome;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = scanner.nextLine();
		
		do{
			System.out.println("Digite sua massa: ");
			massa = scanner.nextFloat();
			val = paciente.setMassa(massa);
		}
		while(val == false);
		
		
		do{
			System.out.println("Didgite sua altura: ");
			altura = scanner.nextFloat();
			val = paciente.setAltura(altura);
		}
		while(val == false);
		
		paciente.setNome(nome);
		
		float imc = 
		Imc.calcImc(paciente.getMassa(), 
		paciente.getAltura()); 
		
		System.out.println(imc);
		
				
	}

}
