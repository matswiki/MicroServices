package com.cgm.central.appointment.callback.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.cgm.central.appointment.callback.model.CallbackBody;
import com.cgm.central.appointment.callback.service.AppointmentCallbackService;

@Path("/appointment/callback")
public class AppointmentCallbackRestController {

	private static Logger log = Logger.getLogger(AppointmentCallbackRestController.class);
	
	private AppointmentCallbackService appointmentCallbackService;

	public AppointmentCallbackRestController(AppointmentCallbackService appointmentCallbackService) {
		super();
		this.appointmentCallbackService = appointmentCallbackService;
	}

	@PUT
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateAppointment(@QueryParam("clientAppointmentId") String clientAppointmentId,  CallbackBody appointmentCallback) {
		log.info(clientAppointmentId);
		log.info(appointmentCallback);
		return Response.status(Response.Status.OK).entity(appointmentCallbackService.update(appointmentCallback))
				.type(MediaType.APPLICATION_JSON).build();
	}

}
