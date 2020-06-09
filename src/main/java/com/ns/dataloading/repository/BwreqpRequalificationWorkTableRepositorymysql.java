package com.ns.dataloading.repository;

import com.ns.dataloading.entity.BwreqpRequalificationWorkTable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Qualifier("Bwreqp")
@Repository
public interface BwreqpRequalificationWorkTableRepositorymysql extends JpaRepository<BwreqpRequalificationWorkTable,Long> {
}
