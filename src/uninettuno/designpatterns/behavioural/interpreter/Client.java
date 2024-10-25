package uninettuno.designpatterns.behavioural.interpreter;

//CLIENT
public class Client {

	public static void main(String[] args) {
		
		//Operazione di addizione
		Espressione addizione = new Addiziona();
		
		//Contesto delle variabili
		Contesto contesto = new Contesto();
		contesto.push(new Numero("345"));
		contesto.push(new Numero("76"));
		
		//Risultato
		System.out.println("Il risultato vale: "+addizione.interpreta(contesto));
	}
}
