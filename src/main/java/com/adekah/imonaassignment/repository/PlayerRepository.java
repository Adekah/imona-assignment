package com.adekah.imonaassignment.repository;

import com.adekah.imonaassignment.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
