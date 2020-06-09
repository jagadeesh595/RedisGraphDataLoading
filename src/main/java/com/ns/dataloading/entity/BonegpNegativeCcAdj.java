package com.ns.dataloading.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "BONEGP_NegativeCCAdj")
public class BonegpNegativeCcAdj {
    private Long id;
    private Integer bnpyrProcPeriodYear;
    private Integer bnpmoProcPeriodMonth;
    private String bncoidCompanyId;
    private Long bnctycCountryCode;
    private Long bndidDistributorId;
    private String bnetypErrorType;
    private String bnecdeErrorCode;
    private BigDecimal bnpccrCcFromBohstp;
    private BigDecimal bntccrCaseCreditAdj;
    private Integer bnfmoAdjForMonth;
    private Integer bnfyrAdjForYear;
    private String bncdatLastChangeDate;
    private String bncusrLastChangeUser;

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
    @Column(name = "BNPYR_ProcPeriodYear", nullable = true)
    public Integer getBnpyrProcPeriodYear() {
        return bnpyrProcPeriodYear;
    }

    public void setBnpyrProcPeriodYear(Integer bnpyrProcPeriodYear) {
        this.bnpyrProcPeriodYear = bnpyrProcPeriodYear;
    }

    @Basic
    @Column(name = "BNPMO_ProcPeriodMonth", nullable = true)
    public Integer getBnpmoProcPeriodMonth() {
        return bnpmoProcPeriodMonth;
    }

    public void setBnpmoProcPeriodMonth(Integer bnpmoProcPeriodMonth) {
        this.bnpmoProcPeriodMonth = bnpmoProcPeriodMonth;
    }

    @Basic
    @Column(name = "BNCOID_CompanyId", nullable = true, length = 15)
    public String getBncoidCompanyId() {
        return bncoidCompanyId;
    }

    public void setBncoidCompanyId(String bncoidCompanyId) {
        this.bncoidCompanyId = bncoidCompanyId;
    }

    @Basic
    @Column(name = "BNCTYC_CountryCode", nullable = true)
    public Long getBnctycCountryCode() {
        return bnctycCountryCode;
    }

    public void setBnctycCountryCode(Long bnctycCountryCode) {
        this.bnctycCountryCode = bnctycCountryCode;
    }

    @Basic
    @Column(name = "BNDID_DistributorId", nullable = true)
    public Long getBndidDistributorId() {
        return bndidDistributorId;
    }

    public void setBndidDistributorId(Long bndidDistributorId) {
        this.bndidDistributorId = bndidDistributorId;
    }

    @Basic
    @Column(name = "BNETYP_ErrorType", nullable = true, length = 15)
    public String getBnetypErrorType() {
        return bnetypErrorType;
    }

    public void setBnetypErrorType(String bnetypErrorType) {
        this.bnetypErrorType = bnetypErrorType;
    }

    @Basic
    @Column(name = "BNECDE_ErrorCode", nullable = true, length = 15)
    public String getBnecdeErrorCode() {
        return bnecdeErrorCode;
    }

    public void setBnecdeErrorCode(String bnecdeErrorCode) {
        this.bnecdeErrorCode = bnecdeErrorCode;
    }

    @Basic
    @Column(name = "BNPCCR_CCFromBohstp", nullable = true, precision = 3)
    public BigDecimal getBnpccrCcFromBohstp() {
        return bnpccrCcFromBohstp;
    }

    public void setBnpccrCcFromBohstp(BigDecimal bnpccrCcFromBohstp) {
        this.bnpccrCcFromBohstp = bnpccrCcFromBohstp;
    }

    @Basic
    @Column(name = "BNTCCR_CaseCreditAdj", nullable = true, precision = 3)
    public BigDecimal getBntccrCaseCreditAdj() {
        return bntccrCaseCreditAdj;
    }

    public void setBntccrCaseCreditAdj(BigDecimal bntccrCaseCreditAdj) {
        this.bntccrCaseCreditAdj = bntccrCaseCreditAdj;
    }

