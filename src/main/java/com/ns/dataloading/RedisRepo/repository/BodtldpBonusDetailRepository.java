package com.ns.dataloading.RedisRepo.repository;



import com.ns.dataloading.entityredis.entity.BodtldpBonusDetail;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
@Qualifier("BodtldpBonusDetailRepository")
@Repository
public interface BodtldpBonusDetailRepository extends CrudRepository<BodtldpBonusDetail,Long> {
}
