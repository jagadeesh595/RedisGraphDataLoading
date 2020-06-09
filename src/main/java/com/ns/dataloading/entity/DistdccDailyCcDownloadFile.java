package com.ns.dataloading.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "DISTDCC_DailyCCDownloadFile")
public class DistdccDailyCcDownloadFile {
    private Long id;
    private Long dictlDistributorCtrl;
    private Long dictycDistributorCity;
    private Long dididDistributorId;
    private BigDecimal dprpccPrevMonthPersonalCc;
    private BigDecimal dprdccPrevMonthDistCc;
    private BigDecimal dpraccPrevMonthActiveCc;
    private BigDecimal dprnccPrevMonthNonMgrCc;
    private BigDecimal dprtccPrevMonthTotCc;
    private BigDecimal dcrpccCurrMonthPerCc;
    private BigDecimal dcrdccCurrMonthDistCc;
    private BigDecimal dcraccCurrMonthActiveCc;
    private BigDecimal dcrnccCurrMonthNonMgrCc;
    private BigDecimal dcrtccCurrMonthTotCc;
    private Integer dprpmoPrevProcessMonth;
    private Integer dcrpmoCurrProcessMonth;
    private String dccborBonusSystemOrigin;
    private Integer dprpyrPrevProcessYear;
    private Integer dcrpyrCurrProcessYear;
    private String diqualWeblookUpQualFlag;
    private String dizipcZipCode;
    private String dilprfLanguagePrefernece;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DICTL_DistributorCtrl", nullable = false)
    public Long getDictlDistributorCtrl() {
        return dictlDistributorCtrl;
    }

    public void setDictlDistributorCtrl(Long dictlDistributorCtrl) {
        this.dictlDistributorCtrl = dictlDistributorCtrl;
    }

    @Basic
    @Column(name = "DICTYC_DistributorCity", nullable = true)
    public Long getDictycDistributorCity() {
        return dictycDistributorCity;
    }

    public void setDictycDistributorCity(Long dictycDistributorCity) {
        this.dictycDistributorCity = dictycDistributorCity;
    }

    @Basic
    @Column(name = "DIDID_DistributorId", nullable = true)
    public Long getDididDistributorId() {
        return dididDistributorId;
    }

    public void setDididDistributorId(Long dididDistributorId) {
        this.dididDistributorId = dididDistributorId;
    }

    @Basic
    @Column(name = "DPRPCC_PrevMonthPersonalCC", nullable = true, precision = 3)
    public BigDecimal getDprpccPrevMonthPersonalCc() {
        return dprpccPrevMonthPersonalCc;
    }

    public void setDprpccPrevMonthPersonalCc(BigDecimal dprpccPrevMonthPersonalCc) {
        this.dprpccPrevMonthPersonalCc = dprpccPrevMonthPersonalCc;
    }

    @Basic
    @Column(name = "DPRDCC_PrevMonthDistCC", nullable = true, precision = 3)
    public BigDecimal getDprdccPrevMonthDistCc() {
        return dprdccPrevMonthDistCc;
    }

    public void setDprdccPrevMonthDistCc(BigDecimal dprdccPrevMonthDistCc) {
        this.dprdccPrevMonthDistCc = dprdccPrevMonthDistCc;
    }

    @Basic
    @Column(name = "DPRACC_PrevMonthActiveCC", nullable = true, precision = 3)
    public BigDecimal getDpraccPrevMonthActiveCc() {
        return dpraccPrevMonthActiveCc;
    }

    public void setDpraccPrevMonthActiveCc(BigDecimal dpraccPrevMonthActiveCc) {
        this.dpraccPrevMonthActiveCc = dpraccPrevMonthActiveCc;
    }

    @Basic
    @Column(name = "DPRNCC_PrevMonthNonMgrCC", nullable = true, precision = 3)
    public BigDecimal getDprnccPrevMonthNonMgrCc() {
        return dprnccPrevMonthNonMgrCc;
    }

    public void setDprnccPrevMonthNonMgrCc(BigDecimal dprnccPrevMonthNonMgrCc) {
        this.dprnccPrevMonthNonMgrCc = dprnccPrevMonthNonMgrCc;
    }

    @Basic
    @Column(name = "DPRTCC_PrevMonthTotCC", nullable = true, precision = 3)
    public BigDecimal getDprtccPrevMonthTotCc() {
        return dprtccPrevMonthTotCc;
    }

