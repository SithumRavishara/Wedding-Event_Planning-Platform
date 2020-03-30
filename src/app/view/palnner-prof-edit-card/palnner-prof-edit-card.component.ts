import { Component, OnInit, TemplateRef } from '@angular/core';
import { BsModalService, BsModalRef } from 'ngx-bootstrap/modal';

@Component({
  selector: 'app-palnner-prof-edit-card',
  templateUrl: './palnner-prof-edit-card.component.html',
  styleUrls: ['./palnner-prof-edit-card.component.css']
})
export class PalnnerProfEditCardComponent implements OnInit {

  isCollapsed: any = true;
  istwoCollapsed: any = true;
  isthirdCollapsed: any = true;
  islastCollapsed: any = true;

  bsModalRef: BsModalRef;
  modalRef: BsModalRef;

  constructor(private modalService: BsModalService) { }

  ngOnInit() {
  }

  openModal(template: TemplateRef<any>) {
    this.modalRef = this.modalService.show(template);
  }

  openModalWithComponent() {
    this.bsModalRef.content.closeBtnName = 'Close';
  
}


}
