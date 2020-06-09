package com.ns.dataloading.repository;


import com.ns.dataloading.entity.BoqalpBonusQualification;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Qualifier("Boqalp")
@Repository
public interface BoqalpBonusQualificationRepositorymysql extends JpaRepository<BoqalpBonusQualification,Long> {


}
