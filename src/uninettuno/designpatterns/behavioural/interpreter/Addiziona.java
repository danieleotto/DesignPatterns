package uninettuno.designpatterns.behavioural.interpreter;

//TERMINAL EXPRESSION
public class Addiziona implements Espressione{

	@Override
	public int interpreta(Contesto contesto) {
		return contesto.pop().interpreta(contesto)+contesto.pop().interpreta(contesto);
	}
}
