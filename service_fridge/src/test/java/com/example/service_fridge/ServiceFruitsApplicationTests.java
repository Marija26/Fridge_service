package com.example.service_fridge;

import com.example.service_fridge.model.Fruit;
import com.example.service_fridge.repository.FruitRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
class ServiceFruitsApplicationTests {


    @Autowired
	private MockMvc mockMvc;


	@MockBean
	private FruitRepository fruitRepository;

	Fruit fruit = new Fruit("Apple", "yellow");

	ObjectMapper mapper = new ObjectMapper();


	@Test
	public void addUserTest() throws Exception {
		when(fruitRepository.save(Mockito.any(Fruit.class))).thenReturn(fruit);
		this.mockMvc.perform((post("/rest/add/"))
				.content(mapper.writeValueAsString(fruit))
				.contentType(MediaType.APPLICATION_JSON_UTF8)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
	}
	
}

