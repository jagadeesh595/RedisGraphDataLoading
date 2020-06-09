package com.ns.dataloading.RedisRepo.repository;

import com.ns.dataloading.entityredis.entity.Bor999WkVital5Promo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;@Qualifier("Bor999WkVital5PromoRepository")
@Repository
public interface Bor999WkVital5PromoRepository extends CrudRepository<Bor999WkVital5Promo,Long> {
}
