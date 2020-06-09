package com.ns.dataloading.RedisRepo.repository;

import com.ns.dataloading.entityredis.entity.BomnqpMgrsNotQualForLbDailyCc;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;@Qualifier("BomnqpMgrsNotQualForLbDailyCcRepository")
@Repository
public interface BomnqpMgrsNotQualForLbDailyCcRepository extends CrudRepository<BomnqpMgrsNotQualForLbDailyCc,Long> {


}
