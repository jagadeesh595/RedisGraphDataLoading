package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@RedisHash("DSMGCP_ContactFile")
public class DsmgcpContactFile implements Serializable {
    private Long id;
    private Long dcareaArea;
    private String dctypeContactType;
    private String dcstasStatus;
    private Long dcctlDistributorControl;
    private Long dcctycCountryCode;
    private Long dcdidDistributorId;
    private String dcfnamFirstName;
    private String dclnamLastName;
    private String dcadd1AddressLine1;
    private String dcadd2AddressLine2;
    private String dcadd3AddressLine3;
    private String dcadd4AddressLine4;
    private String dccityCity;
    private String dcstatStateCode;
    private String dcacntCountryCode;
    private String dczipcPostalCode;
    private Long dcphn1PhoneNumber;
    private Long dcphn2PhoneNumber;
    private Long dcfaxFax;
    private String dcemalAddressLine1;
    private Integer dcdmDistrictMgrId;
    private BigDecimal dcbamtPhycBonusAmount;
    private String dccombCombo;
    private Long dcgeocGeographicCode;
    private Long dcseqSequenceNumber;
    private String dcstrdStartDate;
    private String dcenddTerminationDate;


    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "DCAREA_Area", nullable = true)
    public Long getDcareaArea() {
        return dcareaArea;
    }

    public void setDcareaArea(Long dcareaArea) {
        this.dcareaArea = dcareaArea;
    }

    // @Basic
    // @Column(name = "DCTYPE_ContactType", nullable = true, length = 1)
    public String getDctypeContactType() {
        return dctypeContactType;
    }

    public void setDctypeContactType(String dctypeContactType) {
        this.dctypeContactType = dctypeContactType;
    }

    // @Basic
    // @Column(name = "DCSTAS_Status", nullable = true, length = 1)
    public String getDcstasStatus() {
        return dcstasStatus;
    }

    public void setDcstasStatus(String dcstasStatus) {
        this.dcstasStatus = dcstasStatus;
    }

    // @Basic
    // @Column(name = "DCCTL_DistributorControl", nullable = true)
    public Long getDcctlDistributorControl() {
        return dcctlDistributorControl;
    }

    public void setDcctlDistributorControl(Long dcctlDistributorControl) {
        this.dcctlDistributorControl = dcctlDistributorControl;
    }

    // @Basic
    // @Column(name = "DCCTYC_CountryCode", nullable = true)
    public Long getDcctycCountryCode() {
        return dcctycCountryCode;
    }

    public void setDcctycCountryCode(Long dcctycCountryCode) {
        this.dcctycCountryCode = dcctycCountryCode;
    }

    // @Basic
    // @Column(name = "DCDID_DistributorId", nullable = true)
    public Long getDcdidDistributorId() {
        return dcdidDistributorId;
    }

    public void setDcdidDistributorId(Long dcdidDistributorId) {
        this.dcdidDistributorId = dcdidDistributorId;
    }

    // @Basic
    // @Column(name = "DCFNAM_FirstName", nullable = true, length = 255)
    public String getDcfnamFirstName() {
        return dcfnamFirstName;
    }

    public void setDcfnamFirstName(String dcfnamFirstName) {
        this.dcfnamFirstName = dcfnamFirstName;
    }

    // @Basic
    // @Column(name = "DCLNAM_LastName", nullable = true, length = 255)
    public String getDclnamLastName() {
        return dclnamLastName;
    }

    public void setDclnamLastName(String dclnamLastName) {
        this.dclnamLastName = dclnamLastName;
    }

    // @Basic
    // @Column(name = "DCADD1_AddressLine1", nullable = true, length = 255)
    public String getDcadd1AddressLine1() {
        return dcadd1AddressLine1;
    }

    public void setDcadd1AddressLine1(String dcadd1AddressLine1) {
        this.dcadd1AddressLine1 = dcadd1AddressLine1;
    }

    // @Basic
    // @Column(name = "DCADD2_AddressLine2", nullable = true, length = 255)
    public String getDcadd2AddressLine2() {
        return dcadd2AddressLine2;
    }

    public void setDcadd2AddressLine2(String dcadd2AddressLine2) {
        this.dcadd2AddressLine2 = dcadd2AddressLine2;
    }

    // @Basic
    // @Column(name = "DCADD3_AddressLine3", nullable = true, length = 255)
    public String getDcadd3AddressLine3() {
        return dcadd3AddressLine3;
    }

    public void setDcadd3AddressLine3(String dcadd3AddressLine3) {
        this.dcadd3AddressLine3 = dcadd3AddressLine3;
    }

    // @Basic
    // @Column(name = "DCADD4_AddressLine4", nullable = true, length = 255)
    public String getDcadd4AddressLine4() {
        return dcadd4AddressLine4;
    }

    public void setDcadd4AddressLine4(String dcadd4AddressLine4) {
        this.dcadd4AddressLine4 = dcadd4AddressLine4;
    }

    // @Basic
    // @Column(name = "DCCITY_City", nullable = true, length = 255)
    public String getDccityCity() {
        return dccityCity;
    }

    public void setDccityCity(String dccityCity) {
        this.dccityCity = dccityCity;
    }

    // @Basic
    // @Column(name = "DCSTAT_StateCode", nullable = true, length = 255)
    public String getDcstatStateCode() {
        return dcstatStateCode;
    }

    public void setDcstatStateCode(String dcstatStateCode) {
        this.dcstatStateCode = dcstatStateCode;
    }

    // @Basic
    // @Column(name = "DCACNT_CountryCode", nullable = true, length = 255)
    public String getDcacntCountryCode() {
        return dcacntCountryCode;
    }

    public void setDcacntCountryCode(String dcacntCountryCode) {
        this.dcacntCountryCode = dcacntCountryCode;
    }

    // @Basic
    // @Column(name = "DCZIPC_PostalCode", nullable = true, length = 255)
    public String getDczipcPostalCode() {
        return dczipcPostalCode;
    }

    public void setDczipcPostalCode(String dczipcPostalCode) {
        this.dczipcPostalCode = dczipcPostalCode;
    }

    // @Basic
    // @Column(name = "DCPHN1_PhoneNumber", nullable = true)
    public Long getDcphn1PhoneNumber() {
        return dcphn1PhoneNumber;
    }

    public void setDcphn1PhoneNumber(Long dcphn1PhoneNumber) {
        this.dcphn1PhoneNumber = dcphn1PhoneNumber;
    }

    // @Basic
    // @Column(name = "DCPHN2_PhoneNumber", nullable = true)
    public Long getDcphn2PhoneNumber() {
        return dcphn2PhoneNumber;
    }

    public void setDcphn2PhoneNumber(Long dcphn2PhoneNumber) {
        this.dcphn2PhoneNumber = dcphn2PhoneNumber;
    }

    // @Basic
    // @Column(name = "DCFAX_Fax", nullable = true)
    public Long getDcfaxFax() {
        return dcfaxFax;
    }

    public void setDcfaxFax(Long dcfaxFax) {
        this.dcfaxFax = dcfaxFax;
    }

    // @Basic
    // @Column(name = "DCEMAL_AddressLine1", nullable = true, length = 255)
    public String getDcemalAddressLine1() {
        return dcemalAddressLine1;
    }

    public void setDcemalAddressLine1(String dcemalAddressLine1) {
        this.dcemalAddressLine1 = dcemalAddressLine1;
    }

    // @Basic
    // @Column(name = "DCDM_DistrictMgrId", nullable = true)
    public Integer getDcdmDistrictMgrId() {
        return dcdmDistrictMgrId;
    }

    public void setDcdmDistrictMgrId(Integer dcdmDistrictMgrId) {
        this.dcdmDistrictMgrId = dcdmDistrictMgrId;
    }

    // @Basic
    // @Column(name = "DCBAMT_PhycBonusAmount", nullable = true, precision = 3)
    public BigDecimal getDcbamtPhycBonusAmount() {
        return dcbamtPhycBonusAmount;
    }

    public void setDcbamtPhycBonusAmount(BigDecimal dcbamtPhycBonusAmount) {
        this.dcbamtPhycBonusAmount = dcbamtPhycBonusAmount;
    }

    // @Basic
    // @Column(name = "DCCOMB_Combo", nullable = true, length = 1)
    public String getDccombCombo() {
        return dccombCombo;
    }

    public void setDccombCombo(String dccombCombo) {
        this.dccombCombo = dccombCombo;
    }

    // @Basic
    // @Column(name = "DCGEOC_GeographicCode", nullable = true)
    public Long getDcgeocGeographicCode() {
        return dcgeocGeographicCode;
    }

    public void setDcgeocGeographicCode(Long dcgeocGeographicCode) {
        this.dcgeocGeographicCode = dcgeocGeographicCode;
    }

    // @Basic
    // @Column(name = "DCSEQ_SequenceNumber", nullable = true)
    public Long getDcseqSequenceNumber() {
        return dcseqSequenceNumber;
    }

    public void setDcseqSequenceNumber(Long dcseqSequenceNumber) {
        this.dcseqSequenceNumber = dcseqSequenceNumber;
    }

    // @Basic
    // @Column(name = "DCSTRD_StartDate", nullable = true, length = 15)
    public String getDcstrdStartDate() {
        return dcstrdStartDate;
    }

    public void setDcstrdStartDate(String dcstrdStartDate) {
        this.dcstrdStartDate = dcstrdStartDate;
    }

    // @Basic
    // @Column(name = "DCENDD_TerminationDate", nullable = true, length = 15)
    public String getDcenddTerminationDate() {
        return dcenddTerminationDate;
    }

    public void setDcenddTerminationDate(String dcenddTerminationDate) {
        this.dcenddTerminationDate = dcenddTerminationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DsmgcpContactFile that = (DsmgcpContactFile) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (dcareaArea != null ? !dcareaArea.equals(that.dcareaArea) : that.dcareaArea != null) return false;
        if (dctypeContactType != null ? !dctypeContactType.equals(that.dctypeContactType) : that.dctypeContactType != null)
            return false;
        if (dcstasStatus != null ? !dcstasStatus.equals(that.dcstasStatus) : that.dcstasStatus != null) return false;
        if (dcctlDistributorControl != null ? !dcctlDistributorControl.equals(that.dcctlDistributorControl) : that.dcctlDistributorControl != null)
            return false;
        if (dcctycCountryCode != null ? !dcctycCountryCode.equals(that.dcctycCountryCode) : that.dcctycCountryCode != null)
            return false;
        if (dcdidDistributorId != null ? !dcdidDistributorId.equals(that.dcdidDistributorId) : that.dcdidDistributorId != null)
            return false;
        if (dcfnamFirstName != null ? !dcfnamFirstName.equals(that.dcfnamFirstName) : that.dcfnamFirstName != null)
            return false;
        if (dclnamLastName != null ? !dclnamLastName.equals(that.dclnamLastName) : that.dclnamLastName != null)
            return false;
        if (dcadd1AddressLine1 != null ? !dcadd1AddressLine1.equals(that.dcadd1AddressLine1) : that.dcadd1AddressLine1 != null)
            return false;
        if (dcadd2AddressLine2 != null ? !dcadd2AddressLine2.equals(that.dcadd2AddressLine2) : that.dcadd2AddressLine2 != null)
            return false;
        if (dcadd3AddressLine3 != null ? !dcadd3AddressLine3.equals(that.dcadd3AddressLine3) : that.dcadd3AddressLine3 != null)
            return false;
        if (dcadd4AddressLine4 != null ? !dcadd4AddressLine4.equals(that.dcadd4AddressLine4) : that.dcadd4AddressLine4 != null)
            return false;
        if (dccityCity != null ? !dccityCity.equals(that.dccityCity) : that.dccityCity != null) return false;
        if (dcstatStateCode != null ? !dcstatStateCode.equals(that.dcstatStateCode) : that.dcstatStateCode != null)
            return false;
        if (dcacntCountryCode != null ? !dcacntCountryCode.equals(that.dcacntCountryCode) : that.dcacntCountryCode != null)
            return false;
        if (dczipcPostalCode != null ? !dczipcPostalCode.equals(that.dczipcPostalCode) : that.dczipcPostalCode != null)
            return false;
        if (dcphn1PhoneNumber != null ? !dcphn1PhoneNumber.equals(that.dcphn1PhoneNumber) : that.dcphn1PhoneNumber != null)
            return false;
        if (dcphn2PhoneNumber != null ? !dcphn2PhoneNumber.equals(that.dcphn2PhoneNumber) : that.dcphn2PhoneNumber != null)
            return false;
        if (dcfaxFax != null ? !dcfaxFax.equals(that.dcfaxFax) : that.dcfaxFax != null) return false;
        if (dcemalAddressLine1 != null ? !dcemalAddressLine1.equals(that.dcemalAddressLine1) : that.dcemalAddressLine1 != null)
            return false;
        if (dcdmDistrictMgrId != null ? !dcdmDistrictMgrId.equals(that.dcdmDistrictMgrId) : that.dcdmDistrictMgrId != null)
            return false;
        if (dcbamtPhycBonusAmount != null ? !dcbamtPhycBonusAmount.equals(that.dcbamtPhycBonusAmount) : that.dcbamtPhycBonusAmount != null)
            return false;
        if (dccombCombo != null ? !dccombCombo.equals(that.dccombCombo) : that.dccombCombo != null) return false;
        if (dcgeocGeographicCode != null ? !dcgeocGeographicCode.equals(that.dcgeocGeographicCode) : that.dcgeocGeographicCode != null)
            return false;
        if (dcseqSequenceNumber != null ? !dcseqSequenceNumber.equals(that.dcseqSequenceNumber) : that.dcseqSequenceNumber != null)
            return false;
        if (dcstrdStartDate != null ? !dcstrdStartDate.equals(that.dcstrdStartDate) : that.dcstrdStartDate != null)
            return false;
        if (dcenddTerminationDate != null ? !dcenddTerminationDate.equals(that.dcenddTerminationDate) : that.dcenddTerminationDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dcareaArea != null ? dcareaArea.hashCode() : 0);
        result = 31 * result + (dctypeContactType != null ? dctypeContactType.hashCode() : 0);
        result = 31 * result + (dcstasStatus != null ? dcstasStatus.hashCode() : 0);
        result = 31 * result + (dcctlDistributorControl != null ? dcctlDistributorControl.hashCode() : 0);
        result = 31 * result + (dcctycCountryCode != null ? dcctycCountryCode.hashCode() : 0);
        result = 31 * result + (dcdidDistributorId != null ? dcdidDistributorId.hashCode() : 0);
        result = 31 * result + (dcfnamFirstName != null ? dcfnamFirstName.hashCode() : 0);
        result = 31 * result + (dclnamLastName != null ? dclnamLastName.hashCode() : 0);
        result = 31 * result + (dcadd1AddressLine1 != null ? dcadd1AddressLine1.hashCode() : 0);
        result = 31 * result + (dcadd2AddressLine2 != null ? dcadd2AddressLine2.hashCode() : 0);
        result = 31 * result + (dcadd3AddressLine3 != null ? dcadd3AddressLine3.hashCode() : 0);
        result = 31 * result + (dcadd4AddressLine4 != null ? dcadd4AddressLine4.hashCode() : 0);
        result = 31 * result + (dccityCity != null ? dccityCity.hashCode() : 0);
        result = 31 * result + (dcstatStateCode != null ? dcstatStateCode.hashCode() : 0);
        result = 31 * result + (dcacntCountryCode != null ? dcacntCountryCode.hashCode() : 0);
        result = 31 * result + (dczipcPostalCode != null ? dczipcPostalCode.hashCode() : 0);
        result = 31 * result + (dcphn1PhoneNumber != null ? dcphn1PhoneNumber.hashCode() : 0);
        result = 31 * result + (dcphn2PhoneNumber != null ? dcphn2PhoneNumber.hashCode() : 0);
        result = 31 * result + (dcfaxFax != null ? dcfaxFax.hashCode() : 0);
        result = 31 * result + (dcemalAddressLine1 != null ? dcemalAddressLine1.hashCode() : 0);
        result = 31 * result + (dcdmDistrictMgrId != null ? dcdmDistrictMgrId.hashCode() : 0);
        result = 31 * result + (dcbamtPhycBonusAmount != null ? dcbamtPhycBonusAmount.hashCode() : 0);
        result = 31 * result + (dccombCombo != null ? dccombCombo.hashCode() : 0);
        result = 31 * result + (dcgeocGeographicCode != null ? dcgeocGeographicCode.hashCode() : 0);
        result = 31 * result + (dcseqSequenceNumber != null ? dcseqSequenceNumber.hashCode() : 0);
        result = 31 * result + (dcstrdStartDate != null ? dcstrdStartDate.hashCode() : 0);
        result = 31 * result + (dcenddTerminationDate != null ? dcenddTerminationDate.hashCode() : 0);
        return result;
    }


    public DsmgcpContactFile copy() {
        DsmgcpContactFile d = new DsmgcpContactFile();
        d.dcareaArea = dcareaArea;
        d.dctypeContactType = dctypeContactType;
        d.dcstasStatus = dcstasStatus;
        d.dcctlDistributorControl = dcctlDistributorControl;
        d.dcctycCountryCode = dcctycCountryCode;
        d.dcdidDistributorId = dcdidDistributorId;
        d.dcfnamFirstName = dcfnamFirstName;
        d.dclnamLastName = dclnamLastName;
        d.dcadd1AddressLine1 = dcadd1AddressLine1;
        d.dcadd2AddressLine2 = dcadd2AddressLine2;
        d.dcadd3AddressLine3 = dcadd3AddressLine3;
        d.dcadd4AddressLine4 = dcadd4AddressLine4;
        d.dccityCity = dccityCity;
        d.dcstatStateCode = dcstatStateCode;
        d.dcacntCountryCode = dcacntCountryCode;
        d.dczipcPostalCode = dczipcPostalCode;
        d.dcphn1PhoneNumber = dcphn1PhoneNumber;
        d.dcphn2PhoneNumber = dcphn2PhoneNumber;
        d.dcfaxFax = dcfaxFax;
        d.dcemalAddressLine1 = dcemalAddressLine1;
        d.dcdmDistrictMgrId = dcdmDistrictMgrId;
        d.dcbamtPhycBonusAmount = dcbamtPhycBonusAmount;
        d.dccombCombo = dccombCombo;
        d.dcgeocGeographicCode = dcgeocGeographicCode;
        d.dcseqSequenceNumber = dcseqSequenceNumber;
        d.dcstrdStartDate = dcstrdStartDate;
        d.dcenddTerminationDate = dcenddTerminationDate;
        return d;
    }

    @Override
    public String toString() {
        return "{\"DsmgcpContactFile\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"dcareaArea\":\"" + dcareaArea + "\""
                + ",                         \"dctypeContactType\":\"" + dctypeContactType + "\""
                + ",                         \"dcstasStatus\":\"" + dcstasStatus + "\""
                + ",                         \"dcctlDistributorControl\":\"" + dcctlDistributorControl + "\""
                + ",                         \"dcctycCountryCode\":\"" + dcctycCountryCode + "\""
                + ",                         \"dcdidDistributorId\":\"" + dcdidDistributorId + "\""
                + ",                         \"dcfnamFirstName\":\"" + dcfnamFirstName + "\""
                + ",                         \"dclnamLastName\":\"" + dclnamLastName + "\""
                + ",                         \"dcadd1AddressLine1\":\"" + dcadd1AddressLine1 + "\""
                + ",                         \"dcadd2AddressLine2\":\"" + dcadd2AddressLine2 + "\""
                + ",                         \"dcadd3AddressLine3\":\"" + dcadd3AddressLine3 + "\""
                + ",                         \"dcadd4AddressLine4\":\"" + dcadd4AddressLine4 + "\""
                + ",                         \"dccityCity\":\"" + dccityCity + "\""
                + ",                         \"dcstatStateCode\":\"" + dcstatStateCode + "\""
                + ",                         \"dcacntCountryCode\":\"" + dcacntCountryCode + "\""
                + ",                         \"dczipcPostalCode\":\"" + dczipcPostalCode + "\""
                + ",                         \"dcphn1PhoneNumber\":\"" + dcphn1PhoneNumber + "\""
                + ",                         \"dcphn2PhoneNumber\":\"" + dcphn2PhoneNumber + "\""
                + ",                         \"dcfaxFax\":\"" + dcfaxFax + "\""
                + ",                         \"dcemalAddressLine1\":\"" + dcemalAddressLine1 + "\""
                + ",                         \"dcdmDistrictMgrId\":\"" + dcdmDistrictMgrId + "\""
                + ",                         \"dcbamtPhycBonusAmount\":\"" + dcbamtPhycBonusAmount + "\""
                + ",                         \"dccombCombo\":\"" + dccombCombo + "\""
                + ",                         \"dcgeocGeographicCode\":\"" + dcgeocGeographicCode + "\""
                + ",                         \"dcseqSequenceNumber\":\"" + dcseqSequenceNumber + "\""
                + ",                         \"dcstrdStartDate\":\"" + dcstrdStartDate + "\""
                + ",                         \"dcenddTerminationDate\":\"" + dcenddTerminationDate + "\""
                + "}}";
    }
}
