package com.ns.dataloading.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "BOODGP_OutStandingDebtOrIrsGranishmentFile")
public class BoodgpOutStandingDebtOrIrsGranishmentFile {
    private Long id;
    private Long boctlDistributorControl;
    private String botypeRecordType;
    private BigDecimal bobalCurrentBalance;
    private String bofileFileStatus;
    private Integer boexmpExemptions;
    private String boblndBlindAndOr65;
    private Integer boadedAddedDeductions;
    private String bocdatLastChangeDate;
    private String bocusrLastChangeUser;
    private Long boctycCountryCode;
    private Long bodidDistributorId;
    private String bocoidCompanyId;
    private BigDecimal bopcntWithHoldPerc;
    private String boretbRetainBalance;

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
    @Column(name = "BOCTL_DistributorControl", nullable = false)
    public Long getBoctlDistributorControl() {
        return boctlDistributorControl;
    }

    public void setBoctlDistributorControl(Long boctlDistributorControl) {
        this.boctlDistributorControl = boctlDistributorControl;
    }

    @Basic
    @Column(name = "BOTYPE_RecordType", nullable = true, length = 1)
    public String getBotypeRecordType() {
        return botypeRecordType;
    }

    public void setBotypeRecordType(String botypeRecordType) {
        this.botypeRecordType = botypeRecordType;
    }

    @Basic
    @Column(name = "BOBAL_CurrentBalance", nullable = true, precision = 3)
    public BigDecimal getBobalCurrentBalance() {
        return bobalCurrentBalance;
    }

    public void setBobalCurrentBalance(BigDecimal bobalCurrentBalance) {
        this.bobalCurrentBalance = bobalCurrentBalance;
    }

    @Basic
    @Column(name = "BOFILE_FileStatus", nullable = true, length = 255)
    public String getBofileFileStatus() {
        return bofileFileStatus;
    }

    public void setBofileFileStatus(String bofileFileStatus) {
        this.bofileFileStatus = bofileFileStatus;
    }

    @Basic
    @Column(name = "BOEXMP_Exemptions", nullable = true)
    public Integer getBoexmpExemptions() {
        return boexmpExemptions;
    }

    public void setBoexmpExemptions(Integer boexmpExemptions) {
        this.boexmpExemptions = boexmpExemptions;
    }

    @Basic
    @Column(name = "BOBLND_BlindAndOr65", nullable = true, length = 1)
    public String getBoblndBlindAndOr65() {
        return boblndBlindAndOr65;
    }

    public void setBoblndBlindAndOr65(String boblndBlindAndOr65) {
        this.boblndBlindAndOr65 = boblndBlindAndOr65;
    }

    @Basic
    @Column(name = "BOADED_AddedDeductions", nullable = true)
    public Integer getBoadedAddedDeductions() {
        return boadedAddedDeductions;
    }

    public void setBoadedAddedDeductions(Integer boadedAddedDeductions) {
        this.boadedAddedDeductions = boadedAddedDeductions;
    }

    @Basic
    @Column(name = "BOCDAT_LastChangeDate", nullable = true, length = 15)
    public String getBocdatLastChangeDate() {
        return bocdatLastChangeDate;
    }

    public void setBocdatLastChangeDate(String bocdatLastChangeDate) {
        this.bocdatLastChangeDate = bocdatLastChangeDate;
    }

    @Basic
    @Column(name = "BOCUSR_LastChangeUser", nullable = true, length = 255)
    public String getBocusrLastChangeUser() {
        return bocusrLastChangeUser;
    }

    public void setBocusrLastChangeUser(String bocusrLastChangeUser) {
        this.bocusrLastChangeUser = bocusrLastChangeUser;
    }

    @Basic
    @Column(name = "BOCTYC_CountryCode", nullable = true)
    public Long getBoctycCountryCode() {
        return boctycCountryCode;
    }

    public void setBoctycCountryCode(Long boctycCountryCode) {
        this.boctycCountryCode = boctycCountryCode;
    }

    @Basic
    @Column(name = "BODID_DistributorId", nullable = true)
    public Long getBodidDistributorId() {
        return bodidDistributorId;
    }

    public void setBodidDistributorId(Long bodidDistributorId) {
        this.bodidDistributorId = bodidDistributorId;
    }

    @Basic
    @Column(name = "BOCOID_CompanyId", nullable = true, length = 15)
    public String getBocoidCompanyId() {
        return bocoidCompanyId;
    }

    public void setBocoidCompanyId(String bocoidCompanyId) {
        this.bocoidCompanyId = bocoidCompanyId;
    }

    @Basic
    @Column(name = "BOPCNT_WithHoldPerc", nullable = true, precision = 3)
    public BigDecimal getBopcntWithHoldPerc() {
        return bopcntWithHoldPerc;
    }

    public void setBopcntWithHoldPerc(BigDecimal bopcntWithHoldPerc) {
        this.bopcntWithHoldPerc = bopcntWithHoldPerc;
    }

    @Basic
    @Column(name = "BORETB_RetainBalance", nullable = true, length = 1)
    public String getBoretbRetainBalance() {
        return boretbRetainBalance;
    }

