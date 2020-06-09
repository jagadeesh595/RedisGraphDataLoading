package com.ns.dataloading.entity;

import org.springframework.data.redis.core.index.Indexed;

import javax.persistence.*;

/**
 * Created by rpalamakula on 16-08-2017.
 */
@Entity
@Table(name = "DSHSTP_DistributorHistory")
public class DshstpDistributorHistory {
    private  Long id;
    private @Indexed
    Long htctlDistCtrl;
    private @Indexed String hthscdHistCode;
    private @Indexed Long htseqSequence;
    private @Indexed String htdscgOldData;
    private @Indexed Integer htpyrYearOfChange;
    private @Indexed Integer htpmoMonthOfChange;
    private @Indexed String htdatcChangeDate;
    private @Indexed String htuserChangeUserId;
    private @Indexed String htwprcWebProcessed;
    private @Indexed String htiprcICentrisProcessed;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "HTCTL_DistCtrl", nullable = false)
    public Long getHtctlDistCtrl() {
        return htctlDistCtrl;
    }

    public void setHtctlDistCtrl(Long htctlDistCtrl) {
        this.htctlDistCtrl = htctlDistCtrl;
    }

    @Basic
    @Column(name = "HTHSCD_HistCode", nullable = true, length = 255)
    public String getHthscdHistCode() {
        return hthscdHistCode;
    }

    public void setHthscdHistCode(String hthscdHistCode) {
        this.hthscdHistCode = hthscdHistCode;
    }

    @Basic
    @Column(name = "HTSEQ_Sequence", nullable = true)
    public Long getHtseqSequence() {
        return htseqSequence;
    }

    public void setHtseqSequence(Long htseqSequence) {
        this.htseqSequence = htseqSequence;
    }

    @Basic
    @Column(name = "HTDSCG_OldData", nullable = true, length = 255)
    public String getHtdscgOldData() {
        return htdscgOldData;
    }

    public void setHtdscgOldData(String htdscgOldData) {
        this.htdscgOldData = htdscgOldData;
    }

    @Basic
    @Column(name = "HTPYR_YearOfChange", nullable = true)
    public Integer getHtpyrYearOfChange() {
        return htpyrYearOfChange;
    }

    public void setHtpyrYearOfChange(Integer htpyrYearOfChange) {
        this.htpyrYearOfChange = htpyrYearOfChange;
    }

    @Basic
    @Column(name = "HTPMO_MonthOfChange", nullable = true)
    public Integer getHtpmoMonthOfChange() {
        return htpmoMonthOfChange;
    }

    public void setHtpmoMonthOfChange(Integer htpmoMonthOfChange) {
        this.htpmoMonthOfChange = htpmoMonthOfChange;
    }

    @Basic
    @Column(name = "HTDATC_ChangeDate", nullable = true, length = 12)
    public String getHtdatcChangeDate() {
        return htdatcChangeDate;
    }

    public void setHtdatcChangeDate(String htdatcChangeDate) {
        this.htdatcChangeDate = htdatcChangeDate;
    }

    @Basic
    @Column(name = "HTUSER_ChangeUserId", nullable = true, length = 255)
    public String getHtuserChangeUserId() {
        return htuserChangeUserId;
    }

    public void setHtuserChangeUserId(String htuserChangeUserId) {
        this.htuserChangeUserId = htuserChangeUserId;
    }

    @Basic
    @Column(name = "HTWPRC_WebProcessed", nullable = true, length = 1)
    public String getHtwprcWebProcessed() {
        return htwprcWebProcessed;
    }

    public void setHtwprcWebProcessed(String htwprcWebProcessed) {
        this.htwprcWebProcessed = htwprcWebProcessed;
    }

    @Basic
    @Column(name = "HTIPRC_ICentrisProcessed", nullable = true, length = 1)
    public String getHtiprcICentrisProcessed() {
        return htiprcICentrisProcessed;
    }

    public void setHtiprcICentrisProcessed(String htiprcICentrisProcessed) {
        this.htiprcICentrisProcessed = htiprcICentrisProcessed;
    }

    public DshstpDistributorHistory() {
        this.htctlDistCtrl = 0L;
        this.hthscdHistCode = "";
        this.htseqSequence = 0L;
        this.htdscgOldData = "";
        this.htpyrYearOfChange = 0;
        this.htpmoMonthOfChange = 0;
        this.htdatcChangeDate = "";
        this.htuserChangeUserId = "";
        this.htwprcWebProcessed = "";
        this.htiprcICentrisProcessed = "";
    }

    public DshstpDistributorHistory(Long htctlDistCtrl, String hthscdHistCode, Long htseqSequence, String htdscgOldData, Integer htpyrYearOfChange, Integer htpmoMonthOfChange, String htdatcChangeDate, String htuserChangeUserId, String htwprcWebProcessed, String htiprcICentrisProcessed) {
        this.htctlDistCtrl = htctlDistCtrl;
        this.hthscdHistCode = hthscdHistCode;
        this.htseqSequence = htseqSequence;
        this.htdscgOldData = htdscgOldData;
        this.htpyrYearOfChange = htpyrYearOfChange;
        this.htpmoMonthOfChange = htpmoMonthOfChange;
        this.htdatcChangeDate = htdatcChangeDate;
        this.htuserChangeUserId = htuserChangeUserId;
        this.htwprcWebProcessed = htwprcWebProcessed;
        this.htiprcICentrisProcessed = htiprcICentrisProcessed;
    }

    public DshstpDistributorHistory copy() {
        DshstpDistributorHistory history = new DshstpDistributorHistory();
        history.setHtctlDistCtrl(htctlDistCtrl);
        history.setHthscdHistCode(hthscdHistCode);
        history.setHtseqSequence(htseqSequence);
        history.setHtdscgOldData(htdscgOldData);
        history.setHtpyrYearOfChange(htpyrYearOfChange);
        history.setHtpmoMonthOfChange(htpmoMonthOfChange);
        history.setHtdatcChangeDate(htdatcChangeDate);
        history.setHtuserChangeUserId(htuserChangeUserId);
        history.setHtwprcWebProcessed(htwprcWebProcessed);
        history.setHtiprcICentrisProcessed(htiprcICentrisProcessed);


        return history;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DshstpDistributorHistory that = (DshstpDistributorHistory) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (htctlDistCtrl != null ? !htctlDistCtrl.equals(that.htctlDistCtrl) : that.htctlDistCtrl != null)
            return false;
        if (hthscdHistCode != null ? !hthscdHistCode.equals(that.hthscdHistCode) : that.hthscdHistCode != null)
            return false;
        if (htseqSequence != null ? !htseqSequence.equals(that.htseqSequence) : that.htseqSequence != null)
            return false;
        if (htdscgOldData != null ? !htdscgOldData.equals(that.htdscgOldData) : that.htdscgOldData != null)
            return false;
        if (htpyrYearOfChange != null ? !htpyrYearOfChange.equals(that.htpyrYearOfChange) : that.htpyrYearOfChange != null)
            return false;
        if (htpmoMonthOfChange != null ? !htpmoMonthOfChange.equals(that.htpmoMonthOfChange) : that.htpmoMonthOfChange != null)
            return false;
        if (htdatcChangeDate != null ? !htdatcChangeDate.equals(that.htdatcChangeDate) : that.htdatcChangeDate != null)
            return false;
        if (htuserChangeUserId != null ? !htuserChangeUserId.equals(that.htuserChangeUserId) : that.htuserChangeUserId != null)
            return false;
        if (htwprcWebProcessed != null ? !htwprcWebProcessed.equals(that.htwprcWebProcessed) : that.htwprcWebProcessed != null)
            return false;
        if (htiprcICentrisProcessed != null ? !htiprcICentrisProcessed.equals(that.htiprcICentrisProcessed) : that.htiprcICentrisProcessed != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (htctlDistCtrl != null ? htctlDistCtrl.hashCode() : 0);
        result = 31 * result + (hthscdHistCode != null ? hthscdHistCode.hashCode() : 0);
        result = 31 * result + (htseqSequence != null ? htseqSequence.hashCode() : 0);
        result = 31 * result + (htdscgOldData != null ? htdscgOldData.hashCode() : 0);
        result = 31 * result + (htpyrYearOfChange != null ? htpyrYearOfChange.hashCode() : 0);
        result = 31 * result + (htpmoMonthOfChange != null ? htpmoMonthOfChange.hashCode() : 0);
        result = 31 * result + (htdatcChangeDate != null ? htdatcChangeDate.hashCode() : 0);
        result = 31 * result + (htuserChangeUserId != null ? htuserChangeUserId.hashCode() : 0);
        result = 31 * result + (htwprcWebProcessed != null ? htwprcWebProcessed.hashCode() : 0);
        result = 31 * result + (htiprcICentrisProcessed != null ? htiprcICentrisProcessed.hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "{\"DshstpDistributorHistory\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"htctlDistCtrl\":\"" + htctlDistCtrl + "\""
                + ",                         \"hthscdHistCode\":\"" + hthscdHistCode + "\""
                + ",                         \"htseqSequence\":\"" + htseqSequence + "\""
                + ",                         \"htdscgOldData\":\"" + htdscgOldData + "\""
                + ",                         \"htpyrYearOfChange\":\"" + htpyrYearOfChange + "\""
                + ",                         \"htpmoMonthOfChange\":\"" + htpmoMonthOfChange + "\""
                + ",                         \"htdatcChangeDate\":\"" + htdatcChangeDate + "\""
                + ",                         \"htuserChangeUserId\":\"" + htuserChangeUserId + "\""
                + ",                         \"htwprcWebProcessed\":\"" + htwprcWebProcessed + "\""
                + ",                         \"htiprcICentrisProcessed\":\"" + htiprcICentrisProcessed + "\""
                + "}}";
    }
}
