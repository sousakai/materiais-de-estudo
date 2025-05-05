public class AviaoComercial extends Aeronave implements Voo{

	public AviaoComercial(String modelo, int capacidade) {
		super(modelo, capacidade);
		// TODO Auto-generated constructor stub - ESTUDAR ISSO
		
	}
	
	public void exibirInformacoes() {
		System.out.println("Modelo...:" + modelo);
		System.out.println("Capacidade...:" + capacidade);
		System.out.println("Tipo de Voo...:" + tipoDeVoo());

	}
	
	public String tipoDeVoo() {
		return "Transporte de Passageiros";
	}
}
