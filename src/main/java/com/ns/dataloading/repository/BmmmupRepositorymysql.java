package com.ns.dataloading.repository;


import com.ns.dataloading.entity.BmmmupBonusMulMonthMoveup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
@Qualifier("Bmmmup")
@Repository
public interface BmmmupRepositorymysql extends JpaRepository<BmmmupBonusMulMonthMoveup,Long> {
}
