package com.example.restservice;

		import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
		import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
		import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
		import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

		import org.junit.jupiter.api.Test;

		import org.springframework.beans.factory.annotation.Autowired;
		import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
		import org.springframework.boot.test.context.SpringBootTest;
		import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class RestServiceApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void root() throws Exception {
		this.mockMvc.perform(get("/"))
				.andDo(print())
				.andExpect(status().is(200))
				.andExpect(jsonPath("$.content").value("Hola ke ase"));
	}

	@Test
	public void noParamGreetingShouldReturnDefaultMessage() throws Exception {

		this.mockMvc.perform(get("/greeting")).andDo(print()).andExpect(status().isOk())
				.andExpect(jsonPath("$.content").value("Hello, World!"));
	}

	@Test
	public void paramGreetingShouldReturnTailoredMessage() throws Exception {

		this.mockMvc.perform(get("/greeting").param("name", "Spring Community"))
				.andDo(print()).andExpect(status().isOk())
				.andExpect(jsonPath("$.content").value("Hello, Spring Community!"));
	}

	@Test
	void testRoot() {
	}

	@Test
	void greeting() {
	}
}