package primeiroprograma.carro.corrida.java;

import java.util.Objects;

public class rapido {
	
	private Integer ano ;
	private String modelo;
	private String cor ;
	
/*public rapido(Integer ano,String modelo,String cor) {
	
	/*this.ano   = ano;
	this modelo= modelo;
	this cor   = cor;
	*/


public rapido(Integer ano, String modelo, String cor) {
	
 	this.ano = ano;
	this.modelo = modelo;
	this.cor = cor;
}

public rapido() {
	// TODO Auto-generated constructor stub
}

public Integer getAno() {
	return ano;
}

public void setAno(Integer ano) {
	this.ano = ano;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

@Override
public String toString() {
	return "rapido [modelo=" + modelo + ", cor=" + cor + "]";
}

@Override
public int hashCode() {
	return Objects.hash(ano);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	rapido other = (rapido) obj;
	return Objects.equals(ano, other.ano);
}

/*public rapido(Integer ano, String modelo, String cor) {
	super();
	this.ano = ano;
	this.modelo = modelo;
	this.cor = cor;
}*/

public String getCor() {
	return cor;
}

public void setCor(String cor) {
	this.cor = cor;
}
}
