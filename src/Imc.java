public class Imc {
	
	private static float imc;
		
	public static float calcImc(float massa, float altura){
		imc = massa / (altura * altura);
		return imc;
	}
	
}
