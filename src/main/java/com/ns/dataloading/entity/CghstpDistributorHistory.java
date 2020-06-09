package com.ns.dataloading.entity;

import javax.persistence.*;

@Entity
@Table(name = "CGHSTP_DistributorHistory")
public class CghstpDistributorHistory {
    private Long id;
    private String cgcoidCompany;
    private Long cgdidDistributorId;
    private Long cgctlDistributorControl;
    private String cghscdHistoryCode;
    private String cgdscgOldData;
    private Integer cgpyrProcessPeriodYear;
    private Integer cgpmoProcessPeriodMonth;
    private Integer cglevlLevel;
    private String cgdatcChangeDate;
    private Long cgseqSequenceNumber;

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
    @Column(name = "CGCOID_Company", nullable = true, length = 15)
    public String getCgcoidCompany() {
        return cgcoidCompany;
    }

    public void setCgcoidCompany(String cgcoidCompany) {
        this.cgcoidCompany = cgcoidCompany;
    }

    @Basic
    @Column(name = "CGDID_DistributorId", nullable = true)
    public Long getCgdidDistributorId() {
        return cgdidDistributorId;
    }

    public void setCgdidDistributorId(Long cgdidDistributorId) {
        this.cgdidDistributorId = cgdidDistributorId;
    }

    @Basic
    @Column(name = "CGCTL_DistributorControl", nullable = false)
    public Long getCgctlDistributorControl() {
        return cgctlDistributorControl;
    }

    public void setCgctlDistributorControl(Long cgctlDistributorControl) {
        this.cgctlDistributorControl = cgctlDistributorControl;
    }

    @Basic
    @Column(name = "CGHSCD_HistoryCode", nullable = true, length = 15)
    public String getCghscdHistoryCode() {
        return cghscdHistoryCode;
    }

    public void setCghscdHistoryCode(String cghscdHistoryCode) {
        this.cghscdHistoryCode = cghscdHistoryCode;
    }

    @Basic
    @Column(name = "CGDSCG_OldData", nullable = true, length = 255)
    public String getCgdscgOldData() {
        return cgdscgOldData;
    }

    public void setCgdscgOldData(String cgdscgOldData) {
        this.cgdscgOldData = cgdscgOldData;
    }

    @Basic
    @Column(name = "CGPYR_ProcessPeriodYear", nullable = true)
    public Integer getCgpyrProcessPeriodYear() {
        return cgpyrProcessPeriodYear;
    }

    public void setCgpyrProcessPeriodYear(Integer cgpyrProcessPeriodYear) {
        this.cgpyrProcessPeriodYear = cgpyrProcessPeriodYear;
    }

    @Basic
    @Column(name = "CGPMO_ProcessPeriodMonth", nullable = true)
    public Integer getCgpmoProcessPeriodMonth() {
        return cgpmoProcessPeriodMonth;
    }

    public void setCgpmoProcessPeriodMonth(Integer cgpmoProcessPeriodMonth) {
        this.cgpmoProcessPeriodMonth = cgpmoProcessPeriodMonth;
    }

    @Basic
    @Column(name = "CGLEVL_Level", nullable = true)
    public Integer getCglevlLevel() {
        return cglevlLevel;
    }

    public void setCglevlLevel(Integer cglevlLevel) {
        this.cglevlLevel = cglevlLevel;
    }

    @Basic
    @Column(name = "CGDATC_ChangeDate", nullable = true, length = 15)
    public String getCgdatcChangeDate() {
        return cgdatcChangeDate;
    }

    public void setCgdatcChangeDate(String cgdatcChangeDate) {
        this.cgdatcChangeDate = cgdatcChangeDate;
    }

    @Basic
    @Column(name = "CGSEQ_SequenceNumber", nullable = true)
    public Long getCgseqSequenceNumber() {
        return cgseqSequenceNumber;
    }

