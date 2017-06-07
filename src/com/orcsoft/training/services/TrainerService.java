package com.orcsoft.training.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.orcsoft.training.Trainer;
import com.orcsoft.training.TrainerDAO;


@Path("/trainer")  // set a path to called this class
public class TrainerService extends Application{
	
	TrainerDAO trainerDAO = new TrainerDAO();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response findAllTrainers(String jsonString) {
		System.err.println(jsonString);
		Gson gsonObject = new Gson();
		List<Trainer> trainerNames = trainerDAO.findAll();
				
		return Response.status(200).entity(gsonObject.toJson(trainerNames)).build();
	}
}
