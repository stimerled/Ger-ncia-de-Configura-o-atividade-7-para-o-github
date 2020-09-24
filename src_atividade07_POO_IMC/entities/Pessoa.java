package entities;

public class Pessoa {
	private double alt;
	private double peso;
	private byte sexo;
	
	public Pessoa() {
		}
		
	public Pessoa(double alt, double peso, byte sexo) {
		this.alt = alt;
		this.peso = peso;
	}
	 public double getPeso() {
		return peso;	}
	 public double getAlt() {
		return alt;     }
	 public byte getSexo() {
			return sexo;   } 
	public void setAlt(double alt) {
		this.alt = alt; }
	public void setPeso(double peso) {
		this.peso = peso; 	}
	public void setSexo(byte sexo) {
		this.sexo = sexo;
	}

	 public double calcularPeso() {
		if(this.sexo == 1) { 
	 return (72.7 * this.alt - 58); 
	 }else if (this.sexo == 2) { 
	 return (62.1 * this.alt - 44.7); 
	 }
		return 0;}
	
	public String verificarPeso()
	{
		if (peso <= (calcularPeso() - 2))
			return "Abaixo do peso";
		else  if  (peso >= calcularPeso() + 2)
			return "Acima do peso";
		else
			return "Peso normal";	}
	} 