package com.ns.dataloading.RedisRepo.repository;

import com.ns.dataloading.entityredis.entity.RunLog;
import org.springframework.data.repository.CrudRepository;

public interface RunlogRepo extends CrudRepository<RunLog,Long> {
}
