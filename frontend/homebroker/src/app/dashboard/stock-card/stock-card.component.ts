import  Stock  from 'src/app/shared/models/stock-model';
import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-stock-card',
  templateUrl: './stock-card.component.html',
  styleUrls: ['./stock-card.component.css']
})
export class StockCardComponent implements OnInit {

  @Input()
  stock =  new Stock();

  constructor() { }

  ngOnInit(): void {
  }

  get variantion():string{

    const localizeVariantionString = this.stock.variantion.toLocaleString();
    const prefix =  this.stock.variantion > 0 ? '+' :'-';
    return `${prefix} ${localizeVariantionString.replace('-','')}%`;

  }

}
