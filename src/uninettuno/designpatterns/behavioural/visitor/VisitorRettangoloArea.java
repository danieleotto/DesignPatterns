package uninettuno.designpatterns.behavioural.visitor;

//VISITOR
public class VisitorRettangoloArea {

	public void visitRettangoloArea(ElementiRettangolo elementiRettangolo) {
		int area = (elementiRettangolo.base * elementiRettangolo.altezza);
		System.out.println("\nL'area del rettangolo vale: "+area);
	}
}
