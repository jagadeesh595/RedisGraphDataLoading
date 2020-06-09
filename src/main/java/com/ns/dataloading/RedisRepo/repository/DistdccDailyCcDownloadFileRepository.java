package com.ns.dataloading.RedisRepo.repository;

import com.ns.dataloading.entityredis.entity.DistdccDailyCcDownloadFile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistdccDailyCcDownloadFileRepository extends CrudRepository<DistdccDailyCcDownloadFile,Long> {
}
