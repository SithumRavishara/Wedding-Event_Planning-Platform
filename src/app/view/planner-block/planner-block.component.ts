import { Component, OnInit } from '@angular/core';
// import { url } from 'inspector';

@Component({
  selector: 'app-planner-block',
  templateUrl: './planner-block.component.html',
  styleUrls: ['./planner-block.component.css']
})
export class PlannerBlockComponent implements OnInit {
  
  // eventid : Number = 0;
  servers : number[] = [1];
  rowid : number = 0;
  private eventid: number = 0
  private i: number = 0;
  idNumber : Number = 10;

  constructor() {
   }

  ngOnInit() {
  }

  isCollapsed = true;
  message: String = "Wedding Palan 2019";
  icon: String;
  icon2: String = "./../../../assets/Images/delete.png";
 
  
  collapsed(): void {
    this.icon = "./../../../assets/Images/down.png";
  }
 
  expanded(): void {
    this.icon = "./../../../assets/Images/up.png";
  }

  public add() {
    this.eventid = this.eventid + 1;
    }

  onAdd(){
    this.servers.push(this.eventid);
  }

  // onRemove(){
  //   this.servers.();
  // }
    
}
