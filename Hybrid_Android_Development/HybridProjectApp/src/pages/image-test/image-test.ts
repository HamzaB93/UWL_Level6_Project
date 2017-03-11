import { Component } from '@angular/core';
import { NavController, NavParams } from 'ionic-angular';

/*
  Generated class for the ImageTest page.

  See http://ionicframework.com/docs/v2/components/#navigation for more info on
  Ionic pages and navigation.
*/
@Component({
  selector: 'page-image-test',
  templateUrl: 'image-test.html'
})
export class ImageTestPage {
  document: any;

  constructor(public navCtrl: NavController, public navParams: NavParams) {}

  loadImage() {
    for(var i = 0; i < 2; i++){
      this.document.getElementById( "androidLogo" ).src = "assets/img/android_logo.png";
    }
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad ImageTestPage');
  }

}
