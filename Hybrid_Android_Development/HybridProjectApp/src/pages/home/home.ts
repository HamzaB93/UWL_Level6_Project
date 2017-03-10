import { Component } from '@angular/core';

import { NavController } from 'ionic-angular';

// Imported pages
import { PreImageTestPage } from '../pre-image-test/pre-image-test';
import { PreActivityTestPage } from '../pre-activity-test/pre-activity-test';
import { PreVideoTestPage } from '../pre-video-test/pre-video-test';
import { PreGuiComponentTestPage } from '../pre-gui-component-test/pre-gui-component-test';

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
      {name: "Video test", id: 3},
      {name: "Gui Component test", id: 4},
    ];
    }

    navigate(i) {
      if(i == 0){
        this.navCtrl.push(PreImageTestPage);
      }
      else if(i == 1){
        this.navCtrl.push(PreActivityTestPage);
      }
      else if(i == 2){
        this.navCtrl.push(PreVideoTestPage);
      }
      else if(i == 3){
        this.navCtrl.push(PreGuiComponentTestPage);
      }
  }
}
