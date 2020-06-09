package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@RedisHash("BOHSRP_BonusHistorySource")
public class BohsrpBonusHistorySource implements Serializable {
    private Long id;
    private Long bshctlDistributorControl;
    private Integer bshpyrProcessYear;
    private Integer bshpmoProcessMonth;
    private Long bshorsOrderSourceCode;
    private Long bshshsShippingSourceCode;
    private String bshcidCompanyId;
    private BigDecimal bshpccPerCcForSrc;
    private BigDecimal bshdccDistCcForSrc;
    private BigDecimal bshtacTotalActCcForSrc;
    private BigDecimal bshnmcNonMgrCcForSrc;
    private BigDecimal bshtccTotalCcForSrc;
    private BigDecimal bshphcCcForSrc;
    private BigDecimal bshtbsSrcBonusAmt;
    private BigDecimal bsht1SPersonalDiscount;
    private BigDecimal bsht2SRetailPersonalBonus;
    private BigDecimal bsht3SGroupBonusAmt;
    private BigDecimal bshadAdjustmentAmount1099;
    private BigDecimal bshadnAdjustmentAmtNon1099;
    private BigDecimal bshnwcNewNonMgrCc;
    private BigDecimal bshnwpNewNmCcForPs;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "BSHCTL_DistributorControl", nullable = false)
    public Long getBshctlDistributorControl() {
        return bshctlDistributorControl;
    }

    public void setBshctlDistributorControl(Long bshctlDistributorControl) {
        this.bshctlDistributorControl = bshctlDistributorControl;
    }

    // @Basic
    // @Column(name = "BSHPYR_ProcessYear", nullable = true)
    public Integer getBshpyrProcessYear() {
        return bshpyrProcessYear;
    }

    public void setBshpyrProcessYear(Integer bshpyrProcessYear) {
        this.bshpyrProcessYear = bshpyrProcessYear;
    }

    // @Basic
    // @Column(name = "BSHPMO_ProcessMonth", nullable = true)
    public Integer getBshpmoProcessMonth() {
        return bshpmoProcessMonth;
    }

    public void setBshpmoProcessMonth(Integer bshpmoProcessMonth) {
        this.bshpmoProcessMonth = bshpmoProcessMonth;
    }

    // @Basic
    // @Column(name = "BSHORS_OrderSourceCode", nullable = true)
    public Long getBshorsOrderSourceCode() {
        return bshorsOrderSourceCode;
    }

    public void setBshorsOrderSourceCode(Long bshorsOrderSourceCode) {
        this.bshorsOrderSourceCode = bshorsOrderSourceCode;
    }

    // @Basic
    // @Column(name = "BSHSHS_ShippingSourceCode", nullable = true)
    public Long getBshshsShippingSourceCode() {
        return bshshsShippingSourceCode;
    }

    public void setBshshsShippingSourceCode(Long bshshsShippingSourceCode) {
        this.bshshsShippingSourceCode = bshshsShippingSourceCode;
    }

    // @Basic
    // @Column(name = "BSHCID_CompanyId", nullable = true, length = 15)
    public String getBshcidCompanyId() {
        return bshcidCompanyId;
    }

    public void setBshcidCompanyId(String bshcidCompanyId) {
        this.bshcidCompanyId = bshcidCompanyId;
    }

    // @Basic
    // @Column(name = "BSHPCC_PerCcForSrc", nullable = true, precision = 3)
    public BigDecimal getBshpccPerCcForSrc() {
        return bshpccPerCcForSrc;
    }

    public void setBshpccPerCcForSrc(BigDecimal bshpccPerCcForSrc) {
        this.bshpccPerCcForSrc = bshpccPerCcForSrc;
    }

    // @Basic
    // @Column(name = "BSHDCC_DistCcForSrc", nullable = true, precision = 3)
    public BigDecimal getBshdccDistCcForSrc() {
        return bshdccDistCcForSrc;
    }

    public void setBshdccDistCcForSrc(BigDecimal bshdccDistCcForSrc) {
        this.bshdccDistCcForSrc = bshdccDistCcForSrc;
    }

    // @Basic
    // @Column(name = "BSHTAC_TotalActCcForSrc", nullable = true, precision = 3)
    public BigDecimal getBshtacTotalActCcForSrc() {
        return bshtacTotalActCcForSrc;
    }

    public void setBshtacTotalActCcForSrc(BigDecimal bshtacTotalActCcForSrc) {
        this.bshtacTotalActCcForSrc = bshtacTotalActCcForSrc;
    }

    // @Basic
    // @Column(name = "BSHNMC_NonMgrCcForSrc", nullable = true, precision = 3)
    public BigDecimal getBshnmcNonMgrCcForSrc() {
        return bshnmcNonMgrCcForSrc;
    }

    public void setBshnmcNonMgrCcForSrc(BigDecimal bshnmcNonMgrCcForSrc) {
        this.bshnmcNonMgrCcForSrc = bshnmcNonMgrCcForSrc;
    }

    // @Basic
    // @Column(name = "BSHTCC_TotalCcForSrc", nullable = true, precision = 3)
    public BigDecimal getBshtccTotalCcForSrc() {
        return bshtccTotalCcForSrc;
    }

    public void setBshtccTotalCcForSrc(BigDecimal bshtccTotalCcForSrc) {
        this.bshtccTotalCcForSrc = bshtccTotalCcForSrc;
    }

    // @Basic
    // @Column(name = "BSHPHC_CcForSrc", nullable = true, precision = 3)
    public BigDecimal getBshphcCcForSrc() {
        return bshphcCcForSrc;
    }

    public void setBshphcCcForSrc(BigDecimal bshphcCcForSrc) {
        this.bshphcCcForSrc = bshphcCcForSrc;
    }

    // @Basic
    // @Column(name = "BSHTBS_SrcBonusAmt", nullable = true, precision = 2)
    public BigDecimal getBshtbsSrcBonusAmt() {
        return bshtbsSrcBonusAmt;
    }

    public void setBshtbsSrcBonusAmt(BigDecimal bshtbsSrcBonusAmt) {
        this.bshtbsSrcBonusAmt = bshtbsSrcBonusAmt;
    }

    // @Basic
    // @Column(name = "BSHT1S_PersonalDiscount", nullable = true, precision = 3)
    public BigDecimal getBsht1SPersonalDiscount() {
        return bsht1SPersonalDiscount;
    }

    public void setBsht1SPersonalDiscount(BigDecimal bsht1SPersonalDiscount) {
        this.bsht1SPersonalDiscount = bsht1SPersonalDiscount;
    }

    // @Basic
    // @Column(name = "BSHT2S_RetailPersonalBonus", nullable = true, precision = 3)
    public BigDecimal getBsht2SRetailPersonalBonus() {
        return bsht2SRetailPersonalBonus;
    }

    public void setBsht2SRetailPersonalBonus(BigDecimal bsht2SRetailPersonalBonus) {
        this.bsht2SRetailPersonalBonus = bsht2SRetailPersonalBonus;
    }

    // @Basic
    // @Column(name = "BSHT3S_GroupBonusAmt", nullable = true, precision = 3)
    public BigDecimal getBsht3SGroupBonusAmt() {
        return bsht3SGroupBonusAmt;
    }

    public void setBsht3SGroupBonusAmt(BigDecimal bsht3SGroupBonusAmt) {
        this.bsht3SGroupBonusAmt = bsht3SGroupBonusAmt;
    }

    // @Basic
    // @Column(name = "BSHAD_AdjustmentAmount1099", nullable = true, precision = 3)
    public BigDecimal getBshadAdjustmentAmount1099() {
        return bshadAdjustmentAmount1099;
    }

    public void setBshadAdjustmentAmount1099(BigDecimal bshadAdjustmentAmount1099) {
        this.bshadAdjustmentAmount1099 = bshadAdjustmentAmount1099;
    }

    // @Basic
    // @Column(name = "BSHADN_AdjustmentAmtNon1099", nullable = true, precision = 3)
    public BigDecimal getBshadnAdjustmentAmtNon1099() {
        return bshadnAdjustmentAmtNon1099;
    }

    public void setBshadnAdjustmentAmtNon1099(BigDecimal bshadnAdjustmentAmtNon1099) {
        this.bshadnAdjustmentAmtNon1099 = bshadnAdjustmentAmtNon1099;
    }

    // @Basic
    // @Column(name = "BSHNWC_NewNonMgrCc", nullable = true, precision = 3)
    public BigDecimal getBshnwcNewNonMgrCc() {
        return bshnwcNewNonMgrCc;
    }

    public void setBshnwcNewNonMgrCc(BigDecimal bshnwcNewNonMgrCc) {
        this.bshnwcNewNonMgrCc = bshnwcNewNonMgrCc;
    }

    // @Basic
    // @Column(name = "BSHNWP_NewNmCcForPs", nullable = true, precision = 3)
    public BigDecimal getBshnwpNewNmCcForPs() {
        return bshnwpNewNmCcForPs;
    }

    public void setBshnwpNewNmCcForPs(BigDecimal bshnwpNewNmCcForPs) {
        this.bshnwpNewNmCcForPs = bshnwpNewNmCcForPs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BohsrpBonusHistorySource that = (BohsrpBonusHistorySource) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (bshctlDistributorControl != null ? !bshctlDistributorControl.equals(that.bshctlDistributorControl) : that.bshctlDistributorControl != null)
            return false;
        if (bshpyrProcessYear != null ? !bshpyrProcessYear.equals(that.bshpyrProcessYear) : that.bshpyrProcessYear != null)
            return false;
        if (bshpmoProcessMonth != null ? !bshpmoProcessMonth.equals(that.bshpmoProcessMonth) : that.bshpmoProcessMonth != null)
            return false;
        if (bshorsOrderSourceCode != null ? !bshorsOrderSourceCode.equals(that.bshorsOrderSourceCode) : that.bshorsOrderSourceCode != null)
            return false;
        if (bshshsShippingSourceCode != null ? !bshshsShippingSourceCode.equals(that.bshshsShippingSourceCode) : that.bshshsShippingSourceCode != null)
            return false;
        if (bshcidCompanyId != null ? !bshcidCompanyId.equals(that.bshcidCompanyId) : that.bshcidCompanyId != null)
            return false;
        if (bshpccPerCcForSrc != null ? !bshpccPerCcForSrc.equals(that.bshpccPerCcForSrc) : that.bshpccPerCcForSrc != null)
            return false;
        if (bshdccDistCcForSrc != null ? !bshdccDistCcForSrc.equals(that.bshdccDistCcForSrc) : that.bshdccDistCcForSrc != null)
            return false;
        if (bshtacTotalActCcForSrc != null ? !bshtacTotalActCcForSrc.equals(that.bshtacTotalActCcForSrc) : that.bshtacTotalActCcForSrc != null)
            return false;
        if (bshnmcNonMgrCcForSrc != null ? !bshnmcNonMgrCcForSrc.equals(that.bshnmcNonMgrCcForSrc) : that.bshnmcNonMgrCcForSrc != null)
            return false;
        if (bshtccTotalCcForSrc != null ? !bshtccTotalCcForSrc.equals(that.bshtccTotalCcForSrc) : that.bshtccTotalCcForSrc != null)
            return false;
        if (bshphcCcForSrc != null ? !bshphcCcForSrc.equals(that.bshphcCcForSrc) : that.bshphcCcForSrc != null)
            return false;
        if (bshtbsSrcBonusAmt != null ? !bshtbsSrcBonusAmt.equals(that.bshtbsSrcBonusAmt) : that.bshtbsSrcBonusAmt != null)
            return false;
        if (bsht1SPersonalDiscount != null ? !bsht1SPersonalDiscount.equals(that.bsht1SPersonalDiscount) : that.bsht1SPersonalDiscount != null)
            return false;
        if (bsht2SRetailPersonalBonus != null ? !bsht2SRetailPersonalBonus.equals(that.bsht2SRetailPersonalBonus) : that.bsht2SRetailPersonalBonus != null)
            return false;
        if (bsht3SGroupBonusAmt != null ? !bsht3SGroupBonusAmt.equals(that.bsht3SGroupBonusAmt) : that.bsht3SGroupBonusAmt != null)
            return false;
        if (bshadAdjustmentAmount1099 != null ? !bshadAdjustmentAmount1099.equals(that.bshadAdjustmentAmount1099) : that.bshadAdjustmentAmount1099 != null)
            return false;
        if (bshadnAdjustmentAmtNon1099 != null ? !bshadnAdjustmentAmtNon1099.equals(that.bshadnAdjustmentAmtNon1099) : that.bshadnAdjustmentAmtNon1099 != null)
            return false;
        if (bshnwcNewNonMgrCc != null ? !bshnwcNewNonMgrCc.equals(that.bshnwcNewNonMgrCc) : that.bshnwcNewNonMgrCc != null)
            return false;
        if (bshnwpNewNmCcForPs != null ? !bshnwpNewNmCcForPs.equals(that.bshnwpNewNmCcForPs) : that.bshnwpNewNmCcForPs != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (bshctlDistributorControl != null ? bshctlDistributorControl.hashCode() : 0);
        result = 31 * result + (bshpyrProcessYear != null ? bshpyrProcessYear.hashCode() : 0);
        result = 31 * result + (bshpmoProcessMonth != null ? bshpmoProcessMonth.hashCode() : 0);
        result = 31 * result + (bshorsOrderSourceCode != null ? bshorsOrderSourceCode.hashCode() : 0);
        result = 31 * result + (bshshsShippingSourceCode != null ? bshshsShippingSourceCode.hashCode() : 0);
        result = 31 * result + (bshcidCompanyId != null ? bshcidCompanyId.hashCode() : 0);
        result = 31 * result + (bshpccPerCcForSrc != null ? bshpccPerCcForSrc.hashCode() : 0);
        result = 31 * result + (bshdccDistCcForSrc != null ? bshdccDistCcForSrc.hashCode() : 0);
        result = 31 * result + (bshtacTotalActCcForSrc != null ? bshtacTotalActCcForSrc.hashCode() : 0);
        result = 31 * result + (bshnmcNonMgrCcForSrc != null ? bshnmcNonMgrCcForSrc.hashCode() : 0);
        result = 31 * result + (bshtccTotalCcForSrc != null ? bshtccTotalCcForSrc.hashCode() : 0);
        result = 31 * result + (bshphcCcForSrc != null ? bshphcCcForSrc.hashCode() : 0);
        result = 31 * result + (bshtbsSrcBonusAmt != null ? bshtbsSrcBonusAmt.hashCode() : 0);
        result = 31 * result + (bsht1SPersonalDiscount != null ? bsht1SPersonalDiscount.hashCode() : 0);
        result = 31 * result + (bsht2SRetailPersonalBonus != null ? bsht2SRetailPersonalBonus.hashCode() : 0);
        result = 31 * result + (bsht3SGroupBonusAmt != null ? bsht3SGroupBonusAmt.hashCode() : 0);
        result = 31 * result + (bshadAdjustmentAmount1099 != null ? bshadAdjustmentAmount1099.hashCode() : 0);
        result = 31 * result + (bshadnAdjustmentAmtNon1099 != null ? bshadnAdjustmentAmtNon1099.hashCode() : 0);
        result = 31 * result + (bshnwcNewNonMgrCc != null ? bshnwcNewNonMgrCc.hashCode() : 0);
        result = 31 * result + (bshnwpNewNmCcForPs != null ? bshnwpNewNmCcForPs.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"BohsrpBonusHistorySource\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"bshctlDistributorControl\":\"" + bshctlDistributorControl + "\""
                + ",                         \"bshpyrProcessYear\":\"" + bshpyrProcessYear + "\""
                + ",                         \"bshpmoProcessMonth\":\"" + bshpmoProcessMonth + "\""
                + ",                         \"bshorsOrderSourceCode\":\"" + bshorsOrderSourceCode + "\""
                + ",                         \"bshshsShippingSourceCode\":\"" + bshshsShippingSourceCode + "\""
                + ",                         \"bshcidCompanyId\":\"" + bshcidCompanyId + "\""
                + ",                         \"bshpccPerCcForSrc\":\"" + bshpccPerCcForSrc + "\""
                + ",                         \"bshdccDistCcForSrc\":\"" + bshdccDistCcForSrc + "\""
                + ",                         \"bshtacTotalActCcForSrc\":\"" + bshtacTotalActCcForSrc + "\""
                + ",                         \"bshnmcNonMgrCcForSrc\":\"" + bshnmcNonMgrCcForSrc + "\""
                + ",                         \"bshtccTotalCcForSrc\":\"" + bshtccTotalCcForSrc + "\""
                + ",                         \"bshphcCcForSrc\":\"" + bshphcCcForSrc + "\""
                + ",                         \"bshtbsSrcBonusAmt\":\"" + bshtbsSrcBonusAmt + "\""
                + ",                         \"bsht1SPersonalDiscount\":\"" + bsht1SPersonalDiscount + "\""
                + ",                         \"bsht2SRetailPersonalBonus\":\"" + bsht2SRetailPersonalBonus + "\""
                + ",                         \"bsht3SGroupBonusAmt\":\"" + bsht3SGroupBonusAmt + "\""
                + ",                         \"bshadAdjustmentAmount1099\":\"" + bshadAdjustmentAmount1099 + "\""
                + ",                         \"bshadnAdjustmentAmtNon1099\":\"" + bshadnAdjustmentAmtNon1099 + "\""
                + ",                         \"bshnwcNewNonMgrCc\":\"" + bshnwcNewNonMgrCc + "\""
                + ",                         \"bshnwpNewNmCcForPs\":\"" + bshnwpNewNmCcForPs + "\""
                + "}}";
    }

    public BohsrpBonusHistorySource copy() {
        BohsrpBonusHistorySource b = new BohsrpBonusHistorySource();
        b.bshctlDistributorControl = bshctlDistributorControl;
        b.bshpyrProcessYear = bshpyrProcessYear;
        b.bshpmoProcessMonth = bshpmoProcessMonth;
        b.bshorsOrderSourceCode = bshorsOrderSourceCode;
        b.bshshsShippingSourceCode = bshshsShippingSourceCode;
        b.bshcidCompanyId = bshcidCompanyId;
        b.bshpccPerCcForSrc = bshpccPerCcForSrc;
        b.bshdccDistCcForSrc = bshdccDistCcForSrc;
        b.bshtacTotalActCcForSrc = bshtacTotalActCcForSrc;
        b.bshnmcNonMgrCcForSrc = bshnmcNonMgrCcForSrc;
        b.bshtccTotalCcForSrc = bshtccTotalCcForSrc;
        b.bshphcCcForSrc = bshphcCcForSrc;
        b.bshtbsSrcBonusAmt = bshtbsSrcBonusAmt;
        b.bsht1SPersonalDiscount = bsht1SPersonalDiscount;
        b.bsht2SRetailPersonalBonus = bsht2SRetailPersonalBonus;
        b.bsht3SGroupBonusAmt = bsht3SGroupBonusAmt;
        b.bshadAdjustmentAmount1099 = bshadAdjustmentAmount1099;
        b.bshadnAdjustmentAmtNon1099 = bshadnAdjustmentAmtNon1099;
        b.bshnwcNewNonMgrCc = bshnwcNewNonMgrCc;
        b.bshnwpNewNmCcForPs = bshnwpNewNmCcForPs;
        return b;
    }


}
