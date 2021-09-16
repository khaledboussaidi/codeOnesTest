package com.ponctuation.ponctuationservice.TestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ponctuation.ponctuationservice.DTO.TextDto;
import com.ponctuation.ponctuationservice.service.PonctuationService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest
public class TestPonctuationController {

    @Autowired
    MockMvc mockMvc;
    @MockBean
    PonctuationService ponctuationService;
    @Test
    void countPonctuationNumber() throws Exception {
        TextDto textDto = new TextDto();
        textDto.setValue("khaled,;:,");
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(textDto);
        when(ponctuationService.countPonctuationNumber(textDto.getValue())).thenReturn(3);
        mockMvc.perform(MockMvcRequestBuilders.post("/ponctuation-service/count")
                .contentType(MediaType.APPLICATION_JSON).content(json)
        ).andExpect(status().isOk());
    }
}