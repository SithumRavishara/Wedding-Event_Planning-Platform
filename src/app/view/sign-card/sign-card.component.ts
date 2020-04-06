import { Component, OnInit, ViewChild } from '@angular/core';
import { User } from 'src/app/dto/user';
import {NgForm} from '@angular/forms';
import { SignupService } from 'src/app/service/signup.service';

@Component({
  selector: 'app-sign-card',
  templateUrl: './sign-card.component.html',
  styleUrls: ['./sign-card.component.css']
})
export class SignCardComponent implements OnInit {

  allowtoChoose = false;

  user: User = new User('','','');

  constructor(private _signupService: SignupService) { }

  ngOnInit() {
  }

  saveUser(): void {
   this._signupService.register(this.user).subscribe(
     data => console.log('success!',data),
     error => console.log('error:',error)
   )
  }

}
