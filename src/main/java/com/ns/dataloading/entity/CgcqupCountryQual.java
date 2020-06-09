package com.ns.dataloading.entity;

import javax.persistence.*;

@Entity
@Table(name = "CGCQUP_CountryQual")
public class CgcqupCountryQual {
    private Long id;
    private Integer cgnbumgNbrUnrecMgrLvl;
    private Integer cgnbrmgNbrRecMgrLvl;
    private Integer cgnbimgNbrInhMgrLvl;
    private Integer cgnbtmgNbrTrfMgrLvl;
    private String cgcdteDistorspnChgDate;
    private Long cgdidDisributortId;
    private Long cgsidSponId;
    private Long cgaraaDistAreaInOpCmpy;
    private String cgfdsdtFirstDwlnSpnDate;
    private String cgwsdatWholesaleDistDate;
    private String cgndpfgNdpFlag;
    private String cgfpdtFirstPurchaseDate;
    private Long cgnbsarmgrNb1StGenSpnActRqMgr;
    private Long cgnbNomgrNbNameOnlyMgr;
    private String cgpmtTypePaymttype;
    private String cgwebrecapWebrecap;
    private String cgnewsLtrNewsltr;
    private String cgbonAct1Bonact1;
    private String cgbonAct2Bonact2;
    private Long cgspnSeqSponsorSequenceNb;
    private String cgprspnflgPrimarySpnFlag;
    private String cgscopeScope;
    private String cgstampAddorchangeStamp;
    private String cgdelDeleteFlag;
    private Long cgdxtseqDxTransactionSequence;
    private Long cgsfdelSalesForceDelete;
    private String cgsfdeldatSalesForceDeleteDate;
    private String cgsfdeltimSalesForceDeleteTime;
    private Long cgsfbldSalesForceLoad;
    private String cgsfblddatSalesForceLoadDate;
    private String cgsfbldtimSalesForceLoadDate;
    private Long cgsfcfmSalesForceConfirm;
    private String cgsfcfmdatSalesForceConfirmDate;
    private String cgsfcfmtimSalesForceConfirmTime;
    private String cgisoOprCompanyIso;
    private String cgctlControlNumber;
    private String cgdid1DistId;
    private String cgspnSponsorControl;
    private String cgsid1SponsorId;
    private String cgsetdSponsoredDate;
    private String cgsetuSetupUserid;
    private String cgchgdatLastchgDate;
    private String cgchgusrLastchgUserid;
    private Integer cgpyrSponsoredPeriodYear;
    private Integer cgpmoSponsoredPeriodMonth;
    private String cgfrdcDomesticorforeign;
    private String cgstasStatus;
    private String cgtrfmTransferedMgrFlag;
    private String cginhmInheritedMgrFlag;
    private String cgdqmgRecognizedMgrFlag;
    private Integer cglidLevelIndexId;
    private Integer cgnbdstNbrDistLvl;
    private Integer cgnbasNbrAsstSupLvl;
    private Integer cgnbsupNbrSupLvl;
    private Integer cgnbasmNbrAssMgrLvl;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CGNBUMG_NbrUnrecMgrLvl", nullable = true)
    public Integer getCgnbumgNbrUnrecMgrLvl() {
        return cgnbumgNbrUnrecMgrLvl;
    }

    public void setCgnbumgNbrUnrecMgrLvl(Integer cgnbumgNbrUnrecMgrLvl) {
        this.cgnbumgNbrUnrecMgrLvl = cgnbumgNbrUnrecMgrLvl;
    }

    @Basic
    @Column(name = "CGNBRMG_nbrRecMgrLvl", nullable = true)
    public Integer getCgnbrmgNbrRecMgrLvl() {
        return cgnbrmgNbrRecMgrLvl;
    }

    public void setCgnbrmgNbrRecMgrLvl(Integer cgnbrmgNbrRecMgrLvl) {
        this.cgnbrmgNbrRecMgrLvl = cgnbrmgNbrRecMgrLvl;
    }

    @Basic
    @Column(name = "CGNBIMG_nbrInhMgrLvl", nullable = true)
    public Integer getCgnbimgNbrInhMgrLvl() {
        return cgnbimgNbrInhMgrLvl;
    }

    public void setCgnbimgNbrInhMgrLvl(Integer cgnbimgNbrInhMgrLvl) {
        this.cgnbimgNbrInhMgrLvl = cgnbimgNbrInhMgrLvl;
    }

    @Basic
    @Column(name = "CGNBTMG_nbrTrfMgrLvl", nullable = true)
    public Integer getCgnbtmgNbrTrfMgrLvl() {
        return cgnbtmgNbrTrfMgrLvl;
    }

    public void setCgnbtmgNbrTrfMgrLvl(Integer cgnbtmgNbrTrfMgrLvl) {
        this.cgnbtmgNbrTrfMgrLvl = cgnbtmgNbrTrfMgrLvl;
    }

    @Basic
    @Column(name = "CGCDTE_distorspnChgDate", nullable = true, length = 15)
    public String getCgcdteDistorspnChgDate() {
        return cgcdteDistorspnChgDate;
    }

    public void setCgcdteDistorspnChgDate(String cgcdteDistorspnChgDate) {
        this.cgcdteDistorspnChgDate = cgcdteDistorspnChgDate;
    }

    @Basic
    @Column(name = "CGDID_disributortId", nullable = true)
    public Long getCgdidDisributortId() {
        return cgdidDisributortId;
    }

    public void setCgdidDisributortId(Long cgdidDisributortId) {
        this.cgdidDisributortId = cgdidDisributortId;
    }

    @Basic
    @Column(name = "CGSID_sponId", nullable = true)
    public Long getCgsidSponId() {
        return cgsidSponId;
    }

    public void setCgsidSponId(Long cgsidSponId) {
        this.cgsidSponId = cgsidSponId;
    }

    @Basic
    @Column(name = "CGARAA_distAreaInOpCmpy", nullable = true)
    public Long getCgaraaDistAreaInOpCmpy() {
        return cgaraaDistAreaInOpCmpy;
    }

    public void setCgaraaDistAreaInOpCmpy(Long cgaraaDistAreaInOpCmpy) {
        this.cgaraaDistAreaInOpCmpy = cgaraaDistAreaInOpCmpy;
    }

