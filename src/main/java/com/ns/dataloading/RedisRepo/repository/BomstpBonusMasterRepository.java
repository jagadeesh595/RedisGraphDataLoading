package com.ns.dataloading.RedisRepo.repository;


import com.ns.dataloading.entityredis.entity.BomstpBonusMaster;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;@Qualifier("BomstpBonusMasterRepository")
@Repository
public interface BomstpBonusMasterRepository extends CrudRepository<BomstpBonusMaster,Long> {

}
