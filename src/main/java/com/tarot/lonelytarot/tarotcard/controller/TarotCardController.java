package com.tarot.lonelytarot.tarotcard.controller;

import com.tarot.lonelytarot.tarotcard.service.TarotCardService;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/tarot")
public class TarotCardController {

  private final TarotCardService tarotCardService;
  private final ChatClient chatClient;

  @GetMapping("/ai")
  Map<String, String> completion(
      @RequestParam(value = "message", defaultValue = "Tell me about tarot card.") String message) {
    tarotCardService.initTarotCard();
    return Map.of(
        "completion",
        chatClient.prompt()
            .user(message)
            .call()
            .content());
  }

  @GetMapping("/decks/shuffle")
  public ResponseEntity<?> getShuffleCards() {
    return ResponseEntity.ok(tarotCardService.getShuffleCard());
  }

}
