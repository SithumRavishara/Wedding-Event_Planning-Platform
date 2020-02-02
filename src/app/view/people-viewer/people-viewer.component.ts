import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-people-viewer',
  templateUrl: './people-viewer.component.html',
  styleUrls: ['./people-viewer.component.css']
})

export class PeopleViewerComponent implements OnInit {

 

  constructor() { }

  ngOnInit() {
  }
   
  itemsPerSlide = 5;
 
  slides = [
    {image: 'assets/Images/people.jpeg'},
    {image: 'assets/Images/banner1.svg'},
    {image: 'assets/Images/banner2.svg'},
    {image: 'assets/Images/people.jpeg'},
    {image: 'assets/Images/people.jpeg'},
    {image: 'assets/Images/people.jpeg'},
    {image: 'assets/Images/people.jpeg'},
    {image: 'assets/Images/people.jpeg'},
    {image: 'assets/Images/people.jpeg'},
    {image: 'assets/Images/people.jpeg'}
  ];

}
