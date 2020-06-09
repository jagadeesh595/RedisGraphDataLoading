package com.ns.dataloading.RedisRepo.repository;


import com.ns.dataloading.entityredis.entity.BodtlpBonusDetail;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;@Qualifier("BodtlpBonusDetailRepository")
@Repository
public interface BodtlpBonusDetailRepository extends CrudRepository<BodtlpBonusDetail,Long> {


}
