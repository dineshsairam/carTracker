import { Injectable } from "@angular/core";
import { Http } from "@angular/http";
import { Observable } from "rxjs/Observable";
import "rxjs/add/operator/catch";
import "rxjs/add/operator/map";
import "rxjs/add/observable/throw";
import 'rxjs/add/operator/filter';



@Injectable()
export class UserService {

  constructor(private http: Http) {
  }
  getAlerts(): Observable<any> {
    return this.http.get('/assets/alerts.json')
      .map(response => response.json())
      .catch(error => Observable.throw(error.statusText));
  }
  getAlertSort(): Observable <any[]> {
    return this.http.get('/assets/readings.json')
      .map(response => response.json())
      .catch(error => Observable.throw(error.statusText));
  }
  getAlertsByTime(): Observable<any[]> {
    return this.http.get('/assets/alerts.json')
      .map(response => response.json())
      .catch(error => Observable.throw(error.statusText));
  }

  getVehicles(): Observable<any[]> {
    return this.http.get('/assets/v.json')
      .map((response:any) => response.json())
      .catch(error => Observable.throw(error.statusText));
  }


  getAlertsById(vehsid): Observable<any[]> {
    return this.http.get('/assets/alerts.json')
      .map(response => response.json())
      .filter(response => response === vehsid)
      .catch(error => Observable.throw(error.statusText));

  }



}
