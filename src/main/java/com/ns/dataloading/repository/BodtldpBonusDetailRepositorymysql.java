package com.ns.dataloading.repository;



import com.ns.dataloading.entity.BodtldpBonusDetail;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
@Qualifier("BODTLP")
@Repository
public interface BodtldpBonusDetailRepositorymysql extends JpaRepository<BodtldpBonusDetail,Long> {
}
