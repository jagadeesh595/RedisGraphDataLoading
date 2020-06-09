package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@RedisHash("BOHSTP_BonusHistory")
public class BohstpBonusHistory implements Serializable {
    private  Long id;
    private @Indexed
    Long bhctlDistCtrl;
    private @Indexed Integer bhpyrYear;
    private @Indexed Integer bhpmoMonth;
    private @Indexed BigDecimal bhtamtTotBonAmt;
    private @Indexed BigDecimal bhtamt1PerDiscAmt;
    private @Indexed BigDecimal bhtamt2RetPerBonAmt;
    private @Indexed BigDecimal bhtamt3GrpBonAmt;
    private @Indexed BigDecimal bhpcasPerCasCre;
    private @Indexed BigDecimal bhdcasDistCasCre;
    private @Indexed BigDecimal bhtacsTotActCasCre;
    private @Indexed String bhactfActiveFlag;
    private @Indexed BigDecimal bhncasNonMgrCasCre;
    private @Indexed BigDecimal bhtccrTotCasCre;
    private @Indexed BigDecimal bhphycPhyCasCre;
    private @Indexed String bhcoidCompCode;
    private @Indexed String bhwaivVolWaiv;
    private @Indexed String bhldbwLbWaiv;
    private @Indexed String bhqumgLbQual;
    private @Indexed String bhpaypLbElig;
    private @Indexed BigDecimal bhpuccPushupCasCre;
    private @Indexed Integer bhlbmgLbMgrs;
    private @Indexed Integer bhblevBegLev;
    private @Indexed Integer bhelevEndLev;
    private @Indexed String bhdqmgRecMgr;
    private @Indexed Integer bhmgrlMgrLev;
    private @Indexed Integer bhgmlvGemLev;
    private @Indexed BigDecimal bhaytdTotBonAmtYtd;
    private @Indexed BigDecimal bhpytdPerCasCreYtd;
    private @Indexed BigDecimal bhdytdDistCasCreYtd;
    private @Indexed BigDecimal bhtaydTotActCasCreYtd;
    private @Indexed BigDecimal bhnytdNonMgrCasCreYtd;
    private @Indexed BigDecimal bhtytdTotCasCreYtd;
    private @Indexed BigDecimal bhhytdPhyCasCreYtd;
    private @Indexed Long bhchkCheckNum;
    private @Indexed BigDecimal bhadjnAdjNon1099;
    private @Indexed BigDecimal bhadjAdj1099;
    private @Indexed Long bhareaDistArea;
    private @Indexed Integer bh1GamFrtsGenActMgrs25Cc;
    private @Indexed BigDecimal bhnwccNewNonMgrCc;
    private @Indexed BigDecimal bhnwpsNewNmccPs;
    private @Indexed BigDecimal bhwytdNewNmccForPsYtd;

    public BohstpBonusHistory() {
    }

