import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import axios from 'axios';

@Injectable({
  providedIn: 'root'
})
export class CryptoService {
  private apiUrl = 'http://localhost:8080/cryptos';


  async getCryptos(){
    try {
      const response = await axios.get(this.apiUrl);
      return response.data;
    } catch (error) {
      console.error('Erreur lors de la récupération des cryptos :', error);
      return [];
    }}

    async getTop3Cryptos() {
      try {
        const response = await axios.get(this.apiUrl + '/top3');
        console.log("Données reçues (Top 3):", response.data);
        return response.data;
      } catch (error) {
        console.error('Erreur lors de la récupération du Top 3 Cryptos :', error);
        return [];
      }
    }
    
}
