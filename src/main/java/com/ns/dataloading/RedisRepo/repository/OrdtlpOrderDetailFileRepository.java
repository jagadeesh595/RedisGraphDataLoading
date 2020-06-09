package com.ns.dataloading.RedisRepo.repository;

import com.ns.dataloading.entityredis.entity.OrdtlpOrderDetailFile;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;@Qualifier("OrdtlpOrderDetailFileRepository")
@Repository
public interface OrdtlpOrderDetailFileRepository extends CrudRepository<OrdtlpOrderDetailFile,Long> {
}
