import { Component } from '@angular/core';
import { NavController, NavParams } from 'ionic-angular';
import { PreActivityTestPage } from '../pre-activity-test/pre-activity-test';

/*
  Generated class for the Cycle5Activity page.

  See http://ionicframework.com/docs/v2/components/#navigation for more info on
  Ionic pages and navigation.
*/
@Component({
  selector: 'page-cycle5-activity',
  templateUrl: 'cycle5-activity.html'
})
export class Cycle5ActivityPage {

  constructor(public navCtrl: NavController, public navParams: NavParams) {
    this.navCtrl.push(PreActivityTestPage);
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad Cycle5ActivityPage');
  }

}
