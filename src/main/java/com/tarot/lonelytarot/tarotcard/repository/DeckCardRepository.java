package com.tarot.lonelytarot.tarotcard.repository;

import com.tarot.lonelytarot.tarotcard.domain.DeckCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeckCardRepository extends JpaRepository<DeckCard, Integer> {

}
