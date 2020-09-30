import { Component, OnInit } from '@angular/core';
import { Flight } from '../model/flight';
import { FlightService } from '../service/flightService';
import { observable, Observable } from 'rxjs';

@Component({
  selector: 'app-view-all-flights',
  templateUrl: './view-all-flights.component.html',
  styleUrls: ['./view-all-flights.component.css']
})
export class ViewAllFlightsComponent  {

flights:Flight[];

  constructor(private flightService:FlightService) {
    let observable:Observable<Flight[]>=flightService.viewAllFlights();
    observable.subscribe(
      flightArray=>
      this.flights=flightArray);
      
    }
    delete(flightNum:number){
      let observable=this.flightService.delete(flightNum);
      observable.subscribe(
        res=>{
         this.delete(flightNum);
        },
        err=>{
          console.log("inside deleteFlight, err is "+err.message);
        }
      );
       }
     
   }

