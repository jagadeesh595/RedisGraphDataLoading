package com.ns.dataloading.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by rpalamakula on 16-08-2017.
 */
@Entity
@Table(name = "BOMSTP_BonusMaster")
public class BomstpBonusMaster {
    private Long id;
    private String bmcoidCompanyId;
    private Long bmctlDistCtrl;
    private Long bmctycCntryCode;
    private Long bmdidDistId;
    private Long bmspnSponsorCtrl;
    private BigDecimal bmpcasPerCasCre;
    private BigDecimal bmdcasDistCasCre;
    private BigDecimal bmtacsTotActCasCre;
    private String bmactfActiveFlag;
    private String bmwaiv4CcWaiver;
    private BigDecimal bmncasNonMgrCasCre;
    private BigDecimal bmtccrTotCasCre;
    private BigDecimal bmlmccLastMnthCasCre;
    private BigDecimal bmphycPhyCasCre;
    private Integer bmblevBegLev;
    private Integer bmelevEndLev;
    private Integer bmmgrlMgrLev;
    private Integer bmgmlvGemLev;
    private String bmqumgLbQual;
    private String bmdqmgRecMgr;
    private String bmfrdcForirgnDom;
    private String bmwk1CGrandFatherFlag;
    private String bmstasStatus;
    private Integer bmldrpLdrshipMgrs;
    private Integer bm1Gam1StGenActMgrWith25Cc;
    private Long bmareaDistArea;
    private BigDecimal bmpuccPushUpCasCre;
    private BigDecimal bmtamtTotBonAmt;
    private BigDecimal bmtamt1PerDiscAmt;
    private BigDecimal bmtamt2RetPerBonAmt;
    private BigDecimal bmtamt3GrpBonAmt;
    private BigDecimal bmadjAdjAmt1099;
    private BigDecimal bmadjnNonAdjAmt1099;
    private Long bmchkCheckNum;
    private String bmmovuMoveUporReQualFlag;
    private String bmtrfmTransferredMgr;
    private String bminhmInheritedMgr;
    private Integer bmamgrActiveMgrs;
    private Integer bmtmgrTotMgrs;
    private String bmwh20Wh20Per;
    private String bmwh30Wh30Per;
    private Integer bmldrcLdrshipMgrs;
    private Long bmordMoveUpReQualOrderNum;
    private String bmordtMovUporReQualOrdDate;
    private BigDecimal bmpmtdPerCasCreMtd;
    private BigDecimal bmnwccNewNonMgrCc;
    private BigDecimal bmnwpsNewNonMgrCcForPs;
    private String memberFile;

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
    @Column(name = "BMCOID_CompanyId", nullable = true, length = 255)
    public String getBmcoidCompanyId() {
        return bmcoidCompanyId;
    }

    public void setBmcoidCompanyId(String bmcoidCompanyId) {
        this.bmcoidCompanyId = bmcoidCompanyId;
    }

    @Basic
    @Column(name = "BMCTL_DistCtrl", nullable = false)
    public Long getBmctlDistCtrl() {
        return bmctlDistCtrl;
    }

    public void setBmctlDistCtrl(Long bmctlDistCtrl) {
        this.bmctlDistCtrl = bmctlDistCtrl;
    }

    @Basic
    @Column(name = "BMCTYC_CntryCode", nullable = true)
    public Long getBmctycCntryCode() {
        return bmctycCntryCode;
    }

    public void setBmctycCntryCode(Long bmctycCntryCode) {
        this.bmctycCntryCode = bmctycCntryCode;
    }

    @Basic
    @Column(name = "BMDID_DistId", nullable = true)
    public Long getBmdidDistId() {
        return bmdidDistId;
    }

    public void setBmdidDistId(Long bmdidDistId) {
        this.bmdidDistId = bmdidDistId;
    }

    @Basic
    @Column(name = "BMSPN_SponsorCtrl", nullable = false)
    public Long getBmspnSponsorCtrl() {
        return bmspnSponsorCtrl;
    }

    public void setBmspnSponsorCtrl(Long bmspnSponsorCtrl) {
        this.bmspnSponsorCtrl = bmspnSponsorCtrl;
    }

    @Basic
    @Column(name = "BMPCAS_PerCasCre", nullable = true, precision = 3)
    public BigDecimal getBmpcasPerCasCre() {
        return bmpcasPerCasCre;
    }

    public void setBmpcasPerCasCre(BigDecimal bmpcasPerCasCre) {
        this.bmpcasPerCasCre = bmpcasPerCasCre;
    }

    @Basic
    @Column(name = "BMDCAS_DistCasCre", nullable = true, precision = 3)
    public BigDecimal getBmdcasDistCasCre() {
        return bmdcasDistCasCre;
    }

    public void setBmdcasDistCasCre(BigDecimal bmdcasDistCasCre) {
        this.bmdcasDistCasCre = bmdcasDistCasCre;
    }

    @Basic
    @Column(name = "BMTACS_TotActCasCre", nullable = true, precision = 3)
    public BigDecimal getBmtacsTotActCasCre() {
        return bmtacsTotActCasCre;
    }

    public void setBmtacsTotActCasCre(BigDecimal bmtacsTotActCasCre) {
        this.bmtacsTotActCasCre = bmtacsTotActCasCre;
    }

    @Basic
    @Column(name = "BMACTF_ActiveFlag", nullable = true, length = 1)
    public String getBmactfActiveFlag() {
        return bmactfActiveFlag;
    }

