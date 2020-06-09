package com.ns.dataloading.RedisRepo.repository;


import com.ns.dataloading.entityredis.entity.BomsrpBonusMasterSrc;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;@Qualifier("BomsrpBonusMasterSrcRepository")
@Repository
public interface BomsrpBonusMasterSrcRepository extends CrudRepository<BomsrpBonusMasterSrc,Long> {


}
