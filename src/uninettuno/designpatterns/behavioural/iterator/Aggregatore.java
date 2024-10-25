package uninettuno.designpatterns.behavioural.iterator;

/*Aggregator interface*/
public interface Aggregatore {
	
	public MioIteratore creaIteratore();
	public void add(String dato);

}
