
public class AviaoCarga extends Aeronave implements Voo{

	public AviaoCarga(String modelo, int capacidade) {
		super(modelo, capacidade);
		// TODO Auto-generated constructor stub
	}
	
	public void exibirInformacoes() {
		System.out.println("Modelo...:" + modelo);
		System.out.println("Capacidade...:" + capacidade);
		System.out.println("Tipo de Voo...:" + tipoDeVoo());

	}
	
	public String tipoDeVoo() {
		return "Transporte de Carga";
	}
}
