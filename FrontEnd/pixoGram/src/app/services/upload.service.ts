import { Injectable } from '@angular/core';
import { uploadMediaModel } from '../models/uploadMedia.model';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UploadService {

  private baseUrl = 'http://localhost:8022/media';

  constructor(private http: HttpClient) { }

   storeMedia(mediafile: uploadMediaModel, id: number): Observable<Object> {
    return this.http.post(this.baseUrl + '/create/' + id, mediafile);
   }
  
   getUserMedia(id: number): Observable<any> {
     return  this.http.get(this.baseUrl + '/id/' + id);
   } 

   getAllMedia():Observable<any>{
     return this.http.get(this.baseUrl+'/allmedia');
   }
   
 
}