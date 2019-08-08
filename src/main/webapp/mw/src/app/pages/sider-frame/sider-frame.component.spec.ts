import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SiderFrameComponent } from './sider-frame.component';

describe('SiderFrameComponent', () => {
  let component: SiderFrameComponent;
  let fixture: ComponentFixture<SiderFrameComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SiderFrameComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SiderFrameComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
