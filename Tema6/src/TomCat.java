
public class TomCat extends Armat {

	public TomCat(String idAvion, int totalEnginePower) {
		super(idAvion, totalEnginePower);
		// TODO Auto-generated constructor stub
	}

	public void refuel() {
		System.out.println("PlaneID: " + this.idAvion
				+ "Initiating refueling procedure - Locating refueller - Catching up - Refueling - Refueling complete.");
	}
}
