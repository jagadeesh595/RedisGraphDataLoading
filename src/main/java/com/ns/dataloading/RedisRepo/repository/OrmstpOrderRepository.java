package com.ns.dataloading.RedisRepo.repository;

import com.ns.dataloading.entityredis.entity.OrmstpOrder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.stream.Stream;

@Qualifier("OrmstpOrderRepository")
@Repository
public interface OrmstpOrderRepository extends CrudRepository<OrmstpOrder,Long> {

/*
   // OrmstpOrder deleteByomordNumber(@Param("omordNumber") Long omordNumber);
    OrmstpOrder o=new OrmstpOrder();
    ExampleMatcher matcher = ExampleMatcher.matching()
            .withIgnorePaths("omordNumber")
            .withIncludeNullValues()
            .withIgnoreCase();

    Example<OrmstpOrder> example = Example.of(o, matcher);*/

}
