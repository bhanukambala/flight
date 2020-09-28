package com.dxctraining.flight.service;

import java.util.List;

import com.dxctraining.flight.entities.Flight;

public interface IFlightService {
	Flight addFlight(Flight flight);
	Flight modifyFlight(Flight flight);
	Flight viewByFlightNum(Integer flightNum);
	List<Flight> viewAllFlights();
	void delete(Integer flightNum);
	void validate(Object obj);

}
