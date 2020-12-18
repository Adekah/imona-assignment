package com.adekah.imonaassignment.repository;

import com.adekah.imonaassignment.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {
}
