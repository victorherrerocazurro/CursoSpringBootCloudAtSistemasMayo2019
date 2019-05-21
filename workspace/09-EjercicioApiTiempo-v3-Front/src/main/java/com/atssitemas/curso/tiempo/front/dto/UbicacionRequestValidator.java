package com.atssitemas.curso.tiempo.front.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class UbicacionRequestValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
		//return clazz.getName().equals(UbicacionRequest.class.getName());
	}

	@Override
	public void validate(Object target, Errors errors) {
		UbicacionRequest ubicacionRequest = (UbicacionRequest)target;
		if(ubicacionRequest.getLatitud().doubleValue() > 30) {
			errors.rejectValue("latitud", "noespana");
		}

	}

}