    public void setCgseqSequenceNumber(Long cgseqSequenceNumber) {
        this.cgseqSequenceNumber = cgseqSequenceNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CghstpDistributorHistory that = (CghstpDistributorHistory) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (cgcoidCompany != null ? !cgcoidCompany.equals(that.cgcoidCompany) : that.cgcoidCompany != null)
            return false;
        if (cgdidDistributorId != null ? !cgdidDistributorId.equals(that.cgdidDistributorId) : that.cgdidDistributorId != null)
            return false;
        if (cgctlDistributorControl != null ? !cgctlDistributorControl.equals(that.cgctlDistributorControl) : that.cgctlDistributorControl != null)
            return false;
        if (cghscdHistoryCode != null ? !cghscdHistoryCode.equals(that.cghscdHistoryCode) : that.cghscdHistoryCode != null)
            return false;
        if (cgdscgOldData != null ? !cgdscgOldData.equals(that.cgdscgOldData) : that.cgdscgOldData != null)
            return false;
        if (cgpyrProcessPeriodYear != null ? !cgpyrProcessPeriodYear.equals(that.cgpyrProcessPeriodYear) : that.cgpyrProcessPeriodYear != null)
            return false;
        if (cgpmoProcessPeriodMonth != null ? !cgpmoProcessPeriodMonth.equals(that.cgpmoProcessPeriodMonth) : that.cgpmoProcessPeriodMonth != null)
            return false;
        if (cglevlLevel != null ? !cglevlLevel.equals(that.cglevlLevel) : that.cglevlLevel != null) return false;
        if (cgdatcChangeDate != null ? !cgdatcChangeDate.equals(that.cgdatcChangeDate) : that.cgdatcChangeDate != null)
            return false;
        if (cgseqSequenceNumber != null ? !cgseqSequenceNumber.equals(that.cgseqSequenceNumber) : that.cgseqSequenceNumber != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (cgcoidCompany != null ? cgcoidCompany.hashCode() : 0);
        result = 31 * result + (cgdidDistributorId != null ? cgdidDistributorId.hashCode() : 0);
        result = 31 * result + (cgctlDistributorControl != null ? cgctlDistributorControl.hashCode() : 0);
        result = 31 * result + (cghscdHistoryCode != null ? cghscdHistoryCode.hashCode() : 0);
        result = 31 * result + (cgdscgOldData != null ? cgdscgOldData.hashCode() : 0);
        result = 31 * result + (cgpyrProcessPeriodYear != null ? cgpyrProcessPeriodYear.hashCode() : 0);
        result = 31 * result + (cgpmoProcessPeriodMonth != null ? cgpmoProcessPeriodMonth.hashCode() : 0);
        result = 31 * result + (cglevlLevel != null ? cglevlLevel.hashCode() : 0);
        result = 31 * result + (cgdatcChangeDate != null ? cgdatcChangeDate.hashCode() : 0);
        result = 31 * result + (cgseqSequenceNumber != null ? cgseqSequenceNumber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"CghstpDistributorHistory\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"cgcoidCompany\":\"" + cgcoidCompany + "\""
                + ",                         \"cgdidDistributorId\":\"" + cgdidDistributorId + "\""
                + ",                         \"cgctlDistributorControl\":\"" + cgctlDistributorControl + "\""
                + ",                         \"cghscdHistoryCode\":\"" + cghscdHistoryCode + "\""
                + ",                         \"cgdscgOldData\":\"" + cgdscgOldData + "\""
                + ",                         \"cgpyrProcessPeriodYear\":\"" + cgpyrProcessPeriodYear + "\""
                + ",                         \"cgpmoProcessPeriodMonth\":\"" + cgpmoProcessPeriodMonth + "\""
                + ",                         \"cglevlLevel\":\"" + cglevlLevel + "\""
                + ",                         \"cgdatcChangeDate\":\"" + cgdatcChangeDate + "\""
                + ",                         \"cgseqSequenceNumber\":\"" + cgseqSequenceNumber + "\""
                + "}}";
    }
}
