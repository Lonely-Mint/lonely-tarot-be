package com.tarot.lonelytarot.tarotcard.service;

import com.tarot.lonelytarot.tarotcard.domain.dto.CardDto;
import com.tarot.lonelytarot.tarotcard.domain.entity.Card;
import java.util.List;

public interface TarotCardService {

  default CardDto cardEntityToDto(Card card) {
    CardDto cardDto = CardDto.builder()
        .cardId(card.getCardId())
        .cardName(card.getCardName())
        .build();
    return cardDto;
  }

  void initTarotCard();

  List<CardDto> getShuffleCard();

}
