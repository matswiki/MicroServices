package com.cgm.central.appointment.callback.repository;

import java.util.Collection;

import com.cgm.central.appointment.callback.model.CallbackBody;

public interface AppointmentCallbackRepository {

	CallbackBody save(CallbackBody contact);

	CallbackBody find(CallbackBody contact);

	Collection<CallbackBody> findAll(CallbackBody contact);

	CallbackBody delete(CallbackBody contact);

}