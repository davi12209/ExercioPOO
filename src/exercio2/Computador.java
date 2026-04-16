package exercio2;

public class Computador {
	
	private Processador processador;
	private String modelo;
	
	public Processador getProcessador() {
		return processador;
	}
	public void setProcessador(Processador processador) {
		this.processador = processador;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
public void exibirDetalhes() {
		
		System.out.println("Detalhes");
		System.out.println("modelo: " + modelo);
		System.out.println("marca:" + processador.getMarca());
		System.out.println("frequencia:" + processador.getFrequencia());
	}
}
