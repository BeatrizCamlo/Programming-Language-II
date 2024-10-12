
public class ProvaControl {
	
	public double verificarNotaParte1(double notaParte1) {
		if (notaParte1 <= 5 && notaParte1 >=0) {
			return notaParte1;
		}
		else {
			System.out.println("Nota parte 01 - invalida!");
			return 0;
		}	
	}
	
	public double verificarNotaParte2(double notaParte2) {
		if (notaParte2 <= 5 && notaParte2 >=0) {
			return notaParte2;
		}
		else {
			System.out.println("Nota parte 02 - invalida!");
			return 0;
		}	
	}

}
