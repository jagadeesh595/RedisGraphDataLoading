package com.ns.dataloading.RedisRepo.repository;

import com.ns.dataloading.entityredis.entity.BohstpBonusHistory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;@Qualifier("BohstpBonusHistoryRepository")
@Repository
public interface BohstpBonusHistoryRepository extends CrudRepository<BohstpBonusHistory,Long> {
}
