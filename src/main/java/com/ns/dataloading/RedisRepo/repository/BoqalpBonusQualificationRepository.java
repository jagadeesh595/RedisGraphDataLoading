package com.ns.dataloading.RedisRepo.repository;


import com.ns.dataloading.entityredis.entity.BoqalpBonusQualification;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;@Qualifier("BoqalpBonusQualificationRepository")
@Repository
public interface BoqalpBonusQualificationRepository extends CrudRepository<BoqalpBonusQualification,Long> {


}
