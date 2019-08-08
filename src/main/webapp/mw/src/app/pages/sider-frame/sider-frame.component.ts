import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-sider-frame',
  templateUrl: './sider-frame.component.html',
  styleUrls: ['./sider-frame.component.css']
})
export class SiderFrameComponent implements OnInit {
  isCollapsed = false;

  constructor() { }

  ngOnInit() {
  }

}
