package com.ns.dataloading.repository;

import com.ns.dataloading.entity.DslevpDistributorLevels;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Qualifier("Dslevp")
@Repository
public interface DslevpDistributorLevelsRepositorymysql extends JpaRepository<DslevpDistributorLevels,Long> {
}
