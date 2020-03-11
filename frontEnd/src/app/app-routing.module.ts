import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { UploadMediaComponent } from './components/upload-media/upload-media.component';
import { MediadetailComponent } from './components/mediadetail/mediadetail.component';
import { NewsFeedComponent } from './components/news-feed/news-feed.component';
import { AccountDetailsComponent } from './components/account-details/account-details.component';
import { BlockUserComponent } from './components/block-user/block-user.component';
import { SearchComponent } from './components/search/search.component';
import { MyMediaComponent } from './components/my-media/my-media.component';
import { MyMedia1Component } from './components/my-media1/my-media1.component';
import { HeaderComponent } from './components/header/header.component';
import { FollowComponent } from './components/follow/follow.component';


const routes: Routes = [
  {path: "" , component: LoginComponent},
  {path: "login" , component: LoginComponent},
  {path: "register", component:RegisterComponent},
  {path: "uploadmedia", component:UploadMediaComponent},
  {path: "mediadetails", component: MediadetailComponent},
  {path: "newsfeed", component:NewsFeedComponent},
  {path: "accountdetails", component:AccountDetailsComponent},
  {path: "blockuser", component:BlockUserComponent},
  {path: "search", component: SearchComponent},
  {path: "mymedia", component: MyMediaComponent},
  {path: "mymedia1", component: MyMedia1Component},
  {path: "header",component:HeaderComponent},
  {path:"follow", component: FollowComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
