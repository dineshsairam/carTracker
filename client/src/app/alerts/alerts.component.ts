import { Component, OnInit } from '@angular/core';
import {UserService} from "../user-service/user.service";
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-alerts',
  templateUrl: './alerts.component.html',
  styleUrls: ['./alerts.component.css']
})
export class AlertsComponent  {
alrts;

  constructor(private route: ActivatedRoute, private userservice: UserService) {

    this.route.params.subscribe(params => {
      userservice.getAlertsById(params.vehsid)
        .subscribe(alrts => this.alrts = alrts);
    });

  }

}
