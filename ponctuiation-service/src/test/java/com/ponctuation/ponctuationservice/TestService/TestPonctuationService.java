package com.ponctuation.ponctuationservice.TestService;

import com.ponctuation.ponctuationservice.service.PonctuationServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPonctuationService {


    @Test
    void CountNumberIs2() {
        String text = "ii.!";

        Assertions.assertEquals(2,new PonctuationServiceImpl().countPonctuationNumber(text));

    }
    @Test
    void CountNumberIs3() {
        String text = "x:x!x,";

        Assertions.assertEquals(3,new PonctuationServiceImpl().countPonctuationNumber(text));

    }

    @Test
    void CountNumberIs4 (){
        String text = "a;a,a!c;";

        Assertions.assertEquals(4,new PonctuationServiceImpl().countPonctuationNumber(text));

    }
}
