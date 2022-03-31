
public class Avion {

	protected String idAvion;
	protected int totalEnginePower;

	public Avion(String idAvion, int totalEnginePower) {
		this.idAvion = idAvion;
		this.totalEnginePower = totalEnginePower;
	}

	public String getIdAvion() {
		return idAvion;
	}

	public int getTotalEnginePower() {
		return totalEnginePower;
	}

	public String takeOff() {
		return "PlaneID: " + idAvion + " "
				+ "Initiating takeoff procedure - Starting engines - Accelerating down the runway - Taking off - Retracting gear - Takeoff complete";

	}

	public String fly() {

		return "PlaneID: " + idAvion + " " + "Flying";
	}

	public String land() {
		return "PlaneID: " + idAvion
				+ "- Initiating landing procedure - Enabling airbrakes -Lowering gear - Contacting runway - Decelerating - Stopping engines - Landing complete.";
	}

}
