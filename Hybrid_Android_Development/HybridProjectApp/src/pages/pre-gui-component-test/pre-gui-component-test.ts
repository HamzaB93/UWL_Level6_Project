import { Component } from '@angular/core';
import { NavController, NavParams } from 'ionic-angular';

import { GuiComponentTestPage } from '../gui-component-test/gui-component-test'

/*
  Generated class for the PreGuiComponentTest page.

  See http://ionicframework.com/docs/v2/components/#navigation for more info on
  Ionic pages and navigation.
*/
@Component({
  selector: 'page-pre-gui-component-test',
  templateUrl: 'pre-gui-component-test.html'
})
export class PreGuiComponentTestPage {

  constructor(public navCtrl: NavController, public navParams: NavParams) {}

  ionViewDidLoad() {
    console.log('ionViewDidLoad PreGuiComponentTestPage');
  }

  startGuiTest(){
    this.navCtrl.push(GuiComponentTestPage);
  }

}
