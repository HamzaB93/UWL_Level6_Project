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

  //androidImg = document.getElementById("androidImage") as HTMLImageElement;


  constructor(public navCtrl: NavController, public navParams: NavParams) {
    //androidImg.src = "assets/img/android_logo";
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad ImageTestPage');
  }

}
