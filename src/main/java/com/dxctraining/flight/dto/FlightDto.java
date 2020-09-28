package com.dxctraining.flight.dto;

public class FlightDto {
	private Integer flightNum;
	private String flightModel;
	private String carrierName;
	private int seatCapacity;
	
	public FlightDto(Integer flightNum,String flightModel,String carrierName,int seatCapacity) {
		this.flightNum=flightNum;
		this.flightModel=flightModel;
		this.carrierName=carrierName;
		this.seatCapacity=seatCapacity;
	}

	public Integer getFlightNum() {
		return flightNum;
	}

	public void setFlightNum(Integer flightNum) {
		this.flightNum = flightNum;
	}

	public String getFlightModel() {
		return flightModel;
	}

	public void setFlightModel(String flightModel) {
		this.flightModel = flightModel;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public int getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

}
