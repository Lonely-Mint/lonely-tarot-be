package com.tarot.lonelytarot.tarotcard.repository;

import com.tarot.lonelytarot.tarotcard.domain.entity.DeckCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeckCardRepository extends JpaRepository<DeckCard, Integer> {

}
