public class Paciente {
	
	private String nome;
	private float massa;
	private float altura;
	
	public String getNome(){
		return nome;
	}
	
	public float getMassa(){
		return massa;
	}
	
	public float getAltura(){
		return altura;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public boolean setMassa(float massa){
		boolean valor;
		if (massa <= 0){
			System.out.println("Massa inválida");
			valor = false;
		}
		else{
			this.massa = massa;
			valor = true;
		}
		return valor;
	}
	
	public boolean setAltura(float altura){
		boolean valor;
		if (altura <= 0){
			System.out.println("Altura inválida");
			valor = false;
		}
		else{
			this.altura = altura;
			valor = true;
		}
		return valor;
	}
	
	
	
}
