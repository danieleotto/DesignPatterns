package uninettuno.designpatterns.behavioural.interpreter;

//NONTERMINAL EXPRESSION
public class Numero implements Espressione{
	
	private int numero;
	
	public Numero(String numero) {
		this.numero = Integer.parseInt(numero);
	}
	
	@Override
	public int interpreta(Contesto contesto) {
		return numero;
	}

}
