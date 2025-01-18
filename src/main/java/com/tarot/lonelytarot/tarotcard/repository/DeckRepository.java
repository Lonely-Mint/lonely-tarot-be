package com.tarot.lonelytarot.tarotcard.repository;

import com.tarot.lonelytarot.tarotcard.domain.entity.Deck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeckRepository extends JpaRepository<Deck, Integer> {

}
