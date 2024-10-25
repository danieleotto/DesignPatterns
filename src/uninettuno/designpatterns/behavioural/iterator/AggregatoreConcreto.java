package uninettuno.designpatterns.behavioural.iterator;

import java.util.ArrayList;
/*Concrete Aggregator*/
public class AggregatoreConcreto implements Aggregatore{

	private ArrayList<Object> array;
	
	public AggregatoreConcreto() {
		array = new ArrayList<Object>();
	}
	
	@Override
	public MioIteratore creaIteratore() {
		return new IteratoreConcreto(array);
	}
	
	@Override
	public void add(String dato) {
		array.add(dato);
	}
}
