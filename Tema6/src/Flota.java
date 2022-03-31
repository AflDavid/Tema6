
public class Flota {

	public static void main(String[] args) {

		boeing b747 = new boeing("1518", 900, 300);
		concorde Concorde = new concorde("3148", 2180, 100);
		TomCat Grumman = new TomCat("1842", 2485);
		Mig MiG = new Mig("4458", 2446);

		System.out.println(b747.maxPassengers);
		System.out.println(Concorde.maxPassengers);
		System.out.println(Grumman.totalEnginePower);
		MiG.launchMissile();

	}

}
