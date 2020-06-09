package com.ns.dataloading.repository;

import com.ns.dataloading.entity.BofitpFitStartOrder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Qualifier("Bofitp")
@Repository
public interface BofitpFitStartOrderRepositorymysql extends JpaRepository<BofitpFitStartOrder,Long> {
}
