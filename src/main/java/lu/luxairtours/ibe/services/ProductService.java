package lu.luxairtours.ibe.services;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import de.bewotec.bewotecws.schema.GetProductAvailability;
import de.bewotec.service.BewotecHubServiceStub;
import de.bewotec.service.BewotecHubService_GetProductAvailability_GenericFaultFault_FaultMessage;
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

	
	public void getProductAvailability() throws Exception {
	
		GetProductAvailability container = new GetProductAvailability();
		
		// products?dateFrom=2020-01-22&dateTo=2021-01-17&departureAirports=LUX&durationend=8&
		// durationstart=5&passengers=30,30&sortBy=Priority&sortOrder=desc&resultsFrom=10&lang=en
		
		this.service.getProductAvailability(container);
	}
	
}
