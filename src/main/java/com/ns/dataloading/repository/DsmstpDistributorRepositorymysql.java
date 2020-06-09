package com.ns.dataloading.repository;

import com.ns.dataloading.entity.DsmstpDistributor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Qualifier("Dsmstp")
@Repository
public interface DsmstpDistributorRepositorymysql extends JpaRepository<DsmstpDistributor,Long> {

    @Query(value = "select q.* from DSMSTP_Distributor q  limit :limit offset :offset", nativeQuery = true)
    public List<DsmstpDistributor> findDsmstpDistributor(@Param("offset") int offset,@Param("limit") int limit);
}
