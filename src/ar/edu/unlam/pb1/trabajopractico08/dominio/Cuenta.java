package ar.edu.unlam.pb1.trabajopractico08.dominio;

public class Cuenta{
	//atts
	private String titular = "";
	public double saldo;

	//bob
	public Cuenta (String titular){
		this.titular = titular;
	}
	public Cuenta(String titular,double saldoInicial){
		this.saldo = saldoInicial;
		this.titular = titular;
		}

	//metodos
	public String getTitular(){
		return titular;
	}
	public void setTitular(String titular){
		this.titular = titular;
	}

	public double getSaldo(){
		return saldo;
	}

	public String toString(){
		return titular+saldo;
	}
	public void depositar(double cantidad){
		if(cantidad>0){
		this.saldo = saldo+cantidad;
	}
	}
	public void retirar(double cantidad){
		if(cantidad>saldo){
			saldo=saldo;
		}
		else{
			saldo=saldo-cantidad;
		}
	}
}
