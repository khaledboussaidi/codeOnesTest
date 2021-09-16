package com.ponctuation.ponctuationservice.controller;

import com.ponctuation.ponctuationservice.DTO.PonctuationCountResultDto;
import com.ponctuation.ponctuationservice.DTO.TextDto;
import com.ponctuation.ponctuationservice.service.PonctuationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AliasFor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ponctuation-service")
@CrossOrigin(origins = "*")
public class PonctuationController {
    @Autowired
    PonctuationService ponctuationService;
    /* definition of our  ponctuation counter endpoint rest  */
    @PostMapping("/count")
    public ResponseEntity<?> countPonctuation(@RequestBody TextDto textDto){
        PonctuationCountResultDto ponctuationCountResultDto = new PonctuationCountResultDto();
        System.out.println(textDto);
        try{
             ponctuationCountResultDto.setValue(this.ponctuationService.countPonctuationNumber(textDto.getValue()));
            return new ResponseEntity<>(ponctuationCountResultDto,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
