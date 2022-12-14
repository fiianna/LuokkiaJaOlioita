

public class LuokkiaJaOlioita {

	public static void main(String[] args) {
		
		// oliot
		Auto auto1 = new Auto("Lexus", "NX 450h", "hybrid");
		Auto auto2 = new Auto("BMW", "i4 eDrive", "diesel");
		
		// Tulosta tiedot -metodi
		auto1.tulostaTiedot();
		//auto2.tulostaTiedot();
		
		// Muuta tiedot -metodi
		auto2.muutaTiedot("Volvo", "XC60");
		
		// Olioiden arvot
		// auto.merkki = "Lexus";
		
		// Kutsutaan metodia
		auto1.kaynnisty();
		//System.out.println(auto.merkki);
	}

}

class Auto{
	// Ominaisuudet
	public String merkki;
	public String malli;
	public String polttoaine;
	
	// Muodostin/parametrisoitu konstruktori luokasta Auto
	public Auto(String merkki, String malli, String polttoaine) {
		this.merkki=merkki;
		this.malli=malli;
		this.polttoaine=polttoaine;
	}
	
	// Toiminnallisuudet/metodit
	public void kaynnisty() {
		System.out.println("Ajoneuvo on käynnistetty.");
	}
	
	public void ajaAutoa(){
		System.out.println("Ajat autoa.");
	}
	
	public void sammuta() {
		System.out.println("Ajoneuvo on sammutettu.");
	}
	
	public void tulostaTiedot() {
		System.out.println("AUTO:");
		System.out.println(merkki);
		System.out.println(malli);
		System.out.println(polttoaine);
	}
	
	public void muutaTiedot(String merkki, String malli) {
		System.out.println("AUTO:");
		System.out.println(merkki);
		System.out.println(malli);
	}
}
