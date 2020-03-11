import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { UserModel } from '../models/user.model';
import { FollowModel } from '../models/follow.model';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private baseUrl = 'http://localhost:8021/user';

  private followUrl='http://localhost:8023/follow'

  constructor(private http: HttpClient) { }
  
  firstName: String;
  username: String;
  id: Number;
  email: String;

  getUser(id: number): Observable<Object> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  getUserByName(username: String): Observable<Object> {
    return this.http.get(`${this.baseUrl}/${username}`);
  }

  getLoginByName(username: String): Observable<Object> {
    return this.http.get(`${this.baseUrl}/login/${username}`);
  }
  createUser(user: UserModel): Observable<Object> {
    console.log(user)
    return this.http.post(`${this.baseUrl}` + `/create`,user);
  }

  follow(follow:FollowModel): Observable<Object> {
    return this.http.post(`${this.followUrl}`+`/create`,follow);
  }

  getFollowing(userid: number): Observable<Object>{
    return this.http.get(`http://localhost:8023/follow/following/`+`${userid}`)
  }







/*   =========================================================================================== */

  updateUser(password: string): Observable<Object> {
    return this.http.put(this.baseUrl+'/'+this.id+'/'+password,{ responseType: 'text' });
  }

  deleteUser(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  }

  getUsers(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }

  deleteAll(): Observable<any> {
    return this.http.delete(`${this.baseUrl}` + `/delete`, { responseType: 'text' });
  }
  
  getOtherUsers(): Observable<any> {
    return this.http.get(this.baseUrl+'s/'+this.id);
  }


  
  following(uid: number): Observable<any> {
    return this.http.get('http://localhost:8003/following/' + uid);
  }
  
  followers(uid: number): Observable<any> {
    return this.http.get('http://localhost:8003/followers/' + uid);
  }

  unfollow(uid:number, fid:number): Observable<any> {
    return this.http.delete('http://localhost:8003/follow/unfollow/' + uid + '/' + fid);
  }
  
  block(id: number) { 
    return this.http.put('http://localhost:8003/follow/block/'+this.id+'/'+id,{ responseType: 'text' })
  }

  getBlockedUsers() :Observable<any>{
    return this.http.get('http://localhost:8003/follow/getblockedusers/'+this.id); 
  }

  unblock(id: number) {
    return this.http.put('http://localhost:8003/follow/unblock/'+this.id+'/'+id,{responseType: 'text'})
  }
}
