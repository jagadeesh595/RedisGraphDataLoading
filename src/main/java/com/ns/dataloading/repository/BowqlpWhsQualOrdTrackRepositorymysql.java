package com.ns.dataloading.repository;

import com.ns.dataloading.entity.BowqlpWhsQualOrdTrack;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Qualifier("Bowqlp")
@Repository
public interface BowqlpWhsQualOrdTrackRepositorymysql extends JpaRepository<BowqlpWhsQualOrdTrack,Long> {
}
