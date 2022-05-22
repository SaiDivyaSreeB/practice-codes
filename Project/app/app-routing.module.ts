import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FictionBooksComponent } from './fiction-books/fiction-books.component';
import { GenresComponent } from './genres/genres.component';
import { HorrorBooksComponent } from './horror-books/horror-books.component';
import { LiteratureBooksComponent } from './literature-books/literature-books.component';
import { NewCollectionsComponent } from './new-collections/new-collections.component';


const routes: Routes = [{path:'newCollections',component:NewCollectionsComponent},{path:'genres',component:GenresComponent},{path:'literaure-books',component:LiteratureBooksComponent},{path:'fiction-books',component:FictionBooksComponent}];
const childRoutes: Routes=[{path:'horror',component:HorrorBooksComponent},{path:'literature',component:LiteratureBooksComponent},{path:'fiction',component:FictionBooksComponent}]
@NgModule({
  imports: [RouterModule.forRoot(routes),RouterModule.forChild(childRoutes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
