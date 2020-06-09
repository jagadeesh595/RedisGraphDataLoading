package com.ns.dataloading.repository;


import com.ns.dataloading.entity.BodtlpBonusDetail;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Qualifier("Bodtlp")
@Repository
public interface BodtlpBonusDetailRepositorymysql extends JpaRepository<BodtlpBonusDetail,Long> {


}
