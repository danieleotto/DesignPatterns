package uninettuno.designpatterns.behavioural.iterator;

/*Client*/
public class Client {

	public static void main(String[] args) {
		Aggregatore aggregatore = new AggregatoreConcreto();
		aggregatore.add("Dato numero 1.");
		aggregatore.add("Dato numero 2.");
		
		MioIteratore iteratore = aggregatore.creaIteratore();
		while (iteratore.hasNext())
			System.out.println(iteratore.next());
	}
}
