package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@WebMvcTest
class FeatureFlagControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnFeatureEnabledFalse() throws Exception {
        MvcResult result = mockMvc.perform(get("/features/isEnabled"))
                .andExpect(status().is2xxSuccessful())
                .andReturn();

        assertEquals("false", result.getResponse().getContentAsString());
    }
}