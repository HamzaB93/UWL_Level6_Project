import { Component } from '@angular/core';
import { NavController, NavParams } from 'ionic-angular';
import { Cycle2ActivityPage } from '../cycle2-activity/cycle2-activity';

/*
  Generated class for the Cycle1Activity page.

  See http://ionicframework.com/docs/v2/components/#navigation for more info on
  Ionic pages and navigation.
*/
@Component({
  selector: 'page-cycle1-activity',
  templateUrl: 'cycle1-activity.html'
})
export class Cycle1ActivityPage {

  constructor(public navCtrl: NavController, public navParams: NavParams) {
    this.navCtrl.push(Cycle2ActivityPage);
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad Cycle1ActivityPage');
  }

}
