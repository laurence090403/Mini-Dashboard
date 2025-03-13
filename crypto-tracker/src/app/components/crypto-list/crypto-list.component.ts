import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CryptoService } from '../../services/crypto.service';

@Component({
  selector: 'app-crypto-list',
  standalone: true,
  imports: [CommonModule], 
  templateUrl: './crypto-list.component.html',
  styleUrls: ['./crypto-list.component.scss']
})
export class CryptoListComponent implements OnInit {
  cryptos: any[] = []; 
  top3Cryptos: any[] = [];
  affichage: string = 'all'; 

  constructor(private cryptoService: CryptoService) {}

  async ngOnInit() {
    this.cryptos = await this.cryptoService.getCryptos();
    this.top3Cryptos = await this.cryptoService.getTop3Cryptos();
  }

  afficherListe(type: string) {
    this.affichage = type; 
  }
}
