package com.ns.dataloading;


import com.google.gson.Gson;
import com.ns.dataloading.RedisRepo.repository.*;
import com.ns.dataloading.Utils.Utils;
import com.ns.dataloading.entity.DistdccDailyCcDownloadFile;
import com.ns.dataloading.entity.RunConfig;
import com.ns.dataloading.repository.*;
import com.redislabs.redisgraph.RedisGraph;
import com.redislabs.redisgraph.ResultSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RepositoryCall {
    @Qualifier("Ormstp")
    @Autowired
    OrmstpOrderRepositorymysql ordermysql;
    @Autowired
    FlcmppCompanyConfigRepository flcmppCompanyConfigRepository;
    @Autowired
    FlcmppCompanyConfigmysql flcmppCompanyConfigmysql;
    @Qualifier("OrmstpOrderRepository")
    @Autowired
    com.ns.dataloading.RedisRepo.repository.OrmstpOrderRepository orderredisrepo;
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    BomcfgGlobalMultMonthMoveupConfigRepository bomcfgGlobalMultMonthMoveupConfigRepository;
    @Autowired
    BomcfgGlobalMultMonthMoveupConfigRepositorymysql bomcfgGlobalMultMonthMoveupConfigRepositorymysql;
    @Autowired
    Gson jsonconvertor = new Gson();
    // @Qualifier("dsmstpDistributorRepository")
    @Autowired
    DspwvpWaiverRepository dspwvpWaiverRepository;
    @Autowired
    DspwvpWaiverRepositorymysql dspwvpWaiverRepositorymysql;
    @Autowired
    DshstpDistributorHistoryRepository dshstpDistributorHistoryRepository;
    @Autowired
    DshstpDistributorHistoryRepositorymysql dshstpDistributorHistoryRepositorymysql;
    @Autowired
    DslevpDistributorLevelsRepository dslevpDistributorLevelsRepository;
    @Autowired
    DslevpDistributorLevelsRepositorymysql dslevpDistributorLevelsRepositorymysql;
    @Autowired
    DsmstpDistributorRepositorymysql dsmstpDistributorRepositorymysql;
    @Autowired
    DsmstpDistributorRepository dsmstpDistributorRepository;
    @Autowired
    DsainpDistAddInfoRepository dsainpDistAddInfoRepository;
    @Autowired
    DsainpDistAddInfoRepositorymysql dsainpDistAddInfoRepositorymysql;
    @Autowired
    Runlogrepomysql runlogrepomysql;
    @Autowired
    RunlogRepo runlogReporedis;
    @Autowired
    Runconfigmysql runconfigmysql;
    @Autowired
    RunconfigredisRepo runconfigredisRepo;
    @Autowired
    DistdccDailyCcDownloadFilemysql distdccDailyCcDownloadFilemysql;
    @Autowired
    DistdccDailyCcDownloadFileRepository distdccDailyCcDownloadFileRepository;
    @Autowired
    BowqlpWhsQualOrdTrackRepositorymysql bowqlpWhsQualOrdTrackRepositorymysql;
    @Autowired
    BowqlpWhsQualOrdTrackRepository bowqlpWhsQualOrdTrackRepository;
    @Autowired
    BoqalpBonusQualificationRepository boqalredis;
    @Autowired
    BoqalpBonusQualificationRepositorymysql bonusQualificationRepositorymysql;
    @Autowired
    BohstpBonusHistoryRepository bohstpBonusHistoryRepository;
    @Autowired
    BohstpBonusHistoryRepositorymysql bohstpBonusHistoryRepositorymysql;
    @Autowired
    BofitpFitStartOrderRepository bofitpFitStartOrderRepository;
    @Autowired
    BofitpFitStartOrderRepositorymysql bofitpFitStartOrderRepositorymysql;

    @Autowired
    RedisGraph graph;

    Utils utils = new Utils();
    int start = 0;
    int limit = 50000;
    int currentCount = 0;

/*

    @Autowired
    BodtldpBonusDetailRepository bodtldpBonusDetailRepository;
    @Autowired
    BodtldpBonusDetailRepositorymysql bodtldpBonusDetailRepositorymysql;
    @Autowired
    BodtlpBonusDetailRepository bodtlpBonusDetailRepository;
    @Autowired
    BodtlpBonusDetailRepositorymysql bodtlpBonusDetailRepositorymysql;
*/

    public void init() {

//        List<RunConfig> runConfigList = new ArrayList<>();
//        runConfigList = runconfigmysql.findAll();
//
//        runConfigList.parallelStream().forEach(x ->
//        {
//            String query = utils.convertObjectToKeyValueString(x);
//            try {
//                ResultSet rs = graph.query("rediscegraph", query);
//            } catch (Exception ex) {
//                System.out.println(ex.toString());
//            }
//        });
//        System.out.println("Run config loaded");
//        System.out.println("'''''''''''''''''''''''''''''''''''''''''''");
//
//        List<com.ns.dataloading.entity.RunLog> Runlogmysql = new ArrayList<>();
//        Runlogmysql = runlogrepomysql.findAll();
//
//        Runlogmysql.parallelStream().forEach(x ->
//        {
//            String query = utils.convertObjectToKeyValueString(x);
//            try {
//                ResultSet rs = graph.query("rediscegraph", query);
//            } catch (Exception ex) {
//                System.out.println(ex.toString());
//            }
//        });
//        System.out.println("Runlogloaded");
//        System.out.println("'''''''''''''''''''''''''''''''''''''''''''");
//
//
//        List<com.ns.dataloading.entity.OrmstpOrder> orderlistmysql = new ArrayList<>();
//        orderlistmysql = ordermysql.findAll();
//        orderlistmysql.parallelStream().forEach(x ->
//        {
//            String query = utils.convertObjectToKeyValueString(x);
//            try {
//                ResultSet rs = graph.query("rediscegraph", query);
//            } catch (Exception ex) {
//                System.out.println(ex.toString());
//            }
//        });
//        System.out.println("Orderloaded");
//        System.out.println("'''''''''''''''''''''''''''''''''''''''''''");
//
//        start = 0;
//        currentCount = 0;
//        do {
//            List<com.ns.dataloading.entity.DsmstpDistributor> Distributorlistmysql = dsmstpDistributorRepositorymysql.findDsmstpDistributor(start, limit);
//            currentCount = Distributorlistmysql.size();
//            Distributorlistmysql.parallelStream().forEach(x ->
//            {
//                String query = utils.convertObjectToKeyValueString(x);
//                try {
//                    ResultSet rs = graph.query("rediscegraph", query);
//                } catch (Exception ex) {
//                    System.out.println(ex.toString());
//                }
//            });
//
//            start = start + currentCount;
//            System.out.println("DsmstpDistributor Loaded");
//            System.out.println("'''''''''''''''''''''''''''''''''''''''''''");
//        }
//        while (currentCount == limit);
//
//
//        List<com.ns.dataloading.entity.BoqalpBonusQualification> boqalpBonusQualificationListmysql = bonusQualificationRepositorymysql.findAll();
//
//        boqalpBonusQualificationListmysql.parallelStream().forEach(x ->
//        {
//            String query = utils.convertObjectToKeyValueString(x);
//            try {
//                ResultSet rs = graph.query("rediscegraph", query);
//            } catch (Exception ex) {
//                System.out.println(ex.toString());
//            }
//        });
//
//        System.out.println("BoqalpBonusQualification Loaded");
//        System.out.println("'''''''''''''''''''''''''''''''''''''''''''");
//
//
//        List<com.ns.dataloading.entity.FlcmppCompanyConfig> flcmppCompanyConfigListmysql = flcmppCompanyConfigmysql.findAll();
//        flcmppCompanyConfigListmysql.parallelStream().forEach(x ->
//        {
//            String query = utils.convertObjectToKeyValueString(x);
//            try {
//                ResultSet rs = graph.query("rediscegraph", query);
//            } catch (Exception ex) {
//                System.out.println(ex.toString());
//            }
//        });
//
//        System.out.println("FlcmppCompanyConfig Loaded");
//        System.out.println("'''''''''''''''''''''''''''''''''''''''''''");
//
//
//        start = 0;
//        currentCount = 0;
//        do {
//            List<com.ns.dataloading.entity.BohstpBonusHistory> bohstpBonusHistoryListmysql = bohstpBonusHistoryRepositorymysql.findBohstpBonusHistory(start, limit);
//            currentCount = bohstpBonusHistoryListmysql.size();
//            bohstpBonusHistoryListmysql.parallelStream().forEach(x ->
//            {
//                String query = utils.convertObjectToKeyValueString(x);
//                try {
//                    ResultSet rs = graph.query("rediscegraph", query);
//                } catch (Exception ex) {
//                    System.out.println(ex.toString());
//                }
//            });
//
//            start = start + currentCount;
//            System.out.println("BohstpBonusHistory Loaded");
//            System.out.println("'''''''''''''''''''''''''''''''''''''''''''");
//        }
//        while (currentCount == limit);
//
//        System.out.println("BohstpBonusHistory Loaded");
//
//
//        System.out.println("'''''''''''''''''''''''''''''''''''''''''''");


//        List<com.ns.dataloading.entity.DistdccDailyCcDownloadFile> distdccDailyCcDownloadFiles = distdccDailyCcDownloadFilemysql.findAll();
//        Map<DistdccDailyCcDownloadFile, Long> distdccDailyCcDownloadFileLongMap = new HashMap<>();
//        distdccDailyCcDownloadFiles.parallelStream().forEach(x ->
//        {
//            String query = utils.convertObjectToKeyValueString(x);
//            try {
//                ResultSet rs = graph.query("rediscegraph", query);
//            } catch (Exception ex) {
//                System.out.println(ex.toString());
//            }
//        });
//
//
//        System.out.println("DISTDCC_DailyCCDownloadFile Loaded");
//        System.out.println("'''''''''''''''''''''''''''''''''''''''''''");
//
//        List<com.ns.dataloading.entity.BofitpFitStartOrder> bofitpFitStartOrderList = bofitpFitStartOrderRepositorymysql.findAll();
//
//        bofitpFitStartOrderList.parallelStream().forEach(x ->
//        {
//            String query = utils.convertObjectToKeyValueString(x);
//            try {
//                ResultSet rs = graph.query("rediscegraph", query);
//            } catch (Exception ex) {
//                System.out.println(ex.toString());
//            }
//        });
//
//        System.out.println("BodtlpBonusDetail Loaded");
//        System.out.println("'''''''''''''''''''''''''''''''''''''''''''");

//        List<com.ns.dataloading.entity.DslevpDistributorLevels> dslevelp = new ArrayList<>();
//        dslevelp = dslevpDistributorLevelsRepositorymysql.findAll();
//
//        dslevelp.parallelStream().forEach(x ->
//        {
//            String query = utils.convertObjectToKeyValueString(x);
//            try {
//                ResultSet rs = graph.query("rediscegraph", query);
//            } catch (Exception ex) {
//                System.out.println(ex.toString());
//            }
//        });
//        System.out.println("Dslev loaded");
//        System.out.println("'''''''''''''''''''''''''''''''''''''''''''");
//
        start = 0;
        currentCount = 0;
        do {
            List<com.ns.dataloading.entity.DsainpDistAddInfo> dsainpDistAddInfoList = dsainpDistAddInfoRepositorymysql.findDsainpDistAddInfo(start, limit);
            currentCount = dsainpDistAddInfoList.size();
            dsainpDistAddInfoList.parallelStream().forEach(x ->
            {
                String query = utils.convertObjectToKeyValueString(x);
                try {
                    ResultSet rs = graph.query("rediscegraph", query);
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                }
            });

            start = start + currentCount;
            System.out.println("DsainpDistAddInfo Loaded");
            System.out.println("'''''''''''''''''''''''''''''''''''''''''''");
        }
        while (currentCount == limit);

        start = 0;
        currentCount = 0;
        do {
            List<com.ns.dataloading.entity.DshstpDistributorHistory> dshstpDistributorHistoryList =dshstpDistributorHistoryRepositorymysql.findDshstpDistributorHistory(start, limit);
            currentCount = dshstpDistributorHistoryList.size();
            dshstpDistributorHistoryList.parallelStream().forEach(x ->
            {
                String query = utils.convertObjectToKeyValueString(x);
                try {
                    ResultSet rs = graph.query("rediscegraph", query);
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                }
            });

            start = start + currentCount;
            System.out.println("DshstpDistributorHistory Loaded");
            System.out.println("'''''''''''''''''''''''''''''''''''''''''''");
        }
        while (currentCount == limit);


        start = 0;
        currentCount = 0;
        do {
            List<com.ns.dataloading.entity.BowqlpWhsQualOrdTrack> bowqlpWhsQualOrdTrackList = bowqlpWhsQualOrdTrackRepositorymysql.findBowqlpWhsQualOrdTrack(start, limit);
            currentCount = bowqlpWhsQualOrdTrackList.size();
            bowqlpWhsQualOrdTrackList.parallelStream().forEach(x ->
            {
                String query = utils.convertObjectToKeyValueString(x);
                try {
                    ResultSet rs = graph.query("rediscegraph", query);
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                }
            });

            start = start + currentCount;
            System.out.println("BowqlpWhsQualOrdTrack Loaded");
            System.out.println("'''''''''''''''''''''''''''''''''''''''''''");
        }
        while (currentCount == limit);


//        List<com.ns.dataloading.entity.BomcfgGlobalMultMonthMoveupConfig> bomcfgGlobalMultMonthMoveupConfigslist = new ArrayList<>();
//        bomcfgGlobalMultMonthMoveupConfigslist = bomcfgGlobalMultMonthMoveupConfigRepositorymysql.findAll();
//
//
//        bomcfgGlobalMultMonthMoveupConfigslist.parallelStream().forEach(x ->
//        {
//            String query = utils.convertObjectToKeyValueString(x);
//            try {
//                ResultSet rs = graph.query("rediscegraph", query);
//            } catch (Exception ex) {
//                System.out.println(ex.toString());
//            }
//        });
//        System.out.println("BomcfgGlobalMultMonthMoveupConfig loaded");
//        System.out.println("'''''''''''''''''''''''''''''''''''''''''''");


        List<com.ns.dataloading.entity.DspwvpWaiver> dspwvpWaiverList = new ArrayList<>();
        dspwvpWaiverList = dspwvpWaiverRepositorymysql.findAll();
        dspwvpWaiverList.parallelStream().forEach(x ->
        {
            String query = utils.convertObjectToKeyValueString(x);
            try {
                ResultSet rs = graph.query("rediscegraph", query);
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
        });
        System.out.println("DspwvpWaiver loaded");
        System.out.println("'''''''''''''''''''''''''''''''''''''''''''");
    }
}














