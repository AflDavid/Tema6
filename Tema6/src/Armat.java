
public class Armat extends Avion {

	public Armat(String idAvion, int totalEnginePower) {
		super(idAvion, totalEnginePower);
		// TODO Auto-generated constructor stub
	}

	public void launchMissile() {
		System.out.println("PlaneID: " + this.idAvion + " "
				+ "- Initiating missile launch procedure - Acquiring target - Launching missile - Breaking away - Missile launch complete”.");
	}
}
