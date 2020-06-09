package com.ns.dataloading.repository;

import com.ns.dataloading.entity.BomcfgGlobalMultMonthMoveupConfig;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Qualifier("Bomcfg")
@Repository
public interface BomcfgGlobalMultMonthMoveupConfigRepositorymysql extends JpaRepository<BomcfgGlobalMultMonthMoveupConfig,Long> {
}
