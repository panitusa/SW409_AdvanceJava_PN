import {Injectable} from '@angular/core';

@Injectable()
export class UserService {
users = [
  {_id: 123, username: 'bob', password: 'bobpassword'},
  {_id: 567, username: 'panit', password: 'panitpassword'}
];
// tslint:disable-next-line:ban-types
findUserByCredentials(username: String, password: String) {
  // tslint:disable-next-line:prefer-for-of
  for (let i = 0; i < this.users.length; i++) {
    const user = this.users[i];
    if (username === user.username && password === user.password) {
      return user;
    }
  }
  return null;
}
findUserById(_id: Number){
  for (let i = 0; i < this.users.length; i++) {
    const user = this.users[i];

    if(_id == user._id){
      return user;
    }
    
  }
  return null;
}
}

