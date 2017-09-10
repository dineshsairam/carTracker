import { Component, OnInit } from '@angular/core';
import {UserService} from "../user-service/user.service";

@Component({
  selector: 'app-alertsdisp',
  templateUrl: './alertsdisp.component.html',
  styleUrls: ['./alertsdisp.component.css']
})
export class AlertsdispComponent {
alerts;
  constructor(private userservice: UserService) {
    this.userservice.getAlerts()
      .subscribe(
        alerts => this.alerts = alerts,
        error => console.log(error)
      );
  }
}
