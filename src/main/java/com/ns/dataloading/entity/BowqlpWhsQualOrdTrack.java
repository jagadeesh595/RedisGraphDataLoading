package com.ns.dataloading.entity;

import javax.persistence.*;
import java.math.BigDecimal;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "BOWQLP_WHSQualOrdTrack")
public class BowqlpWhsQualOrdTrack {
    private long id;
    private String bwcoidCompanyId;
    private Integer bwpyrProcYear;
    private Integer bwpmoProcMonth;
    private String bwprccProcCycle;
    private long bwctlDistCtl;
    private String bwodatOrdDate;
    private long bwordOrdNum;
    private String bwwqlfWqlFlag;
    private BigDecimal bwlmpccLstMnthPerCc;
    private BigDecimal bwcmpccMtdPerCc;
    private BigDecimal bwordccCasCreOrder;
    private BigDecimal bwwqlnccNotWqlCasCre;
    private BigDecimal bwwqlyccWqlCasCre;
    private String bwpdatCreatedDate;
    private String bwcusrLstChgUser;
    private Long bwordsOrderSrcCode;
    private Long bwshpsShippingSrcCode;
    private Long bwotypOrdTypCode;
    private String bwedteEntryTimeStamp;
    private String bwcdteChgTimeStamp;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "BWCOID_CompanyId")
    public String getBwcoidCompanyId() {
        return bwcoidCompanyId;
    }

    public void setBwcoidCompanyId(String bwcoidCompanyId) {
        this.bwcoidCompanyId = bwcoidCompanyId;
    }

    @Basic
    @Column(name = "BWPYR_ProcYear")
    public Integer getBwpyrProcYear() {
        return bwpyrProcYear;
    }

    public void setBwpyrProcYear(Integer bwpyrProcYear) {
        this.bwpyrProcYear = bwpyrProcYear;
    }

    @Basic
    @Column(name = "BWPMO_ProcMonth")
    public Integer getBwpmoProcMonth() {
        return bwpmoProcMonth;
    }

    public void setBwpmoProcMonth(Integer bwpmoProcMonth) {
        this.bwpmoProcMonth = bwpmoProcMonth;
    }

    @Basic
    @Column(name = "BWPRCC_ProcCycle")
    public String getbwprccProcCycle() {
        return bwprccProcCycle;
    }

    public void setbwprccProcCycle(String bwprccProcCycle) {
        this.bwprccProcCycle = bwprccProcCycle;
    }

    @Basic
    @Column(name = "BWCTL_DistCtl")
    public long getBwctlDistCtl() {
        return bwctlDistCtl;
    }

    public void setBwctlDistCtl(long bwctlDistCtl) {
        this.bwctlDistCtl = bwctlDistCtl;
    }

    @Basic
    @Column(name = "BWODAT_OrdDate")
    public String getBwodatOrdDate() {
        return bwodatOrdDate;
    }

    public void setBwodatOrdDate(String bwodatOrdDate) {
        this.bwodatOrdDate = bwodatOrdDate;
    }

    @Basic
    @Column(name = "BWORD_OrdNum")
    public long getBwordOrdNum() {
        return bwordOrdNum;
    }

    public void setBwordOrdNum(long bwordOrdNum) {
        this.bwordOrdNum = bwordOrdNum;
    }

    @Basic
    @Column(name = "BWWQLF_WQLFlag")
    public String getBwwqlfWqlFlag() {
        return bwwqlfWqlFlag;
    }

    public void setBwwqlfWqlFlag(String bwwqlfWqlFlag) {
        this.bwwqlfWqlFlag = bwwqlfWqlFlag;
    }

    @Basic
    @Column(name = "BWLMPCC_LstMnthPerCc")
    public BigDecimal getBwlmpccLstMnthPerCc() {
        return bwlmpccLstMnthPerCc;
    }

    public void setBwlmpccLstMnthPerCc(BigDecimal bwlmpccLstMnthPerCc) {
        this.bwlmpccLstMnthPerCc = bwlmpccLstMnthPerCc;
    }

    @Basic
    @Column(name = "BWCMPCC_MTDPerCc")
    public BigDecimal getBwcmpccMtdPerCc() {
        return bwcmpccMtdPerCc;
    }

    public void setBwcmpccMtdPerCc(BigDecimal bwcmpccMtdPerCc) {
        this.bwcmpccMtdPerCc = bwcmpccMtdPerCc;
    }

    @Basic
    @Column(name = "BWORDCC_CasCreOrder")
    public BigDecimal getBwordccCasCreOrder() {
        return bwordccCasCreOrder;
    }

    public void setBwordccCasCreOrder(BigDecimal bwordccCasCreOrder) {
        this.bwordccCasCreOrder = bwordccCasCreOrder;
    }

    @Basic
    @Column(name = "BWWQLNCC_NotWQLCasCre")
    public BigDecimal getBwwqlnccNotWqlCasCre() {
        return bwwqlnccNotWqlCasCre;
    }

    public void setBwwqlnccNotWqlCasCre(BigDecimal bwwqlnccNotWqlCasCre) {
        this.bwwqlnccNotWqlCasCre = bwwqlnccNotWqlCasCre;
    }

    @Basic
    @Column(name = "BWWQLYCC_WQLCasCre")
    public BigDecimal getBwwqlyccWqlCasCre() {
        return bwwqlyccWqlCasCre;
    }

    public void setBwwqlyccWqlCasCre(BigDecimal bwwqlyccWqlCasCre) {
        this.bwwqlyccWqlCasCre = bwwqlyccWqlCasCre;
    }

    @Basic
    @Column(name = "BWPDAT_CreatedDate")
    public String getBwpdatCreatedDate() {
        return bwpdatCreatedDate;
    }

    public void setBwpdatCreatedDate(String bwpdatCreatedDate) {
        this.bwpdatCreatedDate = bwpdatCreatedDate;
    }

    @Basic
    @Column(name = "BWCUSR_LstChgUser")
    public String getBwcusrLstChgUser() {
        return bwcusrLstChgUser;
    }

    public void setBwcusrLstChgUser(String bwcusrLstChgUser) {
        this.bwcusrLstChgUser = bwcusrLstChgUser;
    }

    @Basic
    @Column(name = "BWORDS_OrderSrcCode")
    public Long getBwordsOrderSrcCode() {
        return bwordsOrderSrcCode;
    }

    public void setBwordsOrderSrcCode(Long bwordsOrderSrcCode) {
        this.bwordsOrderSrcCode = bwordsOrderSrcCode;
    }

    @Basic
    @Column(name = "BWSHPS_ShippingSrcCode")
    public Long getBwshpsShippingSrcCode() {
        return bwshpsShippingSrcCode;
    }

    public void setBwshpsShippingSrcCode(Long bwshpsShippingSrcCode) {
        this.bwshpsShippingSrcCode = bwshpsShippingSrcCode;
    }

    @Basic
    @Column(name = "BWOTYP_OrdTypCode")
    public Long getBwotypOrdTypCode() {
        return bwotypOrdTypCode;
    }

    public void setBwotypOrdTypCode(Long bwotypOrdTypCode) {
        this.bwotypOrdTypCode = bwotypOrdTypCode;
    }

    @Basic
    @Column(name = "BWEDTE_EntryTimeStamp")
    public String getBwedteEntryTimeStamp() {
        return bwedteEntryTimeStamp;
    }

    public void setBwedteEntryTimeStamp(String bwedteEntryTimeStamp) {
        this.bwedteEntryTimeStamp = bwedteEntryTimeStamp;
    }

    @Basic
    @Column(name = "BWCDTE_ChgTimeStamp")
    public String getBwcdteChgTimeStamp() {
        return bwcdteChgTimeStamp;
    }

    public void setBwcdteChgTimeStamp(String bwcdteChgTimeStamp) {
        this.bwcdteChgTimeStamp = bwcdteChgTimeStamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BowqlpWhsQualOrdTrack that = (BowqlpWhsQualOrdTrack) o;

        if (id != that.id) return false;
        if (bwctlDistCtl != that.bwctlDistCtl) return false;
        if (bwordOrdNum != that.bwordOrdNum) return false;
        if (bwcoidCompanyId != null ? !bwcoidCompanyId.equals(that.bwcoidCompanyId) : that.bwcoidCompanyId != null)
            return false;
        if (bwpyrProcYear != null ? !bwpyrProcYear.equals(that.bwpyrProcYear) : that.bwpyrProcYear != null)
            return false;
        if (bwpmoProcMonth != null ? !bwpmoProcMonth.equals(that.bwpmoProcMonth) : that.bwpmoProcMonth != null)
            return false;
        if (bwprccProcCycle != null ? !bwprccProcCycle.equals(that.bwprccProcCycle) : that.bwprccProcCycle != null)
            return false;
        if (bwodatOrdDate != null ? !bwodatOrdDate.equals(that.bwodatOrdDate) : that.bwodatOrdDate != null)
            return false;
        if (bwwqlfWqlFlag != null ? !bwwqlfWqlFlag.equals(that.bwwqlfWqlFlag) : that.bwwqlfWqlFlag != null)
            return false;
        if (bwlmpccLstMnthPerCc != null ? !bwlmpccLstMnthPerCc.equals(that.bwlmpccLstMnthPerCc) : that.bwlmpccLstMnthPerCc != null)
            return false;
        if (bwcmpccMtdPerCc != null ? !bwcmpccMtdPerCc.equals(that.bwcmpccMtdPerCc) : that.bwcmpccMtdPerCc != null)
            return false;
        if (bwordccCasCreOrder != null ? !bwordccCasCreOrder.equals(that.bwordccCasCreOrder) : that.bwordccCasCreOrder != null)
            return false;
        if (bwwqlnccNotWqlCasCre != null ? !bwwqlnccNotWqlCasCre.equals(that.bwwqlnccNotWqlCasCre) : that.bwwqlnccNotWqlCasCre != null)
            return false;
        if (bwwqlyccWqlCasCre != null ? !bwwqlyccWqlCasCre.equals(that.bwwqlyccWqlCasCre) : that.bwwqlyccWqlCasCre != null)
            return false;
        if (bwpdatCreatedDate != null ? !bwpdatCreatedDate.equals(that.bwpdatCreatedDate) : that.bwpdatCreatedDate != null)
            return false;
        if (bwcusrLstChgUser != null ? !bwcusrLstChgUser.equals(that.bwcusrLstChgUser) : that.bwcusrLstChgUser != null)
            return false;
        if (bwordsOrderSrcCode != null ? !bwordsOrderSrcCode.equals(that.bwordsOrderSrcCode) : that.bwordsOrderSrcCode != null)
            return false;
        if (bwshpsShippingSrcCode != null ? !bwshpsShippingSrcCode.equals(that.bwshpsShippingSrcCode) : that.bwshpsShippingSrcCode != null)
            return false;
        if (bwotypOrdTypCode != null ? !bwotypOrdTypCode.equals(that.bwotypOrdTypCode) : that.bwotypOrdTypCode != null)
            return false;
        if (bwedteEntryTimeStamp != null ? !bwedteEntryTimeStamp.equals(that.bwedteEntryTimeStamp) : that.bwedteEntryTimeStamp != null)
            return false;
        if (bwcdteChgTimeStamp != null ? !bwcdteChgTimeStamp.equals(that.bwcdteChgTimeStamp) : that.bwcdteChgTimeStamp != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (bwcoidCompanyId != null ? bwcoidCompanyId.hashCode() : 0);
        result = 31 * result + (bwpyrProcYear != null ? bwpyrProcYear.hashCode() : 0);
        result = 31 * result + (bwpmoProcMonth != null ? bwpmoProcMonth.hashCode() : 0);
        result = 31 * result + (bwprccProcCycle != null ? bwprccProcCycle.hashCode() : 0);
        result = 31 * result + (int) (bwctlDistCtl ^ (bwctlDistCtl >>> 32));
        result = 31 * result + (bwodatOrdDate != null ? bwodatOrdDate.hashCode() : 0);
        result = 31 * result + (int) (bwordOrdNum ^ (bwordOrdNum >>> 32));
        result = 31 * result + (bwwqlfWqlFlag != null ? bwwqlfWqlFlag.hashCode() : 0);
        result = 31 * result + (bwlmpccLstMnthPerCc != null ? bwlmpccLstMnthPerCc.hashCode() : 0);
        result = 31 * result + (bwcmpccMtdPerCc != null ? bwcmpccMtdPerCc.hashCode() : 0);
        result = 31 * result + (bwordccCasCreOrder != null ? bwordccCasCreOrder.hashCode() : 0);
        result = 31 * result + (bwwqlnccNotWqlCasCre != null ? bwwqlnccNotWqlCasCre.hashCode() : 0);
        result = 31 * result + (bwwqlyccWqlCasCre != null ? bwwqlyccWqlCasCre.hashCode() : 0);
        result = 31 * result + (bwpdatCreatedDate != null ? bwpdatCreatedDate.hashCode() : 0);
        result = 31 * result + (bwcusrLstChgUser != null ? bwcusrLstChgUser.hashCode() : 0);
        result = 31 * result + (bwordsOrderSrcCode != null ? bwordsOrderSrcCode.hashCode() : 0);
        result = 31 * result + (bwshpsShippingSrcCode != null ? bwshpsShippingSrcCode.hashCode() : 0);
        result = 31 * result + (bwotypOrdTypCode != null ? bwotypOrdTypCode.hashCode() : 0);
        result = 31 * result + (bwedteEntryTimeStamp != null ? bwedteEntryTimeStamp.hashCode() : 0);
        result = 31 * result + (bwcdteChgTimeStamp != null ? bwcdteChgTimeStamp.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"BowqlpWhsQualOrdTrack\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"bwcoidCompanyId\":\"" + bwcoidCompanyId + "\""
                + ",                         \"bwpyrProcYear\":\"" + bwpyrProcYear + "\""
                + ",                         \"bwpmoProcMonth\":\"" + bwpmoProcMonth + "\""
                + ",                         \"bwprccProcCycle\":\"" + bwprccProcCycle + "\""
                + ",                         \"bwctlDistCtl\":\"" + bwctlDistCtl + "\""
                + ",                         \"bwodatOrdDate\":\"" + bwodatOrdDate + "\""
                + ",                         \"bwordOrdNum\":\"" + bwordOrdNum + "\""
                + ",                         \"bwwqlfWqlFlag\":\"" + bwwqlfWqlFlag + "\""
                + ",                         \"bwlmpccLstMnthPerCc\":\"" + bwlmpccLstMnthPerCc + "\""
                + ",                         \"bwcmpccMtdPerCc\":\"" + bwcmpccMtdPerCc + "\""
                + ",                         \"bwordccCasCreOrder\":\"" + bwordccCasCreOrder + "\""
                + ",                         \"bwwqlnccNotWqlCasCre\":\"" + bwwqlnccNotWqlCasCre + "\""
                + ",                         \"bwwqlyccWqlCasCre\":\"" + bwwqlyccWqlCasCre + "\""
                + ",                         \"bwpdatCreatedDate\":\"" + bwpdatCreatedDate + "\""
                + ",                         \"bwcusrLstChgUser\":\"" + bwcusrLstChgUser + "\""
                + ",                         \"bwordsOrderSrcCode\":\"" + bwordsOrderSrcCode + "\""
                + ",                         \"bwshpsShippingSrcCode\":\"" + bwshpsShippingSrcCode + "\""
                + ",                         \"bwotypOrdTypCode\":\"" + bwotypOrdTypCode + "\""
                + ",                         \"bwedteEntryTimeStamp\":\"" + bwedteEntryTimeStamp + "\""
                + ",                         \"bwcdteChgTimeStamp\":\"" + bwcdteChgTimeStamp + "\""
                + "}}";
    }
}
