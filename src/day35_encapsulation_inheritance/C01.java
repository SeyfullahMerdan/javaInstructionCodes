package day35_encapsulation_inheritance;

public class C01 {

	private double not = 49.9;
	private boolean gecerMi = false;

	// public double getNot() {
	// return not;
	// }

	// public boolean isGecerMi() {
	// return gecerMi;
	// }

	public void setNot(double not) {
		this.not = not; // Baþka classlardan argüment olarak yazýlan degerler bu methoda parametre
						// olarak gelecek.
	}

	public boolean isGecerMi() {
		if (not > 50)
			gecerMi = true;

		return gecerMi;
	}

}