    public void setBmactfActiveFlag(String bmactfActiveFlag) {
        this.bmactfActiveFlag = bmactfActiveFlag;
    }

    @Basic
    @Column(name = "BMWAIV_4ccWaiver", nullable = true, length = 1)
    public String getBmwaiv4CcWaiver() {
        return bmwaiv4CcWaiver;
    }

    public void setBmwaiv4CcWaiver(String bmwaiv4CcWaiver) {
        this.bmwaiv4CcWaiver = bmwaiv4CcWaiver;
    }

    @Basic
    @Column(name = "BMNCAS_NonMgrCasCre", nullable = true, precision = 3)
    public BigDecimal getBmncasNonMgrCasCre() {
        return bmncasNonMgrCasCre;
    }

    public void setBmncasNonMgrCasCre(BigDecimal bmncasNonMgrCasCre) {
        this.bmncasNonMgrCasCre = bmncasNonMgrCasCre;
    }

    @Basic
    @Column(name = "BMTCCR_TotCasCre", nullable = false, precision = 3)
    public BigDecimal getBmtccrTotCasCre() {
        return bmtccrTotCasCre;
    }

    public void setBmtccrTotCasCre(BigDecimal bmtccrTotCasCre) {
        this.bmtccrTotCasCre = bmtccrTotCasCre;
    }

    @Basic
    @Column(name = "BMLMCC_LastMnthCasCre", nullable = false, precision = 3)
    public BigDecimal getBmlmccLastMnthCasCre() {
        return bmlmccLastMnthCasCre;
    }

    public void setBmlmccLastMnthCasCre(BigDecimal bmlmccLastMnthCasCre) {
        this.bmlmccLastMnthCasCre = bmlmccLastMnthCasCre;
    }

    @Basic
    @Column(name = "BMPHYC_PhyCasCre", nullable = false, precision = 3)
    public BigDecimal getBmphycPhyCasCre() {
        return bmphycPhyCasCre;
    }

    public void setBmphycPhyCasCre(BigDecimal bmphycPhyCasCre) {
        this.bmphycPhyCasCre = bmphycPhyCasCre;
    }

    @Basic
    @Column(name = "BMBLEV_BegLev", nullable = false)
    public Integer getBmblevBegLev() {
        return bmblevBegLev;
    }

    public void setBmblevBegLev(Integer bmblevBegLev) {
        this.bmblevBegLev = bmblevBegLev;
    }

    @Basic
    @Column(name = "BMELEV_EndLev", nullable = false)
    public Integer getBmelevEndLev() {
        return bmelevEndLev;
    }

    public void setBmelevEndLev(Integer bmelevEndLev) {
        this.bmelevEndLev = bmelevEndLev;
    }

    @Basic
    @Column(name = "BMMGRL_MgrLev", nullable = false)
    public Integer getBmmgrlMgrLev() {
        return bmmgrlMgrLev;
    }

    public void setBmmgrlMgrLev(Integer bmmgrlMgrLev) {
        this.bmmgrlMgrLev = bmmgrlMgrLev;
    }

    @Basic
    @Column(name = "BMGMLV_GemLev", nullable = false)
    public Integer getBmgmlvGemLev() {
        return bmgmlvGemLev;
    }

    public void setBmgmlvGemLev(Integer bmgmlvGemLev) {
        this.bmgmlvGemLev = bmgmlvGemLev;
    }

    @Basic
    @Column(name = "BMQUMG_LBQual", nullable = true, length = 1)
    public String getBmqumgLbQual() {
        return bmqumgLbQual;
    }

    public void setBmqumgLbQual(String bmqumgLbQual) {
        this.bmqumgLbQual = bmqumgLbQual;
    }

    @Basic
    @Column(name = "BMDQMG_RecMgr", nullable = true, length = 1)
    public String getBmdqmgRecMgr() {
        return bmdqmgRecMgr;
    }

    public void setBmdqmgRecMgr(String bmdqmgRecMgr) {
        this.bmdqmgRecMgr = bmdqmgRecMgr;
    }

    @Basic
    @Column(name = "BMFRDC_ForirgnDom", nullable = true, length = 1)
    public String getBmfrdcForirgnDom() {
        return bmfrdcForirgnDom;
    }

    public void setBmfrdcForirgnDom(String bmfrdcForirgnDom) {
        this.bmfrdcForirgnDom = bmfrdcForirgnDom;
    }

    @Basic
    @Column(name = "BMWK1C_GrandFatherFlag", nullable = true, length = 1)
    public String getBmwk1CGrandFatherFlag() {
        return bmwk1CGrandFatherFlag;
    }

    public void setBmwk1CGrandFatherFlag(String bmwk1CGrandFatherFlag) {
        this.bmwk1CGrandFatherFlag = bmwk1CGrandFatherFlag;
    }

    @Basic
    @Column(name = "BMSTAS_Status", nullable = true, length = 1)
    public String getBmstasStatus() {
        return bmstasStatus;
    }

    public void setBmstasStatus(String bmstasStatus) {
        this.bmstasStatus = bmstasStatus;
    }

    @Basic
    @Column(name = "BMLDRP_LdrshipMgrs", nullable = true)
    public Integer getBmldrpLdrshipMgrs() {
        return bmldrpLdrshipMgrs;
    }

    public void setBmldrpLdrshipMgrs(Integer bmldrpLdrshipMgrs) {
        this.bmldrpLdrshipMgrs = bmldrpLdrshipMgrs;
    }

