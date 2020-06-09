package com.ns.dataloading.RedisRepo.repository;

import com.ns.dataloading.entityredis.entity.DsmstpDistributor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;@Qualifier("DsmstpDistributorRepository")
@Repository
public interface DsmstpDistributorRepository extends CrudRepository<DsmstpDistributor,Long> {
}