    @Basic
    @Column(name = "CGFDSDT_firstDwlnSpnDate", nullable = true, length = 15)
    public String getCgfdsdtFirstDwlnSpnDate() {
        return cgfdsdtFirstDwlnSpnDate;
    }

    public void setCgfdsdtFirstDwlnSpnDate(String cgfdsdtFirstDwlnSpnDate) {
        this.cgfdsdtFirstDwlnSpnDate = cgfdsdtFirstDwlnSpnDate;
    }

    @Basic
    @Column(name = "CGWSDAT_wholesaleDistDate", nullable = true, length = 15)
    public String getCgwsdatWholesaleDistDate() {
        return cgwsdatWholesaleDistDate;
    }

    public void setCgwsdatWholesaleDistDate(String cgwsdatWholesaleDistDate) {
        this.cgwsdatWholesaleDistDate = cgwsdatWholesaleDistDate;
    }

    @Basic
    @Column(name = "CGNDPFG_ndpFlag", nullable = true, length = 1)
    public String getCgndpfgNdpFlag() {
        return cgndpfgNdpFlag;
    }

    public void setCgndpfgNdpFlag(String cgndpfgNdpFlag) {
        this.cgndpfgNdpFlag = cgndpfgNdpFlag;
    }

    @Basic
    @Column(name = "CGFPDT_firstPurchaseDate", nullable = true, length = 15)
    public String getCgfpdtFirstPurchaseDate() {
        return cgfpdtFirstPurchaseDate;
    }

    public void setCgfpdtFirstPurchaseDate(String cgfpdtFirstPurchaseDate) {
        this.cgfpdtFirstPurchaseDate = cgfpdtFirstPurchaseDate;
    }

    @Basic
    @Column(name = "CGNBSARMGR_nb1stGenSpnActRqMgr", nullable = true)
    public Long getCgnbsarmgrNb1StGenSpnActRqMgr() {
        return cgnbsarmgrNb1StGenSpnActRqMgr;
    }

    public void setCgnbsarmgrNb1StGenSpnActRqMgr(Long cgnbsarmgrNb1StGenSpnActRqMgr) {
        this.cgnbsarmgrNb1StGenSpnActRqMgr = cgnbsarmgrNb1StGenSpnActRqMgr;
    }

    @Basic
    @Column(name = "CGNB_NOMGR_nbNameOnlyMgr", nullable = true)
    public Long getCgnbNomgrNbNameOnlyMgr() {
        return cgnbNomgrNbNameOnlyMgr;
    }

    public void setCgnbNomgrNbNameOnlyMgr(Long cgnbNomgrNbNameOnlyMgr) {
        this.cgnbNomgrNbNameOnlyMgr = cgnbNomgrNbNameOnlyMgr;
    }

    @Basic
    @Column(name = "CGPMT_TYPE_paymttype", nullable = true, length = 1)
    public String getCgpmtTypePaymttype() {
        return cgpmtTypePaymttype;
    }

    public void setCgpmtTypePaymttype(String cgpmtTypePaymttype) {
        this.cgpmtTypePaymttype = cgpmtTypePaymttype;
    }

    @Basic
    @Column(name = "CGWEBRECAP_webrecap", nullable = true, length = 1)
    public String getCgwebrecapWebrecap() {
        return cgwebrecapWebrecap;
    }

    public void setCgwebrecapWebrecap(String cgwebrecapWebrecap) {
        this.cgwebrecapWebrecap = cgwebrecapWebrecap;
    }

    @Basic
    @Column(name = "CGNEWS_LTR_newsltr", nullable = true, length = 1)
    public String getCgnewsLtrNewsltr() {
        return cgnewsLtrNewsltr;
    }

    public void setCgnewsLtrNewsltr(String cgnewsLtrNewsltr) {
        this.cgnewsLtrNewsltr = cgnewsLtrNewsltr;
    }

    @Basic
    @Column(name = "CGBON_ACT1_bonact1", nullable = true, length = 255)
    public String getCgbonAct1Bonact1() {
        return cgbonAct1Bonact1;
    }

    public void setCgbonAct1Bonact1(String cgbonAct1Bonact1) {
        this.cgbonAct1Bonact1 = cgbonAct1Bonact1;
    }

    @Basic
    @Column(name = "CGBON_ACT2_bonact2", nullable = true, length = 255)
    public String getCgbonAct2Bonact2() {
        return cgbonAct2Bonact2;
    }

    public void setCgbonAct2Bonact2(String cgbonAct2Bonact2) {
        this.cgbonAct2Bonact2 = cgbonAct2Bonact2;
    }

    @Basic
    @Column(name = "CGSPN_SEQ_sponsorSequenceNb", nullable = true)
    public Long getCgspnSeqSponsorSequenceNb() {
        return cgspnSeqSponsorSequenceNb;
    }

    public void setCgspnSeqSponsorSequenceNb(Long cgspnSeqSponsorSequenceNb) {
        this.cgspnSeqSponsorSequenceNb = cgspnSeqSponsorSequenceNb;
    }

    @Basic
    @Column(name = "CGPRSPNFLG_primarySpnFlag", nullable = true, length = 1)
    public String getCgprspnflgPrimarySpnFlag() {
        return cgprspnflgPrimarySpnFlag;
    }

    public void setCgprspnflgPrimarySpnFlag(String cgprspnflgPrimarySpnFlag) {
        this.cgprspnflgPrimarySpnFlag = cgprspnflgPrimarySpnFlag;
    }

    @Basic
    @Column(name = "CGSCOPE_scope", nullable = true, length = 15)
    public String getCgscopeScope() {
        return cgscopeScope;
    }

    public void setCgscopeScope(String cgscopeScope) {
        this.cgscopeScope = cgscopeScope;
    }

    @Basic
    @Column(name = "CGSTAMP_addorchangeStamp", nullable = true, length = 255)
    public String getCgstampAddorchangeStamp() {
        return cgstampAddorchangeStamp;
    }

    public void setCgstampAddorchangeStamp(String cgstampAddorchangeStamp) {
        this.cgstampAddorchangeStamp = cgstampAddorchangeStamp;
    }

    @Basic
    @Column(name = "CGDEL_deleteFlag", nullable = true, length = 1)
    public String getCgdelDeleteFlag() {
        return cgdelDeleteFlag;
    }

    public void setCgdelDeleteFlag(String cgdelDeleteFlag) {
        this.cgdelDeleteFlag = cgdelDeleteFlag;
    }