    @Basic
    @Column(name = "BM1GAM_1stGenActMgrWith25cc", nullable = true)
    public Integer getBm1Gam1StGenActMgrWith25Cc() {
        return bm1Gam1StGenActMgrWith25Cc;
    }

    public void setBm1Gam1StGenActMgrWith25Cc(Integer bm1Gam1StGenActMgrWith25Cc) {
        this.bm1Gam1StGenActMgrWith25Cc = bm1Gam1StGenActMgrWith25Cc;
    }

    @Basic
    @Column(name = "BMAREA_DistArea", nullable = true)
    public Long getBmareaDistArea() {
        return bmareaDistArea;
    }

    public void setBmareaDistArea(Long bmareaDistArea) {
        this.bmareaDistArea = bmareaDistArea;
    }

    @Basic
    @Column(name = "BMPUCC_PushUpCasCre", nullable = true, precision = 3)
    public BigDecimal getBmpuccPushUpCasCre() {
        return bmpuccPushUpCasCre;
    }

    public void setBmpuccPushUpCasCre(BigDecimal bmpuccPushUpCasCre) {
        this.bmpuccPushUpCasCre = bmpuccPushUpCasCre;
    }

    @Basic
    @Column(name = "BMTAMT_TotBonAmt", nullable = true, precision = 3)
    public BigDecimal getBmtamtTotBonAmt() {
        return bmtamtTotBonAmt;
    }

    public void setBmtamtTotBonAmt(BigDecimal bmtamtTotBonAmt) {
        this.bmtamtTotBonAmt = bmtamtTotBonAmt;
    }

    @Basic
    @Column(name = "BMTAMT1_PerDiscAmt", nullable = true, precision = 3)
    public BigDecimal getBmtamt1PerDiscAmt() {
        return bmtamt1PerDiscAmt;
    }

    public void setBmtamt1PerDiscAmt(BigDecimal bmtamt1PerDiscAmt) {
        this.bmtamt1PerDiscAmt = bmtamt1PerDiscAmt;
    }

    @Basic
    @Column(name = "BMTAMT2_RetPerBonAmt", nullable = true, precision = 3)
    public BigDecimal getBmtamt2RetPerBonAmt() {
        return bmtamt2RetPerBonAmt;
    }

    public void setBmtamt2RetPerBonAmt(BigDecimal bmtamt2RetPerBonAmt) {
        this.bmtamt2RetPerBonAmt = bmtamt2RetPerBonAmt;
    }

    @Basic
    @Column(name = "BMTAMT3_GrpBonAmt", nullable = true, precision = 3)
    public BigDecimal getBmtamt3GrpBonAmt() {
        return bmtamt3GrpBonAmt;
    }

    public void setBmtamt3GrpBonAmt(BigDecimal bmtamt3GrpBonAmt) {
        this.bmtamt3GrpBonAmt = bmtamt3GrpBonAmt;
    }

    @Basic
    @Column(name = "BMADJ_AdjAmt1099", nullable = true, precision = 3)
    public BigDecimal getBmadjAdjAmt1099() {
        return bmadjAdjAmt1099;
    }

    public void setBmadjAdjAmt1099(BigDecimal bmadjAdjAmt1099) {
        this.bmadjAdjAmt1099 = bmadjAdjAmt1099;
    }

    @Basic
    @Column(name = "BMADJN_NonAdjAmt1099", nullable = true, precision = 3)
    public BigDecimal getBmadjnNonAdjAmt1099() {
        return bmadjnNonAdjAmt1099;
    }

    public void setBmadjnNonAdjAmt1099(BigDecimal bmadjnNonAdjAmt1099) {
        this.bmadjnNonAdjAmt1099 = bmadjnNonAdjAmt1099;
    }

    @Basic
    @Column(name = "BMCHK_CheckNum", nullable = true)
    public Long getBmchkCheckNum() {
        return bmchkCheckNum;
    }

    public void setBmchkCheckNum(Long bmchkCheckNum) {
        this.bmchkCheckNum = bmchkCheckNum;
    }

    @Basic
    @Column(name = "BMMOVU_MoveUporReQualFlag", nullable = true, length = 15)
    public String getBmmovuMoveUporReQualFlag() {
        return bmmovuMoveUporReQualFlag;
    }

    public void setBmmovuMoveUporReQualFlag(String bmmovuMoveUporReQualFlag) {
        this.bmmovuMoveUporReQualFlag = bmmovuMoveUporReQualFlag;
    }

    @Basic
    @Column(name = "BMTRFM_TransferredMgr", nullable = true, length = 1)
    public String getBmtrfmTransferredMgr() {
        return bmtrfmTransferredMgr;
    }

    public void setBmtrfmTransferredMgr(String bmtrfmTransferredMgr) {
        this.bmtrfmTransferredMgr = bmtrfmTransferredMgr;
    }

    @Basic
    @Column(name = "BMINHM_InheritedMgr", nullable = true, length = 1)
    public String getBminhmInheritedMgr() {
        return bminhmInheritedMgr;
    }

    public void setBminhmInheritedMgr(String bminhmInheritedMgr) {
        this.bminhmInheritedMgr = bminhmInheritedMgr;
    }

    @Basic
    @Column(name = "BMAMGR_ActiveMgrs", nullable = true)
    public Integer getBmamgrActiveMgrs() {
        return bmamgrActiveMgrs;
    }

    public void setBmamgrActiveMgrs(Integer bmamgrActiveMgrs) {
        this.bmamgrActiveMgrs = bmamgrActiveMgrs;
    }