    public void setDprtccPrevMonthTotCc(BigDecimal dprtccPrevMonthTotCc) {
        this.dprtccPrevMonthTotCc = dprtccPrevMonthTotCc;
    }

    @Basic
    @Column(name = "DCRPCC_CurrMonthPerCC", nullable = true, precision = 3)
    public BigDecimal getDcrpccCurrMonthPerCc() {
        return dcrpccCurrMonthPerCc;
    }

    public void setDcrpccCurrMonthPerCc(BigDecimal dcrpccCurrMonthPerCc) {
        this.dcrpccCurrMonthPerCc = dcrpccCurrMonthPerCc;
    }

    @Basic
    @Column(name = "DCRDCC_CurrMonthDistCC", nullable = true, precision = 3)
    public BigDecimal getDcrdccCurrMonthDistCc() {
        return dcrdccCurrMonthDistCc;
    }

    public void setDcrdccCurrMonthDistCc(BigDecimal dcrdccCurrMonthDistCc) {
        this.dcrdccCurrMonthDistCc = dcrdccCurrMonthDistCc;
    }

    @Basic
    @Column(name = "DCRACC_CurrMonthActiveCC", nullable = true, precision = 3)
    public BigDecimal getDcraccCurrMonthActiveCc() {
        return dcraccCurrMonthActiveCc;
    }

    public void setDcraccCurrMonthActiveCc(BigDecimal dcraccCurrMonthActiveCc) {
        this.dcraccCurrMonthActiveCc = dcraccCurrMonthActiveCc;
    }

    @Basic
    @Column(name = "DCRNCC_CurrMonthNonMgrCC", nullable = true, precision = 3)
    public BigDecimal getDcrnccCurrMonthNonMgrCc() {
        return dcrnccCurrMonthNonMgrCc;
    }

    public void setDcrnccCurrMonthNonMgrCc(BigDecimal dcrnccCurrMonthNonMgrCc) {
        this.dcrnccCurrMonthNonMgrCc = dcrnccCurrMonthNonMgrCc;
    }

    @Basic
    @Column(name = "DCRTCC_CurrMonthTotCC", nullable = true, precision = 3)
    public BigDecimal getDcrtccCurrMonthTotCc() {
        return dcrtccCurrMonthTotCc;
    }

    public void setDcrtccCurrMonthTotCc(BigDecimal dcrtccCurrMonthTotCc) {
        this.dcrtccCurrMonthTotCc = dcrtccCurrMonthTotCc;
    }

    @Basic
    @Column(name = "DPRPMO_PrevProcessMonth", nullable = true)
    public Integer getDprpmoPrevProcessMonth() {
        return dprpmoPrevProcessMonth;
    }

    public void setDprpmoPrevProcessMonth(Integer dprpmoPrevProcessMonth) {
        this.dprpmoPrevProcessMonth = dprpmoPrevProcessMonth;
    }

    @Basic
    @Column(name = "DCRPMO_CurrProcessMonth", nullable = true)
    public Integer getDcrpmoCurrProcessMonth() {
        return dcrpmoCurrProcessMonth;
    }

    public void setDcrpmoCurrProcessMonth(Integer dcrpmoCurrProcessMonth) {
        this.dcrpmoCurrProcessMonth = dcrpmoCurrProcessMonth;
    }

    @Basic
    @Column(name = "DCCBOR_BonusSystemOrigin", nullable = true, length = 255)
    public String getDccborBonusSystemOrigin() {
        return dccborBonusSystemOrigin;
    }

    public void setDccborBonusSystemOrigin(String dccborBonusSystemOrigin) {
        this.dccborBonusSystemOrigin = dccborBonusSystemOrigin;
    }

    @Basic
    @Column(name = "DPRPYR_PrevProcessYear", nullable = true)
    public Integer getDprpyrPrevProcessYear() {
        return dprpyrPrevProcessYear;
    }

    public void setDprpyrPrevProcessYear(Integer dprpyrPrevProcessYear) {
        this.dprpyrPrevProcessYear = dprpyrPrevProcessYear;
    }

    @Basic
    @Column(name = "DCRPYR_CurrProcessYear", nullable = true)
    public Integer getDcrpyrCurrProcessYear() {
        return dcrpyrCurrProcessYear;
    }