    @Basic
    @Column(name = "CGDXTSEQ_dxTransactionSequence", nullable = true)
    public Long getCgdxtseqDxTransactionSequence() {
        return cgdxtseqDxTransactionSequence;
    }

    public void setCgdxtseqDxTransactionSequence(Long cgdxtseqDxTransactionSequence) {
        this.cgdxtseqDxTransactionSequence = cgdxtseqDxTransactionSequence;
    }

    @Basic
    @Column(name = "CGSFDEL_salesForceDelete", nullable = true)
    public Long getCgsfdelSalesForceDelete() {
        return cgsfdelSalesForceDelete;
    }

    public void setCgsfdelSalesForceDelete(Long cgsfdelSalesForceDelete) {
        this.cgsfdelSalesForceDelete = cgsfdelSalesForceDelete;
    }

    @Basic
    @Column(name = "CGSFDELDAT_salesForceDeleteDate", nullable = true, length = 15)
    public String getCgsfdeldatSalesForceDeleteDate() {
        return cgsfdeldatSalesForceDeleteDate;
    }

    public void setCgsfdeldatSalesForceDeleteDate(String cgsfdeldatSalesForceDeleteDate) {
        this.cgsfdeldatSalesForceDeleteDate = cgsfdeldatSalesForceDeleteDate;
    }

    @Basic
    @Column(name = "CGSFDELTIM_salesForceDeleteTime", nullable = true, length = 15)
    public String getCgsfdeltimSalesForceDeleteTime() {
        return cgsfdeltimSalesForceDeleteTime;
    }

    public void setCgsfdeltimSalesForceDeleteTime(String cgsfdeltimSalesForceDeleteTime) {
        this.cgsfdeltimSalesForceDeleteTime = cgsfdeltimSalesForceDeleteTime;
    }

    @Basic
    @Column(name = "CGSFBLD_salesForceLoad", nullable = true)
    public Long getCgsfbldSalesForceLoad() {
        return cgsfbldSalesForceLoad;
    }

    public void setCgsfbldSalesForceLoad(Long cgsfbldSalesForceLoad) {
        this.cgsfbldSalesForceLoad = cgsfbldSalesForceLoad;
    }

    @Basic
    @Column(name = "CGSFBLDDAT_salesForceLoadDate", nullable = true, length = 15)
    public String getCgsfblddatSalesForceLoadDate() {
        return cgsfblddatSalesForceLoadDate;
    }

    public void setCgsfblddatSalesForceLoadDate(String cgsfblddatSalesForceLoadDate) {
        this.cgsfblddatSalesForceLoadDate = cgsfblddatSalesForceLoadDate;
    }

    @Basic
    @Column(name = "CGSFBLDTIM_salesForceLoadDate", nullable = true, length = 15)
    public String getCgsfbldtimSalesForceLoadDate() {
        return cgsfbldtimSalesForceLoadDate;
    }

    public void setCgsfbldtimSalesForceLoadDate(String cgsfbldtimSalesForceLoadDate) {
        this.cgsfbldtimSalesForceLoadDate = cgsfbldtimSalesForceLoadDate;
    }

    @Basic
    @Column(name = "CGSFCFM_salesForceConfirm", nullable = true)
    public Long getCgsfcfmSalesForceConfirm() {
        return cgsfcfmSalesForceConfirm;
    }

    public void setCgsfcfmSalesForceConfirm(Long cgsfcfmSalesForceConfirm) {
        this.cgsfcfmSalesForceConfirm = cgsfcfmSalesForceConfirm;
    }

    @Basic
    @Column(name = "CGSFCFMDAT_salesForceConfirmDate", nullable = true, length = 15)
    public String getCgsfcfmdatSalesForceConfirmDate() {
        return cgsfcfmdatSalesForceConfirmDate;
    }

    public void setCgsfcfmdatSalesForceConfirmDate(String cgsfcfmdatSalesForceConfirmDate) {
        this.cgsfcfmdatSalesForceConfirmDate = cgsfcfmdatSalesForceConfirmDate;
    }

    @Basic
    @Column(name = "CGSFCFMTIM_salesForceConfirmTime", nullable = true, length = 15)
    public String getCgsfcfmtimSalesForceConfirmTime() {
        return cgsfcfmtimSalesForceConfirmTime;
    }

    public void setCgsfcfmtimSalesForceConfirmTime(String cgsfcfmtimSalesForceConfirmTime) {
        this.cgsfcfmtimSalesForceConfirmTime = cgsfcfmtimSalesForceConfirmTime;
    }

    @Basic
    @Column(name = "CGISO_oprCompanyIso", nullable = true, length = 15)
    public String getCgisoOprCompanyIso() {
        return cgisoOprCompanyIso;
    }

    public void setCgisoOprCompanyIso(String cgisoOprCompanyIso) {
        this.cgisoOprCompanyIso = cgisoOprCompanyIso;
    }

    @Basic
    @Column(name = "CGCTL_controlNumber", nullable = true, length = 15)
    public String getCgctlControlNumber() {
        return cgctlControlNumber;
    }

    public void setCgctlControlNumber(String cgctlControlNumber) {
        this.cgctlControlNumber = cgctlControlNumber;
    }

    @Basic
    @Column(name = "CGDID1_distId", nullable = true, length = 255)
    public String getCgdid1DistId() {
        return cgdid1DistId;
    }

    public void setCgdid1DistId(String cgdid1DistId) {
        this.cgdid1DistId = cgdid1DistId;
    }

    @Basic
    @Column(name = "CGSPN_sponsorControl", nullable = true, length = 255)
    public String getCgspnSponsorControl() {
        return cgspnSponsorControl;
    }

    public void setCgspnSponsorControl(String cgspnSponsorControl) {
        this.cgspnSponsorControl = cgspnSponsorControl;
    }

    @Basic
    @Column(name = "CGSID1_sponsorId", nullable = true, length = 255)
    public String getCgsid1SponsorId() {
        return cgsid1SponsorId;
    }

    public void setCgsid1SponsorId(String cgsid1SponsorId) {
        this.cgsid1SponsorId = cgsid1SponsorId;
    }

    @Basic
    @Column(name = "CGSETD_sponsoredDate", nullable = true, length = 15)
    public String getCgsetdSponsoredDate() {
        return cgsetdSponsoredDate;
    }

