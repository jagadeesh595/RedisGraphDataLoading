package com.ns.dataloading.repository;

import com.ns.dataloading.entity.DsainpDistAddInfo;
import com.ns.dataloading.entity.DsmstpDistributor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Qualifier("Dsainp")
@Repository
public interface DsainpDistAddInfoRepositorymysql extends JpaRepository<DsainpDistAddInfo,Long> {

    @Query(value = "select q.* from DSAINP_DistAddInfo q  limit :limit offset :offset", nativeQuery = true)
    public List<DsainpDistAddInfo> findDsainpDistAddInfo(@Param("offset") int offset, @Param("limit") int limit);
}
