package uninettuno.designpatterns.behavioural.interpreter;

import java.util.Stack;

//CONTEXT
public class Contesto {

	@SuppressWarnings("rawtypes")
	private Stack variabile = null;
	
	@SuppressWarnings("rawtypes")
	public Contesto() {
		this.variabile = new Stack();
	}
	
	@SuppressWarnings("unchecked")
	public void push(Espressione espressione) {
		variabile.push(espressione);
	}
	
	public Espressione pop() {
		return (Espressione)this.variabile.pop();
	}
}
