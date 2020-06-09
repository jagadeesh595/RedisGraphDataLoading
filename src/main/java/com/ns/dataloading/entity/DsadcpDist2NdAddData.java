package com.ns.dataloading.entity;

import javax.persistence.*;

@Entity
@Table(name = "DSADCP_Dist2ndAddData")
public class DsadcpDist2NdAddData {
    private Long id;
    private Long aactlDistributorControl;
    private String aafpdtFirstPurchaceDate;
    private String aawddtWhlSalDistDate;
    private String aaeuserEntryUser;
    private String aaedteEntryDate;
    private String aaepgnmEntryPgmName;
    private String aacuserLastChangeUser;
    private String aacdteLastChangeDate;
    private String aacpgnmLastChangePgmName;

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
    @Column(name = "AACTL_DistributorControl", nullable = false)
    public Long getAactlDistributorControl() {
        return aactlDistributorControl;
    }

    public void setAactlDistributorControl(Long aactlDistributorControl) {
        this.aactlDistributorControl = aactlDistributorControl;
    }

    @Basic
    @Column(name = "AAFPDT_FirstPurchaceDate", nullable = true, length = 15)
    public String getAafpdtFirstPurchaceDate() {
        return aafpdtFirstPurchaceDate;
    }

    public void setAafpdtFirstPurchaceDate(String aafpdtFirstPurchaceDate) {
        this.aafpdtFirstPurchaceDate = aafpdtFirstPurchaceDate;
    }

    @Basic
    @Column(name = "AAWDDT_WhlSalDistDate", nullable = true, length = 15)
    public String getAawddtWhlSalDistDate() {
        return aawddtWhlSalDistDate;
    }

    public void setAawddtWhlSalDistDate(String aawddtWhlSalDistDate) {
        this.aawddtWhlSalDistDate = aawddtWhlSalDistDate;
    }

    @Basic
    @Column(name = "AAEUSER_EntryUser", nullable = true, length = 255)
    public String getAaeuserEntryUser() {
        return aaeuserEntryUser;
    }

    public void setAaeuserEntryUser(String aaeuserEntryUser) {
        this.aaeuserEntryUser = aaeuserEntryUser;
    }

    @Basic
    @Column(name = "AAEDTE_EntryDate", nullable = true, length = 15)
    public String getAaedteEntryDate() {
        return aaedteEntryDate;
    }

    public void setAaedteEntryDate(String aaedteEntryDate) {
        this.aaedteEntryDate = aaedteEntryDate;
    }

    @Basic
    @Column(name = "AAEPGNM_EntryPgmName", nullable = true, length = 15)
    public String getAaepgnmEntryPgmName() {
        return aaepgnmEntryPgmName;
    }

    public void setAaepgnmEntryPgmName(String aaepgnmEntryPgmName) {
        this.aaepgnmEntryPgmName = aaepgnmEntryPgmName;
    }

    @Basic
    @Column(name = "AACUSER_LastChangeUser", nullable = true, length = 255)
    public String getAacuserLastChangeUser() {
        return aacuserLastChangeUser;
    }

    public void setAacuserLastChangeUser(String aacuserLastChangeUser) {
        this.aacuserLastChangeUser = aacuserLastChangeUser;
    }

    @Basic
    @Column(name = "AACDTE_LastChangeDate", nullable = true, length = 15)
    public String getAacdteLastChangeDate() {
        return aacdteLastChangeDate;
    }

    public void setAacdteLastChangeDate(String aacdteLastChangeDate) {
        this.aacdteLastChangeDate = aacdteLastChangeDate;
    }

    @Basic
    @Column(name = "AACPGNM_LastChangePgmName", nullable = true, length = 15)
    public String getAacpgnmLastChangePgmName() {
        return aacpgnmLastChangePgmName;
    }

