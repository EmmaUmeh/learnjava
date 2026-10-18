package com.javademo.spring_boot_tutorial;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = SpringBootTutorialApplication.class)
@AutoConfigureMockMvc
class SpringBootTutorialApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void rootShowsApiIsRunning() throws Exception {
		mockMvc.perform(get("/"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.message").value("Spring Boot API is running"))
				.andExpect(jsonPath("$.try").value("GET /api/hello"));
	}

	@Test
	void helloEndpointReturnsGreeting() throws Exception {
		mockMvc.perform(get("/api/hello"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.message").value("Hello from Spring Boot API!"));
	}
}
