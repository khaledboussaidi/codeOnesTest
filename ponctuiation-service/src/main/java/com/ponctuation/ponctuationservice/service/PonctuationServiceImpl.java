package com.ponctuation.ponctuationservice.service;

public class PonctuationServiceImpl implements PonctuationService{
    @Override
    public int countPonctuationNumber(String text) {
        int ponctuationCount =0;
        for( int i = 0; i < text.length(); i++){
            if(text.charAt(i) == '!' || text.charAt(i) == ',' || text.charAt(i) == ';' || text.charAt(i) == '.' || text.charAt(i) == '?' || text.charAt(i) == ':') {
                ponctuationCount++;
            }
        }
        return  ponctuationCount;
    }
}
