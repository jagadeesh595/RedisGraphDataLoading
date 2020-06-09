package com.ns.dataloading.RedisRepo.repository;

import com.ns.dataloading.entityredis.entity.DspwvpWaiver;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;@Qualifier("DspwvpWaiverRepository")
@Repository
public interface DspwvpWaiverRepository extends CrudRepository<DspwvpWaiver,Long> {
}
