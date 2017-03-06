import { Component } from '@angular/core';
import { NavController, NavParams } from 'ionic-angular';
import { PreImageTestPage } from '../pre-image-test/pre-image-test';

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
  document: any;

  constructor(public navCtrl: NavController, public navParams: NavParams) {
    //androidImg.src = "assets/img/android_logo";

    // this.androidIm.useMap="img/android_logo.png";
    // var img = document.createElement('img');
    // img.setAttribute('src', this.androidIm.useMap);
    // img.setAttribute('style', "height:300px;width:200px");
    // document.body.appendChild(img);
    // this.androidIm = document.getElementById("androidLogo") as HTMLImageElement;
    // this.androidIm.src="data:assets/img/android_logo.png";

  }

  loadImage() {
    for(var i = 0; i < 2; i++){
      this.document.getElementById( "androidLogo" ).src = "assets/img/android_logo.png";
    }
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad ImageTestPage');
  }

}
