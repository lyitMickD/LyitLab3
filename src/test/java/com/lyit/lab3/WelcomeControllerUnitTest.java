package com.lyit.lab3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.lyit.lab3.controller.WelcomeController;
import com.lyit.lab3.service.WelcomeService;

class WelcomeControllerUnitTest {

	@Test
	void shouldWelcome() {
		WelcomeService welcomeService = Mockito.mock(WelcomeService.class);
		when(welcomeService.getWelcomeMessage("John")).thenReturn("Welcome John!");
		WelcomeController welcomeController = new WelcomeController(welcomeService);
		assertEquals("Welcome John!", welcomeController.welcome("John"));
	}

}
