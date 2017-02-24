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

  androidIm = new Image();

  //androidImg = document.getElementById("androidImage") as HTMLImageElement;


  constructor(public navCtrl: NavController, public navParams: NavParams) {
    //androidImg.src = "assets/img/android_logo";

    this.androidIm.useMap="img/android_logo.png";
    var img = document.createElement('img');
    img.setAttribute('src', this.androidIm.useMap);
    img.setAttribute('style', "height:300px;width:200px");
    document.body.appendChild(img);
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad ImageTestPage');
  }

}
