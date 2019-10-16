package com.cgm.central.appointment.callback.service;

import com.cgm.central.appointment.callback.model.CallbackBody;
import com.cgm.central.appointment.callback.repository.AppointmentCallbackRepository;

public class AppointmentCallbackService {
	
	private AppointmentCallbackRepository appointmentCallbackRepository;

	public AppointmentCallbackService(AppointmentCallbackRepository appointmentCallbackRepository) {
		super();
		this.appointmentCallbackRepository = appointmentCallbackRepository;
	}

	public CallbackBody update(CallbackBody appointmentCallback) {
		return appointmentCallbackRepository.save(appointmentCallback);
	}
}
