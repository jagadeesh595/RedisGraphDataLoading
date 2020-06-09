package com.ns.dataloading.redisconfig;

import com.ns.dataloading.entityredis.entity.*;

public interface Converter {
    RunConfig convert(com.ns.dataloading.entity.RunConfig sourceOrder);

    FlcmppCompanyConfig convert(com.ns.dataloading.entity.FlcmppCompanyConfig sourceOrder);

    DistdccDailyCcDownloadFile convert(com.ns.dataloading.entity.DistdccDailyCcDownloadFile sourceOrder);


    BodtlpBonusDetail convert(com.ns.dataloading.entity.BodtlpBonusDetail sourceOrder);

    RunLog convert(com.ns.dataloading.entity.RunLog sourceOrder);

    OrmstpOrder convert(com.ns.dataloading.entity.OrmstpOrder sourceOrder);

    DspwvpWaiver convert(com.ns.dataloading.entity.DspwvpWaiver sourceOrder);

    BoqalpBonusQualification convert(com.ns.dataloading.entity.BoqalpBonusQualification sourceOrder);

    CbwccpWorldWideCc convert(com.ns.dataloading.entity.CbwccpWorldWideCc sourceOrder);


    Bor999WkVital5Promo convert(com.ns.dataloading.entity.Bor999WkVital5Promo sourceOrder);

    OrdtlpOrderDetailFile convert(com.ns.dataloading.entity.OrdtlpOrderDetailFile sourceOrder);

    BowqlpWhsQualOrdTrack convert(com.ns.dataloading.entity.BowqlpWhsQualOrdTrack sourceOrder);

    BohstpBonusHistory convert(com.ns.dataloading.entity.BohstpBonusHistory sourceOrder);

    DsainpDistAddInfo convert(com.ns.dataloading.entity.DsainpDistAddInfo sourceOrder);

    DsmstpDistributor convert(com.ns.dataloading.entity.DsmstpDistributor sourceOrder);

    BodtldpBonusDetail convert(com.ns.dataloading.entity.BodtldpBonusDetail sourceOrder);

    DslevpDistributorLevels convert(com.ns.dataloading.entity.DslevpDistributorLevels sourceOrder);

    BofitpFitStartOrder convert(com.ns.dataloading.entity.BofitpFitStartOrder sourceOrder);

    // call4MonthMoveupRequalificationSP->stored procedure convert(Userdetails sourceOrder);
    DshstpDistributorHistory convert(com.ns.dataloading.entity.DshstpDistributorHistory sourceOrder);

    BomcfgGlobalMultMonthMoveupConfig convert(com.ns.dataloading.entity.BomcfgGlobalMultMonthMoveupConfig sourceOrder);

    BwreqpRequalificationWorkTable convert(com.ns.dataloading.entity.BwreqpRequalificationWorkTable sourceOrder);

    BmmmupBonusMulMonthMoveup convert(com.ns.dataloading.entity.BmmmupBonusMulMonthMoveup sourceOrder);

}

