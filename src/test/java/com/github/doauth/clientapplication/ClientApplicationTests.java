package com.github.doauth.clientapplication;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;

@SpringBootTest
class ClientApplicationTests {

  @SuppressWarnings("unused")
  @MockBean
  private ClientRegistrationRepository clientRegistrationRepository;

  @Test
  void contextLoads() {
  }

}
