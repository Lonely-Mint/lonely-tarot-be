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
public class Deck {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(length = 2000, nullable = false)
  private String question;

  @Column(length = 400, nullable = false)
  private String spreadType;

  @Builder
  public Deck(String question, String spreadType) {
    this.question = question;
    this.spreadType = spreadType;
  }


}
