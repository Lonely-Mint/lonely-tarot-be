package com.tarot.lonelytarot.tarotcard.service;

import com.tarot.lonelytarot.tarotcard.domain.dto.CardDto;
import com.tarot.lonelytarot.tarotcard.domain.entity.Card;
import com.tarot.lonelytarot.tarotcard.repository.CardRepository;
import java.util.Collections;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TarotCardServiceImpl implements TarotCardService {

  private final CardRepository cardRepository;

  @Override
  public void initTarotCard() {

    long cardCount = cardRepository.count();
    if (cardCount == 78) {
      return;
    }
    List<Card> cards = List.of(
        new Card("The Fool"),
        new Card("The Magician"),
        new Card("The High Priestess"),
        new Card("The Empress"),
        new Card("The Emperor"),
        new Card("The Hierophant"),
        new Card("The Lovers"),
        new Card("The Chariot"),
        new Card("Strength"),
        new Card("The Hermit"),
        new Card("Wheel of Fortune"),
        new Card("Justice"),
        new Card("The Hanged Man"),
        new Card("Death"),
        new Card("Temperance"),
        new Card("The Devil"),
        new Card("The Tower"),
        new Card("The Star"),
        new Card("The Moon"),
        new Card("The Sun"),
        new Card("Judgment"),
        new Card("The World"),
        new Card("Ace of Cups"),
        new Card("Two of Cups"),
        new Card("Three of Cups"),
        new Card("Four of Cups"),
        new Card("Five of Cups"),
        new Card("Six of Cups"),
        new Card("Seven of Cups"),
        new Card("Eight of Cups"),
        new Card("Nine of Cups"),
        new Card("Ten of Cups"),
        new Card("Page of Cups"),
        new Card("Knight of Cups"),
        new Card("Queen of Cups"),
        new Card("King of Cups"),
        new Card("Ace of Swords"),
        new Card("Two of Swords"),
        new Card("Three of Swords"),
        new Card("Four of Swords"),
        new Card("Five of Swords"),
        new Card("Six of Swords"),
        new Card("Seven of Swords"),
        new Card("Eight of Swords"),
        new Card("Nine of Swords"),
        new Card("Ten of Swords"),
        new Card("Page of Swords"),
        new Card("Knight of Swords"),
        new Card("Queen of Swords"),
        new Card("King of Swords"),
        new Card("Ace of Wands"),
        new Card("Two of Wands"),
        new Card("Three of Wands"),
        new Card("Four of Wands"),
        new Card("Five of Wands"),
        new Card("Six of Wands"),
        new Card("Seven of Wands"),
        new Card("Eight of Wands"),
        new Card("Nine of Wands"),
        new Card("Ten of Wands"),
        new Card("Page of Wands"),
        new Card("Knight of Wands"),
        new Card("Queen of Wands"),
        new Card("King of Wands"),
        new Card("Ace of Pentacles"),
        new Card("Two of Pentacles"),
        new Card("Three of Pentacles"),
        new Card("Four of Pentacles"),
        new Card("Five of Pentacles"),
        new Card("Six of Pentacles"),
        new Card("Seven of Pentacles"),
        new Card("Eight of Pentacles"),
        new Card("Nine of Pentacles"),
        new Card("Ten of Pentacles"),
        new Card("Page of Pentacles"),
        new Card("Knight of Pentacles"),
        new Card("Queen of Pentacles"),
        new Card("King of Pentacles")
    );
    cardRepository.deleteAll();
    cardRepository.saveAll(cards);
  }

  @Override
  public List<CardDto> getShuffleCard() {
    initTarotCard();
    List<Card> cards = cardRepository.findAll();
    Collections.shuffle(cards);
    return cards.stream().map(card -> new CardDto(card.getCardId(), card.getCardName())).toList();
  }
}
