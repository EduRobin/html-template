import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Router} from '@angular/router';
import {AuthenticationService} from '../services/authentication.service';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent implements OnInit {


  private password = '';
  private checkpassword = '';
  private email = '';
  private username = '';
  private registerURL = 'http://85.160.64.233:3000/session/register';

  constructor(private httpClient: HttpClient, private router: Router, private authentication: AuthenticationService) { }

  clickMeToRegister(e) {
    this.authentication.clickRegister(this.email, this.username, this.password, this.checkpassword).subscribe(
      (data: any) => {
        this.router.navigate(['/home']);
      }, (error) => {
      }
    );
  }

  ngOnInit() {
  }

}
