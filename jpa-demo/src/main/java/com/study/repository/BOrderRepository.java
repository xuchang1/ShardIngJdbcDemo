package com.study.repository;

import com.study.entity.BOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BOrderRepository extends JpaRepository<BOrder, Long> {

    @Query(nativeQuery = true, value = "select * from b_order where id=:id")
    Object findOrderById(@Param("id") Long id);

    @Query(nativeQuery = true, value = "select * from b_order where company_id=:companyId")
    Object[] findOrderByCompanyId(@Param("companyId") Integer companyId);

    @Query(nativeQuery = true, value = "select * from b_order where company_id=:companyId and id=:id")
    Object findOrderByCompanyIdAndId(@Param("companyId") Integer companyId, @Param("id") Long id);

    @Query(nativeQuery = true, value = "select * from b_order where name=:name")
    Object[] findOrderByName(@Param("name") String name);

}
