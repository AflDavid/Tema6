
public class concorde extends Comercial {

	public concorde(String idAvion, int totalEnginePower, int maxPassengers) {
		super(idAvion, totalEnginePower, maxPassengers);
		// TODO Auto-generated constructor stub
	}

	public void goSonic() {
		System.out.println("PlaneID: " + this.idAvion + "Super-sonic mode activated");
	}

	public void goSubSonic() {
		System.out.println("PlaneID: " + this.idAvion + "Super-sonic mode deactivated");
	}

}
