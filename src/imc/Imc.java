package imc;

public class Imc {
	private double weight;
	private double height;

	public Imc() {

	}

	public Imc(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double imcCalc() {
		return weight / (height * height);
	}

	public String imcClassification() {
		double imc = imcCalc();
		String classificacion;

		if (imc < 18.5) {
			classificacion = "ABAIXO DO PESO";
		} else if (imc < 25) {
			classificacion = "NORMAL";
		} else if (imc < 30) {
			classificacion = "SOBREPESO";
		} else if (imc < 39.9) {
			classificacion = "OBESIDADE";
		} else {
			classificacion = "OBESIDADE GRAVE";
		}
		return classificacion;
	}

	@Override
	public String toString() {
		return "IMC: " + String.format("%.2f", imcCalc()) + "\nClassificação: " + imcClassification();
	}

}
