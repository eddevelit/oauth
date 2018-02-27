package com.team3.oauth.model;

public class Cuenta {
	public int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	public String getEjecutivo() {
		return Ejecutivo;
	}
	public void setEjecutivo(String ejecutivo) {
		Ejecutivo = ejecutivo;
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public double Saldo;
	public String Ejecutivo;
	public int id_cliente;
}
