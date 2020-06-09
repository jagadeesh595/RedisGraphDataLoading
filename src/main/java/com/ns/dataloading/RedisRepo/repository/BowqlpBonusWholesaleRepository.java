package com.ns.dataloading.RedisRepo.repository;


import com.ns.dataloading.entityredis.entity.BowqlpWhsQualOrdTrack;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;@Qualifier("BowqlpBonusWholesaleRepository")
@Repository
public interface BowqlpBonusWholesaleRepository extends CrudRepository<BowqlpWhsQualOrdTrack,Long> {
}
