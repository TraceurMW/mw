import {Component} from '@angular/core';
import {MatButtonModule, MatCheckboxModule} from '@angular/material';
import { ReactiveFormsModule  } from '@angular/forms';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
   $$(selector, context) {
    context = context || document;
    var elements = context.querySelectorAll(selector);
    return Array.prototype.slice.call(elements);
  }
  title = 'mw';
}
