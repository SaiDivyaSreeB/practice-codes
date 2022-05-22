import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LiteratureBooksComponent } from './literature-books.component';

describe('LiteratureBooksComponent', () => {
  let component: LiteratureBooksComponent;
  let fixture: ComponentFixture<LiteratureBooksComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LiteratureBooksComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LiteratureBooksComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
