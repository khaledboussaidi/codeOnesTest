import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs/internal/Observable";
import { environment } from "src/environments/environment";
import { PonctuationCountResultDto } from "../model/PonctuationCountResultDto";
import { TextDto } from "../model/TextDto";

const API_URL = environment.apiUrl;
const httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' }),
  };
  const headers = new HttpHeaders().set('Content-Type', 'text/plain; charset=utf-8');
  
  @Injectable({
    providedIn: 'root',
  })

  export class PonctuationService {
    constructor(private http: HttpClient) { }


    countPonctuation(textDto: TextDto): Observable<PonctuationCountResultDto> {
        return this.http.post<PonctuationCountResultDto>(API_URL + '/ponctuation-service/count/' , textDto , httpOptions);
      }
  }
