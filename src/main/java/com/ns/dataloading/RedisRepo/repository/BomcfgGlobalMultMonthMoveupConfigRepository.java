package com.ns.dataloading.RedisRepo.repository;

import com.ns.dataloading.entityredis.entity.BomcfgGlobalMultMonthMoveupConfig;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;@Qualifier("BomcfgGlobalMultMonthMoveupConfigRepository")
@Repository
public interface BomcfgGlobalMultMonthMoveupConfigRepository extends CrudRepository<BomcfgGlobalMultMonthMoveupConfig,Long> {
}
