package com.ns.dataloading.repository;

import com.ns.dataloading.entity.BohstpBonusHistory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Qualifier("Bohstp")
@Repository
public interface BohstpBonusHistoryRepositorymysql extends JpaRepository<BohstpBonusHistory,Long> {

    @Query(value = "select q.* from BOHSTP_BonusHistory q  limit :limit offset :offset", nativeQuery = true)
    public List<BohstpBonusHistory> findBohstpBonusHistory(@Param("offset") int offset, @Param("limit") int limit);
}
