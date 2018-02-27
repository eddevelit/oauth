package com.team3.oauth.model;

public class Cuenta {
	private int id;
	private double Saldo;
	private String Ejecutivo;
	private int id_cliente;
	
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
}
