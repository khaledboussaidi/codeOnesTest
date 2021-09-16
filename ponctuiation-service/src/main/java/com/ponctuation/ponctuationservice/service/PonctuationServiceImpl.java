package com.ponctuation.ponctuationservice.service;

import org.springframework.stereotype.Service;

@Service
public class PonctuationServiceImpl implements PonctuationService{

    /* method return the number of punctuations in string object */
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
