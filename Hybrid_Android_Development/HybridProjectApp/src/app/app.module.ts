import { NgModule, ErrorHandler } from '@angular/core';
import { IonicApp, IonicModule, IonicErrorHandler } from 'ionic-angular';
import { MyApp } from './app.component';
import { HomePage } from '../pages/home/home';
// Imported pages
import { PreImageTestPage } from '../pages/pre-image-test/pre-image-test';
import { ImageTestPage } from '../pages/image-test/image-test';

@NgModule({
  declarations: [
    MyApp,
    HomePage,
    PreImageTestPage,
    ImageTestPage
  ],
  imports: [
    IonicModule.forRoot(MyApp)
  ],
  bootstrap: [IonicApp],
  entryComponents: [
    MyApp,
    HomePage,
    PreImageTestPage,
    ImageTestPage
  ],
  providers: [{provide: ErrorHandler, useClass: IonicErrorHandler}]
})
export class AppModule {}
