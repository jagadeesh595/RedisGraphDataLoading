package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.*;
import java.io.Serializable;

@RedisHash("BOERNP_EarnedIncentiveFile")
public class BoernpEarnedIncentiveFile implements Serializable {
    private Long id;
    private String bicoidCompanyCode;
    private Long bictycCountryCode;
    private Long bididDistributorId;
    private Long bictlDistributorControl;
    private String bierniIncentiveNumber;
    private Integer biqpyrQualifyingYear;
    private Integer biqpmoQualifyingMonth;
    private Integer bickyrFirstCheckYear;
    private Integer bickmoFirstCheckMonth;
    private Integer biexyrExpiringYear;
    private Integer biexmoExpiringMonth;
    private String bioldpOldPolicy;
    private String biadatAddedDate;
    private String biausrAddedByUser;
    private String bicdatLastChangeDate;
    private String bicusrLastChangeUser;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "BICOID_CompanyCode", nullable = true, length = 15)
    public String getBicoidCompanyCode() {
        return bicoidCompanyCode;
    }

    public void setBicoidCompanyCode(String bicoidCompanyCode) {
        this.bicoidCompanyCode = bicoidCompanyCode;
    }

    // @Basic
    // @Column(name = "BICTYC_CountryCode", nullable = true)
    public Long getBictycCountryCode() {
        return bictycCountryCode;
    }

    public void setBictycCountryCode(Long bictycCountryCode) {
        this.bictycCountryCode = bictycCountryCode;
    }

    // @Basic
    // @Column(name = "BIDID_DistributorId", nullable = true)
    public Long getBididDistributorId() {
        return bididDistributorId;
    }

    public void setBididDistributorId(Long bididDistributorId) {
        this.bididDistributorId = bididDistributorId;
    }

    // @Basic
    // @Column(name = "BICTL_DistributorControl", nullable = true)
    public Long getBictlDistributorControl() {
        return bictlDistributorControl;
    }

    public void setBictlDistributorControl(Long bictlDistributorControl) {
        this.bictlDistributorControl = bictlDistributorControl;
    }

    // @Basic
    // @Column(name = "BIERNI_IncentiveNumber", nullable = true, length = 1)
    public String getBierniIncentiveNumber() {
        return bierniIncentiveNumber;
    }

    public void setBierniIncentiveNumber(String bierniIncentiveNumber) {
        this.bierniIncentiveNumber = bierniIncentiveNumber;
    }

    // @Basic
    // @Column(name = "BIQPYR_QualifyingYear", nullable = true)
    public Integer getBiqpyrQualifyingYear() {
        return biqpyrQualifyingYear;
    }

    public void setBiqpyrQualifyingYear(Integer biqpyrQualifyingYear) {
        this.biqpyrQualifyingYear = biqpyrQualifyingYear;
    }

    // @Basic
    // @Column(name = "BIQPMO_QualifyingMonth", nullable = true)
    public Integer getBiqpmoQualifyingMonth() {
        return biqpmoQualifyingMonth;
    }

    public void setBiqpmoQualifyingMonth(Integer biqpmoQualifyingMonth) {
        this.biqpmoQualifyingMonth = biqpmoQualifyingMonth;
    }

    // @Basic
    // @Column(name = "BICKYR_FirstCheckYear", nullable = true)
    public Integer getBickyrFirstCheckYear() {
        return bickyrFirstCheckYear;
    }

    public void setBickyrFirstCheckYear(Integer bickyrFirstCheckYear) {
        this.bickyrFirstCheckYear = bickyrFirstCheckYear;
    }

    // @Basic
    // @Column(name = "BICKMO_FirstCheckMonth", nullable = true)
    public Integer getBickmoFirstCheckMonth() {
        return bickmoFirstCheckMonth;
    }

    public void setBickmoFirstCheckMonth(Integer bickmoFirstCheckMonth) {
        this.bickmoFirstCheckMonth = bickmoFirstCheckMonth;
    }

    // @Basic
    // @Column(name = "BIEXYR_ExpiringYear", nullable = true)
    public Integer getBiexyrExpiringYear() {
        return biexyrExpiringYear;
    }

    public void setBiexyrExpiringYear(Integer biexyrExpiringYear) {
        this.biexyrExpiringYear = biexyrExpiringYear;
    }

    // @Basic
    // @Column(name = "BIEXMO_ExpiringMonth", nullable = true)
    public Integer getBiexmoExpiringMonth() {
        return biexmoExpiringMonth;
    }

    public void setBiexmoExpiringMonth(Integer biexmoExpiringMonth) {
        this.biexmoExpiringMonth = biexmoExpiringMonth;
    }

    // @Basic
    // @Column(name = "BIOLDP_OldPolicy", nullable = true, length = 1)
    public String getBioldpOldPolicy() {
        return bioldpOldPolicy;
    }

    public void setBioldpOldPolicy(String bioldpOldPolicy) {
        this.bioldpOldPolicy = bioldpOldPolicy;
    }

    // @Basic
    // @Column(name = "BIADAT_AddedDate", nullable = true, length = 15)
    public String getBiadatAddedDate() {
        return biadatAddedDate;
    }

    public void setBiadatAddedDate(String biadatAddedDate) {
        this.biadatAddedDate = biadatAddedDate;
    }

    // @Basic
    // @Column(name = "BIAUSR_AddedByUser", nullable = true, length = 255)
    public String getBiausrAddedByUser() {
        return biausrAddedByUser;
    }

    public void setBiausrAddedByUser(String biausrAddedByUser) {
        this.biausrAddedByUser = biausrAddedByUser;
    }

    // @Basic
    // @Column(name = "BICDAT_LastChangeDate", nullable = true, length = 15)
    public String getBicdatLastChangeDate() {
        return bicdatLastChangeDate;
    }

    public void setBicdatLastChangeDate(String bicdatLastChangeDate) {
        this.bicdatLastChangeDate = bicdatLastChangeDate;
    }

    // @Basic
    // @Column(name = "BICUSR_LastChangeUser", nullable = true, length = 255)
    public String getBicusrLastChangeUser() {
        return bicusrLastChangeUser;
    }

    public void setBicusrLastChangeUser(String bicusrLastChangeUser) {
        this.bicusrLastChangeUser = bicusrLastChangeUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BoernpEarnedIncentiveFile that = (BoernpEarnedIncentiveFile) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (bicoidCompanyCode != null ? !bicoidCompanyCode.equals(that.bicoidCompanyCode) : that.bicoidCompanyCode != null)
            return false;
        if (bictycCountryCode != null ? !bictycCountryCode.equals(that.bictycCountryCode) : that.bictycCountryCode != null)
            return false;
        if (bididDistributorId != null ? !bididDistributorId.equals(that.bididDistributorId) : that.bididDistributorId != null)
            return false;
        if (bictlDistributorControl != null ? !bictlDistributorControl.equals(that.bictlDistributorControl) : that.bictlDistributorControl != null)
            return false;
        if (bierniIncentiveNumber != null ? !bierniIncentiveNumber.equals(that.bierniIncentiveNumber) : that.bierniIncentiveNumber != null)
            return false;
        if (biqpyrQualifyingYear != null ? !biqpyrQualifyingYear.equals(that.biqpyrQualifyingYear) : that.biqpyrQualifyingYear != null)
            return false;
        if (biqpmoQualifyingMonth != null ? !biqpmoQualifyingMonth.equals(that.biqpmoQualifyingMonth) : that.biqpmoQualifyingMonth != null)
            return false;
        if (bickyrFirstCheckYear != null ? !bickyrFirstCheckYear.equals(that.bickyrFirstCheckYear) : that.bickyrFirstCheckYear != null)
            return false;
        if (bickmoFirstCheckMonth != null ? !bickmoFirstCheckMonth.equals(that.bickmoFirstCheckMonth) : that.bickmoFirstCheckMonth != null)
            return false;
        if (biexyrExpiringYear != null ? !biexyrExpiringYear.equals(that.biexyrExpiringYear) : that.biexyrExpiringYear != null)
            return false;
        if (biexmoExpiringMonth != null ? !biexmoExpiringMonth.equals(that.biexmoExpiringMonth) : that.biexmoExpiringMonth != null)
            return false;
        if (bioldpOldPolicy != null ? !bioldpOldPolicy.equals(that.bioldpOldPolicy) : that.bioldpOldPolicy != null)
            return false;
        if (biadatAddedDate != null ? !biadatAddedDate.equals(that.biadatAddedDate) : that.biadatAddedDate != null)
            return false;
        if (biausrAddedByUser != null ? !biausrAddedByUser.equals(that.biausrAddedByUser) : that.biausrAddedByUser != null)
            return false;
        if (bicdatLastChangeDate != null ? !bicdatLastChangeDate.equals(that.bicdatLastChangeDate) : that.bicdatLastChangeDate != null)
            return false;
        if (bicusrLastChangeUser != null ? !bicusrLastChangeUser.equals(that.bicusrLastChangeUser) : that.bicusrLastChangeUser != null)
            return false;

        return true;
    }

    public BoernpEarnedIncentiveFile() {
    }

    public BoernpEarnedIncentiveFile copy() {
        BoernpEarnedIncentiveFile boernp = new BoernpEarnedIncentiveFile();
        boernp.setBicoidCompanyCode(bicoidCompanyCode);
        boernp.setBictycCountryCode(bictycCountryCode);
        boernp.setBididDistributorId(bididDistributorId);
        boernp.setBictlDistributorControl(bictlDistributorControl);
        boernp.setBierniIncentiveNumber(bierniIncentiveNumber);
        boernp.setBiqpyrQualifyingYear(biqpyrQualifyingYear);
        boernp.setBiqpmoQualifyingMonth(biqpmoQualifyingMonth);
        boernp.setBickyrFirstCheckYear(bickyrFirstCheckYear);
        boernp.setBickmoFirstCheckMonth(bickmoFirstCheckMonth);
        boernp.setBiexyrExpiringYear(biexyrExpiringYear);
        boernp.setBiexmoExpiringMonth(biexmoExpiringMonth);
        boernp.setBioldpOldPolicy(bioldpOldPolicy);
        boernp.setBiadatAddedDate(biadatAddedDate);
        boernp.setBiausrAddedByUser(biausrAddedByUser);
        boernp.setBicdatLastChangeDate(bicdatLastChangeDate);
        boernp.setBicusrLastChangeUser(bicusrLastChangeUser);
        return boernp;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (bicoidCompanyCode != null ? bicoidCompanyCode.hashCode() : 0);
        result = 31 * result + (bictycCountryCode != null ? bictycCountryCode.hashCode() : 0);
        result = 31 * result + (bididDistributorId != null ? bididDistributorId.hashCode() : 0);
        result = 31 * result + (bictlDistributorControl != null ? bictlDistributorControl.hashCode() : 0);
        result = 31 * result + (bierniIncentiveNumber != null ? bierniIncentiveNumber.hashCode() : 0);
        result = 31 * result + (biqpyrQualifyingYear != null ? biqpyrQualifyingYear.hashCode() : 0);
        result = 31 * result + (biqpmoQualifyingMonth != null ? biqpmoQualifyingMonth.hashCode() : 0);
        result = 31 * result + (bickyrFirstCheckYear != null ? bickyrFirstCheckYear.hashCode() : 0);
        result = 31 * result + (bickmoFirstCheckMonth != null ? bickmoFirstCheckMonth.hashCode() : 0);
        result = 31 * result + (biexyrExpiringYear != null ? biexyrExpiringYear.hashCode() : 0);
        result = 31 * result + (biexmoExpiringMonth != null ? biexmoExpiringMonth.hashCode() : 0);
        result = 31 * result + (bioldpOldPolicy != null ? bioldpOldPolicy.hashCode() : 0);
        result = 31 * result + (biadatAddedDate != null ? biadatAddedDate.hashCode() : 0);
        result = 31 * result + (biausrAddedByUser != null ? biausrAddedByUser.hashCode() : 0);
        result = 31 * result + (bicdatLastChangeDate != null ? bicdatLastChangeDate.hashCode() : 0);
        result = 31 * result + (bicusrLastChangeUser != null ? bicusrLastChangeUser.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"BoernpEarnedIncentiveFile\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"bicoidCompanyCode\":\"" + bicoidCompanyCode + "\""
                + ",                         \"bictycCountryCode\":\"" + bictycCountryCode + "\""
                + ",                         \"bididDistributorId\":\"" + bididDistributorId + "\""
                + ",                         \"bictlDistributorControl\":\"" + bictlDistributorControl + "\""
                + ",                         \"bierniIncentiveNumber\":\"" + bierniIncentiveNumber + "\""
                + ",                         \"biqpyrQualifyingYear\":\"" + biqpyrQualifyingYear + "\""
                + ",                         \"biqpmoQualifyingMonth\":\"" + biqpmoQualifyingMonth + "\""
                + ",                         \"bickyrFirstCheckYear\":\"" + bickyrFirstCheckYear + "\""
                + ",                         \"bickmoFirstCheckMonth\":\"" + bickmoFirstCheckMonth + "\""
                + ",                         \"biexyrExpiringYear\":\"" + biexyrExpiringYear + "\""
                + ",                         \"biexmoExpiringMonth\":\"" + biexmoExpiringMonth + "\""
                + ",                         \"bioldpOldPolicy\":\"" + bioldpOldPolicy + "\""
                + ",                         \"biadatAddedDate\":\"" + biadatAddedDate + "\""
                + ",                         \"biausrAddedByUser\":\"" + biausrAddedByUser + "\""
                + ",                         \"bicdatLastChangeDate\":\"" + bicdatLastChangeDate + "\""
                + ",                         \"bicusrLastChangeUser\":\"" + bicusrLastChangeUser + "\""
                + "}}";
    }
}

