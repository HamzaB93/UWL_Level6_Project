import { Component } from '@angular/core';

import { NavController } from 'ionic-angular';

// Imported the second page so we can navigate to it
import { PreImageTestPage } from '../pre-image-test/pre-image'

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

// For list of options in main menu
options: any;

  // Generating the list of options in the constructor
  constructor(public navCtrl: NavController) {
    this.options = [
      {name: "Image test", id: 1},
      {name: "Activity Cycle test ", id: 2},
    ];
  }
}
