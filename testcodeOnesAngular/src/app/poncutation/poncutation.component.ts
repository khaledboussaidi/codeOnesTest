import { Component, OnInit } from '@angular/core';
import { PonctuationCountResultDto } from '../model/PonctuationCountResultDto';
import { TextDto } from '../model/TextDto';
import { PonctuationService } from '../service/ponctuation-service';

@Component({
  selector: 'app-poncutation',
  templateUrl: './poncutation.component.html',
  styleUrls: ['./poncutation.component.scss']
})
export class PoncutationComponent implements OnInit {

  constructor(private service: PonctuationService) { }
  textDto: TextDto = new TextDto;
  ponctuationcountResult: PonctuationCountResultDto = new PonctuationCountResultDto;
  ngOnInit(): void {
    this.textDto = new TextDto();
    this.ponctuationcountResult = new PonctuationCountResultDto();
  }
  calculate(){
    let resp=this.service.countPonctuation(this.textDto);
    resp.subscribe(data=>this.ponctuationcountResult = data);
  }
}
