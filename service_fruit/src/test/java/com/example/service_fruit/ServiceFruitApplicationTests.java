package com.example.service_fruit;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
class ServiceFruitApplicationTests {


	@Autowired
	private MockMvc mockMvc;


	@Test
	public void addUserTestApple() throws Exception {
		this.mockMvc.perform((get("/sendFruits?FruitId=1"))
				.contentType(MediaType.APPLICATION_JSON_UTF8)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect((content().json("{'name': 'Apple'}")));
	}


	@Test
	public void addUserTestBanana() throws Exception {
		this.mockMvc.perform((get("/sendFruits?FruitId=2"))
				.contentType(MediaType.APPLICATION_JSON_UTF8)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect((content().json("{'name': 'Banana'}")));
	}

}
