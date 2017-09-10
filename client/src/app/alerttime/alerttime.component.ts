import { Component, OnInit } from '@angular/core';
import {UserService} from "../user-service/user.service";
import * as moment from 'moment';

@Component({
  selector: 'app-alerttime',
  templateUrl: './alerttime.component.html',
  styleUrls: ['./alerttime.component.css']
})
export class AlerttimeComponent  {
alerts;

  constructor(private userservice: UserService) {
    this.userservice.getAlerts()
      .subscribe(
        alerts => this.alerts = alerts,
        error => console.log(error)
      );
  }
  now = moment().unix();
  now1 = moment();
  cal = this.now - 7200;
  cal1 = moment().subtract(7200, 'seconds');


}
