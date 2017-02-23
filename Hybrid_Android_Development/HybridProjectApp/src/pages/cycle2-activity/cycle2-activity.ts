import { Component } from '@angular/core';
import { NavController, NavParams } from 'ionic-angular';
import { Cycle3ActivityPage } from '../cycle3-activity/cycle3-activity';

/*
  Generated class for the Cycle2Activity page.

  See http://ionicframework.com/docs/v2/components/#navigation for more info on
  Ionic pages and navigation.
*/
@Component({
  selector: 'page-cycle2-activity',
  templateUrl: 'cycle2-activity.html'
})
export class Cycle2ActivityPage {

  constructor(public navCtrl: NavController, public navParams: NavParams) {
    this.navCtrl.push(Cycle3ActivityPage);
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad Cycle2ActivityPage');
  }

}
