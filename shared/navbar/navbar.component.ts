import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgbDropdownConfig } from '@ng-bootstrap/ng-bootstrap';
import {TranslateService} from '@ngx-translate/core';
import { TokenStorageService } from 'src/app/components/services/token-storage.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss'],
  providers: [NgbDropdownConfig]
})
export class NavbarComponent implements OnInit {
  public iconOnlyToggled = false;
  public sidebarToggled = false;

  constructor(private tokenStorage:TokenStorageService,private router:Router,config: NgbDropdownConfig, translate: TranslateService) {
    config.placement = 'bottom-right';
    // this language will be used as a fallback when a translation isn't found in the current language
    translate.setDefaultLang('en');
  }

  ngOnInit() {
  }

  logout(){

    this.tokenStorage.signOut();
    this.router.navigate(['/user-pages/login']);
   }
  

  // toggle sidebar in small devices
  toggleOffcanvas() {
    document.querySelector('.sidebar-offcanvas').classList.toggle('active');
  }

  // toggle sidebar
  toggleSidebar() {
    let body = document.querySelector('body');
    if((!body.classList.contains('sidebar-toggle-display')) && (!body.classList.contains('sidebar-absolute'))) {
      this.iconOnlyToggled = !this.iconOnlyToggled;
      if(this.iconOnlyToggled) {
        body.classList.add('sidebar-icon-only');
      } else {
        body.classList.remove('sidebar-icon-only');
      }
    } else {
      this.sidebarToggled = !this.sidebarToggled;
      if(this.sidebarToggled) {
        body.classList.add('sidebar-hidden');
      } else {
        body.classList.remove('sidebar-hidden');
      }
    }
  }

  // toggle right sidebar
  toggleRightSidebar() {
    document.querySelector('#right-sidebar').classList.toggle('open');
  }

}
