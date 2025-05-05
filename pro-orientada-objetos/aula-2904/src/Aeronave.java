public abstract class Aeronave {
	protected String modelo;
	protected int capacidade;


//construtor
public Aeronave(String modelo, int capacidade) {
	this.capacidade = capacidade;
	this.modelo = modelo;
}

//getter
public String getModelo() {
	return modelo;
}

//setter
public void setModelo(String modelo){
	this.modelo= modelo;
}

public abstract void exibirInformacoes();
	//em classe abstrata se deve escrever abstract no método 
}

// método concreto (possui código) tem chaves, enquanto abstratas usam apenas ';'



