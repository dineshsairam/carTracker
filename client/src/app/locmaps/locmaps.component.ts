import { Component, OnInit } from '@angular/core';
import {UserService} from "../user-service/user.service";
import * as moment from 'moment';
// import {Component} from "@angular/core";

@Component({
  selector: 'app-locmaps',
  templateUrl: './locmaps.component.html',
  styleUrls: ['./locmaps.component.css']
})
export class LocmapsComponent  {
readings;
  constructor(private userservice: UserService ) {
    this.userservice.getAlertSort()
     .subscribe(
       readings => this.readings = readings,
       error => console.log(error)
     );
  }

now = moment().unix();
  dat = new Date(this.now * 1000);
}
