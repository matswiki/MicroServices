package com.cgm.central.appointment.callback.repository;

import java.util.Collection;

import org.apache.log4j.Logger;

import com.cgm.central.appointment.callback.model.CallbackBody;

public class AppointmentCallbackRepositoryImpl implements AppointmentCallbackRepository {

	Logger log = Logger.getLogger(AppointmentCallbackRepositoryImpl.class);
	
	@Override
	public CallbackBody save(CallbackBody appointmentCallback) {
		return appointmentCallback;
	}

	@Override
	public CallbackBody find(CallbackBody appointmentCallback) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<CallbackBody> findAll(CallbackBody appointmentCallback) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CallbackBody delete(CallbackBody appointmentCallback) {
		// TODO Auto-generated method stub
		return null;
	}

}
