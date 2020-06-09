package com.ns.dataloading.repository;

import com.ns.dataloading.entity.OrmstpOrder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Qualifier("Ormstp")
@Repository
public interface OrmstpOrderRepositorymysql extends JpaRepository<OrmstpOrder,Long> {


}
