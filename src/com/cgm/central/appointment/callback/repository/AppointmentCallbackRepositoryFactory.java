package com.cgm.central.appointment.callback.repository;

public class AppointmentCallbackRepositoryFactory {
	public static AppointmentCallbackRepository getInstance(String type) {
		return new AppointmentCallbackRepositoryImpl();
	}
}
