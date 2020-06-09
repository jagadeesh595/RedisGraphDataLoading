package com.ns.dataloading.RedisRepo.repository;

import com.ns.dataloading.entityredis.entity.BofitpFitStartOrder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;@Qualifier("BofitpFitStartOrderRepository")
@Repository
public interface BofitpFitStartOrderRepository extends CrudRepository<BofitpFitStartOrder,Long> {
}
