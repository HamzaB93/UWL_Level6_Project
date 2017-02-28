import { Component } from '@angular/core';
import { NavController, NavParams } from 'ionic-angular';
import { VideoPlayer } from 'ionic-native';

/*
  Generated class for the VideoTest page.

  See http://ionicframework.com/docs/v2/components/#navigation for more info on
  Ionic pages and navigation.
*/
@Component({
  selector: 'page-video-test',
  templateUrl: 'video-test.html'
})
export class VideoTestPage {

  constructor(public navCtrl: NavController, public navParams: NavParams) {
    // Playing a video.
    VideoPlayer.play("src/assets/vid/guardians.mp4").then(() => {
      console.log('video completed');
    }).catch(err => {
      console.log(err);
    });
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad VideoTestPage');
  }

}
