package com.dxctraining.flight.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dxctraining.flight.entities.Flight;

public interface IFlightDao {
	Flight addFlight(Flight flight);
	Flight modifyFlight(Flight flight);
	Flight viewByFlightNum(Integer flightNum);
	List<Flight> viewAllFlights();
	void delete(Integer flightNum);
}

