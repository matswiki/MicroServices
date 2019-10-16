package com.cgm.central.appointment.callback;

import org.wso2.msf4j.MicroservicesRunner;

import com.cgm.central.appointment.callback.api.AppointmentCallbackRestController;
import com.cgm.central.appointment.callback.repository.AppointmentCallbackRepository;
import com.cgm.central.appointment.callback.repository.AppointmentCallbackRepositoryFactory;
import com.cgm.central.appointment.callback.service.AppointmentCallbackService;

public class CallbackHandlerApplication {
	public static void main(String[] args) {
		// read arguments from configuration file
		int port = 8088;
		String callbackRepositoryType = "type";

		// start the micro service
		AppointmentCallbackRepository appointmentCallbackRepository = AppointmentCallbackRepositoryFactory
				.getInstance(callbackRepositoryType);
		AppointmentCallbackService appointmentCallbackService = new AppointmentCallbackService(
				appointmentCallbackRepository);
		AppointmentCallbackRestController appointmentCallbackController = new AppointmentCallbackRestController(
				appointmentCallbackService);
		new MicroservicesRunner(port).deploy(appointmentCallbackController).start();
	}
}
