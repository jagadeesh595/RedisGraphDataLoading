package com.ns.dataloading.repository;

import com.ns.dataloading.entity.BowqlpWhsQualOrdTrack;
import com.ns.dataloading.entity.DshstpDistributorHistory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Qualifier("Bowqlp")
@Repository
public interface BowqlpWhsQualOrdTrackRepositorymysql extends JpaRepository<BowqlpWhsQualOrdTrack,Long> {

    @Query(value = "select q.* from BOWQLP_WHSQualOrdTrack q  limit :limit offset :offset", nativeQuery = true)
    public List<BowqlpWhsQualOrdTrack> findBowqlpWhsQualOrdTrack(@Param("offset") int offset, @Param("limit") int limit);
}
