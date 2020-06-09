package com.ns.dataloading.repository;


import com.ns.dataloading.entity.EmwccpWorldWideCc;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
@Qualifier("Emwccp")
@Repository
public interface EmwccpRepositorymysql extends JpaRepository<EmwccpWorldWideCc,Long> {
}
