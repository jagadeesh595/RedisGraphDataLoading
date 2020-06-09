package com.ns.dataloading.RedisRepo.repository;


import com.ns.dataloading.entityredis.entity.BmmmupBonusMulMonthMoveup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
@Qualifier("BmmmupRepository")
@Repository
public interface BmmmupRepository extends CrudRepository<BmmmupBonusMulMonthMoveup,Long> {
}
