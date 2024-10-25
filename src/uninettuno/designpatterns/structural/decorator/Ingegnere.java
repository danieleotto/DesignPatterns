package uninettuno.designpatterns.structural.decorator;

/*Concrete component*/
public class Ingegnere implements Dipendente {
	
	private String nome, ufficio;
	
	public Ingegnere(String nome, String ufficio) {
		this.nome = nome;
		this.ufficio = ufficio;
	}
	
	@Override
	public void chiSono() {
		System.out.println("\nMi chiamo "+this.nome+" e lavoro in "+this.ufficio+".\n");
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public String getUfficio() {
		return this.ufficio;
	}

}
