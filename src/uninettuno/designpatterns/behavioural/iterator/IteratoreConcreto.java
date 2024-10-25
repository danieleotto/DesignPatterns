package uninettuno.designpatterns.behavioural.iterator;

import java.util.ArrayList;
/*Concrete iterator*/
public class IteratoreConcreto implements MioIteratore{

	private ArrayList<Object> array;
	private int attuale = -1;
	
	public IteratoreConcreto(ArrayList<Object> array) {
		this.array = array;
	}
	
	@Override
	public boolean hasNext() {
		return (attuale+1)<array.size();
	}
	
	@Override
	public Object next() {
		attuale++;
		return array.get(attuale);
	}
}
