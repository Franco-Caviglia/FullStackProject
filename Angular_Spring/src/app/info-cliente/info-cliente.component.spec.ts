import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InfoClienteComponent } from './info-cliente.component';

describe('InfoClienteComponent', () => {
  let component: InfoClienteComponent;
  let fixture: ComponentFixture<InfoClienteComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [InfoClienteComponent]
    });
    fixture = TestBed.createComponent(InfoClienteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
