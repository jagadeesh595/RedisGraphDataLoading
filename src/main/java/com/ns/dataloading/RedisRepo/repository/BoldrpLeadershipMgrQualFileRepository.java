package com.ns.dataloading.RedisRepo.repository;


import com.ns.dataloading.entityredis.entity.BoldrpLeadershipMgrQualFile;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;@Qualifier("BoldrpLeadershipMgrQualFileRepository")
@Repository
public interface BoldrpLeadershipMgrQualFileRepository extends CrudRepository<BoldrpLeadershipMgrQualFile,Long> {
}
