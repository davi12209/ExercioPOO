package exercio2;

public class Carro {
	
	private String marca;
	private Motor motor;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	
	public void trocaMotor(Motor novoMotor) {
		
		this.motor = novoMotor;
	}
	
	
	public void mostraInfo() {
		
		System.out.println("marca: " + marca);
		System.out.println("----Motor----");
		System.out.println("modelo: " + motor.getModelo());
		System.out.println("potencia: " + motor.getPotencia());
	}
}
