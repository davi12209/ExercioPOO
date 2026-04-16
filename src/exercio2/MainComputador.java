package exercio2;

public class MainComputador {

	public static void main(String[] args) {
		
		Processador proce = new Processador();
		proce.setFrequencia(64);
		proce.setMarca("AMD");
		
		Computador comp = new Computador();
		comp.setProcessador(proce);
		comp.setModelo("Dell");
		
		comp.exibirDetalhes();
		
		
	}

}
