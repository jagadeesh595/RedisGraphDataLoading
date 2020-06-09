package com.ns.dataloading.entity;

import javax.persistence.*;

@Entity
@Table(name = "DSPWVXP_LdrShipWaiverFromForiegnCntry")
public class DspwvxpLdrShipWaiverFromForiegnCntry {
    private Long id;
    private Integer xwyearYear;
    private Integer xwmonthMonth;
    private Long xwctlDistControl;
    private String xwonemOneMnthWaiver;
    private String xwcdatLastChangeDate;
    private String xwcusrLastChangeUser;
    private Long xwctycCntryCode;
    private Long xwdidDistId;
    private String xwlbwfLbWaiverFlag;
    private String xwcntyAlphaCntryCode;
    private String xwstatStatus;

    @Id
    @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "XWYEAR_Year", nullable = true)
    public Integer getXwyearYear() {
        return xwyearYear;
    }

    public void setXwyearYear(Integer xwyearYear) {
        this.xwyearYear = xwyearYear;
    }

    @Basic
    @Column(name = "XWMONTH_Month", nullable = true)
    public Integer getXwmonthMonth() {
        return xwmonthMonth;
    }

    public void setXwmonthMonth(Integer xwmonthMonth) {
        this.xwmonthMonth = xwmonthMonth;
    }

    @Basic
    @Column(name = "XWCTL_DistControl", nullable = false)
    public Long getXwctlDistControl() {
        return xwctlDistControl;
    }

    public void setXwctlDistControl(Long xwctlDistControl) {
        this.xwctlDistControl = xwctlDistControl;
    }

    @Basic
    @Column(name = "XWONEM_OneMnthWaiver", nullable = true, length = 1)
    public String getXwonemOneMnthWaiver() {
        return xwonemOneMnthWaiver;
    }

    public void setXwonemOneMnthWaiver(String xwonemOneMnthWaiver) {
        this.xwonemOneMnthWaiver = xwonemOneMnthWaiver;
    }

    @Basic
    @Column(name = "XWCDAT_LastChangeDate", nullable = true, length = 10)
    public String getXwcdatLastChangeDate() {
        return xwcdatLastChangeDate;
    }

    public void setXwcdatLastChangeDate(String xwcdatLastChangeDate) {
        this.xwcdatLastChangeDate = xwcdatLastChangeDate;
    }

    @Basic
    @Column(name = "XWCUSR_LastChangeUser", nullable = true, length = 255)
    public String getXwcusrLastChangeUser() {
        return xwcusrLastChangeUser;
    }

    public void setXwcusrLastChangeUser(String xwcusrLastChangeUser) {
        this.xwcusrLastChangeUser = xwcusrLastChangeUser;
    }

    @Basic
    @Column(name = "XWCTYC_CntryCode", nullable = true)
    public Long getXwctycCntryCode() {
        return xwctycCntryCode;
    }

    public void setXwctycCntryCode(Long xwctycCntryCode) {
        this.xwctycCntryCode = xwctycCntryCode;
    }

    @Basic
    @Column(name = "XWDID_DistId", nullable = false)
    public Long getXwdidDistId() {
        return xwdidDistId;
    }

    public void setXwdidDistId(Long xwdidDistId) {
        this.xwdidDistId = xwdidDistId;
    }

    @Basic
    @Column(name = "XWLBWF_LbWaiverFlag", nullable = true, length = 1)
    public String getXwlbwfLbWaiverFlag() {
        return xwlbwfLbWaiverFlag;
    }

    public void setXwlbwfLbWaiverFlag(String xwlbwfLbWaiverFlag) {
        this.xwlbwfLbWaiverFlag = xwlbwfLbWaiverFlag;
    }

    @Basic
    @Column(name = "XWCNTY_AlphaCntryCode", nullable = true, length = 255)
    public String getXwcntyAlphaCntryCode() {
        return xwcntyAlphaCntryCode;
    }

    public void setXwcntyAlphaCntryCode(String xwcntyAlphaCntryCode) {
        this.xwcntyAlphaCntryCode = xwcntyAlphaCntryCode;
    }

    @Basic
    @Column(name = "XWSTAT_Status", nullable = true, length = 1)
    public String getXwstatStatus() {
        return xwstatStatus;
    }

    public void setXwstatStatus(String xwstatStatus) {
        this.xwstatStatus = xwstatStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DspwvxpLdrShipWaiverFromForiegnCntry that = (DspwvxpLdrShipWaiverFromForiegnCntry) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (xwyearYear != null ? !xwyearYear.equals(that.xwyearYear) : that.xwyearYear != null) return false;
        if (xwmonthMonth != null ? !xwmonthMonth.equals(that.xwmonthMonth) : that.xwmonthMonth != null) return false;
        if (xwctlDistControl != null ? !xwctlDistControl.equals(that.xwctlDistControl) : that.xwctlDistControl != null)
            return false;
        if (xwonemOneMnthWaiver != null ? !xwonemOneMnthWaiver.equals(that.xwonemOneMnthWaiver) : that.xwonemOneMnthWaiver != null)
            return false;
        if (xwcdatLastChangeDate != null ? !xwcdatLastChangeDate.equals(that.xwcdatLastChangeDate) : that.xwcdatLastChangeDate != null)
            return false;
        if (xwcusrLastChangeUser != null ? !xwcusrLastChangeUser.equals(that.xwcusrLastChangeUser) : that.xwcusrLastChangeUser != null)
            return false;
        if (xwctycCntryCode != null ? !xwctycCntryCode.equals(that.xwctycCntryCode) : that.xwctycCntryCode != null)
            return false;
        if (xwdidDistId != null ? !xwdidDistId.equals(that.xwdidDistId) : that.xwdidDistId != null) return false;
        if (xwlbwfLbWaiverFlag != null ? !xwlbwfLbWaiverFlag.equals(that.xwlbwfLbWaiverFlag) : that.xwlbwfLbWaiverFlag != null)
            return false;
        if (xwcntyAlphaCntryCode != null ? !xwcntyAlphaCntryCode.equals(that.xwcntyAlphaCntryCode) : that.xwcntyAlphaCntryCode != null)
            return false;
        if (xwstatStatus != null ? !xwstatStatus.equals(that.xwstatStatus) : that.xwstatStatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (xwyearYear != null ? xwyearYear.hashCode() : 0);
        result = 31 * result + (xwmonthMonth != null ? xwmonthMonth.hashCode() : 0);
        result = 31 * result + (xwctlDistControl != null ? xwctlDistControl.hashCode() : 0);
        result = 31 * result + (xwonemOneMnthWaiver != null ? xwonemOneMnthWaiver.hashCode() : 0);
        result = 31 * result + (xwcdatLastChangeDate != null ? xwcdatLastChangeDate.hashCode() : 0);
        result = 31 * result + (xwcusrLastChangeUser != null ? xwcusrLastChangeUser.hashCode() : 0);
        result = 31 * result + (xwctycCntryCode != null ? xwctycCntryCode.hashCode() : 0);
        result = 31 * result + (xwdidDistId != null ? xwdidDistId.hashCode() : 0);
        result = 31 * result + (xwlbwfLbWaiverFlag != null ? xwlbwfLbWaiverFlag.hashCode() : 0);
        result = 31 * result + (xwcntyAlphaCntryCode != null ? xwcntyAlphaCntryCode.hashCode() : 0);
        result = 31 * result + (xwstatStatus != null ? xwstatStatus.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"DspwvxpLdrShipWaiverFromForiegnCntry\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"xwyearYear\":\"" + xwyearYear + "\""
                + ",                         \"xwmonthMonth\":\"" + xwmonthMonth + "\""
                + ",                         \"xwctlDistControl\":\"" + xwctlDistControl + "\""
                + ",                         \"xwonemOneMnthWaiver\":\"" + xwonemOneMnthWaiver + "\""
                + ",                         \"xwcdatLastChangeDate\":\"" + xwcdatLastChangeDate + "\""
                + ",                         \"xwcusrLastChangeUser\":\"" + xwcusrLastChangeUser + "\""
                + ",                         \"xwctycCntryCode\":\"" + xwctycCntryCode + "\""
                + ",                         \"xwdidDistId\":\"" + xwdidDistId + "\""
                + ",                         \"xwlbwfLbWaiverFlag\":\"" + xwlbwfLbWaiverFlag + "\""
                + ",                         \"xwcntyAlphaCntryCode\":\"" + xwcntyAlphaCntryCode + "\""
                + ",                         \"xwstatStatus\":\"" + xwstatStatus + "\""
                + "}}";
    }
}