    @Basic
    @Column(name = "BMTMGR_TotMgrs", nullable = true)
    public Integer getBmtmgrTotMgrs() {
        return bmtmgrTotMgrs;
    }

    public void setBmtmgrTotMgrs(Integer bmtmgrTotMgrs) {
        this.bmtmgrTotMgrs = bmtmgrTotMgrs;
    }

    @Basic
    @Column(name = "BMWH20_WH20per", nullable = true, length = 1)
    public String getBmwh20Wh20Per() {
        return bmwh20Wh20Per;
    }

    public void setBmwh20Wh20Per(String bmwh20Wh20Per) {
        this.bmwh20Wh20Per = bmwh20Wh20Per;
    }

    @Basic
    @Column(name = "BMWH30_WH30per", nullable = true, length = 1)
    public String getBmwh30Wh30Per() {
        return bmwh30Wh30Per;
    }

    public void setBmwh30Wh30Per(String bmwh30Wh30Per) {
        this.bmwh30Wh30Per = bmwh30Wh30Per;
    }

    @Basic
    @Column(name = "BMLDRC_LdrshipMgrs", nullable = true)
    public Integer getBmldrcLdrshipMgrs() {
        return bmldrcLdrshipMgrs;
    }

    public void setBmldrcLdrshipMgrs(Integer bmldrcLdrshipMgrs) {
        this.bmldrcLdrshipMgrs = bmldrcLdrshipMgrs;
    }

    @Basic
    @Column(name = "BMORD_MoveUpReQualOrderNum", nullable = true)
    public Long getBmordMoveUpReQualOrderNum() {
        return bmordMoveUpReQualOrderNum;
    }

    public void setBmordMoveUpReQualOrderNum(Long bmordMoveUpReQualOrderNum) {
        this.bmordMoveUpReQualOrderNum = bmordMoveUpReQualOrderNum;
    }

    @Basic
    @Column(name = "BMORDT_MovUporReQualOrdDate", nullable = true, length = 15)
    public String getBmordtMovUporReQualOrdDate() {
        return bmordtMovUporReQualOrdDate;
    }

    public void setBmordtMovUporReQualOrdDate(String bmordtMovUporReQualOrdDate) {
        this.bmordtMovUporReQualOrdDate = bmordtMovUporReQualOrdDate;
    }

    @Basic
    @Column(name = "BMPMTD_PerCasCreMtd", nullable = true, precision = 3)
    public BigDecimal getBmpmtdPerCasCreMtd() {
        return bmpmtdPerCasCreMtd;
    }

    public void setBmpmtdPerCasCreMtd(BigDecimal bmpmtdPerCasCreMtd) {
        this.bmpmtdPerCasCreMtd = bmpmtdPerCasCreMtd;
    }

    @Basic
    @Column(name = "BMNWCC_NewNonMgrCC", nullable = true, precision = 3)
    public BigDecimal getBmnwccNewNonMgrCc() {
        return bmnwccNewNonMgrCc;
    }

    public void setBmnwccNewNonMgrCc(BigDecimal bmnwccNewNonMgrCc) {
        this.bmnwccNewNonMgrCc = bmnwccNewNonMgrCc;
    }

    @Basic
    @Column(name = "BMNWPS_NewNonMgrCCForPs", nullable = true, precision = 3)
    public BigDecimal getBmnwpsNewNonMgrCcForPs() {
        return bmnwpsNewNonMgrCcForPs;
    }

