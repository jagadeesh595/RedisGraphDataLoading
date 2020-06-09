package com.ns.dataloading.RedisRepo.repository;

import com.ns.dataloading.entityredis.entity.BwreqpRequalificationWorkTable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;@Qualifier("BwreqpRequalificationWorkTableRepository")
@Repository
public interface BwreqpRequalificationWorkTableRepository extends CrudRepository<BwreqpRequalificationWorkTable,Long> {
}
