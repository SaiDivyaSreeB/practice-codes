import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NewCollectionsComponent } from './new-collections/new-collections.component';
import { GenresComponent } from './genres/genres.component';
import { LiteratureBooksComponent } from './literature-books/literature-books.component';
import { FictionBooksComponent } from './fiction-books/fiction-books.component';
import { NavComponent } from './nav/nav.component';
import { HorrorBooksComponent } from './horror-books/horror-books.component';
import { FavButtonDirective } from './fav-button.directive';
import { ButtonFavComponent } from './button-fav/button-fav.component';


@NgModule({
  declarations: [
    AppComponent,
    NewCollectionsComponent,
    GenresComponent,
    LiteratureBooksComponent,
    FictionBooksComponent,
    NavComponent,
    HorrorBooksComponent,
    FavButtonDirective,
    ButtonFavComponent,
    
  ],
  imports: [
    BrowserModule,
   
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
