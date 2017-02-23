import { Component } from '@angular/core';
import { NavController, NavParams } from 'ionic-angular';
import { Cycle4ActivityPage } from '../cycle4-activity/cycle4-activity';

/*
  Generated class for the Cycle3Activity page.

  See http://ionicframework.com/docs/v2/components/#navigation for more info on
  Ionic pages and navigation.
*/
@Component({
  selector: 'page-cycle3-activity',
  templateUrl: 'cycle3-activity.html'
})
export class Cycle3ActivityPage {

  constructor(public navCtrl: NavController, public navParams: NavParams) {
    this.navCtrl.push(Cycle4ActivityPage);
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad Cycle3ActivityPage');
  }

}
