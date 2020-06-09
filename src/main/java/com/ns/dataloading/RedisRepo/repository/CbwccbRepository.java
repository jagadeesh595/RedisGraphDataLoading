package com.ns.dataloading.RedisRepo.repository;


import com.ns.dataloading.entityredis.entity.CbwccpWorldWideCc;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;@Qualifier("CbwccbRepository")
@Repository
public interface CbwccbRepository extends CrudRepository<CbwccpWorldWideCc,Long> {
}