    public void setBmnwpsNewNonMgrCcForPs(BigDecimal bmnwpsNewNonMgrCcForPs) {
        this.bmnwpsNewNonMgrCcForPs = bmnwpsNewNonMgrCcForPs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BomstpBonusMaster that = (BomstpBonusMaster) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (bmcoidCompanyId != null ? !bmcoidCompanyId.equals(that.bmcoidCompanyId) : that.bmcoidCompanyId != null)
            return false;
        if (bmctlDistCtrl != null ? !bmctlDistCtrl.equals(that.bmctlDistCtrl) : that.bmctlDistCtrl != null)
            return false;
        if (bmctycCntryCode != null ? !bmctycCntryCode.equals(that.bmctycCntryCode) : that.bmctycCntryCode != null)
            return false;
        if (bmdidDistId != null ? !bmdidDistId.equals(that.bmdidDistId) : that.bmdidDistId != null) return false;
        if (bmspnSponsorCtrl != null ? !bmspnSponsorCtrl.equals(that.bmspnSponsorCtrl) : that.bmspnSponsorCtrl != null)
            return false;
        if (bmpcasPerCasCre != null ? !bmpcasPerCasCre.equals(that.bmpcasPerCasCre) : that.bmpcasPerCasCre != null)
            return false;
        if (bmdcasDistCasCre != null ? !bmdcasDistCasCre.equals(that.bmdcasDistCasCre) : that.bmdcasDistCasCre != null)
            return false;
        if (bmtacsTotActCasCre != null ? !bmtacsTotActCasCre.equals(that.bmtacsTotActCasCre) : that.bmtacsTotActCasCre != null)
            return false;
        if (bmactfActiveFlag != null ? !bmactfActiveFlag.equals(that.bmactfActiveFlag) : that.bmactfActiveFlag != null)
            return false;
        if (bmwaiv4CcWaiver != null ? !bmwaiv4CcWaiver.equals(that.bmwaiv4CcWaiver) : that.bmwaiv4CcWaiver != null)
            return false;
        if (bmncasNonMgrCasCre != null ? !bmncasNonMgrCasCre.equals(that.bmncasNonMgrCasCre) : that.bmncasNonMgrCasCre != null)
            return false;
        if (bmtccrTotCasCre != null ? !bmtccrTotCasCre.equals(that.bmtccrTotCasCre) : that.bmtccrTotCasCre != null)
            return false;
        if (bmlmccLastMnthCasCre != null ? !bmlmccLastMnthCasCre.equals(that.bmlmccLastMnthCasCre) : that.bmlmccLastMnthCasCre != null)
            return false;
        if (bmphycPhyCasCre != null ? !bmphycPhyCasCre.equals(that.bmphycPhyCasCre) : that.bmphycPhyCasCre != null)
            return false;
        if (bmblevBegLev != null ? !bmblevBegLev.equals(that.bmblevBegLev) : that.bmblevBegLev != null) return false;
        if (bmelevEndLev != null ? !bmelevEndLev.equals(that.bmelevEndLev) : that.bmelevEndLev != null) return false;
        if (bmmgrlMgrLev != null ? !bmmgrlMgrLev.equals(that.bmmgrlMgrLev) : that.bmmgrlMgrLev != null) return false;
        if (bmgmlvGemLev != null ? !bmgmlvGemLev.equals(that.bmgmlvGemLev) : that.bmgmlvGemLev != null) return false;
        if (bmqumgLbQual != null ? !bmqumgLbQual.equals(that.bmqumgLbQual) : that.bmqumgLbQual != null) return false;
        if (bmdqmgRecMgr != null ? !bmdqmgRecMgr.equals(that.bmdqmgRecMgr) : that.bmdqmgRecMgr != null) return false;
        if (bmfrdcForirgnDom != null ? !bmfrdcForirgnDom.equals(that.bmfrdcForirgnDom) : that.bmfrdcForirgnDom != null)
            return false;
        if (bmwk1CGrandFatherFlag != null ? !bmwk1CGrandFatherFlag.equals(that.bmwk1CGrandFatherFlag) : that.bmwk1CGrandFatherFlag != null)
            return false;
        if (bmstasStatus != null ? !bmstasStatus.equals(that.bmstasStatus) : that.bmstasStatus != null) return false;
        if (bmldrpLdrshipMgrs != null ? !bmldrpLdrshipMgrs.equals(that.bmldrpLdrshipMgrs) : that.bmldrpLdrshipMgrs != null)
            return false;
        if (bm1Gam1StGenActMgrWith25Cc != null ? !bm1Gam1StGenActMgrWith25Cc.equals(that.bm1Gam1StGenActMgrWith25Cc) : that.bm1Gam1StGenActMgrWith25Cc != null)
            return false;
        if (bmareaDistArea != null ? !bmareaDistArea.equals(that.bmareaDistArea) : that.bmareaDistArea != null)
            return false;
        if (bmpuccPushUpCasCre != null ? !bmpuccPushUpCasCre.equals(that.bmpuccPushUpCasCre) : that.bmpuccPushUpCasCre != null)
            return false;
        if (bmtamtTotBonAmt != null ? !bmtamtTotBonAmt.equals(that.bmtamtTotBonAmt) : that.bmtamtTotBonAmt != null)
            return false;
        if (bmtamt1PerDiscAmt != null ? !bmtamt1PerDiscAmt.equals(that.bmtamt1PerDiscAmt) : that.bmtamt1PerDiscAmt != null)
            return false;
        if (bmtamt2RetPerBonAmt != null ? !bmtamt2RetPerBonAmt.equals(that.bmtamt2RetPerBonAmt) : that.bmtamt2RetPerBonAmt != null)
            return false;
        if (bmtamt3GrpBonAmt != null ? !bmtamt3GrpBonAmt.equals(that.bmtamt3GrpBonAmt) : that.bmtamt3GrpBonAmt != null)
            return false;
        if (bmadjAdjAmt1099 != null ? !bmadjAdjAmt1099.equals(that.bmadjAdjAmt1099) : that.bmadjAdjAmt1099 != null)
            return false;
        if (bmadjnNonAdjAmt1099 != null ? !bmadjnNonAdjAmt1099.equals(that.bmadjnNonAdjAmt1099) : that.bmadjnNonAdjAmt1099 != null)
            return false;
        if (bmchkCheckNum != null ? !bmchkCheckNum.equals(that.bmchkCheckNum) : that.bmchkCheckNum != null)
            return false;
        if (bmmovuMoveUporReQualFlag != null ? !bmmovuMoveUporReQualFlag.equals(that.bmmovuMoveUporReQualFlag) : that.bmmovuMoveUporReQualFlag != null)
            return false;
        if (bmtrfmTransferredMgr != null ? !bmtrfmTransferredMgr.equals(that.bmtrfmTransferredMgr) : that.bmtrfmTransferredMgr != null)
            return false;
        if (bminhmInheritedMgr != null ? !bminhmInheritedMgr.equals(that.bminhmInheritedMgr) : that.bminhmInheritedMgr != null)
            return false;
        if (bmamgrActiveMgrs != null ? !bmamgrActiveMgrs.equals(that.bmamgrActiveMgrs) : that.bmamgrActiveMgrs != null)
            return false;
        if (bmtmgrTotMgrs != null ? !bmtmgrTotMgrs.equals(that.bmtmgrTotMgrs) : that.bmtmgrTotMgrs != null)
            return false;
        if (bmwh20Wh20Per != null ? !bmwh20Wh20Per.equals(that.bmwh20Wh20Per) : that.bmwh20Wh20Per != null)
            return false;
        if (bmwh30Wh30Per != null ? !bmwh30Wh30Per.equals(that.bmwh30Wh30Per) : that.bmwh30Wh30Per != null)
            return false;
        if (bmldrcLdrshipMgrs != null ? !bmldrcLdrshipMgrs.equals(that.bmldrcLdrshipMgrs) : that.bmldrcLdrshipMgrs != null)
            return false;
        if (bmordMoveUpReQualOrderNum != null ? !bmordMoveUpReQualOrderNum.equals(that.bmordMoveUpReQualOrderNum) : that.bmordMoveUpReQualOrderNum != null)
            return false;
        if (bmordtMovUporReQualOrdDate != null ? !bmordtMovUporReQualOrdDate.equals(that.bmordtMovUporReQualOrdDate) : that.bmordtMovUporReQualOrdDate != null)
            return false;
        if (bmpmtdPerCasCreMtd != null ? !bmpmtdPerCasCreMtd.equals(that.bmpmtdPerCasCreMtd) : that.bmpmtdPerCasCreMtd != null)
            return false;
        if (bmnwccNewNonMgrCc != null ? !bmnwccNewNonMgrCc.equals(that.bmnwccNewNonMgrCc) : that.bmnwccNewNonMgrCc != null)
            return false;
        if (bmnwpsNewNonMgrCcForPs != null ? !bmnwpsNewNonMgrCcForPs.equals(that.bmnwpsNewNonMgrCcForPs) : that.bmnwpsNewNonMgrCcForPs != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (bmcoidCompanyId != null ? bmcoidCompanyId.hashCode() : 0);
        result = 31 * result + (bmctlDistCtrl != null ? bmctlDistCtrl.hashCode() : 0);
        result = 31 * result + (bmctycCntryCode != null ? bmctycCntryCode.hashCode() : 0);
        result = 31 * result + (bmdidDistId != null ? bmdidDistId.hashCode() : 0);
        result = 31 * result + (bmspnSponsorCtrl != null ? bmspnSponsorCtrl.hashCode() : 0);
        result = 31 * result + (bmpcasPerCasCre != null ? bmpcasPerCasCre.hashCode() : 0);
        result = 31 * result + (bmdcasDistCasCre != null ? bmdcasDistCasCre.hashCode() : 0);
        result = 31 * result + (bmtacsTotActCasCre != null ? bmtacsTotActCasCre.hashCode() : 0);
        result = 31 * result + (bmactfActiveFlag != null ? bmactfActiveFlag.hashCode() : 0);
        result = 31 * result + (bmwaiv4CcWaiver != null ? bmwaiv4CcWaiver.hashCode() : 0);
        result = 31 * result + (bmncasNonMgrCasCre != null ? bmncasNonMgrCasCre.hashCode() : 0);
        result = 31 * result + (bmtccrTotCasCre != null ? bmtccrTotCasCre.hashCode() : 0);
        result = 31 * result + (bmlmccLastMnthCasCre != null ? bmlmccLastMnthCasCre.hashCode() : 0);
        result = 31 * result + (bmphycPhyCasCre != null ? bmphycPhyCasCre.hashCode() : 0);
        result = 31 * result + (bmblevBegLev != null ? bmblevBegLev.hashCode() : 0);
        result = 31 * result + (bmelevEndLev != null ? bmelevEndLev.hashCode() : 0);
        result = 31 * result + (bmmgrlMgrLev != null ? bmmgrlMgrLev.hashCode() : 0);
        result = 31 * result + (bmgmlvGemLev != null ? bmgmlvGemLev.hashCode() : 0);
        result = 31 * result + (bmqumgLbQual != null ? bmqumgLbQual.hashCode() : 0);
        result = 31 * result + (bmdqmgRecMgr != null ? bmdqmgRecMgr.hashCode() : 0);
        result = 31 * result + (bmfrdcForirgnDom != null ? bmfrdcForirgnDom.hashCode() : 0);
        result = 31 * result + (bmwk1CGrandFatherFlag != null ? bmwk1CGrandFatherFlag.hashCode() : 0);
        result = 31 * result + (bmstasStatus != null ? bmstasStatus.hashCode() : 0);
        result = 31 * result + (bmldrpLdrshipMgrs != null ? bmldrpLdrshipMgrs.hashCode() : 0);
        result = 31 * result + (bm1Gam1StGenActMgrWith25Cc != null ? bm1Gam1StGenActMgrWith25Cc.hashCode() : 0);
        result = 31 * result + (bmareaDistArea != null ? bmareaDistArea.hashCode() : 0);
        result = 31 * result + (bmpuccPushUpCasCre != null ? bmpuccPushUpCasCre.hashCode() : 0);
        result = 31 * result + (bmtamtTotBonAmt != null ? bmtamtTotBonAmt.hashCode() : 0);
        result = 31 * result + (bmtamt1PerDiscAmt != null ? bmtamt1PerDiscAmt.hashCode() : 0);
        result = 31 * result + (bmtamt2RetPerBonAmt != null ? bmtamt2RetPerBonAmt.hashCode() : 0);
        result = 31 * result + (bmtamt3GrpBonAmt != null ? bmtamt3GrpBonAmt.hashCode() : 0);
        result = 31 * result + (bmadjAdjAmt1099 != null ? bmadjAdjAmt1099.hashCode() : 0);
        result = 31 * result + (bmadjnNonAdjAmt1099 != null ? bmadjnNonAdjAmt1099.hashCode() : 0);
        result = 31 * result + (bmchkCheckNum != null ? bmchkCheckNum.hashCode() : 0);
        result = 31 * result + (bmmovuMoveUporReQualFlag != null ? bmmovuMoveUporReQualFlag.hashCode() : 0);
        result = 31 * result + (bmtrfmTransferredMgr != null ? bmtrfmTransferredMgr.hashCode() : 0);
        result = 31 * result + (bminhmInheritedMgr != null ? bminhmInheritedMgr.hashCode() : 0);
        result = 31 * result + (bmamgrActiveMgrs != null ? bmamgrActiveMgrs.hashCode() : 0);
        result = 31 * result + (bmtmgrTotMgrs != null ? bmtmgrTotMgrs.hashCode() : 0);
        result = 31 * result + (bmwh20Wh20Per != null ? bmwh20Wh20Per.hashCode() : 0);
        result = 31 * result + (bmwh30Wh30Per != null ? bmwh30Wh30Per.hashCode() : 0);
        result = 31 * result + (bmldrcLdrshipMgrs != null ? bmldrcLdrshipMgrs.hashCode() : 0);
        result = 31 * result + (bmordMoveUpReQualOrderNum != null ? bmordMoveUpReQualOrderNum.hashCode() : 0);
        result = 31 * result + (bmordtMovUporReQualOrdDate != null ? bmordtMovUporReQualOrdDate.hashCode() : 0);
        result = 31 * result + (bmpmtdPerCasCreMtd != null ? bmpmtdPerCasCreMtd.hashCode() : 0);
        result = 31 * result + (bmnwccNewNonMgrCc != null ? bmnwccNewNonMgrCc.hashCode() : 0);
        result = 31 * result + (bmnwpsNewNonMgrCcForPs != null ? bmnwpsNewNonMgrCcForPs.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "MemberFile", nullable = true, length = 10)
    public String getMemberFile() {
        return memberFile;
    }

    public void setMemberFile(String memberFile) {
        this.memberFile = memberFile;
    }

    @Override
    public String toString() {
        return "{\"BomstpBonusMaster\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"bmcoidCompanyId\":\"" + bmcoidCompanyId + "\""
                + ",                         \"bmctlDistCtrl\":\"" + bmctlDistCtrl + "\""
                + ",                         \"bmctycCntryCode\":\"" + bmctycCntryCode + "\""
                + ",                         \"bmdidDistId\":\"" + bmdidDistId + "\""
                + ",                         \"bmspnSponsorCtrl\":\"" + bmspnSponsorCtrl + "\""
                + ",                         \"bmpcasPerCasCre\":\"" + bmpcasPerCasCre + "\""
                + ",                         \"bmdcasDistCasCre\":\"" + bmdcasDistCasCre + "\""
                + ",                         \"bmtacsTotActCasCre\":\"" + bmtacsTotActCasCre + "\""
                + ",                         \"bmactfActiveFlag\":\"" + bmactfActiveFlag + "\""
                + ",                         \"bmwaiv4CcWaiver\":\"" + bmwaiv4CcWaiver + "\""
                + ",                         \"bmncasNonMgrCasCre\":\"" + bmncasNonMgrCasCre + "\""
                + ",                         \"bmtccrTotCasCre\":\"" + bmtccrTotCasCre + "\""
                + ",                         \"bmlmccLastMnthCasCre\":\"" + bmlmccLastMnthCasCre + "\""
                + ",                         \"bmphycPhyCasCre\":\"" + bmphycPhyCasCre + "\""
                + ",                         \"bmblevBegLev\":\"" + bmblevBegLev + "\""
                + ",                         \"bmelevEndLev\":\"" + bmelevEndLev + "\""
                + ",                         \"bmmgrlMgrLev\":\"" + bmmgrlMgrLev + "\""
                + ",                         \"bmgmlvGemLev\":\"" + bmgmlvGemLev + "\""
                + ",                         \"bmqumgLbQual\":\"" + bmqumgLbQual + "\""
                + ",                         \"bmdqmgRecMgr\":\"" + bmdqmgRecMgr + "\""
                + ",                         \"bmfrdcForirgnDom\":\"" + bmfrdcForirgnDom + "\""
                + ",                         \"bmwk1CGrandFatherFlag\":\"" + bmwk1CGrandFatherFlag + "\""
                + ",                         \"bmstasStatus\":\"" + bmstasStatus + "\""
                + ",                         \"bmldrpLdrshipMgrs\":\"" + bmldrpLdrshipMgrs + "\""
                + ",                         \"bm1Gam1StGenActMgrWith25Cc\":\"" + bm1Gam1StGenActMgrWith25Cc + "\""
                + ",                         \"bmareaDistArea\":\"" + bmareaDistArea + "\""
                + ",                         \"bmpuccPushUpCasCre\":\"" + bmpuccPushUpCasCre + "\""
                + ",                         \"bmtamtTotBonAmt\":\"" + bmtamtTotBonAmt + "\""
                + ",                         \"bmtamt1PerDiscAmt\":\"" + bmtamt1PerDiscAmt + "\""
                + ",                         \"bmtamt2RetPerBonAmt\":\"" + bmtamt2RetPerBonAmt + "\""
                + ",                         \"bmtamt3GrpBonAmt\":\"" + bmtamt3GrpBonAmt + "\""
                + ",                         \"bmadjAdjAmt1099\":\"" + bmadjAdjAmt1099 + "\""
                + ",                         \"bmadjnNonAdjAmt1099\":\"" + bmadjnNonAdjAmt1099 + "\""
                + ",                         \"bmchkCheckNum\":\"" + bmchkCheckNum + "\""
                + ",                         \"bmmovuMoveUporReQualFlag\":\"" + bmmovuMoveUporReQualFlag + "\""
                + ",                         \"bmtrfmTransferredMgr\":\"" + bmtrfmTransferredMgr + "\""
                + ",                         \"bminhmInheritedMgr\":\"" + bminhmInheritedMgr + "\""
                + ",                         \"bmamgrActiveMgrs\":\"" + bmamgrActiveMgrs + "\""
                + ",                         \"bmtmgrTotMgrs\":\"" + bmtmgrTotMgrs + "\""
                + ",                         \"bmwh20Wh20Per\":\"" + bmwh20Wh20Per + "\""
                + ",                         \"bmwh30Wh30Per\":\"" + bmwh30Wh30Per + "\""
                + ",                         \"bmldrcLdrshipMgrs\":\"" + bmldrcLdrshipMgrs + "\""
                + ",                         \"bmordMoveUpReQualOrderNum\":\"" + bmordMoveUpReQualOrderNum + "\""
                + ",                         \"bmordtMovUporReQualOrdDate\":\"" + bmordtMovUporReQualOrdDate + "\""
                + ",                         \"bmpmtdPerCasCreMtd\":\"" + bmpmtdPerCasCreMtd + "\""
                + ",                         \"bmnwccNewNonMgrCc\":\"" + bmnwccNewNonMgrCc + "\""
                + ",                         \"bmnwpsNewNonMgrCcForPs\":\"" + bmnwpsNewNonMgrCcForPs + "\""
                + ",                         \"memberFile\":\"" + memberFile + "\""
                + "}}";
    }

    public BomstpBonusMaster copy() {
        BomstpBonusMaster b = new BomstpBonusMaster();
        b.bmcoidCompanyId = bmcoidCompanyId;
        b.bmctlDistCtrl = bmctlDistCtrl;
        b.bmctycCntryCode = bmctycCntryCode;
        b.bmdidDistId = bmdidDistId;
        b.bmspnSponsorCtrl = bmspnSponsorCtrl;
        b.bmpcasPerCasCre = bmpcasPerCasCre;
        b.bmdcasDistCasCre = bmdcasDistCasCre;
        b.bmtacsTotActCasCre = bmtacsTotActCasCre;
        b.bmactfActiveFlag = bmactfActiveFlag;
        b.bmwaiv4CcWaiver = bmwaiv4CcWaiver;
        b.bmncasNonMgrCasCre = bmncasNonMgrCasCre;
        b.bmtccrTotCasCre = bmtccrTotCasCre;
        b.bmlmccLastMnthCasCre = bmlmccLastMnthCasCre;
        b.bmphycPhyCasCre = bmphycPhyCasCre;
        b.bmblevBegLev = bmblevBegLev;
        b.bmelevEndLev = bmelevEndLev;
        b.bmmgrlMgrLev = bmmgrlMgrLev;
        b.bmgmlvGemLev = bmgmlvGemLev;
        b.bmqumgLbQual = bmqumgLbQual;
        b.bmdqmgRecMgr = bmdqmgRecMgr;
        b.bmfrdcForirgnDom = bmfrdcForirgnDom;
        b.bmwk1CGrandFatherFlag = bmwk1CGrandFatherFlag;
        b.bmstasStatus = bmstasStatus;
        b.bmldrpLdrshipMgrs = bmldrpLdrshipMgrs;
        b.bm1Gam1StGenActMgrWith25Cc = bm1Gam1StGenActMgrWith25Cc;
        b.bmareaDistArea = bmareaDistArea;
        b.bmpuccPushUpCasCre = bmpuccPushUpCasCre;
        b.bmtamtTotBonAmt = bmtamtTotBonAmt;
        b.bmtamt1PerDiscAmt = bmtamt1PerDiscAmt;
        b.bmtamt2RetPerBonAmt = bmtamt2RetPerBonAmt;
        b.bmtamt3GrpBonAmt = bmtamt3GrpBonAmt;
        b.bmadjAdjAmt1099 = bmadjAdjAmt1099;
        b.bmadjnNonAdjAmt1099 = bmadjnNonAdjAmt1099;
        b.bmchkCheckNum = bmchkCheckNum;
        b.bmmovuMoveUporReQualFlag = bmmovuMoveUporReQualFlag;
        b.bmtrfmTransferredMgr = bmtrfmTransferredMgr;
        b.bminhmInheritedMgr = bminhmInheritedMgr;
        b.bmamgrActiveMgrs = bmamgrActiveMgrs;
        b.bmtmgrTotMgrs = bmtmgrTotMgrs;
        b.bmwh20Wh20Per = bmwh20Wh20Per;
        b.bmwh30Wh30Per = bmwh30Wh30Per;
        b.bmldrcLdrshipMgrs = bmldrcLdrshipMgrs;
        b.bmordMoveUpReQualOrderNum = bmordMoveUpReQualOrderNum;
        b.bmordtMovUporReQualOrdDate = bmordtMovUporReQualOrdDate;
        b.bmpmtdPerCasCreMtd = bmpmtdPerCasCreMtd;
        b.bmnwccNewNonMgrCc = bmnwccNewNonMgrCc;
        b.bmnwpsNewNonMgrCcForPs = bmnwpsNewNonMgrCcForPs;
        b.memberFile = memberFile;
        return b;
    }


}
