import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root' // ✅ Assure que le service est bien injecté dans toute l'application
})
export class CryptoService {
  private apiUrl = 'http://localhost:8080/api/cryptos';

  constructor(private http: HttpClient) {}

  getCryptos(): Observable<any[]> {
    return this.http.get<any[]>(this.apiUrl);
  }
}
