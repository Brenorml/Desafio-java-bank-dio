
public interface IConta {

	void sacar(double valor);
	
	void depositar(double valor);

	void trasnferir(double valor, IConta contaDestino);
	
	void imprimirExtrato();
	
}
