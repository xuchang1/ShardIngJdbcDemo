package com.study.repository;

import com.study.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author changxu13
 * @date 2020/10/17 16:31
 */
public interface PositionRepository extends JpaRepository<Position, Integer> {

    @Query(nativeQuery = true, value = "select p.id, p.name, p.salary, p.city, pd.description from position p left join position_detail pd on p.id = pd.pid where p.id=:id")
    Object findPositionById(@Param("id") Long id);
}
