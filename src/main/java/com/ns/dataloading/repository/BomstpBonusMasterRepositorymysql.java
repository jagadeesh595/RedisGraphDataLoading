package com.ns.dataloading.repository;


import com.ns.dataloading.entity.BomstpBonusMaster;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Qualifier("Bomstp")
@Repository
public interface BomstpBonusMasterRepositorymysql extends JpaRepository<BomstpBonusMaster,Long> {

}
