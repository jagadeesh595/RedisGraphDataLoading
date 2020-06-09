package com.ns.dataloading.repository;

import com.ns.dataloading.entity.BomnqpMgrsNotQualForLbDailyCc;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Qualifier("Bomnqp")
@Repository
public interface BomnqpMgrsNotQualForLbDailyCcRepositorymysql extends JpaRepository<BomnqpMgrsNotQualForLbDailyCc,Long> {


}
