package com.tarot.lonelytarot.tarotcard.controller;

import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TarotCardController {
  private final ChatClient chatClient;

  TarotCardController(ChatClient chatClient) {
    this.chatClient = chatClient;
  }


  @GetMapping("/ai")
  Map<String, String> completion(
      @RequestParam(value = "message", defaultValue = "Tell me about tarot card.") String message) {
    return Map.of(
        "completion",
        chatClient.prompt()
            .user(message)
            .call()
            .content());
  }


}
