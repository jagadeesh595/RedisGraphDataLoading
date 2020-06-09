package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by rpalamakula on 16-08-2017.
 */
@RedisHash("DSPWVP_Waiver")

public class DspwvpWaiver implements Serializable {
    private  Long id;
    private @Indexed
    Long pwctlDistCtrl;
    private @Indexed String pwonemOneMonthWaiver;
    private @Indexed String pwcdatLastChangeDate;
    private @Indexed String pwcusrLastChangeUser;
    private @Indexed Long pwctycCountryCode;
    private @Indexed Long pwdidDistId;
    private @Indexed String pwlbwfLdrshipWaiverFlag;
    private @Indexed String pwcntyAlphaCountryCode;
    private @Indexed String memberFile;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "PWCTL_DistCtrl", nullable = false)
    public Long getPwctlDistCtrl() {
        return pwctlDistCtrl;
    }

    public void setPwctlDistCtrl(Long pwctlDistCtrl) {
        this.pwctlDistCtrl = pwctlDistCtrl;
    }

    // @Basic
    // @Column(name = "PWONEM_OneMonthWaiver", nullable = false, length = 15)
    public String getPwonemOneMonthWaiver() {
        return pwonemOneMonthWaiver;
    }

    public void setPwonemOneMonthWaiver(String pwonemOneMonthWaiver) {
        this.pwonemOneMonthWaiver = pwonemOneMonthWaiver;
    }

    // @Basic
    // @Column(name = "PWCDAT_LastChangeDate", nullable = false, length = 15)
    public String getPwcdatLastChangeDate() {
        return pwcdatLastChangeDate;
    }

    public void setPwcdatLastChangeDate(String pwcdatLastChangeDate) {
        this.pwcdatLastChangeDate = pwcdatLastChangeDate;
    }

    // @Basic
    // @Column(name = "PWCUSR_LastChangeUser", nullable = false, length = 15)
    public String getPwcusrLastChangeUser() {
        return pwcusrLastChangeUser;
    }

    public void setPwcusrLastChangeUser(String pwcusrLastChangeUser) {
        this.pwcusrLastChangeUser = pwcusrLastChangeUser;
    }

    // @Basic
    // @Column(name = "PWCTYC_CountryCode", nullable = false)
    public Long getPwctycCountryCode() {
        return pwctycCountryCode;
    }

    public void setPwctycCountryCode(Long pwctycCountryCode) {
        this.pwctycCountryCode = pwctycCountryCode;
    }

    // @Basic
    // @Column(name = "PWDID_DistId", nullable = false)
    public Long getPwdidDistId() {
        return pwdidDistId;
    }

    public void setPwdidDistId(Long pwdidDistId) {
        this.pwdidDistId = pwdidDistId;
    }

    // @Basic
    // @Column(name = "PWLBWF_LdrshipWaiverFlag", nullable = false, length = 15)
    public String getPwlbwfLdrshipWaiverFlag() {
        return pwlbwfLdrshipWaiverFlag;
    }

    public void setPwlbwfLdrshipWaiverFlag(String pwlbwfLdrshipWaiverFlag) {
        this.pwlbwfLdrshipWaiverFlag = pwlbwfLdrshipWaiverFlag;
    }

    // @Basic
    // @Column(name = "PWCNTY_AlphaCountryCode", nullable = false, length = 15)
    public String getPwcntyAlphaCountryCode() {
        return pwcntyAlphaCountryCode;
    }

    public void setPwcntyAlphaCountryCode(String pwcntyAlphaCountryCode) {
        this.pwcntyAlphaCountryCode = pwcntyAlphaCountryCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DspwvpWaiver that = (DspwvpWaiver) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (pwctlDistCtrl != null ? !pwctlDistCtrl.equals(that.pwctlDistCtrl) : that.pwctlDistCtrl != null)
            return false;
        if (pwonemOneMonthWaiver != null ? !pwonemOneMonthWaiver.equals(that.pwonemOneMonthWaiver) : that.pwonemOneMonthWaiver != null)
            return false;
        if (pwcdatLastChangeDate != null ? !pwcdatLastChangeDate.equals(that.pwcdatLastChangeDate) : that.pwcdatLastChangeDate != null)
            return false;
        if (pwcusrLastChangeUser != null ? !pwcusrLastChangeUser.equals(that.pwcusrLastChangeUser) : that.pwcusrLastChangeUser != null)
            return false;
        if (pwctycCountryCode != null ? !pwctycCountryCode.equals(that.pwctycCountryCode) : that.pwctycCountryCode != null)
            return false;
        if (pwdidDistId != null ? !pwdidDistId.equals(that.pwdidDistId) : that.pwdidDistId != null) return false;
        if (pwlbwfLdrshipWaiverFlag != null ? !pwlbwfLdrshipWaiverFlag.equals(that.pwlbwfLdrshipWaiverFlag) : that.pwlbwfLdrshipWaiverFlag != null)
            return false;
        if (pwcntyAlphaCountryCode != null ? !pwcntyAlphaCountryCode.equals(that.pwcntyAlphaCountryCode) : that.pwcntyAlphaCountryCode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (pwctlDistCtrl != null ? pwctlDistCtrl.hashCode() : 0);
        result = 31 * result + (pwonemOneMonthWaiver != null ? pwonemOneMonthWaiver.hashCode() : 0);
        result = 31 * result + (pwcdatLastChangeDate != null ? pwcdatLastChangeDate.hashCode() : 0);
        result = 31 * result + (pwcusrLastChangeUser != null ? pwcusrLastChangeUser.hashCode() : 0);
        result = 31 * result + (pwctycCountryCode != null ? pwctycCountryCode.hashCode() : 0);
        result = 31 * result + (pwdidDistId != null ? pwdidDistId.hashCode() : 0);
        result = 31 * result + (pwlbwfLdrshipWaiverFlag != null ? pwlbwfLdrshipWaiverFlag.hashCode() : 0);
        result = 31 * result + (pwcntyAlphaCountryCode != null ? pwcntyAlphaCountryCode.hashCode() : 0);
        return result;
    }

    // @Basic
    // @Column(name = "MemberFile", nullable = true, length = 10)
    public String getMemberFile() {
        return memberFile;
    }

    public void setMemberFile(String memberFile) {
        this.memberFile = memberFile;
    }

    @Override
    public String toString() {
        return "{\"DspwvpWaiver\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"pwctlDistCtrl\":\"" + pwctlDistCtrl + "\""
                + ",                         \"pwonemOneMonthWaiver\":\"" + pwonemOneMonthWaiver + "\""
                + ",                         \"pwcdatLastChangeDate\":\"" + pwcdatLastChangeDate + "\""
                + ",                         \"pwcusrLastChangeUser\":\"" + pwcusrLastChangeUser + "\""
                + ",                         \"pwctycCountryCode\":\"" + pwctycCountryCode + "\""
                + ",                         \"pwdidDistId\":\"" + pwdidDistId + "\""
                + ",                         \"pwlbwfLdrshipWaiverFlag\":\"" + pwlbwfLdrshipWaiverFlag + "\""
                + ",                         \"pwcntyAlphaCountryCode\":\"" + pwcntyAlphaCountryCode + "\""
                + ",                         \"memberFile\":\"" + memberFile + "\""
                + "}}";
    }
}
