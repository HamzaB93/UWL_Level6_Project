import { Component } from '@angular/core';
import { NavController, NavParams } from 'ionic-angular';
import { Cycle5ActivityPage } from '../cycle5-activity/cycle5-activity';

/*
  Generated class for the Cycle4Activity page.

  See http://ionicframework.com/docs/v2/components/#navigation for more info on
  Ionic pages and navigation.
*/
@Component({
  selector: 'page-cycle4-activity',
  templateUrl: 'cycle4-activity.html'
})
export class Cycle4ActivityPage {

  constructor(public navCtrl: NavController, public navParams: NavParams) {
    this.navCtrl.push(Cycle5ActivityPage);
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad Cycle4ActivityPage');
  }

}
