package com.ns.dataloading.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "BOCHKP_BonusCheckFile")
public class BochkpBonusCheckFile {
    private Long id;
    private String bccoidCompanyId;
    private Long bcbacBankAccountNum;
    private Integer bcpyrProcessingYear;
    private Integer bcpmoProcessingMonth;
    private Long bcchkCheckNum;
    private Long bcctlDistributorControl;
    private BigDecimal bctamtCheckAmount;
    private String bcstcdCheckStatCode;
    private String bccdatLastChangeDate;
    private String bccusrLastChangeUser;

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
    @Column(name = "BCCOID_CompanyId", nullable = true, length = 15)
    public String getBccoidCompanyId() {
        return bccoidCompanyId;
    }

    public void setBccoidCompanyId(String bccoidCompanyId) {
        this.bccoidCompanyId = bccoidCompanyId;
    }

    @Basic
    @Column(name = "BCBAC_BankAccountNum", nullable = true)
    public Long getBcbacBankAccountNum() {
        return bcbacBankAccountNum;
    }

    public void setBcbacBankAccountNum(Long bcbacBankAccountNum) {
        this.bcbacBankAccountNum = bcbacBankAccountNum;
    }

    @Basic
    @Column(name = "BCPYR_ProcessingYear", nullable = true)
    public Integer getBcpyrProcessingYear() {
        return bcpyrProcessingYear;
    }

    public void setBcpyrProcessingYear(Integer bcpyrProcessingYear) {
        this.bcpyrProcessingYear = bcpyrProcessingYear;
    }

    @Basic
    @Column(name = "BCPMO_ProcessingMonth", nullable = true)
    public Integer getBcpmoProcessingMonth() {
        return bcpmoProcessingMonth;
    }

    public void setBcpmoProcessingMonth(Integer bcpmoProcessingMonth) {
        this.bcpmoProcessingMonth = bcpmoProcessingMonth;
    }

    @Basic
    @Column(name = "BCCHK_CheckNum", nullable = true)
    public Long getBcchkCheckNum() {
        return bcchkCheckNum;
    }

    public void setBcchkCheckNum(Long bcchkCheckNum) {
        this.bcchkCheckNum = bcchkCheckNum;
    }

    @Basic
    @Column(name = "BCCTL_DistributorControl", nullable = false)
    public Long getBcctlDistributorControl() {
        return bcctlDistributorControl;
    }

    public void setBcctlDistributorControl(Long bcctlDistributorControl) {
        this.bcctlDistributorControl = bcctlDistributorControl;
    }

    @Basic
    @Column(name = "BCTAMT_CheckAmount", nullable = true, precision = 2)
    public BigDecimal getBctamtCheckAmount() {
        return bctamtCheckAmount;
    }

    public void setBctamtCheckAmount(BigDecimal bctamtCheckAmount) {
        this.bctamtCheckAmount = bctamtCheckAmount;
    }

    @Basic
    @Column(name = "BCSTCD_CheckStatCode", nullable = true, length = 1)
    public String getBcstcdCheckStatCode() {
        return bcstcdCheckStatCode;
    }

    public void setBcstcdCheckStatCode(String bcstcdCheckStatCode) {
        this.bcstcdCheckStatCode = bcstcdCheckStatCode;
    }

    @Basic
    @Column(name = "BCCDAT_LastChangeDate", nullable = true, length = 15)
    public String getBccdatLastChangeDate() {
        return bccdatLastChangeDate;
    }

    public void setBccdatLastChangeDate(String bccdatLastChangeDate) {
        this.bccdatLastChangeDate = bccdatLastChangeDate;
    }

    @Basic
    @Column(name = "BCCUSR_LastChangeUser", nullable = true, length = 255)
    public String getBccusrLastChangeUser() {
        return bccusrLastChangeUser;
    }

