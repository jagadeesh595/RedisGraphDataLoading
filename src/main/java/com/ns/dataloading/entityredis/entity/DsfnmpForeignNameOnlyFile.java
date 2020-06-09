package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;

@RedisHash("DSFNMP_ForeignNameOnlyFile")
public class DsfnmpForeignNameOnlyFile implements Serializable {
    private Long id;
    private Long fnctlDistributorControl;
    private Long fnctycCountryCode;
    private Long fnfidForeignDistId;
    private String fnfnamFirstName;
    private String fnlnamLastName;
    private String fncntyCountry;
    private String fndateDate;
    private String fnuserUser;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "FNCTL_DistributorControl", nullable = false)
    public Long getFnctlDistributorControl() {
        return fnctlDistributorControl;
    }

    public void setFnctlDistributorControl(Long fnctlDistributorControl) {
        this.fnctlDistributorControl = fnctlDistributorControl;
    }

    // @Basic
    // @Column(name = "FNCTYC_CountryCode", nullable = true)
    public Long getFnctycCountryCode() {
        return fnctycCountryCode;
    }

    public void setFnctycCountryCode(Long fnctycCountryCode) {
        this.fnctycCountryCode = fnctycCountryCode;
    }

    // @Basic
    // @Column(name = "FNFID_ForeignDistId", nullable = true)
    public Long getFnfidForeignDistId() {
        return fnfidForeignDistId;
    }

    public void setFnfidForeignDistId(Long fnfidForeignDistId) {
        this.fnfidForeignDistId = fnfidForeignDistId;
    }

    // @Basic
    // @Column(name = "FNFNAM_FirstName", nullable = true, length = 255)
    public String getFnfnamFirstName() {
        return fnfnamFirstName;
    }

    public void setFnfnamFirstName(String fnfnamFirstName) {
        this.fnfnamFirstName = fnfnamFirstName;
    }

    // @Basic
    // @Column(name = "FNLNAM_LastName", nullable = true, length = 255)
    public String getFnlnamLastName() {
        return fnlnamLastName;
    }

    public void setFnlnamLastName(String fnlnamLastName) {
        this.fnlnamLastName = fnlnamLastName;
    }

    // @Basic
    // @Column(name = "FNCNTY_Country", nullable = true, length = 15)
    public String getFncntyCountry() {
        return fncntyCountry;
    }

    public void setFncntyCountry(String fncntyCountry) {
        this.fncntyCountry = fncntyCountry;
    }

    // @Basic
    // @Column(name = "FNDATE_Date", nullable = true, length = 10)
    public String getFndateDate() {
        return fndateDate;
    }

    public void setFndateDate(String fndateDate) {
        this.fndateDate = fndateDate;
    }

    // @Basic
    // @Column(name = "FNUSER_User", nullable = true, length = 255)
    public String getFnuserUser() {
        return fnuserUser;
    }

    public void setFnuserUser(String fnuserUser) {
        this.fnuserUser = fnuserUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DsfnmpForeignNameOnlyFile that = (DsfnmpForeignNameOnlyFile) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (fnctlDistributorControl != null ? !fnctlDistributorControl.equals(that.fnctlDistributorControl) : that.fnctlDistributorControl != null)
            return false;
        if (fnctycCountryCode != null ? !fnctycCountryCode.equals(that.fnctycCountryCode) : that.fnctycCountryCode != null)
            return false;
        if (fnfidForeignDistId != null ? !fnfidForeignDistId.equals(that.fnfidForeignDistId) : that.fnfidForeignDistId != null)
            return false;
        if (fnfnamFirstName != null ? !fnfnamFirstName.equals(that.fnfnamFirstName) : that.fnfnamFirstName != null)
            return false;
        if (fnlnamLastName != null ? !fnlnamLastName.equals(that.fnlnamLastName) : that.fnlnamLastName != null)
            return false;
        if (fncntyCountry != null ? !fncntyCountry.equals(that.fncntyCountry) : that.fncntyCountry != null)
            return false;
        if (fndateDate != null ? !fndateDate.equals(that.fndateDate) : that.fndateDate != null) return false;
        if (fnuserUser != null ? !fnuserUser.equals(that.fnuserUser) : that.fnuserUser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (fnctlDistributorControl != null ? fnctlDistributorControl.hashCode() : 0);
        result = 31 * result + (fnctycCountryCode != null ? fnctycCountryCode.hashCode() : 0);
        result = 31 * result + (fnfidForeignDistId != null ? fnfidForeignDistId.hashCode() : 0);
        result = 31 * result + (fnfnamFirstName != null ? fnfnamFirstName.hashCode() : 0);
        result = 31 * result + (fnlnamLastName != null ? fnlnamLastName.hashCode() : 0);
        result = 31 * result + (fncntyCountry != null ? fncntyCountry.hashCode() : 0);
        result = 31 * result + (fndateDate != null ? fndateDate.hashCode() : 0);
        result = 31 * result + (fnuserUser != null ? fnuserUser.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"DsfnmpForeignNameOnlyFile\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"fnctlDistributorControl\":\"" + fnctlDistributorControl + "\""
                + ",                         \"fnctycCountryCode\":\"" + fnctycCountryCode + "\""
                + ",                         \"fnfidForeignDistId\":\"" + fnfidForeignDistId + "\""
                + ",                         \"fnfnamFirstName\":\"" + fnfnamFirstName + "\""
                + ",                         \"fnlnamLastName\":\"" + fnlnamLastName + "\""
                + ",                         \"fncntyCountry\":\"" + fncntyCountry + "\""
                + ",                         \"fndateDate\":\"" + fndateDate + "\""
                + ",                         \"fnuserUser\":\"" + fnuserUser + "\""
                + "}}";
    }
}
