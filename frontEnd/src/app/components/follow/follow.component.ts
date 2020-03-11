import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/services/user.service';
import { UploadService } from 'src/app/services/upload.service';
import { FollowModel } from 'src/app/models/follow.model';

@Component({
  selector: 'app-follow',
  templateUrl: './follow.component.html',
  styleUrls: ['./follow.component.css']
})
export class FollowComponent implements OnInit {
  fllwmodel:FollowModel[];
  media: any = [];

  constructor(private userService: UserService, private uploadService:UploadService) { }

  ngOnInit(): void {
  let myid = sessionStorage.getItem("userid"); 
  console.log(myid) 
  this.userService.getFollowing(Number(myid)).subscribe(following =>{
    console.log(following)
    this.fllwmodel=JSON.parse(JSON.stringify(following))
    for(let i=0;this.fllwmodel.length;i++){
      console.log(this.fllwmodel[i].userid)

      this.uploadService.getUserMedia(Number(this.fllwmodel[i].userid)).subscribe(
        src => {
          console.log(src);
          this.media[i] = src;
          /* this.myMedia=JSON.stringify(src);
      console.log(this.myMedia) */
        },
        error => console.log(error),
        () => {
          console.log("completed");
        }
      );
  



    }
    


  }
   
  
    )
    
  
    
    
    
  
    
 
  //displaing follwers media
 /*  this.uploadService.getUserMedia(uid).subscribe(
    src => {
      console.log(src);
      this.media = src;
      /* this.myMedia=JSON.stringify(src);
  console.log(this.myMedia) 
    },
    error => console.log(error),
    () => {
      console.log("completed");
    }
  ); */



    

  }



}
