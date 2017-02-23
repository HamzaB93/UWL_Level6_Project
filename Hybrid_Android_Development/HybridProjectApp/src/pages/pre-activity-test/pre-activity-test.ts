import { Component } from '@angular/core';
import { NavController, NavParams } from 'ionic-angular';
import { Cycle1ActivityPage } from '../cycle1-activity/cycle1-activity';

/*
  Generated class for the PreActivityTest page.

  See http://ionicframework.com/docs/v2/components/#navigation for more info on
  Ionic pages and navigation.
*/
@Component({
  selector: 'page-pre-activity-test',
  templateUrl: 'pre-activity-test.html'
})
export class PreActivityTestPage {

  constructor(public navCtrl: NavController, public navParams: NavParams) {}

  ionViewDidLoad() {
    console.log('ionViewDidLoad PreActivityTestPage');
  }

  startActivityTest(){
    this.navCtrl.push(Cycle1ActivityPage);
  }

}
