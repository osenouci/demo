package lu.luxairtours.ibe.services;

import org.apache.axis2.AxisFault;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import de.bewotec.service.BewotecHubServiceStub;
import lu.luxairtours.ibe.configuration.AppConfig;

@Component
public class ProductService {

	private AppConfig config;
	BewotecHubServiceStub service;
	private final ModelMapper modelMapper = new ModelMapper();

	public ProductService(AppConfig config) throws AxisFault {
		this.config = config;
		service = new BewotecHubServiceStub(this.config.getServiceHubUrl());
	}

	
	public void getProductAvailability() {
		
	}
	
}
