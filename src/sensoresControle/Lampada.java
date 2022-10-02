package sensoresControle;

public class Lampada {
	public boolean estadoInicial = true;
	public int sensorpresenca;
	public int sensorLuminosidade;
	public double sensorPeso;

	public int getSensorpresenca() {
		return sensorpresenca;
	}

	public void setSensorpresenca(int sensorpresenca) {

		if (sensorPeso < 30) {
			System.out.println("lampada apagada");

		}
		this.sensorpresenca = sensorpresenca;
	}

	public int getSensorLuminosidade() {
		return sensorLuminosidade;
	}

	public void setSensorLuminosidade(int sensorLuminosidade) {
		this.sensorLuminosidade = sensorLuminosidade;
	}

	public double getSensorPeso() {
		return sensorPeso;
	}

	public void setSensorPeso(double sensorPeso) {
		this.sensorPeso = sensorPeso;
	}

}
