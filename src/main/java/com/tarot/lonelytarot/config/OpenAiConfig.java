package com.tarot.lonelytarot.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAiConfig {

  @Bean
  public ChatClient chatClient(ChatClient.Builder builder) {
    return builder.defaultSystem(
            "You are a friendly chat bot that answers questions in the voice of a Pirate")
        .build(); // Builder로 ChatClient 생성
  }
}
