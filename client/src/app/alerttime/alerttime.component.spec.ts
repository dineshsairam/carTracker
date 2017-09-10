import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AlerttimeComponent } from './alerttime.component';

describe('AlerttimeComponent', () => {
  let component: AlerttimeComponent;
  let fixture: ComponentFixture<AlerttimeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AlerttimeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AlerttimeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
