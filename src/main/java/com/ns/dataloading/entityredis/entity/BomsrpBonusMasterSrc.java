package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by rpalamakula on 16-08-2017.
 */
@RedisHash("BOMSRP_BonusMasterSrc")
public class BomsrpBonusMasterSrc implements Serializable {
    private Long id;
    private Long bsmctlDistCtrl;
    private String bsmcidCompanyId;
    private Long bsmorsOrderSrcCode;
    private Long bsmshsShippingSrcCode;
    private BigDecimal bsmpccPerCasCre;
    private BigDecimal bsmdccDistCasCre;
    private BigDecimal bsmtacTotActCasCre;
    private BigDecimal bsmnmcNonMgrCasCre;
    private BigDecimal bsmtccTotCasCre;
    private BigDecimal bsmphcPhyCasCred;
    private BigDecimal bsmtbsSrcBonAmt;
    private BigDecimal bsmt1SPerDisc;
    private BigDecimal bsmt2SRetPerBonDisc;
    private BigDecimal bsmt3SGrpBonAmtDisc;
    private BigDecimal bsmadAdjAmt1099;
    private BigDecimal bsmadnSrcAdjAmtNon1099;
    private BigDecimal bsmnwcNewNonMgrCc;
    private BigDecimal bsmnwpNewNonMgrPc;
    private String memberFile;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "BSMCTL_DistCtrl", nullable = false)
    public Long getBsmctlDistCtrl() {
        return bsmctlDistCtrl;
    }

    public void setBsmctlDistCtrl(Long bsmctlDistCtrl) {
        this.bsmctlDistCtrl = bsmctlDistCtrl;
    }

    // @Basic
    // @Column(name = "BSMCID_CompanyId", nullable = true, length = 255)
    public String getBsmcidCompanyId() {
        return bsmcidCompanyId;
    }

    public void setBsmcidCompanyId(String bsmcidCompanyId) {
        this.bsmcidCompanyId = bsmcidCompanyId;
    }

    // @Basic
    // @Column(name = "BSMORS_OrderSrcCode", nullable = true)
    public Long getBsmorsOrderSrcCode() {
        return bsmorsOrderSrcCode;
    }

    public void setBsmorsOrderSrcCode(Long bsmorsOrderSrcCode) {
        this.bsmorsOrderSrcCode = bsmorsOrderSrcCode;
    }

    // @Basic
    // @Column(name = "BSMSHS_ShippingSrcCode", nullable = true)
    public Long getBsmshsShippingSrcCode() {
        return bsmshsShippingSrcCode;
    }

    public void setBsmshsShippingSrcCode(Long bsmshsShippingSrcCode) {
        this.bsmshsShippingSrcCode = bsmshsShippingSrcCode;
    }

    // @Basic
    // @Column(name = "BSMPCC_PerCasCre", nullable = true, precision = 3)
    public BigDecimal getBsmpccPerCasCre() {
        return bsmpccPerCasCre;
    }

    public void setBsmpccPerCasCre(BigDecimal bsmpccPerCasCre) {
        this.bsmpccPerCasCre = bsmpccPerCasCre;
    }

    // @Basic
    // @Column(name = "BSMDCC_DistCasCre", nullable = true, precision = 3)
    public BigDecimal getBsmdccDistCasCre() {
        return bsmdccDistCasCre;
    }

    public void setBsmdccDistCasCre(BigDecimal bsmdccDistCasCre) {
        this.bsmdccDistCasCre = bsmdccDistCasCre;
    }

    // @Basic
    // @Column(name = "BSMTAC_TotActCasCre", nullable = true, precision = 3)
    public BigDecimal getBsmtacTotActCasCre() {
        return bsmtacTotActCasCre;
    }

    public void setBsmtacTotActCasCre(BigDecimal bsmtacTotActCasCre) {
        this.bsmtacTotActCasCre = bsmtacTotActCasCre;
    }

    // @Basic
    // @Column(name = "BSMNMC_NonMgrCasCre", nullable = true, precision = 3)
    public BigDecimal getBsmnmcNonMgrCasCre() {
        return bsmnmcNonMgrCasCre;
    }

    public void setBsmnmcNonMgrCasCre(BigDecimal bsmnmcNonMgrCasCre) {
        this.bsmnmcNonMgrCasCre = bsmnmcNonMgrCasCre;
    }

    // @Basic
    // @Column(name = "BSMTCC_TotCasCre", nullable = true, precision = 3)
    public BigDecimal getBsmtccTotCasCre() {
        return bsmtccTotCasCre;
    }

    public void setBsmtccTotCasCre(BigDecimal bsmtccTotCasCre) {
        this.bsmtccTotCasCre = bsmtccTotCasCre;
    }

    // @Basic
    // @Column(name = "BSMPHC_PhyCasCred", nullable = true, precision = 3)
    public BigDecimal getBsmphcPhyCasCred() {
        return bsmphcPhyCasCred;
    }

    public void setBsmphcPhyCasCred(BigDecimal bsmphcPhyCasCred) {
        this.bsmphcPhyCasCred = bsmphcPhyCasCred;
    }

    // @Basic
    // @Column(name = "BSMTBS_SrcBonAmt", nullable = true, precision = 3)
    public BigDecimal getBsmtbsSrcBonAmt() {
        return bsmtbsSrcBonAmt;
    }

    public void setBsmtbsSrcBonAmt(BigDecimal bsmtbsSrcBonAmt) {
        this.bsmtbsSrcBonAmt = bsmtbsSrcBonAmt;
    }

    // @Basic
    // @Column(name = "BSMT1S_PerDisc", nullable = true, precision = 3)
    public BigDecimal getBsmt1SPerDisc() {
        return bsmt1SPerDisc;
    }

    public void setBsmt1SPerDisc(BigDecimal bsmt1SPerDisc) {
        this.bsmt1SPerDisc = bsmt1SPerDisc;
    }

    // @Basic
    // @Column(name = "BSMT2S_RetPerBonDisc", nullable = true, precision = 3)
    public BigDecimal getBsmt2SRetPerBonDisc() {
        return bsmt2SRetPerBonDisc;
    }

    public void setBsmt2SRetPerBonDisc(BigDecimal bsmt2SRetPerBonDisc) {
        this.bsmt2SRetPerBonDisc = bsmt2SRetPerBonDisc;
    }

    // @Basic
    // @Column(name = "BSMT3S_GrpBonAmtDisc", nullable = true, precision = 3)
    public BigDecimal getBsmt3SGrpBonAmtDisc() {
        return bsmt3SGrpBonAmtDisc;
    }

    public void setBsmt3SGrpBonAmtDisc(BigDecimal bsmt3SGrpBonAmtDisc) {
        this.bsmt3SGrpBonAmtDisc = bsmt3SGrpBonAmtDisc;
    }

    // @Basic
    // @Column(name = "BSMAD_AdjAmt_1099", nullable = true, precision = 3)
    public BigDecimal getBsmadAdjAmt1099() {
        return bsmadAdjAmt1099;
    }

    public void setBsmadAdjAmt1099(BigDecimal bsmadAdjAmt1099) {
        this.bsmadAdjAmt1099 = bsmadAdjAmt1099;
    }

    // @Basic
    // @Column(name = "BSMADN_SrcAdjAmt_Non1099", nullable = true, precision = 3)
    public BigDecimal getBsmadnSrcAdjAmtNon1099() {
        return bsmadnSrcAdjAmtNon1099;
    }

    public void setBsmadnSrcAdjAmtNon1099(BigDecimal bsmadnSrcAdjAmtNon1099) {
        this.bsmadnSrcAdjAmtNon1099 = bsmadnSrcAdjAmtNon1099;
    }

    // @Basic
    // @Column(name = "BSMNWC_NewNonMgrCc", nullable = true, precision = 3)
    public BigDecimal getBsmnwcNewNonMgrCc() {
        return bsmnwcNewNonMgrCc;
    }

    public void setBsmnwcNewNonMgrCc(BigDecimal bsmnwcNewNonMgrCc) {
        this.bsmnwcNewNonMgrCc = bsmnwcNewNonMgrCc;
    }

    // @Basic
    // @Column(name = "BSMNWP_NewNonMgrPc", nullable = true, precision = 3)
    public BigDecimal getBsmnwpNewNonMgrPc() {
        return bsmnwpNewNonMgrPc;
    }

    public void setBsmnwpNewNonMgrPc(BigDecimal bsmnwpNewNonMgrPc) {
        this.bsmnwpNewNonMgrPc = bsmnwpNewNonMgrPc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BomsrpBonusMasterSrc that = (BomsrpBonusMasterSrc) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (bsmctlDistCtrl != null ? !bsmctlDistCtrl.equals(that.bsmctlDistCtrl) : that.bsmctlDistCtrl != null)
            return false;
        if (bsmcidCompanyId != null ? !bsmcidCompanyId.equals(that.bsmcidCompanyId) : that.bsmcidCompanyId != null)
            return false;
        if (bsmorsOrderSrcCode != null ? !bsmorsOrderSrcCode.equals(that.bsmorsOrderSrcCode) : that.bsmorsOrderSrcCode != null)
            return false;
        if (bsmshsShippingSrcCode != null ? !bsmshsShippingSrcCode.equals(that.bsmshsShippingSrcCode) : that.bsmshsShippingSrcCode != null)
            return false;
        if (bsmpccPerCasCre != null ? !bsmpccPerCasCre.equals(that.bsmpccPerCasCre) : that.bsmpccPerCasCre != null)
            return false;
        if (bsmdccDistCasCre != null ? !bsmdccDistCasCre.equals(that.bsmdccDistCasCre) : that.bsmdccDistCasCre != null)
            return false;
        if (bsmtacTotActCasCre != null ? !bsmtacTotActCasCre.equals(that.bsmtacTotActCasCre) : that.bsmtacTotActCasCre != null)
            return false;
        if (bsmnmcNonMgrCasCre != null ? !bsmnmcNonMgrCasCre.equals(that.bsmnmcNonMgrCasCre) : that.bsmnmcNonMgrCasCre != null)
            return false;
        if (bsmtccTotCasCre != null ? !bsmtccTotCasCre.equals(that.bsmtccTotCasCre) : that.bsmtccTotCasCre != null)
            return false;
        if (bsmphcPhyCasCred != null ? !bsmphcPhyCasCred.equals(that.bsmphcPhyCasCred) : that.bsmphcPhyCasCred != null)
            return false;
        if (bsmtbsSrcBonAmt != null ? !bsmtbsSrcBonAmt.equals(that.bsmtbsSrcBonAmt) : that.bsmtbsSrcBonAmt != null)
            return false;
        if (bsmt1SPerDisc != null ? !bsmt1SPerDisc.equals(that.bsmt1SPerDisc) : that.bsmt1SPerDisc != null)
            return false;
        if (bsmt2SRetPerBonDisc != null ? !bsmt2SRetPerBonDisc.equals(that.bsmt2SRetPerBonDisc) : that.bsmt2SRetPerBonDisc != null)
            return false;
        if (bsmt3SGrpBonAmtDisc != null ? !bsmt3SGrpBonAmtDisc.equals(that.bsmt3SGrpBonAmtDisc) : that.bsmt3SGrpBonAmtDisc != null)
            return false;
        if (bsmadAdjAmt1099 != null ? !bsmadAdjAmt1099.equals(that.bsmadAdjAmt1099) : that.bsmadAdjAmt1099 != null)
            return false;
        if (bsmadnSrcAdjAmtNon1099 != null ? !bsmadnSrcAdjAmtNon1099.equals(that.bsmadnSrcAdjAmtNon1099) : that.bsmadnSrcAdjAmtNon1099 != null)
            return false;
        if (bsmnwcNewNonMgrCc != null ? !bsmnwcNewNonMgrCc.equals(that.bsmnwcNewNonMgrCc) : that.bsmnwcNewNonMgrCc != null)
            return false;
        if (bsmnwpNewNonMgrPc != null ? !bsmnwpNewNonMgrPc.equals(that.bsmnwpNewNonMgrPc) : that.bsmnwpNewNonMgrPc != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (bsmctlDistCtrl != null ? bsmctlDistCtrl.hashCode() : 0);
        result = 31 * result + (bsmcidCompanyId != null ? bsmcidCompanyId.hashCode() : 0);
        result = 31 * result + (bsmorsOrderSrcCode != null ? bsmorsOrderSrcCode.hashCode() : 0);
        result = 31 * result + (bsmshsShippingSrcCode != null ? bsmshsShippingSrcCode.hashCode() : 0);
        result = 31 * result + (bsmpccPerCasCre != null ? bsmpccPerCasCre.hashCode() : 0);
        result = 31 * result + (bsmdccDistCasCre != null ? bsmdccDistCasCre.hashCode() : 0);
        result = 31 * result + (bsmtacTotActCasCre != null ? bsmtacTotActCasCre.hashCode() : 0);
        result = 31 * result + (bsmnmcNonMgrCasCre != null ? bsmnmcNonMgrCasCre.hashCode() : 0);
        result = 31 * result + (bsmtccTotCasCre != null ? bsmtccTotCasCre.hashCode() : 0);
        result = 31 * result + (bsmphcPhyCasCred != null ? bsmphcPhyCasCred.hashCode() : 0);
        result = 31 * result + (bsmtbsSrcBonAmt != null ? bsmtbsSrcBonAmt.hashCode() : 0);
        result = 31 * result + (bsmt1SPerDisc != null ? bsmt1SPerDisc.hashCode() : 0);
        result = 31 * result + (bsmt2SRetPerBonDisc != null ? bsmt2SRetPerBonDisc.hashCode() : 0);
        result = 31 * result + (bsmt3SGrpBonAmtDisc != null ? bsmt3SGrpBonAmtDisc.hashCode() : 0);
        result = 31 * result + (bsmadAdjAmt1099 != null ? bsmadAdjAmt1099.hashCode() : 0);
        result = 31 * result + (bsmadnSrcAdjAmtNon1099 != null ? bsmadnSrcAdjAmtNon1099.hashCode() : 0);
        result = 31 * result + (bsmnwcNewNonMgrCc != null ? bsmnwcNewNonMgrCc.hashCode() : 0);
        result = 31 * result + (bsmnwpNewNonMgrPc != null ? bsmnwpNewNonMgrPc.hashCode() : 0);
        return result;
    }

    // @Basic
    // @Column(name = "MemberFile", nullable = true, length = 10)
    public String getMemberFile() {
        return memberFile;
    }

    public void setMemberFile(String memberFile) {
        this.memberFile = memberFile;
    }

    @Override
    public String toString() {
        return "{\"BomsrpBonusMasterSrc\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"bsmctlDistCtrl\":\"" + bsmctlDistCtrl + "\""
                + ",                         \"bsmcidCompanyId\":\"" + bsmcidCompanyId + "\""
                + ",                         \"bsmorsOrderSrcCode\":\"" + bsmorsOrderSrcCode + "\""
                + ",                         \"bsmshsShippingSrcCode\":\"" + bsmshsShippingSrcCode + "\""
                + ",                         \"bsmpccPerCasCre\":\"" + bsmpccPerCasCre + "\""
                + ",                         \"bsmdccDistCasCre\":\"" + bsmdccDistCasCre + "\""
                + ",                         \"bsmtacTotActCasCre\":\"" + bsmtacTotActCasCre + "\""
                + ",                         \"bsmnmcNonMgrCasCre\":\"" + bsmnmcNonMgrCasCre + "\""
                + ",                         \"bsmtccTotCasCre\":\"" + bsmtccTotCasCre + "\""
                + ",                         \"bsmphcPhyCasCred\":\"" + bsmphcPhyCasCred + "\""
                + ",                         \"bsmtbsSrcBonAmt\":\"" + bsmtbsSrcBonAmt + "\""
                + ",                         \"bsmt1SPerDisc\":\"" + bsmt1SPerDisc + "\""
                + ",                         \"bsmt2SRetPerBonDisc\":\"" + bsmt2SRetPerBonDisc + "\""
                + ",                         \"bsmt3SGrpBonAmtDisc\":\"" + bsmt3SGrpBonAmtDisc + "\""
                + ",                         \"bsmadAdjAmt1099\":\"" + bsmadAdjAmt1099 + "\""
                + ",                         \"bsmadnSrcAdjAmtNon1099\":\"" + bsmadnSrcAdjAmtNon1099 + "\""
                + ",                         \"bsmnwcNewNonMgrCc\":\"" + bsmnwcNewNonMgrCc + "\""
                + ",                         \"bsmnwpNewNonMgrPc\":\"" + bsmnwpNewNonMgrPc + "\""
                + ",                         \"memberFile\":\"" + memberFile + "\""
                + "}}";
    }
}