    @Basic
    @Column(name = "BNFMO_AdjForMonth", nullable = true)
    public Integer getBnfmoAdjForMonth() {
        return bnfmoAdjForMonth;
    }

    public void setBnfmoAdjForMonth(Integer bnfmoAdjForMonth) {
        this.bnfmoAdjForMonth = bnfmoAdjForMonth;
    }

    @Basic
    @Column(name = "BNFYR_AdjForYear", nullable = true)
    public Integer getBnfyrAdjForYear() {
        return bnfyrAdjForYear;
    }

    public void setBnfyrAdjForYear(Integer bnfyrAdjForYear) {
        this.bnfyrAdjForYear = bnfyrAdjForYear;
    }

    @Basic
    @Column(name = "BNCDAT_LastChangeDate", nullable = true, length = 10)
    public String getBncdatLastChangeDate() {
        return bncdatLastChangeDate;
    }

    public void setBncdatLastChangeDate(String bncdatLastChangeDate) {
        this.bncdatLastChangeDate = bncdatLastChangeDate;
    }

    @Basic
    @Column(name = "BNCUSR_LastChangeUser", nullable = true, length = 255)
    public String getBncusrLastChangeUser() {
        return bncusrLastChangeUser;
    }

    public void setBncusrLastChangeUser(String bncusrLastChangeUser) {
        this.bncusrLastChangeUser = bncusrLastChangeUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BonegpNegativeCcAdj that = (BonegpNegativeCcAdj) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (bnpyrProcPeriodYear != null ? !bnpyrProcPeriodYear.equals(that.bnpyrProcPeriodYear) : that.bnpyrProcPeriodYear != null)
            return false;
        if (bnpmoProcPeriodMonth != null ? !bnpmoProcPeriodMonth.equals(that.bnpmoProcPeriodMonth) : that.bnpmoProcPeriodMonth != null)
            return false;
        if (bncoidCompanyId != null ? !bncoidCompanyId.equals(that.bncoidCompanyId) : that.bncoidCompanyId != null)
            return false;
        if (bnctycCountryCode != null ? !bnctycCountryCode.equals(that.bnctycCountryCode) : that.bnctycCountryCode != null)
            return false;
        if (bndidDistributorId != null ? !bndidDistributorId.equals(that.bndidDistributorId) : that.bndidDistributorId != null)
            return false;
        if (bnetypErrorType != null ? !bnetypErrorType.equals(that.bnetypErrorType) : that.bnetypErrorType != null)
            return false;
        if (bnecdeErrorCode != null ? !bnecdeErrorCode.equals(that.bnecdeErrorCode) : that.bnecdeErrorCode != null)
            return false;
        if (bnpccrCcFromBohstp != null ? !bnpccrCcFromBohstp.equals(that.bnpccrCcFromBohstp) : that.bnpccrCcFromBohstp != null)
            return false;
        if (bntccrCaseCreditAdj != null ? !bntccrCaseCreditAdj.equals(that.bntccrCaseCreditAdj) : that.bntccrCaseCreditAdj != null)
            return false;
        if (bnfmoAdjForMonth != null ? !bnfmoAdjForMonth.equals(that.bnfmoAdjForMonth) : that.bnfmoAdjForMonth != null)
            return false;
        if (bnfyrAdjForYear != null ? !bnfyrAdjForYear.equals(that.bnfyrAdjForYear) : that.bnfyrAdjForYear != null)
            return false;
        if (bncdatLastChangeDate != null ? !bncdatLastChangeDate.equals(that.bncdatLastChangeDate) : that.bncdatLastChangeDate != null)
            return false;
        if (bncusrLastChangeUser != null ? !bncusrLastChangeUser.equals(that.bncusrLastChangeUser) : that.bncusrLastChangeUser != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (bnpyrProcPeriodYear != null ? bnpyrProcPeriodYear.hashCode() : 0);
        result = 31 * result + (bnpmoProcPeriodMonth != null ? bnpmoProcPeriodMonth.hashCode() : 0);
        result = 31 * result + (bncoidCompanyId != null ? bncoidCompanyId.hashCode() : 0);
        result = 31 * result + (bnctycCountryCode != null ? bnctycCountryCode.hashCode() : 0);
        result = 31 * result + (bndidDistributorId != null ? bndidDistributorId.hashCode() : 0);
        result = 31 * result + (bnetypErrorType != null ? bnetypErrorType.hashCode() : 0);
        result = 31 * result + (bnecdeErrorCode != null ? bnecdeErrorCode.hashCode() : 0);
        result = 31 * result + (bnpccrCcFromBohstp != null ? bnpccrCcFromBohstp.hashCode() : 0);
        result = 31 * result + (bntccrCaseCreditAdj != null ? bntccrCaseCreditAdj.hashCode() : 0);
        result = 31 * result + (bnfmoAdjForMonth != null ? bnfmoAdjForMonth.hashCode() : 0);
        result = 31 * result + (bnfyrAdjForYear != null ? bnfyrAdjForYear.hashCode() : 0);
        result = 31 * result + (bncdatLastChangeDate != null ? bncdatLastChangeDate.hashCode() : 0);
        result = 31 * result + (bncusrLastChangeUser != null ? bncusrLastChangeUser.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"BonegpNegativeCcAdj\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"bnpyrProcPeriodYear\":\"" + bnpyrProcPeriodYear + "\""
                + ",                         \"bnpmoProcPeriodMonth\":\"" + bnpmoProcPeriodMonth + "\""
                + ",                         \"bncoidCompanyId\":\"" + bncoidCompanyId + "\""
                + ",                         \"bnctycCountryCode\":\"" + bnctycCountryCode + "\""
                + ",                         \"bndidDistributorId\":\"" + bndidDistributorId + "\""
                + ",                         \"bnetypErrorType\":\"" + bnetypErrorType + "\""
                + ",                         \"bnecdeErrorCode\":\"" + bnecdeErrorCode + "\""
                + ",                         \"bnpccrCcFromBohstp\":\"" + bnpccrCcFromBohstp + "\""
                + ",                         \"bntccrCaseCreditAdj\":\"" + bntccrCaseCreditAdj + "\""
                + ",                         \"bnfmoAdjForMonth\":\"" + bnfmoAdjForMonth + "\""
                + ",                         \"bnfyrAdjForYear\":\"" + bnfyrAdjForYear + "\""
                + ",                         \"bncdatLastChangeDate\":\"" + bncdatLastChangeDate + "\""
                + ",                         \"bncusrLastChangeUser\":\"" + bncusrLastChangeUser + "\""
                + "}}";
    }

    public BonegpNegativeCcAdj copy() {
        BonegpNegativeCcAdj bonegp = new BonegpNegativeCcAdj();
        bonegp.bnpyrProcPeriodYear = bnpyrProcPeriodYear;
        bonegp.bnpmoProcPeriodMonth = bnpmoProcPeriodMonth;
        bonegp.bncoidCompanyId = bncoidCompanyId;
        bonegp.bnctycCountryCode = bnctycCountryCode;
        bonegp.bndidDistributorId = bndidDistributorId;
        bonegp.bnetypErrorType = bnetypErrorType;
        bonegp.bnecdeErrorCode = bnecdeErrorCode;
        bonegp.bnpccrCcFromBohstp = bnpccrCcFromBohstp;
        bonegp.bntccrCaseCreditAdj = bntccrCaseCreditAdj;
        bonegp.bnfmoAdjForMonth = bnfmoAdjForMonth;
        bonegp.bnfyrAdjForYear = bnfyrAdjForYear;
        bonegp.bncdatLastChangeDate = bncdatLastChangeDate;
        bonegp.bncusrLastChangeUser = bncusrLastChangeUser;
        return bonegp;
    }
}
