package com.orcsoft.training.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.orcsoft.training.services.*;

public class RESTApplication extends Application {
	public Set<Class<?>> getClasses() {
		Set<Class<?>> set = new HashSet<Class<?>>();
		set.add(TrainerService.class);
		return set;
	}
}
