import { Component } from '@angular/core';

import { NavController } from 'ionic-angular';

// Imported pages
import { PreImageTestPage } from '../pre-image-test/pre-image-test';
import { PreActivityTestPage } from '../pre-activity-test/pre-activity-test';

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

    navigate(i) {
      if(i == 0){
        this.navCtrl.push(PreImageTestPage);
      }
      else if(i == 1){
        this.navCtrl.push(PreActivityTestPage);
      }
  }
}
