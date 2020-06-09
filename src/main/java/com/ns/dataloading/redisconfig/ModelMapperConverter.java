package com.ns.dataloading.redisconfig;


import com.ns.dataloading.entityredis.entity.*;
import org.modelmapper.ModelMapper;


public class ModelMapperConverter implements Converter {
    private ModelMapper modelMapper;

    public ModelMapperConverter() {
        modelMapper = new ModelMapper();
    }


    @Override
    public RunConfig convert(com.ns.dataloading.entity.RunConfig sourceOrder) {
        return modelMapper.map(sourceOrder, RunConfig.class);
    }
    @Override
    public DistdccDailyCcDownloadFile convert(com.ns.dataloading.entity.DistdccDailyCcDownloadFile sourceOrder) {
        return modelMapper.map(sourceOrder, DistdccDailyCcDownloadFile.class);
    }


    @Override
    public FlcmppCompanyConfig convert(com.ns.dataloading.entity.FlcmppCompanyConfig sourceOrder) {
        return modelMapper.map(sourceOrder, FlcmppCompanyConfig.class);
    }

    @Override
    public BodtlpBonusDetail convert(com.ns.dataloading.entity.BodtlpBonusDetail sourceOrder) {
        return modelMapper.map(sourceOrder, BodtlpBonusDetail.class);
    }

    @Override
    public RunLog convert(com.ns.dataloading.entity.RunLog sourceOrder) {
        return modelMapper.map(sourceOrder, RunLog.class);
    }

    @Override
    public OrmstpOrder convert(com.ns.dataloading.entity.OrmstpOrder mysqlentity) {
        return modelMapper.map(mysqlentity, OrmstpOrder.class);
    }

    @Override
    public DspwvpWaiver convert(com.ns.dataloading.entity.DspwvpWaiver mysqlentity) {
        return modelMapper.map(mysqlentity, DspwvpWaiver.class);
    }

    @Override
    public BoqalpBonusQualification convert(com.ns.dataloading.entity.BoqalpBonusQualification mysqlentity) {
        return modelMapper.map(mysqlentity, BoqalpBonusQualification.class);
    }

    @Override
    public CbwccpWorldWideCc convert(com.ns.dataloading.entity.CbwccpWorldWideCc sourceOrder) {
        return modelMapper.map(sourceOrder, CbwccpWorldWideCc.class);
    }

    @Override
    public Bor999WkVital5Promo convert(com.ns.dataloading.entity.Bor999WkVital5Promo mysqlentity) {
        return modelMapper.map(mysqlentity, Bor999WkVital5Promo.class);
    }

    @Override
    public OrdtlpOrderDetailFile convert(com.ns.dataloading.entity.OrdtlpOrderDetailFile mysqlentity) {
        return modelMapper.map(mysqlentity, OrdtlpOrderDetailFile.class);
    }

    @Override
    public BowqlpWhsQualOrdTrack convert(com.ns.dataloading.entity.BowqlpWhsQualOrdTrack mysqlentity) {
        return modelMapper.map(mysqlentity, BowqlpWhsQualOrdTrack.class);
    }

    @Override
    public BohstpBonusHistory convert(com.ns.dataloading.entity.BohstpBonusHistory mysqlentity) {
        return modelMapper.map(mysqlentity, BohstpBonusHistory.class);
    }

    @Override
    public DsainpDistAddInfo convert(com.ns.dataloading.entity.DsainpDistAddInfo mysqlentity) {
        return modelMapper.map(mysqlentity, DsainpDistAddInfo.class);
    }

    @Override
    public DsmstpDistributor convert(com.ns.dataloading.entity.DsmstpDistributor mysqlentity) {
        return modelMapper.map(mysqlentity, DsmstpDistributor.class);
    }

    @Override
    public BodtldpBonusDetail convert(com.ns.dataloading.entity.BodtldpBonusDetail mysqlentity) {
        return modelMapper.map(mysqlentity, BodtldpBonusDetail.class);
    }

    @Override
    public DslevpDistributorLevels convert(com.ns.dataloading.entity.DslevpDistributorLevels mysqlentity) {
        return modelMapper.map(mysqlentity, DslevpDistributorLevels.class);
    }

    @Override
    public BofitpFitStartOrder convert(com.ns.dataloading.entity.BofitpFitStartOrder mysqlentity) {
        return modelMapper.map(mysqlentity, BofitpFitStartOrder.class);
    }

    @Override
    public DshstpDistributorHistory convert(com.ns.dataloading.entity.DshstpDistributorHistory mysqlentity) {
        return modelMapper.map(mysqlentity, DshstpDistributorHistory.class);
    }

    @Override
    public BomcfgGlobalMultMonthMoveupConfig convert(com.ns.dataloading.entity.BomcfgGlobalMultMonthMoveupConfig mysqlentity) {
        return modelMapper.map(mysqlentity, BomcfgGlobalMultMonthMoveupConfig.class);
    }

    @Override
    public BwreqpRequalificationWorkTable convert(com.ns.dataloading.entity.BwreqpRequalificationWorkTable mysqlentity) {
        return modelMapper.map(mysqlentity, BwreqpRequalificationWorkTable.class);
    }

    @Override
    public BmmmupBonusMulMonthMoveup convert(com.ns.dataloading.entity.BmmmupBonusMulMonthMoveup mysqlentity) {
        return modelMapper.map(mysqlentity, BmmmupBonusMulMonthMoveup.class);
    }
}
