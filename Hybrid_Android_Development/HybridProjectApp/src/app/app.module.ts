import { NgModule, ErrorHandler } from '@angular/core';
import { IonicApp, IonicModule, IonicErrorHandler } from 'ionic-angular';
import { MyApp } from './app.component';
import { HomePage } from '../pages/home/home';

// Imported pages
import { PreImageTestPage } from '../pages/pre-image-test/pre-image-test';
import { ImageTestPage } from '../pages/image-test/image-test';

import { PreActivityTestPage } from '../pages/pre-activity-test/pre-activity-test';
import { Cycle1ActivityPage } from '../pages/cycle1-activity/cycle1-activity';
import { Cycle2ActivityPage } from '../pages/cycle2-activity/cycle2-activity';
import { Cycle3ActivityPage } from '../pages/cycle3-activity/cycle3-activity';
import { Cycle4ActivityPage } from '../pages/cycle4-activity/cycle4-activity';
import { Cycle5ActivityPage } from '../pages/cycle5-activity/cycle5-activity';

import { PreVideoTestPage } from '../pages/pre-video-test/pre-video-test';
import { VideoTestPage } from '../pages/video-test/video-test';

import { PreGuiComponentTestPage } from '../pages/pre-gui-component-test/pre-gui-component-test';
import { GuiComponentTestPage } from '../pages/gui-component-test/gui-component-test';

@NgModule({
  declarations: [
    MyApp,
    HomePage,
    PreImageTestPage,
    ImageTestPage,
    PreActivityTestPage,
    Cycle1ActivityPage,
    Cycle2ActivityPage,
    Cycle3ActivityPage,
    Cycle4ActivityPage,
    Cycle5ActivityPage,
    PreVideoTestPage,
    VideoTestPage,
    PreGuiComponentTestPage,
    GuiComponentTestPage
  ],
  imports: [
    IonicModule.forRoot(MyApp)
  ],
  bootstrap: [IonicApp],
  entryComponents: [
    MyApp,
    HomePage,
    PreImageTestPage,
    ImageTestPage,
    PreActivityTestPage,
    Cycle1ActivityPage,
    Cycle2ActivityPage,
    Cycle3ActivityPage,
    Cycle4ActivityPage,
    Cycle5ActivityPage,
    PreVideoTestPage,
    VideoTestPage,
    PreGuiComponentTestPage,
    GuiComponentTestPage
  ],
  providers: [{provide: ErrorHandler, useClass: IonicErrorHandler}]
})
export class AppModule {}