    public void setCgsetdSponsoredDate(String cgsetdSponsoredDate) {
        this.cgsetdSponsoredDate = cgsetdSponsoredDate;
    }

    @Basic
    @Column(name = "CGSETU_setupUserid", nullable = true, length = 15)
    public String getCgsetuSetupUserid() {
        return cgsetuSetupUserid;
    }

    public void setCgsetuSetupUserid(String cgsetuSetupUserid) {
        this.cgsetuSetupUserid = cgsetuSetupUserid;
    }

    @Basic
    @Column(name = "CGCHGDAT_lastchgDate", nullable = true, length = 15)
    public String getCgchgdatLastchgDate() {
        return cgchgdatLastchgDate;
    }

    public void setCgchgdatLastchgDate(String cgchgdatLastchgDate) {
        this.cgchgdatLastchgDate = cgchgdatLastchgDate;
    }

    @Basic
    @Column(name = "CGCHGUSR_lastchgUserid", nullable = true, length = 15)
    public String getCgchgusrLastchgUserid() {
        return cgchgusrLastchgUserid;
    }

    public void setCgchgusrLastchgUserid(String cgchgusrLastchgUserid) {
        this.cgchgusrLastchgUserid = cgchgusrLastchgUserid;
    }

    @Basic
    @Column(name = "CGPYR_sponsoredPeriodYear", nullable = true)
    public Integer getCgpyrSponsoredPeriodYear() {
        return cgpyrSponsoredPeriodYear;
    }

    public void setCgpyrSponsoredPeriodYear(Integer cgpyrSponsoredPeriodYear) {
        this.cgpyrSponsoredPeriodYear = cgpyrSponsoredPeriodYear;
    }

    @Basic
    @Column(name = "CGPMO_sponsoredPeriodMonth", nullable = true)
    public Integer getCgpmoSponsoredPeriodMonth() {
        return cgpmoSponsoredPeriodMonth;
    }

    public void setCgpmoSponsoredPeriodMonth(Integer cgpmoSponsoredPeriodMonth) {
        this.cgpmoSponsoredPeriodMonth = cgpmoSponsoredPeriodMonth;
    }

    @Basic
    @Column(name = "CGFRDC_domesticorforeign", nullable = true, length = 1)
    public String getCgfrdcDomesticorforeign() {
        return cgfrdcDomesticorforeign;
    }

    public void setCgfrdcDomesticorforeign(String cgfrdcDomesticorforeign) {
        this.cgfrdcDomesticorforeign = cgfrdcDomesticorforeign;
    }

    @Basic
    @Column(name = "CGSTAS_status", nullable = true, length = 1)
    public String getCgstasStatus() {
        return cgstasStatus;
    }

    public void setCgstasStatus(String cgstasStatus) {
        this.cgstasStatus = cgstasStatus;
    }

    @Basic
    @Column(name = "CGTRFM_transferedMgrFlag", nullable = true, length = 1)
    public String getCgtrfmTransferedMgrFlag() {
        return cgtrfmTransferedMgrFlag;
    }

    public void setCgtrfmTransferedMgrFlag(String cgtrfmTransferedMgrFlag) {
        this.cgtrfmTransferedMgrFlag = cgtrfmTransferedMgrFlag;
    }

    @Basic
    @Column(name = "CGINHM_inheritedMgrFlag", nullable = true, length = 1)
    public String getCginhmInheritedMgrFlag() {
        return cginhmInheritedMgrFlag;
    }

    public void setCginhmInheritedMgrFlag(String cginhmInheritedMgrFlag) {
        this.cginhmInheritedMgrFlag = cginhmInheritedMgrFlag;
    }

    @Basic
    @Column(name = "CGDQMG_recognizedMgrFlag", nullable = true, length = 1)
    public String getCgdqmgRecognizedMgrFlag() {
        return cgdqmgRecognizedMgrFlag;
    }

    public void setCgdqmgRecognizedMgrFlag(String cgdqmgRecognizedMgrFlag) {
        this.cgdqmgRecognizedMgrFlag = cgdqmgRecognizedMgrFlag;
    }

    @Basic
    @Column(name = "CGLID_levelIndexId", nullable = true)
    public Integer getCglidLevelIndexId() {
        return cglidLevelIndexId;
    }

    public void setCglidLevelIndexId(Integer cglidLevelIndexId) {
        this.cglidLevelIndexId = cglidLevelIndexId;
    }

    @Basic
    @Column(name = "CGNBDST_nbrDistLvl", nullable = true)
    public Integer getCgnbdstNbrDistLvl() {
        return cgnbdstNbrDistLvl;
    }

    public void setCgnbdstNbrDistLvl(Integer cgnbdstNbrDistLvl) {
        this.cgnbdstNbrDistLvl = cgnbdstNbrDistLvl;
    }

    @Basic
    @Column(name = "CGNBAS_nbrAsstSupLvl", nullable = true)
    public Integer getCgnbasNbrAsstSupLvl() {
        return cgnbasNbrAsstSupLvl;
    }

    public void setCgnbasNbrAsstSupLvl(Integer cgnbasNbrAsstSupLvl) {
        this.cgnbasNbrAsstSupLvl = cgnbasNbrAsstSupLvl;
    }

    @Basic
    @Column(name = "CGNBSUP_nbrSupLvl", nullable = true)
    public Integer getCgnbsupNbrSupLvl() {
        return cgnbsupNbrSupLvl;
    }

    public void setCgnbsupNbrSupLvl(Integer cgnbsupNbrSupLvl) {
        this.cgnbsupNbrSupLvl = cgnbsupNbrSupLvl;
    }

    @Basic
    @Column(name = "CGNBASM_nbrAssMgrLvl", nullable = true)
    public Integer getCgnbasmNbrAssMgrLvl() {
        return cgnbasmNbrAssMgrLvl;
    }

