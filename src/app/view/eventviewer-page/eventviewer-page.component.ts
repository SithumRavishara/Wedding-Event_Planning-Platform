import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-eventviewer-page',
  templateUrl: './eventviewer-page.component.html',
  styleUrls: ['./eventviewer-page.component.css']
})
export class EventviewerPageComponent implements OnInit {

  Name: String = "Techno Meetup 2019";
  Heading: String = "BionInformatics meetup in Sabaragamuwa University of Sri Lanka";

  constructor() { }

  ngOnInit() {
  }

}
