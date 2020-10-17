package com.study.repository;

import com.study.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author changxu13
 * @date 2020/10/17 16:31
 */
public interface PositionRepository extends JpaRepository<Position, Integer> {
}
