package com.ns.dataloading.repository;


import com.ns.dataloading.entity.BowqlpWhsQualOrdTrack;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
@Qualifier("BowqlpWhole")
@Repository
public interface BowqlpBonusWholesaleRepositorymysql extends JpaRepository<BowqlpWhsQualOrdTrack,Long> {
}
