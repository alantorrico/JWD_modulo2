package com.mitocode.javaweb.semana02._1_lambdas;

public class Empleado {

	private String nombres;
	private Double sueldo;
	private Integer edad;

	public Empleado() {
		super();
	}

	public Empleado(String nombres, Double sueldo, Integer edad) {
		super();
		this.nombres = nombres;
		this.sueldo = sueldo;
		this.edad = edad;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Empleado [nombres=" + nombres + ", sueldo=" + sueldo + ", edad=" + edad + "]";
	}

}
