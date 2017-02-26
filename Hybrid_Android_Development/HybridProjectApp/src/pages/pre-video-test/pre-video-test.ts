import { Component } from '@angular/core';
import { NavController, NavParams } from 'ionic-angular';

/*
  Generated class for the PreVideoTest page.

  See http://ionicframework.com/docs/v2/components/#navigation for more info on
  Ionic pages and navigation.
*/
@Component({
  selector: 'page-pre-video-test',
  templateUrl: 'pre-video-test.html'
})
export class PreVideoTestPage {

  constructor(public navCtrl: NavController, public navParams: NavParams) {}

  ionViewDidLoad() {
    console.log('ionViewDidLoad PreVideoTestPage');
  }

  startVideoTest() {
    //this.navCtrl.push();
  }
}
