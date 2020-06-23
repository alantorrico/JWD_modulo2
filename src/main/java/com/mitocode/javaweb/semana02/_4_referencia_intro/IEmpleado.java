package com.mitocode.javaweb.semana02._4_referencia_intro;

@FunctionalInterface
public interface IEmpleado {

	Empleado crear(String nombre, Double sueldo, Integer edad);
	
}
