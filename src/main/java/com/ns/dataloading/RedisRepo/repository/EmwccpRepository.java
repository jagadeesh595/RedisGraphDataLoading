package com.ns.dataloading.RedisRepo.repository;


import com.ns.dataloading.entityredis.entity.EmwccpWorldWideCc;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;@Qualifier("EmwccpRepository")
@Repository
public interface EmwccpRepository extends CrudRepository<EmwccpWorldWideCc,Long> {
}
