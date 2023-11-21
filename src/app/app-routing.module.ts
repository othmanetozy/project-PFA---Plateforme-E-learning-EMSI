import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {CoursesComponent} from "./Courses/courses.component";
import {LivresComponent} from "./Livres/livres.component";
import {FichesComponent} from "./Fiches/fiches.component";
import {ContactComponent} from "./Contact/contact.component";
import {ConnexionComponent} from "./connexion/connexion.component";
import {HomeComponent} from "./home/home.component";
import {LoginComponent} from "./Login/login.component";

const routes: Routes = [
  {path : '', component:HomeComponent},
  {path : "courses", component:CoursesComponent},
  {path : "livres", component: LivresComponent},
  {path : "fiches", component: FichesComponent},
  {path : "contact", component: ContactComponent},
  {path : "connexion", component: ConnexionComponent},
  {path : "login" , component : LoginComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