    public void setBccusrLastChangeUser(String bccusrLastChangeUser) {
        this.bccusrLastChangeUser = bccusrLastChangeUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BochkpBonusCheckFile that = (BochkpBonusCheckFile) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (bccoidCompanyId != null ? !bccoidCompanyId.equals(that.bccoidCompanyId) : that.bccoidCompanyId != null)
            return false;
        if (bcbacBankAccountNum != null ? !bcbacBankAccountNum.equals(that.bcbacBankAccountNum) : that.bcbacBankAccountNum != null)
            return false;
        if (bcpyrProcessingYear != null ? !bcpyrProcessingYear.equals(that.bcpyrProcessingYear) : that.bcpyrProcessingYear != null)
            return false;
        if (bcpmoProcessingMonth != null ? !bcpmoProcessingMonth.equals(that.bcpmoProcessingMonth) : that.bcpmoProcessingMonth != null)
            return false;
        if (bcchkCheckNum != null ? !bcchkCheckNum.equals(that.bcchkCheckNum) : that.bcchkCheckNum != null)
            return false;
        if (bcctlDistributorControl != null ? !bcctlDistributorControl.equals(that.bcctlDistributorControl) : that.bcctlDistributorControl != null)
            return false;
        if (bctamtCheckAmount != null ? !bctamtCheckAmount.equals(that.bctamtCheckAmount) : that.bctamtCheckAmount != null)
            return false;
        if (bcstcdCheckStatCode != null ? !bcstcdCheckStatCode.equals(that.bcstcdCheckStatCode) : that.bcstcdCheckStatCode != null)
            return false;
        if (bccdatLastChangeDate != null ? !bccdatLastChangeDate.equals(that.bccdatLastChangeDate) : that.bccdatLastChangeDate != null)
            return false;
        if (bccusrLastChangeUser != null ? !bccusrLastChangeUser.equals(that.bccusrLastChangeUser) : that.bccusrLastChangeUser != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (bccoidCompanyId != null ? bccoidCompanyId.hashCode() : 0);
        result = 31 * result + (bcbacBankAccountNum != null ? bcbacBankAccountNum.hashCode() : 0);
        result = 31 * result + (bcpyrProcessingYear != null ? bcpyrProcessingYear.hashCode() : 0);
        result = 31 * result + (bcpmoProcessingMonth != null ? bcpmoProcessingMonth.hashCode() : 0);
        result = 31 * result + (bcchkCheckNum != null ? bcchkCheckNum.hashCode() : 0);
        result = 31 * result + (bcctlDistributorControl != null ? bcctlDistributorControl.hashCode() : 0);
        result = 31 * result + (bctamtCheckAmount != null ? bctamtCheckAmount.hashCode() : 0);
        result = 31 * result + (bcstcdCheckStatCode != null ? bcstcdCheckStatCode.hashCode() : 0);
        result = 31 * result + (bccdatLastChangeDate != null ? bccdatLastChangeDate.hashCode() : 0);
        result = 31 * result + (bccusrLastChangeUser != null ? bccusrLastChangeUser.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"BochkpBonusCheckFile\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"bccoidCompanyId\":\"" + bccoidCompanyId + "\""
                + ",                         \"bcbacBankAccountNum\":\"" + bcbacBankAccountNum + "\""
                + ",                         \"bcpyrProcessingYear\":\"" + bcpyrProcessingYear + "\""
                + ",                         \"bcpmoProcessingMonth\":\"" + bcpmoProcessingMonth + "\""
                + ",                         \"bcchkCheckNum\":\"" + bcchkCheckNum + "\""
                + ",                         \"bcctlDistributorControl\":\"" + bcctlDistributorControl + "\""
                + ",                         \"bctamtCheckAmount\":\"" + bctamtCheckAmount + "\""
                + ",                         \"bcstcdCheckStatCode\":\"" + bcstcdCheckStatCode + "\""
                + ",                         \"bccdatLastChangeDate\":\"" + bccdatLastChangeDate + "\""
                + ",                         \"bccusrLastChangeUser\":\"" + bccusrLastChangeUser + "\""
                + "}}";
    }
}
