package com.ns.dataloading.RedisRepo.repository;

import com.ns.dataloading.entityredis.entity.DshstpDistributorHistory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;@Qualifier("DshstpDistributorHistoryRepository")
@Repository
public interface DshstpDistributorHistoryRepository extends CrudRepository<DshstpDistributorHistory,Long> {
}