    public void setCgnbasmNbrAssMgrLvl(Integer cgnbasmNbrAssMgrLvl) {
        this.cgnbasmNbrAssMgrLvl = cgnbasmNbrAssMgrLvl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CgcqupCountryQual that = (CgcqupCountryQual) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (cgnbumgNbrUnrecMgrLvl != null ? !cgnbumgNbrUnrecMgrLvl.equals(that.cgnbumgNbrUnrecMgrLvl) : that.cgnbumgNbrUnrecMgrLvl != null)
            return false;
        if (cgnbrmgNbrRecMgrLvl != null ? !cgnbrmgNbrRecMgrLvl.equals(that.cgnbrmgNbrRecMgrLvl) : that.cgnbrmgNbrRecMgrLvl != null)
            return false;
        if (cgnbimgNbrInhMgrLvl != null ? !cgnbimgNbrInhMgrLvl.equals(that.cgnbimgNbrInhMgrLvl) : that.cgnbimgNbrInhMgrLvl != null)
            return false;
        if (cgnbtmgNbrTrfMgrLvl != null ? !cgnbtmgNbrTrfMgrLvl.equals(that.cgnbtmgNbrTrfMgrLvl) : that.cgnbtmgNbrTrfMgrLvl != null)
            return false;
        if (cgcdteDistorspnChgDate != null ? !cgcdteDistorspnChgDate.equals(that.cgcdteDistorspnChgDate) : that.cgcdteDistorspnChgDate != null)
            return false;
        if (cgdidDisributortId != null ? !cgdidDisributortId.equals(that.cgdidDisributortId) : that.cgdidDisributortId != null)
            return false;
        if (cgsidSponId != null ? !cgsidSponId.equals(that.cgsidSponId) : that.cgsidSponId != null) return false;
        if (cgaraaDistAreaInOpCmpy != null ? !cgaraaDistAreaInOpCmpy.equals(that.cgaraaDistAreaInOpCmpy) : that.cgaraaDistAreaInOpCmpy != null)
            return false;
        if (cgfdsdtFirstDwlnSpnDate != null ? !cgfdsdtFirstDwlnSpnDate.equals(that.cgfdsdtFirstDwlnSpnDate) : that.cgfdsdtFirstDwlnSpnDate != null)
            return false;
        if (cgwsdatWholesaleDistDate != null ? !cgwsdatWholesaleDistDate.equals(that.cgwsdatWholesaleDistDate) : that.cgwsdatWholesaleDistDate != null)
            return false;
        if (cgndpfgNdpFlag != null ? !cgndpfgNdpFlag.equals(that.cgndpfgNdpFlag) : that.cgndpfgNdpFlag != null)
            return false;
        if (cgfpdtFirstPurchaseDate != null ? !cgfpdtFirstPurchaseDate.equals(that.cgfpdtFirstPurchaseDate) : that.cgfpdtFirstPurchaseDate != null)
            return false;
        if (cgnbsarmgrNb1StGenSpnActRqMgr != null ? !cgnbsarmgrNb1StGenSpnActRqMgr.equals(that.cgnbsarmgrNb1StGenSpnActRqMgr) : that.cgnbsarmgrNb1StGenSpnActRqMgr != null)
            return false;
        if (cgnbNomgrNbNameOnlyMgr != null ? !cgnbNomgrNbNameOnlyMgr.equals(that.cgnbNomgrNbNameOnlyMgr) : that.cgnbNomgrNbNameOnlyMgr != null)
            return false;
        if (cgpmtTypePaymttype != null ? !cgpmtTypePaymttype.equals(that.cgpmtTypePaymttype) : that.cgpmtTypePaymttype != null)
            return false;
        if (cgwebrecapWebrecap != null ? !cgwebrecapWebrecap.equals(that.cgwebrecapWebrecap) : that.cgwebrecapWebrecap != null)
            return false;
        if (cgnewsLtrNewsltr != null ? !cgnewsLtrNewsltr.equals(that.cgnewsLtrNewsltr) : that.cgnewsLtrNewsltr != null)
            return false;
        if (cgbonAct1Bonact1 != null ? !cgbonAct1Bonact1.equals(that.cgbonAct1Bonact1) : that.cgbonAct1Bonact1 != null)
            return false;
        if (cgbonAct2Bonact2 != null ? !cgbonAct2Bonact2.equals(that.cgbonAct2Bonact2) : that.cgbonAct2Bonact2 != null)
            return false;
        if (cgspnSeqSponsorSequenceNb != null ? !cgspnSeqSponsorSequenceNb.equals(that.cgspnSeqSponsorSequenceNb) : that.cgspnSeqSponsorSequenceNb != null)
            return false;
        if (cgprspnflgPrimarySpnFlag != null ? !cgprspnflgPrimarySpnFlag.equals(that.cgprspnflgPrimarySpnFlag) : that.cgprspnflgPrimarySpnFlag != null)
            return false;
        if (cgscopeScope != null ? !cgscopeScope.equals(that.cgscopeScope) : that.cgscopeScope != null) return false;
        if (cgstampAddorchangeStamp != null ? !cgstampAddorchangeStamp.equals(that.cgstampAddorchangeStamp) : that.cgstampAddorchangeStamp != null)
            return false;
        if (cgdelDeleteFlag != null ? !cgdelDeleteFlag.equals(that.cgdelDeleteFlag) : that.cgdelDeleteFlag != null)
            return false;
        if (cgdxtseqDxTransactionSequence != null ? !cgdxtseqDxTransactionSequence.equals(that.cgdxtseqDxTransactionSequence) : that.cgdxtseqDxTransactionSequence != null)
            return false;
        if (cgsfdelSalesForceDelete != null ? !cgsfdelSalesForceDelete.equals(that.cgsfdelSalesForceDelete) : that.cgsfdelSalesForceDelete != null)
            return false;
        if (cgsfdeldatSalesForceDeleteDate != null ? !cgsfdeldatSalesForceDeleteDate.equals(that.cgsfdeldatSalesForceDeleteDate) : that.cgsfdeldatSalesForceDeleteDate != null)
            return false;
        if (cgsfdeltimSalesForceDeleteTime != null ? !cgsfdeltimSalesForceDeleteTime.equals(that.cgsfdeltimSalesForceDeleteTime) : that.cgsfdeltimSalesForceDeleteTime != null)
            return false;
        if (cgsfbldSalesForceLoad != null ? !cgsfbldSalesForceLoad.equals(that.cgsfbldSalesForceLoad) : that.cgsfbldSalesForceLoad != null)
            return false;
        if (cgsfblddatSalesForceLoadDate != null ? !cgsfblddatSalesForceLoadDate.equals(that.cgsfblddatSalesForceLoadDate) : that.cgsfblddatSalesForceLoadDate != null)
            return false;
        if (cgsfbldtimSalesForceLoadDate != null ? !cgsfbldtimSalesForceLoadDate.equals(that.cgsfbldtimSalesForceLoadDate) : that.cgsfbldtimSalesForceLoadDate != null)
            return false;
        if (cgsfcfmSalesForceConfirm != null ? !cgsfcfmSalesForceConfirm.equals(that.cgsfcfmSalesForceConfirm) : that.cgsfcfmSalesForceConfirm != null)
            return false;
        if (cgsfcfmdatSalesForceConfirmDate != null ? !cgsfcfmdatSalesForceConfirmDate.equals(that.cgsfcfmdatSalesForceConfirmDate) : that.cgsfcfmdatSalesForceConfirmDate != null)
            return false;
        if (cgsfcfmtimSalesForceConfirmTime != null ? !cgsfcfmtimSalesForceConfirmTime.equals(that.cgsfcfmtimSalesForceConfirmTime) : that.cgsfcfmtimSalesForceConfirmTime != null)
            return false;
        if (cgisoOprCompanyIso != null ? !cgisoOprCompanyIso.equals(that.cgisoOprCompanyIso) : that.cgisoOprCompanyIso != null)
            return false;
        if (cgctlControlNumber != null ? !cgctlControlNumber.equals(that.cgctlControlNumber) : that.cgctlControlNumber != null)
            return false;
        if (cgdid1DistId != null ? !cgdid1DistId.equals(that.cgdid1DistId) : that.cgdid1DistId != null) return false;
        if (cgspnSponsorControl != null ? !cgspnSponsorControl.equals(that.cgspnSponsorControl) : that.cgspnSponsorControl != null)
            return false;
        if (cgsid1SponsorId != null ? !cgsid1SponsorId.equals(that.cgsid1SponsorId) : that.cgsid1SponsorId != null)
            return false;
        if (cgsetdSponsoredDate != null ? !cgsetdSponsoredDate.equals(that.cgsetdSponsoredDate) : that.cgsetdSponsoredDate != null)
            return false;
        if (cgsetuSetupUserid != null ? !cgsetuSetupUserid.equals(that.cgsetuSetupUserid) : that.cgsetuSetupUserid != null)
            return false;
        if (cgchgdatLastchgDate != null ? !cgchgdatLastchgDate.equals(that.cgchgdatLastchgDate) : that.cgchgdatLastchgDate != null)
            return false;
        if (cgchgusrLastchgUserid != null ? !cgchgusrLastchgUserid.equals(that.cgchgusrLastchgUserid) : that.cgchgusrLastchgUserid != null)
            return false;
        if (cgpyrSponsoredPeriodYear != null ? !cgpyrSponsoredPeriodYear.equals(that.cgpyrSponsoredPeriodYear) : that.cgpyrSponsoredPeriodYear != null)
            return false;
        if (cgpmoSponsoredPeriodMonth != null ? !cgpmoSponsoredPeriodMonth.equals(that.cgpmoSponsoredPeriodMonth) : that.cgpmoSponsoredPeriodMonth != null)
            return false;
        if (cgfrdcDomesticorforeign != null ? !cgfrdcDomesticorforeign.equals(that.cgfrdcDomesticorforeign) : that.cgfrdcDomesticorforeign != null)
            return false;
        if (cgstasStatus != null ? !cgstasStatus.equals(that.cgstasStatus) : that.cgstasStatus != null) return false;
        if (cgtrfmTransferedMgrFlag != null ? !cgtrfmTransferedMgrFlag.equals(that.cgtrfmTransferedMgrFlag) : that.cgtrfmTransferedMgrFlag != null)
            return false;
        if (cginhmInheritedMgrFlag != null ? !cginhmInheritedMgrFlag.equals(that.cginhmInheritedMgrFlag) : that.cginhmInheritedMgrFlag != null)
            return false;
        if (cgdqmgRecognizedMgrFlag != null ? !cgdqmgRecognizedMgrFlag.equals(that.cgdqmgRecognizedMgrFlag) : that.cgdqmgRecognizedMgrFlag != null)
            return false;
        if (cglidLevelIndexId != null ? !cglidLevelIndexId.equals(that.cglidLevelIndexId) : that.cglidLevelIndexId != null)
            return false;
        if (cgnbdstNbrDistLvl != null ? !cgnbdstNbrDistLvl.equals(that.cgnbdstNbrDistLvl) : that.cgnbdstNbrDistLvl != null)
            return false;
        if (cgnbasNbrAsstSupLvl != null ? !cgnbasNbrAsstSupLvl.equals(that.cgnbasNbrAsstSupLvl) : that.cgnbasNbrAsstSupLvl != null)
            return false;
        if (cgnbsupNbrSupLvl != null ? !cgnbsupNbrSupLvl.equals(that.cgnbsupNbrSupLvl) : that.cgnbsupNbrSupLvl != null)
            return false;
        if (cgnbasmNbrAssMgrLvl != null ? !cgnbasmNbrAssMgrLvl.equals(that.cgnbasmNbrAssMgrLvl) : that.cgnbasmNbrAssMgrLvl != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (cgnbumgNbrUnrecMgrLvl != null ? cgnbumgNbrUnrecMgrLvl.hashCode() : 0);
        result = 31 * result + (cgnbrmgNbrRecMgrLvl != null ? cgnbrmgNbrRecMgrLvl.hashCode() : 0);
        result = 31 * result + (cgnbimgNbrInhMgrLvl != null ? cgnbimgNbrInhMgrLvl.hashCode() : 0);
        result = 31 * result + (cgnbtmgNbrTrfMgrLvl != null ? cgnbtmgNbrTrfMgrLvl.hashCode() : 0);
        result = 31 * result + (cgcdteDistorspnChgDate != null ? cgcdteDistorspnChgDate.hashCode() : 0);
        result = 31 * result + (cgdidDisributortId != null ? cgdidDisributortId.hashCode() : 0);
        result = 31 * result + (cgsidSponId != null ? cgsidSponId.hashCode() : 0);
        result = 31 * result + (cgaraaDistAreaInOpCmpy != null ? cgaraaDistAreaInOpCmpy.hashCode() : 0);
        result = 31 * result + (cgfdsdtFirstDwlnSpnDate != null ? cgfdsdtFirstDwlnSpnDate.hashCode() : 0);
        result = 31 * result + (cgwsdatWholesaleDistDate != null ? cgwsdatWholesaleDistDate.hashCode() : 0);
        result = 31 * result + (cgndpfgNdpFlag != null ? cgndpfgNdpFlag.hashCode() : 0);
        result = 31 * result + (cgfpdtFirstPurchaseDate != null ? cgfpdtFirstPurchaseDate.hashCode() : 0);
        result = 31 * result + (cgnbsarmgrNb1StGenSpnActRqMgr != null ? cgnbsarmgrNb1StGenSpnActRqMgr.hashCode() : 0);
        result = 31 * result + (cgnbNomgrNbNameOnlyMgr != null ? cgnbNomgrNbNameOnlyMgr.hashCode() : 0);
        result = 31 * result + (cgpmtTypePaymttype != null ? cgpmtTypePaymttype.hashCode() : 0);
        result = 31 * result + (cgwebrecapWebrecap != null ? cgwebrecapWebrecap.hashCode() : 0);
        result = 31 * result + (cgnewsLtrNewsltr != null ? cgnewsLtrNewsltr.hashCode() : 0);
        result = 31 * result + (cgbonAct1Bonact1 != null ? cgbonAct1Bonact1.hashCode() : 0);
        result = 31 * result + (cgbonAct2Bonact2 != null ? cgbonAct2Bonact2.hashCode() : 0);
        result = 31 * result + (cgspnSeqSponsorSequenceNb != null ? cgspnSeqSponsorSequenceNb.hashCode() : 0);
        result = 31 * result + (cgprspnflgPrimarySpnFlag != null ? cgprspnflgPrimarySpnFlag.hashCode() : 0);
        result = 31 * result + (cgscopeScope != null ? cgscopeScope.hashCode() : 0);
        result = 31 * result + (cgstampAddorchangeStamp != null ? cgstampAddorchangeStamp.hashCode() : 0);
        result = 31 * result + (cgdelDeleteFlag != null ? cgdelDeleteFlag.hashCode() : 0);
        result = 31 * result + (cgdxtseqDxTransactionSequence != null ? cgdxtseqDxTransactionSequence.hashCode() : 0);
        result = 31 * result + (cgsfdelSalesForceDelete != null ? cgsfdelSalesForceDelete.hashCode() : 0);
        result = 31 * result + (cgsfdeldatSalesForceDeleteDate != null ? cgsfdeldatSalesForceDeleteDate.hashCode() : 0);
        result = 31 * result + (cgsfdeltimSalesForceDeleteTime != null ? cgsfdeltimSalesForceDeleteTime.hashCode() : 0);
        result = 31 * result + (cgsfbldSalesForceLoad != null ? cgsfbldSalesForceLoad.hashCode() : 0);
        result = 31 * result + (cgsfblddatSalesForceLoadDate != null ? cgsfblddatSalesForceLoadDate.hashCode() : 0);
        result = 31 * result + (cgsfbldtimSalesForceLoadDate != null ? cgsfbldtimSalesForceLoadDate.hashCode() : 0);
        result = 31 * result + (cgsfcfmSalesForceConfirm != null ? cgsfcfmSalesForceConfirm.hashCode() : 0);
        result = 31 * result + (cgsfcfmdatSalesForceConfirmDate != null ? cgsfcfmdatSalesForceConfirmDate.hashCode() : 0);
        result = 31 * result + (cgsfcfmtimSalesForceConfirmTime != null ? cgsfcfmtimSalesForceConfirmTime.hashCode() : 0);
        result = 31 * result + (cgisoOprCompanyIso != null ? cgisoOprCompanyIso.hashCode() : 0);
        result = 31 * result + (cgctlControlNumber != null ? cgctlControlNumber.hashCode() : 0);
        result = 31 * result + (cgdid1DistId != null ? cgdid1DistId.hashCode() : 0);
        result = 31 * result + (cgspnSponsorControl != null ? cgspnSponsorControl.hashCode() : 0);
        result = 31 * result + (cgsid1SponsorId != null ? cgsid1SponsorId.hashCode() : 0);
        result = 31 * result + (cgsetdSponsoredDate != null ? cgsetdSponsoredDate.hashCode() : 0);
        result = 31 * result + (cgsetuSetupUserid != null ? cgsetuSetupUserid.hashCode() : 0);
        result = 31 * result + (cgchgdatLastchgDate != null ? cgchgdatLastchgDate.hashCode() : 0);
        result = 31 * result + (cgchgusrLastchgUserid != null ? cgchgusrLastchgUserid.hashCode() : 0);
        result = 31 * result + (cgpyrSponsoredPeriodYear != null ? cgpyrSponsoredPeriodYear.hashCode() : 0);
        result = 31 * result + (cgpmoSponsoredPeriodMonth != null ? cgpmoSponsoredPeriodMonth.hashCode() : 0);
        result = 31 * result + (cgfrdcDomesticorforeign != null ? cgfrdcDomesticorforeign.hashCode() : 0);
        result = 31 * result + (cgstasStatus != null ? cgstasStatus.hashCode() : 0);
        result = 31 * result + (cgtrfmTransferedMgrFlag != null ? cgtrfmTransferedMgrFlag.hashCode() : 0);
        result = 31 * result + (cginhmInheritedMgrFlag != null ? cginhmInheritedMgrFlag.hashCode() : 0);
        result = 31 * result + (cgdqmgRecognizedMgrFlag != null ? cgdqmgRecognizedMgrFlag.hashCode() : 0);
        result = 31 * result + (cglidLevelIndexId != null ? cglidLevelIndexId.hashCode() : 0);
        result = 31 * result + (cgnbdstNbrDistLvl != null ? cgnbdstNbrDistLvl.hashCode() : 0);
        result = 31 * result + (cgnbasNbrAsstSupLvl != null ? cgnbasNbrAsstSupLvl.hashCode() : 0);
        result = 31 * result + (cgnbsupNbrSupLvl != null ? cgnbsupNbrSupLvl.hashCode() : 0);
        result = 31 * result + (cgnbasmNbrAssMgrLvl != null ? cgnbasmNbrAssMgrLvl.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"CgcqupCountryQual\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"cgnbumgNbrUnrecMgrLvl\":\"" + cgnbumgNbrUnrecMgrLvl + "\""
                + ",                         \"cgnbrmgNbrRecMgrLvl\":\"" + cgnbrmgNbrRecMgrLvl + "\""
                + ",                         \"cgnbimgNbrInhMgrLvl\":\"" + cgnbimgNbrInhMgrLvl + "\""
                + ",                         \"cgnbtmgNbrTrfMgrLvl\":\"" + cgnbtmgNbrTrfMgrLvl + "\""
                + ",                         \"cgcdteDistorspnChgDate\":\"" + cgcdteDistorspnChgDate + "\""
                + ",                         \"cgdidDisributortId\":\"" + cgdidDisributortId + "\""
                + ",                         \"cgsidSponId\":\"" + cgsidSponId + "\""
                + ",                         \"cgaraaDistAreaInOpCmpy\":\"" + cgaraaDistAreaInOpCmpy + "\""
                + ",                         \"cgfdsdtFirstDwlnSpnDate\":\"" + cgfdsdtFirstDwlnSpnDate + "\""
                + ",                         \"cgwsdatWholesaleDistDate\":\"" + cgwsdatWholesaleDistDate + "\""
                + ",                         \"cgndpfgNdpFlag\":\"" + cgndpfgNdpFlag + "\""
                + ",                         \"cgfpdtFirstPurchaseDate\":\"" + cgfpdtFirstPurchaseDate + "\""
                + ",                         \"cgnbsarmgrNb1StGenSpnActRqMgr\":\"" + cgnbsarmgrNb1StGenSpnActRqMgr + "\""
                + ",                         \"cgnbNomgrNbNameOnlyMgr\":\"" + cgnbNomgrNbNameOnlyMgr + "\""
                + ",                         \"cgpmtTypePaymttype\":\"" + cgpmtTypePaymttype + "\""
                + ",                         \"cgwebrecapWebrecap\":\"" + cgwebrecapWebrecap + "\""
                + ",                         \"cgnewsLtrNewsltr\":\"" + cgnewsLtrNewsltr + "\""
                + ",                         \"cgbonAct1Bonact1\":\"" + cgbonAct1Bonact1 + "\""
                + ",                         \"cgbonAct2Bonact2\":\"" + cgbonAct2Bonact2 + "\""
                + ",                         \"cgspnSeqSponsorSequenceNb\":\"" + cgspnSeqSponsorSequenceNb + "\""
                + ",                         \"cgprspnflgPrimarySpnFlag\":\"" + cgprspnflgPrimarySpnFlag + "\""
                + ",                         \"cgscopeScope\":\"" + cgscopeScope + "\""
                + ",                         \"cgstampAddorchangeStamp\":\"" + cgstampAddorchangeStamp + "\""
                + ",                         \"cgdelDeleteFlag\":\"" + cgdelDeleteFlag + "\""
                + ",                         \"cgdxtseqDxTransactionSequence\":\"" + cgdxtseqDxTransactionSequence + "\""
                + ",                         \"cgsfdelSalesForceDelete\":\"" + cgsfdelSalesForceDelete + "\""
                + ",                         \"cgsfdeldatSalesForceDeleteDate\":\"" + cgsfdeldatSalesForceDeleteDate + "\""
                + ",                         \"cgsfdeltimSalesForceDeleteTime\":\"" + cgsfdeltimSalesForceDeleteTime + "\""
                + ",                         \"cgsfbldSalesForceLoad\":\"" + cgsfbldSalesForceLoad + "\""
                + ",                         \"cgsfblddatSalesForceLoadDate\":\"" + cgsfblddatSalesForceLoadDate + "\""
                + ",                         \"cgsfbldtimSalesForceLoadDate\":\"" + cgsfbldtimSalesForceLoadDate + "\""
                + ",                         \"cgsfcfmSalesForceConfirm\":\"" + cgsfcfmSalesForceConfirm + "\""
                + ",                         \"cgsfcfmdatSalesForceConfirmDate\":\"" + cgsfcfmdatSalesForceConfirmDate + "\""
                + ",                         \"cgsfcfmtimSalesForceConfirmTime\":\"" + cgsfcfmtimSalesForceConfirmTime + "\""
                + ",                         \"cgisoOprCompanyIso\":\"" + cgisoOprCompanyIso + "\""
                + ",                         \"cgctlControlNumber\":\"" + cgctlControlNumber + "\""
                + ",                         \"cgdid1DistId\":\"" + cgdid1DistId + "\""
                + ",                         \"cgspnSponsorControl\":\"" + cgspnSponsorControl + "\""
                + ",                         \"cgsid1SponsorId\":\"" + cgsid1SponsorId + "\""
                + ",                         \"cgsetdSponsoredDate\":\"" + cgsetdSponsoredDate + "\""
                + ",                         \"cgsetuSetupUserid\":\"" + cgsetuSetupUserid + "\""
                + ",                         \"cgchgdatLastchgDate\":\"" + cgchgdatLastchgDate + "\""
                + ",                         \"cgchgusrLastchgUserid\":\"" + cgchgusrLastchgUserid + "\""
                + ",                         \"cgpyrSponsoredPeriodYear\":\"" + cgpyrSponsoredPeriodYear + "\""
                + ",                         \"cgpmoSponsoredPeriodMonth\":\"" + cgpmoSponsoredPeriodMonth + "\""
                + ",                         \"cgfrdcDomesticorforeign\":\"" + cgfrdcDomesticorforeign + "\""
                + ",                         \"cgstasStatus\":\"" + cgstasStatus + "\""
                + ",                         \"cgtrfmTransferedMgrFlag\":\"" + cgtrfmTransferedMgrFlag + "\""
                + ",                         \"cginhmInheritedMgrFlag\":\"" + cginhmInheritedMgrFlag + "\""
                + ",                         \"cgdqmgRecognizedMgrFlag\":\"" + cgdqmgRecognizedMgrFlag + "\""
                + ",                         \"cglidLevelIndexId\":\"" + cglidLevelIndexId + "\""
                + ",                         \"cgnbdstNbrDistLvl\":\"" + cgnbdstNbrDistLvl + "\""
                + ",                         \"cgnbasNbrAsstSupLvl\":\"" + cgnbasNbrAsstSupLvl + "\""
                + ",                         \"cgnbsupNbrSupLvl\":\"" + cgnbsupNbrSupLvl + "\""
                + ",                         \"cgnbasmNbrAssMgrLvl\":\"" + cgnbasmNbrAssMgrLvl + "\""
                + "}}";
    }
}