    public void setAacpgnmLastChangePgmName(String aacpgnmLastChangePgmName) {
        this.aacpgnmLastChangePgmName = aacpgnmLastChangePgmName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DsadcpDist2NdAddData that = (DsadcpDist2NdAddData) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (aactlDistributorControl != null ? !aactlDistributorControl.equals(that.aactlDistributorControl) : that.aactlDistributorControl != null)
            return false;
        if (aafpdtFirstPurchaceDate != null ? !aafpdtFirstPurchaceDate.equals(that.aafpdtFirstPurchaceDate) : that.aafpdtFirstPurchaceDate != null)
            return false;
        if (aawddtWhlSalDistDate != null ? !aawddtWhlSalDistDate.equals(that.aawddtWhlSalDistDate) : that.aawddtWhlSalDistDate != null)
            return false;
        if (aaeuserEntryUser != null ? !aaeuserEntryUser.equals(that.aaeuserEntryUser) : that.aaeuserEntryUser != null)
            return false;
        if (aaedteEntryDate != null ? !aaedteEntryDate.equals(that.aaedteEntryDate) : that.aaedteEntryDate != null)
            return false;
        if (aaepgnmEntryPgmName != null ? !aaepgnmEntryPgmName.equals(that.aaepgnmEntryPgmName) : that.aaepgnmEntryPgmName != null)
            return false;
        if (aacuserLastChangeUser != null ? !aacuserLastChangeUser.equals(that.aacuserLastChangeUser) : that.aacuserLastChangeUser != null)
            return false;
        if (aacdteLastChangeDate != null ? !aacdteLastChangeDate.equals(that.aacdteLastChangeDate) : that.aacdteLastChangeDate != null)
            return false;
        if (aacpgnmLastChangePgmName != null ? !aacpgnmLastChangePgmName.equals(that.aacpgnmLastChangePgmName) : that.aacpgnmLastChangePgmName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (aactlDistributorControl != null ? aactlDistributorControl.hashCode() : 0);
        result = 31 * result + (aafpdtFirstPurchaceDate != null ? aafpdtFirstPurchaceDate.hashCode() : 0);
        result = 31 * result + (aawddtWhlSalDistDate != null ? aawddtWhlSalDistDate.hashCode() : 0);
        result = 31 * result + (aaeuserEntryUser != null ? aaeuserEntryUser.hashCode() : 0);
        result = 31 * result + (aaedteEntryDate != null ? aaedteEntryDate.hashCode() : 0);
        result = 31 * result + (aaepgnmEntryPgmName != null ? aaepgnmEntryPgmName.hashCode() : 0);
        result = 31 * result + (aacuserLastChangeUser != null ? aacuserLastChangeUser.hashCode() : 0);
        result = 31 * result + (aacdteLastChangeDate != null ? aacdteLastChangeDate.hashCode() : 0);
        result = 31 * result + (aacpgnmLastChangePgmName != null ? aacpgnmLastChangePgmName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"DsadcpDist2NdAddData\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"aactlDistributorControl\":\"" + aactlDistributorControl + "\""
                + ",                         \"aafpdtFirstPurchaceDate\":\"" + aafpdtFirstPurchaceDate + "\""
                + ",                         \"aawddtWhlSalDistDate\":\"" + aawddtWhlSalDistDate + "\""
                + ",                         \"aaeuserEntryUser\":\"" + aaeuserEntryUser + "\""
                + ",                         \"aaedteEntryDate\":\"" + aaedteEntryDate + "\""
                + ",                         \"aaepgnmEntryPgmName\":\"" + aaepgnmEntryPgmName + "\""
                + ",                         \"aacuserLastChangeUser\":\"" + aacuserLastChangeUser + "\""
                + ",                         \"aacdteLastChangeDate\":\"" + aacdteLastChangeDate + "\""
                + ",                         \"aacpgnmLastChangePgmName\":\"" + aacpgnmLastChangePgmName + "\""
                + "}}";
    }

    public DsadcpDist2NdAddData copy() {
        DsadcpDist2NdAddData d = new DsadcpDist2NdAddData();
        d.aactlDistributorControl = aactlDistributorControl;
        d.aafpdtFirstPurchaceDate = aafpdtFirstPurchaceDate;
        d.aawddtWhlSalDistDate = aawddtWhlSalDistDate;
        d.aaeuserEntryUser = aaeuserEntryUser;
        d.aaedteEntryDate = aaedteEntryDate;
        d.aaepgnmEntryPgmName = aaepgnmEntryPgmName;
        d.aacuserLastChangeUser = aacuserLastChangeUser;
        d.aacdteLastChangeDate = aacdteLastChangeDate;
        d.aacpgnmLastChangePgmName = aacpgnmLastChangePgmName;
        return d;
    }


}
