package com.ns.dataloading.repository;

import com.ns.dataloading.entity.OrdtlpOrderDetailFile;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Qualifier("Ordtlp")
@Repository
public interface OrdtlpOrderDetailFileRepositorymysql extends JpaRepository<OrdtlpOrderDetailFile,Long> {
}
