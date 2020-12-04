import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BlackboardNavigatorComponent } from './blackboard-navigator.component';

describe('BlackboardNavigatorComponent', () => {
  let component: BlackboardNavigatorComponent;
  let fixture: ComponentFixture<BlackboardNavigatorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BlackboardNavigatorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BlackboardNavigatorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
