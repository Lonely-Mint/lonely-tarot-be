package com.tarot.lonelytarot.tarotcard.repository;

import com.tarot.lonelytarot.tarotcard.domain.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Integer> {

}
