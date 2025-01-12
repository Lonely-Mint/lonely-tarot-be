package com.tarot.lonelytarot.tarotcard.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Card {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int cardId;

  @Column(length = 500, nullable = false)
  private String cardName;

  @Builder
  public Card(String cardName) {
    this.cardName = cardName;
  }

}
