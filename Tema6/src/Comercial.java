
public class Comercial extends Avion {

	protected int maxPassengers;
	
		public Comercial(String idAvion, int totalEnginePower, int maxPassengers) {
			super(idAvion, totalEnginePower);
			this.maxPassengers = maxPassengers;
		}
		
		public int getMaxPassengers() {
			return maxPassengers;
		}
}
