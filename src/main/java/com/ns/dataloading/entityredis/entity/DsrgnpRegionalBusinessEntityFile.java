package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@RedisHash("DSRGNP_RegionalBusinessEntityFile")
public class DsrgnpRegionalBusinessEntityFile implements Serializable {
    private Long id;
    private Long dnctlDistributorControl;
    private String dncntyOperatingCountry;
    private String dnhcmpHomeCompany;
    private String dnstasStatus;
    private String dncnamBusinessEntityName;
    private String dntyppType;
    private String dnsubtSubType;
    private Integer dnefmoEffectiveMonth;
    private Integer dnefyrEffectiveYear;
    private Integer dncnmoCancelMonth;
    private Integer dncnyrCancelYear;
    private BigDecimal dncvatCompanyVat;
    private BigDecimal dnevatEarningVat;
    private String dnvatVatNumber;
    private String dncregCorpRegNum;
    private String dntxidIncomeTaxId;
    private String dnsusrSetUpUser;
    private String dnstimSetUpTimeStamp;
    private String dnlusrLastChangeUser;
    private String dnltimLastChangeTimeStamp;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "DNCTL_DistributorControl", nullable = false)
    public Long getDnctlDistributorControl() {
        return dnctlDistributorControl;
    }

    public void setDnctlDistributorControl(Long dnctlDistributorControl) {
        this.dnctlDistributorControl = dnctlDistributorControl;
    }

    // @Basic
    // @Column(name = "DNCNTY_OperatingCountry", nullable = true, length = 15)
    public String getDncntyOperatingCountry() {
        return dncntyOperatingCountry;
    }

    public void setDncntyOperatingCountry(String dncntyOperatingCountry) {
        this.dncntyOperatingCountry = dncntyOperatingCountry;
    }

    // @Basic
    // @Column(name = "DNHCMP_HomeCompany", nullable = true, length = 15)
    public String getDnhcmpHomeCompany() {
        return dnhcmpHomeCompany;
    }

    public void setDnhcmpHomeCompany(String dnhcmpHomeCompany) {
        this.dnhcmpHomeCompany = dnhcmpHomeCompany;
    }

    // @Basic
    // @Column(name = "DNSTAS_Status", nullable = true, length = 1)
    public String getDnstasStatus() {
        return dnstasStatus;
    }

    public void setDnstasStatus(String dnstasStatus) {
        this.dnstasStatus = dnstasStatus;
    }

    // @Basic
    // @Column(name = "DNCNAM_BusinessEntityName", nullable = true, length = 255)
    public String getDncnamBusinessEntityName() {
        return dncnamBusinessEntityName;
    }

    public void setDncnamBusinessEntityName(String dncnamBusinessEntityName) {
        this.dncnamBusinessEntityName = dncnamBusinessEntityName;
    }

    // @Basic
    // @Column(name = "DNTYPP_Type", nullable = true, length = 1)
    public String getDntyppType() {
        return dntyppType;
    }

    public void setDntyppType(String dntyppType) {
        this.dntyppType = dntyppType;
    }

    // @Basic
    // @Column(name = "DNSUBT_SubType", nullable = true, length = 1)
    public String getDnsubtSubType() {
        return dnsubtSubType;
    }

    public void setDnsubtSubType(String dnsubtSubType) {
        this.dnsubtSubType = dnsubtSubType;
    }

    // @Basic
    // @Column(name = "DNEFMO_EffectiveMonth", nullable = true)
    public Integer getDnefmoEffectiveMonth() {
        return dnefmoEffectiveMonth;
    }

    public void setDnefmoEffectiveMonth(Integer dnefmoEffectiveMonth) {
        this.dnefmoEffectiveMonth = dnefmoEffectiveMonth;
    }

    // @Basic
    // @Column(name = "DNEFYR_EffectiveYear", nullable = true)
    public Integer getDnefyrEffectiveYear() {
        return dnefyrEffectiveYear;
    }

    public void setDnefyrEffectiveYear(Integer dnefyrEffectiveYear) {
        this.dnefyrEffectiveYear = dnefyrEffectiveYear;
    }

    // @Basic
    // @Column(name = "DNCNMO_CancelMonth", nullable = true)
    public Integer getDncnmoCancelMonth() {
        return dncnmoCancelMonth;
    }

    public void setDncnmoCancelMonth(Integer dncnmoCancelMonth) {
        this.dncnmoCancelMonth = dncnmoCancelMonth;
    }

    // @Basic
    // @Column(name = "DNCNYR_CancelYear", nullable = true)
    public Integer getDncnyrCancelYear() {
        return dncnyrCancelYear;
    }

    public void setDncnyrCancelYear(Integer dncnyrCancelYear) {
        this.dncnyrCancelYear = dncnyrCancelYear;
    }

    // @Basic
    // @Column(name = "DNCVAT_CompanyVAT", nullable = true, precision = 3)
    public BigDecimal getDncvatCompanyVat() {
        return dncvatCompanyVat;
    }

    public void setDncvatCompanyVat(BigDecimal dncvatCompanyVat) {
        this.dncvatCompanyVat = dncvatCompanyVat;
    }

    // @Basic
    // @Column(name = "DNEVAT_EarningVAT", nullable = true, precision = 3)
    public BigDecimal getDnevatEarningVat() {
        return dnevatEarningVat;
    }

    public void setDnevatEarningVat(BigDecimal dnevatEarningVat) {
        this.dnevatEarningVat = dnevatEarningVat;
    }

    // @Basic
    // @Column(name = "DNVAT_VATNumber", nullable = true, length = 255)
    public String getDnvatVatNumber() {
        return dnvatVatNumber;
    }

    public void setDnvatVatNumber(String dnvatVatNumber) {
        this.dnvatVatNumber = dnvatVatNumber;
    }

    // @Basic
    // @Column(name = "DNCREG_CorpRegNum", nullable = true, length = 255)
    public String getDncregCorpRegNum() {
        return dncregCorpRegNum;
    }

    public void setDncregCorpRegNum(String dncregCorpRegNum) {
        this.dncregCorpRegNum = dncregCorpRegNum;
    }

    // @Basic
    // @Column(name = "DNTXID_IncomeTaxId", nullable = true, length = 255)
    public String getDntxidIncomeTaxId() {
        return dntxidIncomeTaxId;
    }

    public void setDntxidIncomeTaxId(String dntxidIncomeTaxId) {
        this.dntxidIncomeTaxId = dntxidIncomeTaxId;
    }

    // @Basic
    // @Column(name = "DNSUSR_SetUpUser", nullable = true, length = 255)
    public String getDnsusrSetUpUser() {
        return dnsusrSetUpUser;
    }

    public void setDnsusrSetUpUser(String dnsusrSetUpUser) {
        this.dnsusrSetUpUser = dnsusrSetUpUser;
    }

    // @Basic
    // @Column(name = "DNSTIM_SetUpTimeStamp", nullable = true, length = 255)
    public String getDnstimSetUpTimeStamp() {
        return dnstimSetUpTimeStamp;
    }

    public void setDnstimSetUpTimeStamp(String dnstimSetUpTimeStamp) {
        this.dnstimSetUpTimeStamp = dnstimSetUpTimeStamp;
    }

    // @Basic
    // @Column(name = "DNLUSR_LastChangeUser", nullable = true, length = 255)
    public String getDnlusrLastChangeUser() {
        return dnlusrLastChangeUser;
    }

    public void setDnlusrLastChangeUser(String dnlusrLastChangeUser) {
        this.dnlusrLastChangeUser = dnlusrLastChangeUser;
    }

    // @Basic
    // @Column(name = "DNLTIM_LastChangeTimeStamp", nullable = true, length = 255)
    public String getDnltimLastChangeTimeStamp() {
        return dnltimLastChangeTimeStamp;
    }

    public void setDnltimLastChangeTimeStamp(String dnltimLastChangeTimeStamp) {
        this.dnltimLastChangeTimeStamp = dnltimLastChangeTimeStamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DsrgnpRegionalBusinessEntityFile that = (DsrgnpRegionalBusinessEntityFile) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (dnctlDistributorControl != null ? !dnctlDistributorControl.equals(that.dnctlDistributorControl) : that.dnctlDistributorControl != null)
            return false;
        if (dncntyOperatingCountry != null ? !dncntyOperatingCountry.equals(that.dncntyOperatingCountry) : that.dncntyOperatingCountry != null)
            return false;
        if (dnhcmpHomeCompany != null ? !dnhcmpHomeCompany.equals(that.dnhcmpHomeCompany) : that.dnhcmpHomeCompany != null)
            return false;
        if (dnstasStatus != null ? !dnstasStatus.equals(that.dnstasStatus) : that.dnstasStatus != null) return false;
        if (dncnamBusinessEntityName != null ? !dncnamBusinessEntityName.equals(that.dncnamBusinessEntityName) : that.dncnamBusinessEntityName != null)
            return false;
        if (dntyppType != null ? !dntyppType.equals(that.dntyppType) : that.dntyppType != null) return false;
        if (dnsubtSubType != null ? !dnsubtSubType.equals(that.dnsubtSubType) : that.dnsubtSubType != null)
            return false;
        if (dnefmoEffectiveMonth != null ? !dnefmoEffectiveMonth.equals(that.dnefmoEffectiveMonth) : that.dnefmoEffectiveMonth != null)
            return false;
        if (dnefyrEffectiveYear != null ? !dnefyrEffectiveYear.equals(that.dnefyrEffectiveYear) : that.dnefyrEffectiveYear != null)
            return false;
        if (dncnmoCancelMonth != null ? !dncnmoCancelMonth.equals(that.dncnmoCancelMonth) : that.dncnmoCancelMonth != null)
            return false;
        if (dncnyrCancelYear != null ? !dncnyrCancelYear.equals(that.dncnyrCancelYear) : that.dncnyrCancelYear != null)
            return false;
        if (dncvatCompanyVat != null ? !dncvatCompanyVat.equals(that.dncvatCompanyVat) : that.dncvatCompanyVat != null)
            return false;
        if (dnevatEarningVat != null ? !dnevatEarningVat.equals(that.dnevatEarningVat) : that.dnevatEarningVat != null)
            return false;
        if (dnvatVatNumber != null ? !dnvatVatNumber.equals(that.dnvatVatNumber) : that.dnvatVatNumber != null)
            return false;
        if (dncregCorpRegNum != null ? !dncregCorpRegNum.equals(that.dncregCorpRegNum) : that.dncregCorpRegNum != null)
            return false;
        if (dntxidIncomeTaxId != null ? !dntxidIncomeTaxId.equals(that.dntxidIncomeTaxId) : that.dntxidIncomeTaxId != null)
            return false;
        if (dnsusrSetUpUser != null ? !dnsusrSetUpUser.equals(that.dnsusrSetUpUser) : that.dnsusrSetUpUser != null)
            return false;
        if (dnstimSetUpTimeStamp != null ? !dnstimSetUpTimeStamp.equals(that.dnstimSetUpTimeStamp) : that.dnstimSetUpTimeStamp != null)
            return false;
        if (dnlusrLastChangeUser != null ? !dnlusrLastChangeUser.equals(that.dnlusrLastChangeUser) : that.dnlusrLastChangeUser != null)
            return false;
        if (dnltimLastChangeTimeStamp != null ? !dnltimLastChangeTimeStamp.equals(that.dnltimLastChangeTimeStamp) : that.dnltimLastChangeTimeStamp != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dnctlDistributorControl != null ? dnctlDistributorControl.hashCode() : 0);
        result = 31 * result + (dncntyOperatingCountry != null ? dncntyOperatingCountry.hashCode() : 0);
        result = 31 * result + (dnhcmpHomeCompany != null ? dnhcmpHomeCompany.hashCode() : 0);
        result = 31 * result + (dnstasStatus != null ? dnstasStatus.hashCode() : 0);
        result = 31 * result + (dncnamBusinessEntityName != null ? dncnamBusinessEntityName.hashCode() : 0);
        result = 31 * result + (dntyppType != null ? dntyppType.hashCode() : 0);
        result = 31 * result + (dnsubtSubType != null ? dnsubtSubType.hashCode() : 0);
        result = 31 * result + (dnefmoEffectiveMonth != null ? dnefmoEffectiveMonth.hashCode() : 0);
        result = 31 * result + (dnefyrEffectiveYear != null ? dnefyrEffectiveYear.hashCode() : 0);
        result = 31 * result + (dncnmoCancelMonth != null ? dncnmoCancelMonth.hashCode() : 0);
        result = 31 * result + (dncnyrCancelYear != null ? dncnyrCancelYear.hashCode() : 0);
        result = 31 * result + (dncvatCompanyVat != null ? dncvatCompanyVat.hashCode() : 0);
        result = 31 * result + (dnevatEarningVat != null ? dnevatEarningVat.hashCode() : 0);
        result = 31 * result + (dnvatVatNumber != null ? dnvatVatNumber.hashCode() : 0);
        result = 31 * result + (dncregCorpRegNum != null ? dncregCorpRegNum.hashCode() : 0);
        result = 31 * result + (dntxidIncomeTaxId != null ? dntxidIncomeTaxId.hashCode() : 0);
        result = 31 * result + (dnsusrSetUpUser != null ? dnsusrSetUpUser.hashCode() : 0);
        result = 31 * result + (dnstimSetUpTimeStamp != null ? dnstimSetUpTimeStamp.hashCode() : 0);
        result = 31 * result + (dnlusrLastChangeUser != null ? dnlusrLastChangeUser.hashCode() : 0);
        result = 31 * result + (dnltimLastChangeTimeStamp != null ? dnltimLastChangeTimeStamp.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"DsrgnpRegionalBusinessEntityFile\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"dnctlDistributorControl\":\"" + dnctlDistributorControl + "\""
                + ",                         \"dncntyOperatingCountry\":\"" + dncntyOperatingCountry + "\""
                + ",                         \"dnhcmpHomeCompany\":\"" + dnhcmpHomeCompany + "\""
                + ",                         \"dnstasStatus\":\"" + dnstasStatus + "\""
                + ",                         \"dncnamBusinessEntityName\":\"" + dncnamBusinessEntityName + "\""
                + ",                         \"dntyppType\":\"" + dntyppType + "\""
                + ",                         \"dnsubtSubType\":\"" + dnsubtSubType + "\""
                + ",                         \"dnefmoEffectiveMonth\":\"" + dnefmoEffectiveMonth + "\""
                + ",                         \"dnefyrEffectiveYear\":\"" + dnefyrEffectiveYear + "\""
                + ",                         \"dncnmoCancelMonth\":\"" + dncnmoCancelMonth + "\""
                + ",                         \"dncnyrCancelYear\":\"" + dncnyrCancelYear + "\""
                + ",                         \"dncvatCompanyVat\":\"" + dncvatCompanyVat + "\""
                + ",                         \"dnevatEarningVat\":\"" + dnevatEarningVat + "\""
                + ",                         \"dnvatVatNumber\":\"" + dnvatVatNumber + "\""
                + ",                         \"dncregCorpRegNum\":\"" + dncregCorpRegNum + "\""
                + ",                         \"dntxidIncomeTaxId\":\"" + dntxidIncomeTaxId + "\""
                + ",                         \"dnsusrSetUpUser\":\"" + dnsusrSetUpUser + "\""
                + ",                         \"dnstimSetUpTimeStamp\":\"" + dnstimSetUpTimeStamp + "\""
                + ",                         \"dnlusrLastChangeUser\":\"" + dnlusrLastChangeUser + "\""
                + ",                         \"dnltimLastChangeTimeStamp\":\"" + dnltimLastChangeTimeStamp + "\""
                + "}}";
    }
}
