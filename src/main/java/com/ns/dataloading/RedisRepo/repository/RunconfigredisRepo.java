package com.ns.dataloading.RedisRepo.repository;

import com.ns.dataloading.entityredis.entity.RunConfig;
import org.springframework.data.repository.CrudRepository;

public interface RunconfigredisRepo extends CrudRepository<RunConfig,Long> {
}