    public BohstpBonusHistory(Long bhctlDistCtrl, Integer bhpyrYear, Integer bhpmoMonth, BigDecimal bhtamtTotBonAmt, BigDecimal bhtamt1PerDiscAmt, BigDecimal bhtamt2RetPerBonAmt, BigDecimal bhtamt3GrpBonAmt, BigDecimal bhpcasPerCasCre, BigDecimal bhdcasDistCasCre, BigDecimal bhtacsTotActCasCre, String bhactfActiveFlag, BigDecimal bhncasNonMgrCasCre, BigDecimal bhtccrTotCasCre, BigDecimal bhphycPhyCasCre, String bhcoidCompCode, String bhwaivVolWaiv, String bhldbwLbWaiv, String bhqumgLbQual, String bhpaypLbElig, BigDecimal bhpuccPushupCasCre, Integer bhlbmgLbMgrs, Integer bhblevBegLev, Integer bhelevEndLev, String bhdqmgRecMgr, Integer bhmgrlMgrLev, Integer bhgmlvGemLev, BigDecimal bhaytdTotBonAmtYtd, BigDecimal bhpytdPerCasCreYtd, BigDecimal bhdytdDistCasCreYtd, BigDecimal bhtaydTotActCasCreYtd, BigDecimal bhnytdNonMgrCasCreYtd, BigDecimal bhtytdTotCasCreYtd, BigDecimal bhhytdPhyCasCreYtd, Long bhchkCheckNum, BigDecimal bhadjnAdjNon1099, BigDecimal bhadjAdj1099, Long bhareaDistArea, Integer bh1GamFrtsGenActMgrs25Cc, BigDecimal bhnwccNewNonMgrCc, BigDecimal bhnwpsNewNmccPs, BigDecimal bhwytdNewNmccForPsYtd) {
        this.bhctlDistCtrl = bhctlDistCtrl;
        this.bhpyrYear = bhpyrYear;
        this.bhpmoMonth = bhpmoMonth;
        this.bhtamtTotBonAmt = bhtamtTotBonAmt;
        this.bhtamt1PerDiscAmt = bhtamt1PerDiscAmt;
        this.bhtamt2RetPerBonAmt = bhtamt2RetPerBonAmt;
        this.bhtamt3GrpBonAmt = bhtamt3GrpBonAmt;
        this.bhpcasPerCasCre = bhpcasPerCasCre;
        this.bhdcasDistCasCre = bhdcasDistCasCre;
        this.bhtacsTotActCasCre = bhtacsTotActCasCre;
        this.bhactfActiveFlag = bhactfActiveFlag;
        this.bhncasNonMgrCasCre = bhncasNonMgrCasCre;
        this.bhtccrTotCasCre = bhtccrTotCasCre;
        this.bhphycPhyCasCre = bhphycPhyCasCre;
        this.bhcoidCompCode = bhcoidCompCode;
        this.bhwaivVolWaiv = bhwaivVolWaiv;
        this.bhldbwLbWaiv = bhldbwLbWaiv;
        this.bhqumgLbQual = bhqumgLbQual;
        this.bhpaypLbElig = bhpaypLbElig;
        this.bhpuccPushupCasCre = bhpuccPushupCasCre;
        this.bhlbmgLbMgrs = bhlbmgLbMgrs;
        this.bhblevBegLev = bhblevBegLev;
        this.bhelevEndLev = bhelevEndLev;
        this.bhdqmgRecMgr = bhdqmgRecMgr;
        this.bhmgrlMgrLev = bhmgrlMgrLev;
        this.bhgmlvGemLev = bhgmlvGemLev;
        this.bhaytdTotBonAmtYtd = bhaytdTotBonAmtYtd;
        this.bhpytdPerCasCreYtd = bhpytdPerCasCreYtd;
        this.bhdytdDistCasCreYtd = bhdytdDistCasCreYtd;
        this.bhtaydTotActCasCreYtd = bhtaydTotActCasCreYtd;
        this.bhnytdNonMgrCasCreYtd = bhnytdNonMgrCasCreYtd;
        this.bhtytdTotCasCreYtd = bhtytdTotCasCreYtd;
        this.bhhytdPhyCasCreYtd = bhhytdPhyCasCreYtd;
        this.bhchkCheckNum = bhchkCheckNum;
        this.bhadjnAdjNon1099 = bhadjnAdjNon1099;
        this.bhadjAdj1099 = bhadjAdj1099;
        this.bhareaDistArea = bhareaDistArea;
        this.bh1GamFrtsGenActMgrs25Cc = bh1GamFrtsGenActMgrs25Cc;
        this.bhnwccNewNonMgrCc = bhnwccNewNonMgrCc;
        this.bhnwpsNewNmccPs = bhnwpsNewNmccPs;
        this.bhwytdNewNmccForPsYtd = bhwytdNewNmccForPsYtd;
    }

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "BHCTL_DistCtrl", nullable = false)
    public Long getBhctlDistCtrl() {
        return bhctlDistCtrl;
    }

    public void setBhctlDistCtrl(Long bhctlDistCtrl) {
        this.bhctlDistCtrl = bhctlDistCtrl;
    }

    // @Basic
    // @Column(name = "BHPYR_Year", nullable = false)
    public Integer getBhpyrYear() {
        return bhpyrYear;
    }

    public void setBhpyrYear(Integer bhpyrYear) {
        this.bhpyrYear = bhpyrYear;
    }

    // @Basic
    // @Column(name = "BHPMO_Month", nullable = false)
    public Integer getBhpmoMonth() {
        return bhpmoMonth;
    }

    public void setBhpmoMonth(Integer bhpmoMonth) {
        this.bhpmoMonth = bhpmoMonth;
    }

    // @Basic
    // @Column(name = "BHTAMT_TotBonAmt", nullable = true, precision = 3)
    public BigDecimal getBhtamtTotBonAmt() {
        return bhtamtTotBonAmt;
    }

    public void setBhtamtTotBonAmt(BigDecimal bhtamtTotBonAmt) {
        this.bhtamtTotBonAmt = bhtamtTotBonAmt;
    }

    // @Basic
    // @Column(name = "BHTAMT1_PerDiscAmt", nullable = true, precision = 3)
    public BigDecimal getBhtamt1PerDiscAmt() {
        return bhtamt1PerDiscAmt;
    }

    public void setBhtamt1PerDiscAmt(BigDecimal bhtamt1PerDiscAmt) {
        this.bhtamt1PerDiscAmt = bhtamt1PerDiscAmt;
    }

    // @Basic
    // @Column(name = "BHTAMT2_RetPerBonAmt", nullable = true, precision = 3)
    public BigDecimal getBhtamt2RetPerBonAmt() {
        return bhtamt2RetPerBonAmt;
    }

    public void setBhtamt2RetPerBonAmt(BigDecimal bhtamt2RetPerBonAmt) {
        this.bhtamt2RetPerBonAmt = bhtamt2RetPerBonAmt;
    }

    // @Basic
    // @Column(name = "BHTAMT3_GrpBonAmt", nullable = true, precision = 3)
    public BigDecimal getBhtamt3GrpBonAmt() {
        return bhtamt3GrpBonAmt;
    }

    public void setBhtamt3GrpBonAmt(BigDecimal bhtamt3GrpBonAmt) {
        this.bhtamt3GrpBonAmt = bhtamt3GrpBonAmt;
    }

    // @Basic
    // @Column(name = "BHPCAS_PerCasCre", nullable = true, precision = 3)
    public BigDecimal getBhpcasPerCasCre() {
        return bhpcasPerCasCre;
    }

    public void setBhpcasPerCasCre(BigDecimal bhpcasPerCasCre) {
        this.bhpcasPerCasCre = bhpcasPerCasCre;
    }

    // @Basic
    // @Column(name = "BHDCAS_DistCasCre", nullable = true, precision = 3)
    public BigDecimal getBhdcasDistCasCre() {
        return bhdcasDistCasCre;
    }

    public void setBhdcasDistCasCre(BigDecimal bhdcasDistCasCre) {
        this.bhdcasDistCasCre = bhdcasDistCasCre;
    }

    // @Basic
    // @Column(name = "BHTACS_TotActCasCre", nullable = true, precision = 3)
    public BigDecimal getBhtacsTotActCasCre() {
        return bhtacsTotActCasCre;
    }

    public void setBhtacsTotActCasCre(BigDecimal bhtacsTotActCasCre) {
        this.bhtacsTotActCasCre = bhtacsTotActCasCre;
    }

    // @Basic
    // @Column(name = "BHACTF_ActiveFlag", nullable = true, length = 10)
    public String getBhactfActiveFlag() {
        return bhactfActiveFlag;
    }

    public void setBhactfActiveFlag(String bhactfActiveFlag) {
        this.bhactfActiveFlag = bhactfActiveFlag;
    }

    // @Basic
    // @Column(name = "BHNCAS_NonMgrCasCre", nullable = true, precision = 3)
    public BigDecimal getBhncasNonMgrCasCre() {
        return bhncasNonMgrCasCre;
    }

    public void setBhncasNonMgrCasCre(BigDecimal bhncasNonMgrCasCre) {
        this.bhncasNonMgrCasCre = bhncasNonMgrCasCre;
    }

    // @Basic
    // @Column(name = "BHTCCR_TotCasCre", nullable = true, precision = 3)
    public BigDecimal getBhtccrTotCasCre() {
        return bhtccrTotCasCre;
    }

    public void setBhtccrTotCasCre(BigDecimal bhtccrTotCasCre) {
        this.bhtccrTotCasCre = bhtccrTotCasCre;
    }

    // @Basic
    // @Column(name = "BHPHYC_PhyCasCre", nullable = true, precision = 3)
    public BigDecimal getBhphycPhyCasCre() {
        return bhphycPhyCasCre;
    }

    public void setBhphycPhyCasCre(BigDecimal bhphycPhyCasCre) {
        this.bhphycPhyCasCre = bhphycPhyCasCre;
    }

    // @Basic
    // @Column(name = "BHCOID_CompCode", nullable = true, length = 255)
    public String getBhcoidCompCode() {
        return bhcoidCompCode;
    }

    public void setBhcoidCompCode(String bhcoidCompCode) {
        this.bhcoidCompCode = bhcoidCompCode;
    }

    // @Basic
    // @Column(name = "BHWAIV_VolWaiv", nullable = true, length = 1)
    public String getBhwaivVolWaiv() {
        return bhwaivVolWaiv;
    }

    public void setBhwaivVolWaiv(String bhwaivVolWaiv) {
        this.bhwaivVolWaiv = bhwaivVolWaiv;
    }

    // @Basic
    // @Column(name = "BHLDBW_LBWaiv", nullable = true, length = 1)
    public String getBhldbwLbWaiv() {
        return bhldbwLbWaiv;
    }

    public void setBhldbwLbWaiv(String bhldbwLbWaiv) {
        this.bhldbwLbWaiv = bhldbwLbWaiv;
    }

    // @Basic
    // @Column(name = "BHQUMG_LBQual", nullable = true, length = 1)
    public String getBhqumgLbQual() {
        return bhqumgLbQual;
    }

    public void setBhqumgLbQual(String bhqumgLbQual) {
        this.bhqumgLbQual = bhqumgLbQual;
    }

    // @Basic
    // @Column(name = "BHPAYP_LBElig", nullable = true, length = 1)
    public String getBhpaypLbElig() {
        return bhpaypLbElig;
    }

    public void setBhpaypLbElig(String bhpaypLbElig) {
        this.bhpaypLbElig = bhpaypLbElig;
    }

    // @Basic
    // @Column(name = "BHPUCC_PushupCasCre", nullable = true, precision = 3)
    public BigDecimal getBhpuccPushupCasCre() {
        return bhpuccPushupCasCre;
    }

    public void setBhpuccPushupCasCre(BigDecimal bhpuccPushupCasCre) {
        this.bhpuccPushupCasCre = bhpuccPushupCasCre;
    }

    // @Basic
    // @Column(name = "BHLBMG_LBMgrs", nullable = true)
    public Integer getBhlbmgLbMgrs() {
        return bhlbmgLbMgrs;
    }

    public void setBhlbmgLbMgrs(Integer bhlbmgLbMgrs) {
        this.bhlbmgLbMgrs = bhlbmgLbMgrs;
    }

    // @Basic
    // @Column(name = "BHBLEV_BegLev", nullable = true)
    public Integer getBhblevBegLev() {
        return bhblevBegLev;
    }

    public void setBhblevBegLev(Integer bhblevBegLev) {
        this.bhblevBegLev = bhblevBegLev;
    }

    // @Basic
    // @Column(name = "BHELEV_EndLev", nullable = true)
    public Integer getBhelevEndLev() {
        return bhelevEndLev;
    }

    public void setBhelevEndLev(Integer bhelevEndLev) {
        this.bhelevEndLev = bhelevEndLev;
    }

    // @Basic
    // @Column(name = "BHDQMG_RecMgr", nullable = true, length = 1)
    public String getBhdqmgRecMgr() {
        return bhdqmgRecMgr;
    }

    public void setBhdqmgRecMgr(String bhdqmgRecMgr) {
        this.bhdqmgRecMgr = bhdqmgRecMgr;
    }

    // @Basic
    // @Column(name = "BHMGRL_MgrLev", nullable = true)
    public Integer getBhmgrlMgrLev() {
        return bhmgrlMgrLev;
    }

    public void setBhmgrlMgrLev(Integer bhmgrlMgrLev) {
        this.bhmgrlMgrLev = bhmgrlMgrLev;
    }

    // @Basic
    // @Column(name = "BHGMLV_GemLev", nullable = true)
    public Integer getBhgmlvGemLev() {
        return bhgmlvGemLev;
    }

    public void setBhgmlvGemLev(Integer bhgmlvGemLev) {
        this.bhgmlvGemLev = bhgmlvGemLev;
    }

    // @Basic
    // @Column(name = "BHAYTD_TotBonAmtYtd", nullable = true, precision = 3)
    public BigDecimal getBhaytdTotBonAmtYtd() {
        return bhaytdTotBonAmtYtd;
    }

    public void setBhaytdTotBonAmtYtd(BigDecimal bhaytdTotBonAmtYtd) {
        this.bhaytdTotBonAmtYtd = bhaytdTotBonAmtYtd;
    }

    // @Basic
    // @Column(name = "BHPYTD_PerCasCreYtd", nullable = true, precision = 3)
    public BigDecimal getBhpytdPerCasCreYtd() {
        return bhpytdPerCasCreYtd;
    }

    public void setBhpytdPerCasCreYtd(BigDecimal bhpytdPerCasCreYtd) {
        this.bhpytdPerCasCreYtd = bhpytdPerCasCreYtd;
    }

    // @Basic
    // @Column(name = "BHDYTD_DistCasCreYtd", nullable = true, precision = 3)
    public BigDecimal getBhdytdDistCasCreYtd() {
        return bhdytdDistCasCreYtd;
    }

    public void setBhdytdDistCasCreYtd(BigDecimal bhdytdDistCasCreYtd) {
        this.bhdytdDistCasCreYtd = bhdytdDistCasCreYtd;
    }

    // @Basic
    // @Column(name = "BHTAYD_TotActCasCreYtd", nullable = true, precision = 3)
    public BigDecimal getBhtaydTotActCasCreYtd() {
        return bhtaydTotActCasCreYtd;
    }

    public void setBhtaydTotActCasCreYtd(BigDecimal bhtaydTotActCasCreYtd) {
        this.bhtaydTotActCasCreYtd = bhtaydTotActCasCreYtd;
    }

    // @Basic
    // @Column(name = "BHNYTD_NonMgrCasCreYtd", nullable = true, precision = 3)
    public BigDecimal getBhnytdNonMgrCasCreYtd() {
        return bhnytdNonMgrCasCreYtd;
    }

    public void setBhnytdNonMgrCasCreYtd(BigDecimal bhnytdNonMgrCasCreYtd) {
        this.bhnytdNonMgrCasCreYtd = bhnytdNonMgrCasCreYtd;
    }

    // @Basic
    // @Column(name = "BHTYTD_TotCasCreYtd", nullable = true, precision = 3)
    public BigDecimal getBhtytdTotCasCreYtd() {
        return bhtytdTotCasCreYtd;
    }

    public void setBhtytdTotCasCreYtd(BigDecimal bhtytdTotCasCreYtd) {
        this.bhtytdTotCasCreYtd = bhtytdTotCasCreYtd;
    }

    // @Basic
    // @Column(name = "BHHYTD_PhyCasCreYtd", nullable = true, precision = 3)
    public BigDecimal getBhhytdPhyCasCreYtd() {
        return bhhytdPhyCasCreYtd;
    }

    public void setBhhytdPhyCasCreYtd(BigDecimal bhhytdPhyCasCreYtd) {
        this.bhhytdPhyCasCreYtd = bhhytdPhyCasCreYtd;
    }

    // @Basic
    // @Column(name = "BHCHK_CheckNum", nullable = true)
    public Long getBhchkCheckNum() {
        return bhchkCheckNum;
    }

    public void setBhchkCheckNum(Long bhchkCheckNum) {
        this.bhchkCheckNum = bhchkCheckNum;
    }

    // @Basic
    // @Column(name = "BHADJN_AdjNon1099", nullable = true, precision = 3)
    public BigDecimal getBhadjnAdjNon1099() {
        return bhadjnAdjNon1099;
    }

    public void setBhadjnAdjNon1099(BigDecimal bhadjnAdjNon1099) {
        this.bhadjnAdjNon1099 = bhadjnAdjNon1099;
    }

    // @Basic
    // @Column(name = "BHADJ_Adj1099", nullable = true, precision = 3)
    public BigDecimal getBhadjAdj1099() {
        return bhadjAdj1099;
    }

    public void setBhadjAdj1099(BigDecimal bhadjAdj1099) {
        this.bhadjAdj1099 = bhadjAdj1099;
    }

    // @Basic
    // @Column(name = "BHAREA_DistArea", nullable = true)
    public Long getBhareaDistArea() {
        return bhareaDistArea;
    }

    public void setBhareaDistArea(Long bhareaDistArea) {
        this.bhareaDistArea = bhareaDistArea;
    }

    // @Basic
    // @Column(name = "BH1GAM_FrtsGenActMgrs25cc", nullable = true)
    public Integer getBh1GamFrtsGenActMgrs25Cc() {
        return bh1GamFrtsGenActMgrs25Cc;
    }

    public void setBh1GamFrtsGenActMgrs25Cc(Integer bh1GamFrtsGenActMgrs25Cc) {
        this.bh1GamFrtsGenActMgrs25Cc = bh1GamFrtsGenActMgrs25Cc;
    }

    // @Basic
    // @Column(name = "BHNWCC_NewNonMgrCc", nullable = true, precision = 3)
    public BigDecimal getBhnwccNewNonMgrCc() {
        return bhnwccNewNonMgrCc;
    }

    public void setBhnwccNewNonMgrCc(BigDecimal bhnwccNewNonMgrCc) {
        this.bhnwccNewNonMgrCc = bhnwccNewNonMgrCc;
    }

    // @Basic
    // @Column(name = "BHNWPS_NewNMCCPs", nullable = true, precision = 3)
    public BigDecimal getBhnwpsNewNmccPs() {
        return bhnwpsNewNmccPs;
    }

    public void setBhnwpsNewNmccPs(BigDecimal bhnwpsNewNmccPs) {
        this.bhnwpsNewNmccPs = bhnwpsNewNmccPs;
    }

    // @Basic
    // @Column(name = "BHWYTD_NewNMCCForPsYtd", nullable = true, precision = 3)
    public BigDecimal getBhwytdNewNmccForPsYtd() {
        return bhwytdNewNmccForPsYtd;
    }

    public void setBhwytdNewNmccForPsYtd(BigDecimal bhwytdNewNmccForPsYtd) {
        this.bhwytdNewNmccForPsYtd = bhwytdNewNmccForPsYtd;
    }

    public BohstpBonusHistory copy() {
        BohstpBonusHistory b = new BohstpBonusHistory();
        b.bhctlDistCtrl = bhctlDistCtrl;
        b.bhpyrYear = bhpyrYear;
        b.bhpmoMonth = bhpmoMonth;
        b.bhtamtTotBonAmt = bhtamtTotBonAmt;
        b.bhtamt1PerDiscAmt = bhtamt1PerDiscAmt;
        b.bhtamt2RetPerBonAmt = bhtamt2RetPerBonAmt;
        b.bhtamt3GrpBonAmt = bhtamt3GrpBonAmt;
        b.bhpcasPerCasCre = bhpcasPerCasCre;
        b.bhdcasDistCasCre = bhdcasDistCasCre;
        b.bhtacsTotActCasCre = bhtacsTotActCasCre;
        b.bhactfActiveFlag = bhactfActiveFlag;
        b.bhncasNonMgrCasCre = bhncasNonMgrCasCre;
        b.bhtccrTotCasCre = bhtccrTotCasCre;
        b.bhphycPhyCasCre = bhphycPhyCasCre;
        b.bhcoidCompCode = bhcoidCompCode;
        b.bhwaivVolWaiv = bhwaivVolWaiv;
        b.bhldbwLbWaiv = bhldbwLbWaiv;
        b.bhqumgLbQual = bhqumgLbQual;
        b.bhpaypLbElig = bhpaypLbElig;
        b.bhpuccPushupCasCre = bhpuccPushupCasCre;
        b.bhlbmgLbMgrs = bhlbmgLbMgrs;
        b.bhblevBegLev = bhblevBegLev;
        b.bhelevEndLev = bhelevEndLev;
        b.bhdqmgRecMgr = bhdqmgRecMgr;
        b.bhmgrlMgrLev = bhmgrlMgrLev;
        b.bhgmlvGemLev = bhgmlvGemLev;
        b.bhaytdTotBonAmtYtd = bhaytdTotBonAmtYtd;
        b.bhpytdPerCasCreYtd = bhpytdPerCasCreYtd;
        b.bhdytdDistCasCreYtd = bhdytdDistCasCreYtd;
        b.bhtaydTotActCasCreYtd = bhtaydTotActCasCreYtd;
        b.bhnytdNonMgrCasCreYtd = bhnytdNonMgrCasCreYtd;
        b.bhtytdTotCasCreYtd = bhtytdTotCasCreYtd;
        b.bhhytdPhyCasCreYtd = bhhytdPhyCasCreYtd;
        b.bhchkCheckNum = bhchkCheckNum;
        b.bhadjnAdjNon1099 = bhadjnAdjNon1099;
        b.bhadjAdj1099 = bhadjAdj1099;
        b.bhareaDistArea = bhareaDistArea;
        b.bh1GamFrtsGenActMgrs25Cc = bh1GamFrtsGenActMgrs25Cc;
        b.bhnwccNewNonMgrCc = bhnwccNewNonMgrCc;
        b.bhnwpsNewNmccPs = bhnwpsNewNmccPs;
        b.bhwytdNewNmccForPsYtd = bhwytdNewNmccForPsYtd;

        return b;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BohstpBonusHistory that = (BohstpBonusHistory) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (bhctlDistCtrl != null ? !bhctlDistCtrl.equals(that.bhctlDistCtrl) : that.bhctlDistCtrl != null)
            return false;
        if (bhpyrYear != null ? !bhpyrYear.equals(that.bhpyrYear) : that.bhpyrYear != null) return false;
        if (bhpmoMonth != null ? !bhpmoMonth.equals(that.bhpmoMonth) : that.bhpmoMonth != null) return false;
        if (bhtamtTotBonAmt != null ? !bhtamtTotBonAmt.equals(that.bhtamtTotBonAmt) : that.bhtamtTotBonAmt != null)
            return false;
        if (bhtamt1PerDiscAmt != null ? !bhtamt1PerDiscAmt.equals(that.bhtamt1PerDiscAmt) : that.bhtamt1PerDiscAmt != null)
            return false;
        if (bhtamt2RetPerBonAmt != null ? !bhtamt2RetPerBonAmt.equals(that.bhtamt2RetPerBonAmt) : that.bhtamt2RetPerBonAmt != null)
            return false;
        if (bhtamt3GrpBonAmt != null ? !bhtamt3GrpBonAmt.equals(that.bhtamt3GrpBonAmt) : that.bhtamt3GrpBonAmt != null)
            return false;
        if (bhpcasPerCasCre != null ? !bhpcasPerCasCre.equals(that.bhpcasPerCasCre) : that.bhpcasPerCasCre != null)
            return false;
        if (bhdcasDistCasCre != null ? !bhdcasDistCasCre.equals(that.bhdcasDistCasCre) : that.bhdcasDistCasCre != null)
            return false;
        if (bhtacsTotActCasCre != null ? !bhtacsTotActCasCre.equals(that.bhtacsTotActCasCre) : that.bhtacsTotActCasCre != null)
            return false;
        if (bhactfActiveFlag != null ? !bhactfActiveFlag.equals(that.bhactfActiveFlag) : that.bhactfActiveFlag != null)
            return false;
        if (bhncasNonMgrCasCre != null ? !bhncasNonMgrCasCre.equals(that.bhncasNonMgrCasCre) : that.bhncasNonMgrCasCre != null)
            return false;
        if (bhtccrTotCasCre != null ? !bhtccrTotCasCre.equals(that.bhtccrTotCasCre) : that.bhtccrTotCasCre != null)
            return false;
        if (bhphycPhyCasCre != null ? !bhphycPhyCasCre.equals(that.bhphycPhyCasCre) : that.bhphycPhyCasCre != null)
            return false;
        if (bhcoidCompCode != null ? !bhcoidCompCode.equals(that.bhcoidCompCode) : that.bhcoidCompCode != null)
            return false;
        if (bhwaivVolWaiv != null ? !bhwaivVolWaiv.equals(that.bhwaivVolWaiv) : that.bhwaivVolWaiv != null)
            return false;
        if (bhldbwLbWaiv != null ? !bhldbwLbWaiv.equals(that.bhldbwLbWaiv) : that.bhldbwLbWaiv != null) return false;
        if (bhqumgLbQual != null ? !bhqumgLbQual.equals(that.bhqumgLbQual) : that.bhqumgLbQual != null) return false;
        if (bhpaypLbElig != null ? !bhpaypLbElig.equals(that.bhpaypLbElig) : that.bhpaypLbElig != null) return false;
        if (bhpuccPushupCasCre != null ? !bhpuccPushupCasCre.equals(that.bhpuccPushupCasCre) : that.bhpuccPushupCasCre != null)
            return false;
        if (bhlbmgLbMgrs != null ? !bhlbmgLbMgrs.equals(that.bhlbmgLbMgrs) : that.bhlbmgLbMgrs != null) return false;
        if (bhblevBegLev != null ? !bhblevBegLev.equals(that.bhblevBegLev) : that.bhblevBegLev != null) return false;
        if (bhelevEndLev != null ? !bhelevEndLev.equals(that.bhelevEndLev) : that.bhelevEndLev != null) return false;
        if (bhdqmgRecMgr != null ? !bhdqmgRecMgr.equals(that.bhdqmgRecMgr) : that.bhdqmgRecMgr != null) return false;
        if (bhmgrlMgrLev != null ? !bhmgrlMgrLev.equals(that.bhmgrlMgrLev) : that.bhmgrlMgrLev != null) return false;
        if (bhgmlvGemLev != null ? !bhgmlvGemLev.equals(that.bhgmlvGemLev) : that.bhgmlvGemLev != null) return false;
        if (bhaytdTotBonAmtYtd != null ? !bhaytdTotBonAmtYtd.equals(that.bhaytdTotBonAmtYtd) : that.bhaytdTotBonAmtYtd != null)
            return false;
        if (bhpytdPerCasCreYtd != null ? !bhpytdPerCasCreYtd.equals(that.bhpytdPerCasCreYtd) : that.bhpytdPerCasCreYtd != null)
            return false;
        if (bhdytdDistCasCreYtd != null ? !bhdytdDistCasCreYtd.equals(that.bhdytdDistCasCreYtd) : that.bhdytdDistCasCreYtd != null)
            return false;
        if (bhtaydTotActCasCreYtd != null ? !bhtaydTotActCasCreYtd.equals(that.bhtaydTotActCasCreYtd) : that.bhtaydTotActCasCreYtd != null)
            return false;
        if (bhnytdNonMgrCasCreYtd != null ? !bhnytdNonMgrCasCreYtd.equals(that.bhnytdNonMgrCasCreYtd) : that.bhnytdNonMgrCasCreYtd != null)
            return false;
        if (bhtytdTotCasCreYtd != null ? !bhtytdTotCasCreYtd.equals(that.bhtytdTotCasCreYtd) : that.bhtytdTotCasCreYtd != null)
            return false;
        if (bhhytdPhyCasCreYtd != null ? !bhhytdPhyCasCreYtd.equals(that.bhhytdPhyCasCreYtd) : that.bhhytdPhyCasCreYtd != null)
            return false;
        if (bhchkCheckNum != null ? !bhchkCheckNum.equals(that.bhchkCheckNum) : that.bhchkCheckNum != null)
            return false;
        if (bhadjnAdjNon1099 != null ? !bhadjnAdjNon1099.equals(that.bhadjnAdjNon1099) : that.bhadjnAdjNon1099 != null)
            return false;
        if (bhadjAdj1099 != null ? !bhadjAdj1099.equals(that.bhadjAdj1099) : that.bhadjAdj1099 != null) return false;
        if (bhareaDistArea != null ? !bhareaDistArea.equals(that.bhareaDistArea) : that.bhareaDistArea != null)
            return false;
        if (bh1GamFrtsGenActMgrs25Cc != null ? !bh1GamFrtsGenActMgrs25Cc.equals(that.bh1GamFrtsGenActMgrs25Cc) : that.bh1GamFrtsGenActMgrs25Cc != null)
            return false;
        if (bhnwccNewNonMgrCc != null ? !bhnwccNewNonMgrCc.equals(that.bhnwccNewNonMgrCc) : that.bhnwccNewNonMgrCc != null)
            return false;
        if (bhnwpsNewNmccPs != null ? !bhnwpsNewNmccPs.equals(that.bhnwpsNewNmccPs) : that.bhnwpsNewNmccPs != null)
            return false;
        if (bhwytdNewNmccForPsYtd != null ? !bhwytdNewNmccForPsYtd.equals(that.bhwytdNewNmccForPsYtd) : that.bhwytdNewNmccForPsYtd != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (bhctlDistCtrl != null ? bhctlDistCtrl.hashCode() : 0);
        result = 31 * result + (bhpyrYear != null ? bhpyrYear.hashCode() : 0);
        result = 31 * result + (bhpmoMonth != null ? bhpmoMonth.hashCode() : 0);
        result = 31 * result + (bhtamtTotBonAmt != null ? bhtamtTotBonAmt.hashCode() : 0);
        result = 31 * result + (bhtamt1PerDiscAmt != null ? bhtamt1PerDiscAmt.hashCode() : 0);
        result = 31 * result + (bhtamt2RetPerBonAmt != null ? bhtamt2RetPerBonAmt.hashCode() : 0);
        result = 31 * result + (bhtamt3GrpBonAmt != null ? bhtamt3GrpBonAmt.hashCode() : 0);
        result = 31 * result + (bhpcasPerCasCre != null ? bhpcasPerCasCre.hashCode() : 0);
        result = 31 * result + (bhdcasDistCasCre != null ? bhdcasDistCasCre.hashCode() : 0);
        result = 31 * result + (bhtacsTotActCasCre != null ? bhtacsTotActCasCre.hashCode() : 0);
        result = 31 * result + (bhactfActiveFlag != null ? bhactfActiveFlag.hashCode() : 0);
        result = 31 * result + (bhncasNonMgrCasCre != null ? bhncasNonMgrCasCre.hashCode() : 0);
        result = 31 * result + (bhtccrTotCasCre != null ? bhtccrTotCasCre.hashCode() : 0);
        result = 31 * result + (bhphycPhyCasCre != null ? bhphycPhyCasCre.hashCode() : 0);
        result = 31 * result + (bhcoidCompCode != null ? bhcoidCompCode.hashCode() : 0);
        result = 31 * result + (bhwaivVolWaiv != null ? bhwaivVolWaiv.hashCode() : 0);
        result = 31 * result + (bhldbwLbWaiv != null ? bhldbwLbWaiv.hashCode() : 0);
        result = 31 * result + (bhqumgLbQual != null ? bhqumgLbQual.hashCode() : 0);
        result = 31 * result + (bhpaypLbElig != null ? bhpaypLbElig.hashCode() : 0);
        result = 31 * result + (bhpuccPushupCasCre != null ? bhpuccPushupCasCre.hashCode() : 0);
        result = 31 * result + (bhlbmgLbMgrs != null ? bhlbmgLbMgrs.hashCode() : 0);
        result = 31 * result + (bhblevBegLev != null ? bhblevBegLev.hashCode() : 0);
        result = 31 * result + (bhelevEndLev != null ? bhelevEndLev.hashCode() : 0);
        result = 31 * result + (bhdqmgRecMgr != null ? bhdqmgRecMgr.hashCode() : 0);
        result = 31 * result + (bhmgrlMgrLev != null ? bhmgrlMgrLev.hashCode() : 0);
        result = 31 * result + (bhgmlvGemLev != null ? bhgmlvGemLev.hashCode() : 0);
        result = 31 * result + (bhaytdTotBonAmtYtd != null ? bhaytdTotBonAmtYtd.hashCode() : 0);
        result = 31 * result + (bhpytdPerCasCreYtd != null ? bhpytdPerCasCreYtd.hashCode() : 0);
        result = 31 * result + (bhdytdDistCasCreYtd != null ? bhdytdDistCasCreYtd.hashCode() : 0);
        result = 31 * result + (bhtaydTotActCasCreYtd != null ? bhtaydTotActCasCreYtd.hashCode() : 0);
        result = 31 * result + (bhnytdNonMgrCasCreYtd != null ? bhnytdNonMgrCasCreYtd.hashCode() : 0);
        result = 31 * result + (bhtytdTotCasCreYtd != null ? bhtytdTotCasCreYtd.hashCode() : 0);
        result = 31 * result + (bhhytdPhyCasCreYtd != null ? bhhytdPhyCasCreYtd.hashCode() : 0);
        result = 31 * result + (bhchkCheckNum != null ? bhchkCheckNum.hashCode() : 0);
        result = 31 * result + (bhadjnAdjNon1099 != null ? bhadjnAdjNon1099.hashCode() : 0);
        result = 31 * result + (bhadjAdj1099 != null ? bhadjAdj1099.hashCode() : 0);
        result = 31 * result + (bhareaDistArea != null ? bhareaDistArea.hashCode() : 0);
        result = 31 * result + (bh1GamFrtsGenActMgrs25Cc != null ? bh1GamFrtsGenActMgrs25Cc.hashCode() : 0);
        result = 31 * result + (bhnwccNewNonMgrCc != null ? bhnwccNewNonMgrCc.hashCode() : 0);
        result = 31 * result + (bhnwpsNewNmccPs != null ? bhnwpsNewNmccPs.hashCode() : 0);
        result = 31 * result + (bhwytdNewNmccForPsYtd != null ? bhwytdNewNmccForPsYtd.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"BohstpBonusHistory\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"bhctlDistCtrl\":\"" + bhctlDistCtrl + "\""
                + ",                         \"bhpyrYear\":\"" + bhpyrYear + "\""
                + ",                         \"bhpmoMonth\":\"" + bhpmoMonth + "\""
                + ",                         \"bhtamtTotBonAmt\":\"" + bhtamtTotBonAmt + "\""
                + ",                         \"bhtamt1PerDiscAmt\":\"" + bhtamt1PerDiscAmt + "\""
                + ",                         \"bhtamt2RetPerBonAmt\":\"" + bhtamt2RetPerBonAmt + "\""
                + ",                         \"bhtamt3GrpBonAmt\":\"" + bhtamt3GrpBonAmt + "\""
                + ",                         \"bhpcasPerCasCre\":\"" + bhpcasPerCasCre + "\""
                + ",                         \"bhdcasDistCasCre\":\"" + bhdcasDistCasCre + "\""
                + ",                         \"bhtacsTotActCasCre\":\"" + bhtacsTotActCasCre + "\""
                + ",                         \"bhactfActiveFlag\":\"" + bhactfActiveFlag + "\""
                + ",                         \"bhncasNonMgrCasCre\":\"" + bhncasNonMgrCasCre + "\""
                + ",                         \"bhtccrTotCasCre\":\"" + bhtccrTotCasCre + "\""
                + ",                         \"bhphycPhyCasCre\":\"" + bhphycPhyCasCre + "\""
                + ",                         \"bhcoidCompCode\":\"" + bhcoidCompCode + "\""
                + ",                         \"bhwaivVolWaiv\":\"" + bhwaivVolWaiv + "\""
                + ",                         \"bhldbwLbWaiv\":\"" + bhldbwLbWaiv + "\""
                + ",                         \"bhqumgLbQual\":\"" + bhqumgLbQual + "\""
                + ",                         \"bhpaypLbElig\":\"" + bhpaypLbElig + "\""
                + ",                         \"bhpuccPushupCasCre\":\"" + bhpuccPushupCasCre + "\""
                + ",                         \"bhlbmgLbMgrs\":\"" + bhlbmgLbMgrs + "\""
                + ",                         \"bhblevBegLev\":\"" + bhblevBegLev + "\""
                + ",                         \"bhelevEndLev\":\"" + bhelevEndLev + "\""
                + ",                         \"bhdqmgRecMgr\":\"" + bhdqmgRecMgr + "\""
                + ",                         \"bhmgrlMgrLev\":\"" + bhmgrlMgrLev + "\""
                + ",                         \"bhgmlvGemLev\":\"" + bhgmlvGemLev + "\""
                + ",                         \"bhaytdTotBonAmtYtd\":\"" + bhaytdTotBonAmtYtd + "\""
                + ",                         \"bhpytdPerCasCreYtd\":\"" + bhpytdPerCasCreYtd + "\""
                + ",                         \"bhdytdDistCasCreYtd\":\"" + bhdytdDistCasCreYtd + "\""
                + ",                         \"bhtaydTotActCasCreYtd\":\"" + bhtaydTotActCasCreYtd + "\""
                + ",                         \"bhnytdNonMgrCasCreYtd\":\"" + bhnytdNonMgrCasCreYtd + "\""
                + ",                         \"bhtytdTotCasCreYtd\":\"" + bhtytdTotCasCreYtd + "\""
                + ",                         \"bhhytdPhyCasCreYtd\":\"" + bhhytdPhyCasCreYtd + "\""
                + ",                         \"bhchkCheckNum\":\"" + bhchkCheckNum + "\""
                + ",                         \"bhadjnAdjNon1099\":\"" + bhadjnAdjNon1099 + "\""
                + ",                         \"bhadjAdj1099\":\"" + bhadjAdj1099 + "\""
                + ",                         \"bhareaDistArea\":\"" + bhareaDistArea + "\""
                + ",                         \"bh1GamFrtsGenActMgrs25Cc\":\"" + bh1GamFrtsGenActMgrs25Cc + "\""
                + ",                         \"bhnwccNewNonMgrCc\":\"" + bhnwccNewNonMgrCc + "\""
                + ",                         \"bhnwpsNewNmccPs\":\"" + bhnwpsNewNmccPs + "\""
                + ",                         \"bhwytdNewNmccForPsYtd\":\"" + bhwytdNewNmccForPsYtd + "\""
                + "}}";
    }
}