    public void setDcrpyrCurrProcessYear(Integer dcrpyrCurrProcessYear) {
        this.dcrpyrCurrProcessYear = dcrpyrCurrProcessYear;
    }

    @Basic
    @Column(name = "DIQUAL_WeblookUpQualFlag", nullable = true, length = 1)
    public String getDiqualWeblookUpQualFlag() {
        return diqualWeblookUpQualFlag;
    }

    public void setDiqualWeblookUpQualFlag(String diqualWeblookUpQualFlag) {
        this.diqualWeblookUpQualFlag = diqualWeblookUpQualFlag;
    }

    @Basic
    @Column(name = "DIZIPC_ZipCode", nullable = true, length = 10)
    public String getDizipcZipCode() {
        return dizipcZipCode;
    }

    public void setDizipcZipCode(String dizipcZipCode) {
        this.dizipcZipCode = dizipcZipCode;
    }

    @Basic
    @Column(name = "DILPRF_LanguagePrefernece", nullable = true, length = 1)
    public String getDilprfLanguagePrefernece() {
        return dilprfLanguagePrefernece;
    }

    public void setDilprfLanguagePrefernece(String dilprfLanguagePrefernece) {
        this.dilprfLanguagePrefernece = dilprfLanguagePrefernece;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DistdccDailyCcDownloadFile that = (DistdccDailyCcDownloadFile) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (dictlDistributorCtrl != null ? !dictlDistributorCtrl.equals(that.dictlDistributorCtrl) : that.dictlDistributorCtrl != null)
            return false;
        if (dictycDistributorCity != null ? !dictycDistributorCity.equals(that.dictycDistributorCity) : that.dictycDistributorCity != null)
            return false;
        if (dididDistributorId != null ? !dididDistributorId.equals(that.dididDistributorId) : that.dididDistributorId != null)
            return false;
        if (dprpccPrevMonthPersonalCc != null ? !dprpccPrevMonthPersonalCc.equals(that.dprpccPrevMonthPersonalCc) : that.dprpccPrevMonthPersonalCc != null)
            return false;
        if (dprdccPrevMonthDistCc != null ? !dprdccPrevMonthDistCc.equals(that.dprdccPrevMonthDistCc) : that.dprdccPrevMonthDistCc != null)
            return false;
        if (dpraccPrevMonthActiveCc != null ? !dpraccPrevMonthActiveCc.equals(that.dpraccPrevMonthActiveCc) : that.dpraccPrevMonthActiveCc != null)
            return false;
        if (dprnccPrevMonthNonMgrCc != null ? !dprnccPrevMonthNonMgrCc.equals(that.dprnccPrevMonthNonMgrCc) : that.dprnccPrevMonthNonMgrCc != null)
            return false;
        if (dprtccPrevMonthTotCc != null ? !dprtccPrevMonthTotCc.equals(that.dprtccPrevMonthTotCc) : that.dprtccPrevMonthTotCc != null)
            return false;
        if (dcrpccCurrMonthPerCc != null ? !dcrpccCurrMonthPerCc.equals(that.dcrpccCurrMonthPerCc) : that.dcrpccCurrMonthPerCc != null)
            return false;
        if (dcrdccCurrMonthDistCc != null ? !dcrdccCurrMonthDistCc.equals(that.dcrdccCurrMonthDistCc) : that.dcrdccCurrMonthDistCc != null)
            return false;
        if (dcraccCurrMonthActiveCc != null ? !dcraccCurrMonthActiveCc.equals(that.dcraccCurrMonthActiveCc) : that.dcraccCurrMonthActiveCc != null)
            return false;
        if (dcrnccCurrMonthNonMgrCc != null ? !dcrnccCurrMonthNonMgrCc.equals(that.dcrnccCurrMonthNonMgrCc) : that.dcrnccCurrMonthNonMgrCc != null)
            return false;
        if (dcrtccCurrMonthTotCc != null ? !dcrtccCurrMonthTotCc.equals(that.dcrtccCurrMonthTotCc) : that.dcrtccCurrMonthTotCc != null)
            return false;
        if (dprpmoPrevProcessMonth != null ? !dprpmoPrevProcessMonth.equals(that.dprpmoPrevProcessMonth) : that.dprpmoPrevProcessMonth != null)
            return false;
        if (dcrpmoCurrProcessMonth != null ? !dcrpmoCurrProcessMonth.equals(that.dcrpmoCurrProcessMonth) : that.dcrpmoCurrProcessMonth != null)
            return false;
        if (dccborBonusSystemOrigin != null ? !dccborBonusSystemOrigin.equals(that.dccborBonusSystemOrigin) : that.dccborBonusSystemOrigin != null)
            return false;
        if (dprpyrPrevProcessYear != null ? !dprpyrPrevProcessYear.equals(that.dprpyrPrevProcessYear) : that.dprpyrPrevProcessYear != null)
            return false;
        if (dcrpyrCurrProcessYear != null ? !dcrpyrCurrProcessYear.equals(that.dcrpyrCurrProcessYear) : that.dcrpyrCurrProcessYear != null)
            return false;
        if (diqualWeblookUpQualFlag != null ? !diqualWeblookUpQualFlag.equals(that.diqualWeblookUpQualFlag) : that.diqualWeblookUpQualFlag != null)
            return false;
        if (dizipcZipCode != null ? !dizipcZipCode.equals(that.dizipcZipCode) : that.dizipcZipCode != null)
            return false;
        if (dilprfLanguagePrefernece != null ? !dilprfLanguagePrefernece.equals(that.dilprfLanguagePrefernece) : that.dilprfLanguagePrefernece != null)
            return false;

        return true;
    }


