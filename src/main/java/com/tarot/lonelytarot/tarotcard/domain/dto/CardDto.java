package com.tarot.lonelytarot.tarotcard.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CardDto {

  private int cardId;
  private String cardName;
}
