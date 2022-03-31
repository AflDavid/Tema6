
public class Mig extends Armat {

	public Mig(String idAvion, int totalEnginePower) {
		super(idAvion, totalEnginePower);
		// TODO Auto-generated constructor stub
	}

	public void highSpeedGeometry() {
		System.out.println("PlaneID: " + this.idAvion + "High speed geometry selected");
	}

	public void normalGeometry() {
		System.out.println("PlaneID: " + this.idAvion + "Normal speed geometry selected");
	}

}