    public void setBoretbRetainBalance(String boretbRetainBalance) {
        this.boretbRetainBalance = boretbRetainBalance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BoodgpOutStandingDebtOrIrsGranishmentFile that = (BoodgpOutStandingDebtOrIrsGranishmentFile) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (boctlDistributorControl != null ? !boctlDistributorControl.equals(that.boctlDistributorControl) : that.boctlDistributorControl != null)
            return false;
        if (botypeRecordType != null ? !botypeRecordType.equals(that.botypeRecordType) : that.botypeRecordType != null)
            return false;
        if (bobalCurrentBalance != null ? !bobalCurrentBalance.equals(that.bobalCurrentBalance) : that.bobalCurrentBalance != null)
            return false;
        if (bofileFileStatus != null ? !bofileFileStatus.equals(that.bofileFileStatus) : that.bofileFileStatus != null)
            return false;
        if (boexmpExemptions != null ? !boexmpExemptions.equals(that.boexmpExemptions) : that.boexmpExemptions != null)
            return false;
        if (boblndBlindAndOr65 != null ? !boblndBlindAndOr65.equals(that.boblndBlindAndOr65) : that.boblndBlindAndOr65 != null)
            return false;
        if (boadedAddedDeductions != null ? !boadedAddedDeductions.equals(that.boadedAddedDeductions) : that.boadedAddedDeductions != null)
            return false;
        if (bocdatLastChangeDate != null ? !bocdatLastChangeDate.equals(that.bocdatLastChangeDate) : that.bocdatLastChangeDate != null)
            return false;
        if (bocusrLastChangeUser != null ? !bocusrLastChangeUser.equals(that.bocusrLastChangeUser) : that.bocusrLastChangeUser != null)
            return false;
        if (boctycCountryCode != null ? !boctycCountryCode.equals(that.boctycCountryCode) : that.boctycCountryCode != null)
            return false;
        if (bodidDistributorId != null ? !bodidDistributorId.equals(that.bodidDistributorId) : that.bodidDistributorId != null)
            return false;
        if (bocoidCompanyId != null ? !bocoidCompanyId.equals(that.bocoidCompanyId) : that.bocoidCompanyId != null)
            return false;
        if (bopcntWithHoldPerc != null ? !bopcntWithHoldPerc.equals(that.bopcntWithHoldPerc) : that.bopcntWithHoldPerc != null)
            return false;
        if (boretbRetainBalance != null ? !boretbRetainBalance.equals(that.boretbRetainBalance) : that.boretbRetainBalance != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (boctlDistributorControl != null ? boctlDistributorControl.hashCode() : 0);
        result = 31 * result + (botypeRecordType != null ? botypeRecordType.hashCode() : 0);
        result = 31 * result + (bobalCurrentBalance != null ? bobalCurrentBalance.hashCode() : 0);
        result = 31 * result + (bofileFileStatus != null ? bofileFileStatus.hashCode() : 0);
        result = 31 * result + (boexmpExemptions != null ? boexmpExemptions.hashCode() : 0);
        result = 31 * result + (boblndBlindAndOr65 != null ? boblndBlindAndOr65.hashCode() : 0);
        result = 31 * result + (boadedAddedDeductions != null ? boadedAddedDeductions.hashCode() : 0);
        result = 31 * result + (bocdatLastChangeDate != null ? bocdatLastChangeDate.hashCode() : 0);
        result = 31 * result + (bocusrLastChangeUser != null ? bocusrLastChangeUser.hashCode() : 0);
        result = 31 * result + (boctycCountryCode != null ? boctycCountryCode.hashCode() : 0);
        result = 31 * result + (bodidDistributorId != null ? bodidDistributorId.hashCode() : 0);
        result = 31 * result + (bocoidCompanyId != null ? bocoidCompanyId.hashCode() : 0);
        result = 31 * result + (bopcntWithHoldPerc != null ? bopcntWithHoldPerc.hashCode() : 0);
        result = 31 * result + (boretbRetainBalance != null ? boretbRetainBalance.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"BoodgpOutStandingDebtOrIrsGranishmentFile\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"boctlDistributorControl\":\"" + boctlDistributorControl + "\""
                + ",                         \"botypeRecordType\":\"" + botypeRecordType + "\""
                + ",                         \"bobalCurrentBalance\":\"" + bobalCurrentBalance + "\""
                + ",                         \"bofileFileStatus\":\"" + bofileFileStatus + "\""
                + ",                         \"boexmpExemptions\":\"" + boexmpExemptions + "\""
                + ",                         \"boblndBlindAndOr65\":\"" + boblndBlindAndOr65 + "\""
                + ",                         \"boadedAddedDeductions\":\"" + boadedAddedDeductions + "\""
                + ",                         \"bocdatLastChangeDate\":\"" + bocdatLastChangeDate + "\""
                + ",                         \"bocusrLastChangeUser\":\"" + bocusrLastChangeUser + "\""
                + ",                         \"boctycCountryCode\":\"" + boctycCountryCode + "\""
                + ",                         \"bodidDistributorId\":\"" + bodidDistributorId + "\""
                + ",                         \"bocoidCompanyId\":\"" + bocoidCompanyId + "\""
                + ",                         \"bopcntWithHoldPerc\":\"" + bopcntWithHoldPerc + "\""
                + ",                         \"boretbRetainBalance\":\"" + boretbRetainBalance + "\""
                + "}}";
    }
}
