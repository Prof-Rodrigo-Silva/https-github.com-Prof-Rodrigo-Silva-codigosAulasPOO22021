package classe.modelo;

import java.util.Objects;

public class Telefone {
	private String marca;
	private String modelo;
	private long imei;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public long getImei() {
		return imei;
	}
	public void setImei(long imei) {
		this.imei = imei;
	}
	@Override
	public String toString() {
		return "Telefone [marca=" + marca + ", modelo=" + modelo + ", imei=" + imei + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(imei);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		return imei == other.imei;
	}
	
	

}
