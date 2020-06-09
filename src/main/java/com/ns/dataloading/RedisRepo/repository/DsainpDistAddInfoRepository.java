package com.ns.dataloading.RedisRepo.repository;

import com.ns.dataloading.entityredis.entity.DsainpDistAddInfo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;@Qualifier("DsainpDistAddInfoRepository")
@Repository
public interface DsainpDistAddInfoRepository extends CrudRepository<DsainpDistAddInfo,Long> {
}
