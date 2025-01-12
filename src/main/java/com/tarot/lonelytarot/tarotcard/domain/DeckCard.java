package com.tarot.lonelytarot.tarotcard.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class DeckCard {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int deckCardId;

  @ManyToOne(fetch = FetchType.LAZY)
  private Deck deck;

  @ManyToOne(fetch = FetchType.LAZY)
  private Card card;

  private boolean isReversed;

  private int cardOrder;

}
