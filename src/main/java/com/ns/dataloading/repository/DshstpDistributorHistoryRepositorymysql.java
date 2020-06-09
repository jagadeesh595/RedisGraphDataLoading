package com.ns.dataloading.repository;

import com.ns.dataloading.entity.DshstpDistributorHistory;
import com.ns.dataloading.entityredis.entity.BohstpBonusHistory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Qualifier("Dshstp")
@Repository
public interface DshstpDistributorHistoryRepositorymysql extends JpaRepository<DshstpDistributorHistory,Long> {

    @Query(value = "select q.* from DSHSTP_DistributorHistory q  limit :limit offset :offset", nativeQuery = true)
    public List<DshstpDistributorHistory> findDshstpDistributorHistory(@Param("offset") int offset, @Param("limit") int limit);
}
