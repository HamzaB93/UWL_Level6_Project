import { Component } from '@angular/core';

import { NavController } from 'ionic-angular';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {
  // Defing variables
  // items is an array of any type, anything can go in there
  items: any[];

  constructor(public navCtrl: NavController) {
    //Create set of 10 initial items
    this.items = [];
    // for loop
    for (let i = 0; i < 10; i++){
      this.items.push({
        text: 'Item ' + i,
        id: i
      });
    }
  }

  // For the clicks in the list
  itemSelected(item){
    // Show the text when clicked
    alert(item.text);
  }

}
