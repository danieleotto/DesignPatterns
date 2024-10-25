package uninettuno.designpatterns.behavioural.template;

/*CLIENT*/
public class Test {
	
	public static void main(String[] args) {
		System.out.println("\n Tipico piatto genovese:");
		PastaAsciutta pesto = new PastaAlPesto();
		pesto.cuociPasta();
		
		System.out.println("\n Tipico piatto romano:");
		PastaAsciutta amatriciana = new PastaAmatriciana();
		amatriciana.cuociPasta();
		
	}
}
