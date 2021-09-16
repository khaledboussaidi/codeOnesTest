import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PoncutationComponent } from './poncutation.component';

describe('PoncutationComponent', () => {
  let component: PoncutationComponent;
  let fixture: ComponentFixture<PoncutationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PoncutationComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PoncutationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