    public DistdccDailyCcDownloadFile copy() {
        DistdccDailyCcDownloadFile d = new DistdccDailyCcDownloadFile();
        d.dictlDistributorCtrl = dictlDistributorCtrl;
        d.dictycDistributorCity = dictycDistributorCity;
        d.dididDistributorId = dididDistributorId;
        d.dprpccPrevMonthPersonalCc = dprpccPrevMonthPersonalCc;
        d.dprdccPrevMonthDistCc = dprdccPrevMonthDistCc;
        d.dpraccPrevMonthActiveCc = dpraccPrevMonthActiveCc;
        d.dprnccPrevMonthNonMgrCc = dprnccPrevMonthNonMgrCc;
        d.dprtccPrevMonthTotCc = dprtccPrevMonthTotCc;
        d.dcrpccCurrMonthPerCc = dcrpccCurrMonthPerCc;
        d.dcrdccCurrMonthDistCc = dcrdccCurrMonthDistCc;
        d.dcraccCurrMonthActiveCc = dcraccCurrMonthActiveCc;
        d.dcrnccCurrMonthNonMgrCc = dcrnccCurrMonthNonMgrCc;
        d.dcrtccCurrMonthTotCc = dcrtccCurrMonthTotCc;
        d.dprpmoPrevProcessMonth = dprpmoPrevProcessMonth;
        d.dcrpmoCurrProcessMonth = dcrpmoCurrProcessMonth;
        d.dccborBonusSystemOrigin = dccborBonusSystemOrigin;
        d.dprpyrPrevProcessYear = dprpyrPrevProcessYear;
        d.dcrpyrCurrProcessYear = dcrpyrCurrProcessYear;
        d.diqualWeblookUpQualFlag = diqualWeblookUpQualFlag;
        d.dizipcZipCode = dizipcZipCode;
        d.dilprfLanguagePrefernece = dilprfLanguagePrefernece;
        return d;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dictlDistributorCtrl != null ? dictlDistributorCtrl.hashCode() : 0);
        result = 31 * result + (dictycDistributorCity != null ? dictycDistributorCity.hashCode() : 0);
        result = 31 * result + (dididDistributorId != null ? dididDistributorId.hashCode() : 0);
        result = 31 * result + (dprpccPrevMonthPersonalCc != null ? dprpccPrevMonthPersonalCc.hashCode() : 0);
        result = 31 * result + (dprdccPrevMonthDistCc != null ? dprdccPrevMonthDistCc.hashCode() : 0);
        result = 31 * result + (dpraccPrevMonthActiveCc != null ? dpraccPrevMonthActiveCc.hashCode() : 0);
        result = 31 * result + (dprnccPrevMonthNonMgrCc != null ? dprnccPrevMonthNonMgrCc.hashCode() : 0);
        result = 31 * result + (dprtccPrevMonthTotCc != null ? dprtccPrevMonthTotCc.hashCode() : 0);
        result = 31 * result + (dcrpccCurrMonthPerCc != null ? dcrpccCurrMonthPerCc.hashCode() : 0);
        result = 31 * result + (dcrdccCurrMonthDistCc != null ? dcrdccCurrMonthDistCc.hashCode() : 0);
        result = 31 * result + (dcraccCurrMonthActiveCc != null ? dcraccCurrMonthActiveCc.hashCode() : 0);
        result = 31 * result + (dcrnccCurrMonthNonMgrCc != null ? dcrnccCurrMonthNonMgrCc.hashCode() : 0);
        result = 31 * result + (dcrtccCurrMonthTotCc != null ? dcrtccCurrMonthTotCc.hashCode() : 0);
        result = 31 * result + (dprpmoPrevProcessMonth != null ? dprpmoPrevProcessMonth.hashCode() : 0);
        result = 31 * result + (dcrpmoCurrProcessMonth != null ? dcrpmoCurrProcessMonth.hashCode() : 0);
        result = 31 * result + (dccborBonusSystemOrigin != null ? dccborBonusSystemOrigin.hashCode() : 0);
        result = 31 * result + (dprpyrPrevProcessYear != null ? dprpyrPrevProcessYear.hashCode() : 0);
        result = 31 * result + (dcrpyrCurrProcessYear != null ? dcrpyrCurrProcessYear.hashCode() : 0);
        result = 31 * result + (diqualWeblookUpQualFlag != null ? diqualWeblookUpQualFlag.hashCode() : 0);
        result = 31 * result + (dizipcZipCode != null ? dizipcZipCode.hashCode() : 0);
        result = 31 * result + (dilprfLanguagePrefernece != null ? dilprfLanguagePrefernece.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"DistdccDailyCcDownloadFile\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"dictlDistributorCtrl\":\"" + dictlDistributorCtrl + "\""
                + ",                         \"dictycDistributorCity\":\"" + dictycDistributorCity + "\""
                + ",                         \"dididDistributorId\":\"" + dididDistributorId + "\""
                + ",                         \"dprpccPrevMonthPersonalCc\":\"" + dprpccPrevMonthPersonalCc + "\""
                + ",                         \"dprdccPrevMonthDistCc\":\"" + dprdccPrevMonthDistCc + "\""
                + ",                         \"dpraccPrevMonthActiveCc\":\"" + dpraccPrevMonthActiveCc + "\""
                + ",                         \"dprnccPrevMonthNonMgrCc\":\"" + dprnccPrevMonthNonMgrCc + "\""
                + ",                         \"dprtccPrevMonthTotCc\":\"" + dprtccPrevMonthTotCc + "\""
                + ",                         \"dcrpccCurrMonthPerCc\":\"" + dcrpccCurrMonthPerCc + "\""
                + ",                         \"dcrdccCurrMonthDistCc\":\"" + dcrdccCurrMonthDistCc + "\""
                + ",                         \"dcraccCurrMonthActiveCc\":\"" + dcraccCurrMonthActiveCc + "\""
                + ",                         \"dcrnccCurrMonthNonMgrCc\":\"" + dcrnccCurrMonthNonMgrCc + "\""
                + ",                         \"dcrtccCurrMonthTotCc\":\"" + dcrtccCurrMonthTotCc + "\""
                + ",                         \"dprpmoPrevProcessMonth\":\"" + dprpmoPrevProcessMonth + "\""
                + ",                         \"dcrpmoCurrProcessMonth\":\"" + dcrpmoCurrProcessMonth + "\""
                + ",                         \"dccborBonusSystemOrigin\":\"" + dccborBonusSystemOrigin + "\""
                + ",                         \"dprpyrPrevProcessYear\":\"" + dprpyrPrevProcessYear + "\""
                + ",                         \"dcrpyrCurrProcessYear\":\"" + dcrpyrCurrProcessYear + "\""
                + ",                         \"diqualWeblookUpQualFlag\":\"" + diqualWeblookUpQualFlag + "\""
                + ",                         \"dizipcZipCode\":\"" + dizipcZipCode + "\""
                + ",                         \"dilprfLanguagePrefernece\":\"" + dilprfLanguagePrefernece + "\""
                + "}}";
    }
}
