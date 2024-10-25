package uninettuno.designpatterns.structural.adapter;

/* Client: colui che effettua l'invocazione all'operazione di interesse
 * Target: definisce l'interfaccia specifica del dominio applicativo utilizzata dal Client
 * Adaptee: definisce l'interfaccia di un diverso dominio applicativo da dover adattare per l'invocazione da parte del Client
 * Adapter: definisce l'interfaccia compatibile con il Target che maschera l'invocazione dell'Adaptee*/

public class Adapter extends Impiegato{
	//la classe Adapter eredita Impiegato ed è associata con Employee
	
	Employee employee;
	
	public Adapter(Employee e) {
		this.employee = e;
	}
	
	@Override
	public String getCognome() {
		return employee.getLastName();
	}
	
	@Override
	public void setCognome(String cognome) {
		employee.setLastName(cognome);
	}
	
}
