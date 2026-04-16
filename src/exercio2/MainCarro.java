package exercio2;

public class MainCarro {
	
	public static void main(String[] args) {
		
		Motor motor = new Motor("V8", "2000");
		Carro carro = new Carro();
		
		
		carro.setMarca("Fiat");
		carro.setMotor(motor);
		
		carro.mostraInfo();
		
		Motor novoMotor = new Motor("1.0", "200");
		
		carro.trocaMotor(novoMotor);
		
		carro.mostraInfo();
	}
}
