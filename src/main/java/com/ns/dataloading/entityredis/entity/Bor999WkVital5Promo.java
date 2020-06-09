package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;

@RedisHash("BOR999WK_Vital5Promo")
public class Bor999WkVital5Promo implements Serializable {
    private Long id;
    private Long v5IdDistributorId;
    private Long v5OrdOrderNumber;
    private String v5OrdtOrderDate;
    private Integer v5PyrProcessYear;
    private Integer v5PmoProcessMonth;
    private String v5NameDistributorName;
    private String v5EndtEntryDate;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "V5ID_DistributorId", nullable = false)
    public Long getV5IdDistributorId() {
        return v5IdDistributorId;
    }

    public void setV5IdDistributorId(Long v5IdDistributorId) {
        this.v5IdDistributorId = v5IdDistributorId;
    }

    // @Basic
    // @Column(name = "V5ORD_OrderNumber", nullable = false)
    public Long getV5OrdOrderNumber() {
        return v5OrdOrderNumber;
    }

    public void setV5OrdOrderNumber(Long v5OrdOrderNumber) {
        this.v5OrdOrderNumber = v5OrdOrderNumber;
    }

    // @Basic
    // @Column(name = "V5ORDT_OrderDate", nullable = true, length = 15)
    public String getV5OrdtOrderDate() {
        return v5OrdtOrderDate;
    }

    public void setV5OrdtOrderDate(String v5OrdtOrderDate) {
        this.v5OrdtOrderDate = v5OrdtOrderDate;
    }

    // @Basic
    // @Column(name = "V5PYR_ProcessYear", nullable = true)
    public Integer getV5PyrProcessYear() {
        return v5PyrProcessYear;
    }

    public void setV5PyrProcessYear(Integer v5PyrProcessYear) {
        this.v5PyrProcessYear = v5PyrProcessYear;
    }

    // @Basic
    // @Column(name = "V5PMO_ProcessMonth", nullable = true)
    public Integer getV5PmoProcessMonth() {
        return v5PmoProcessMonth;
    }

    public void setV5PmoProcessMonth(Integer v5PmoProcessMonth) {
        this.v5PmoProcessMonth = v5PmoProcessMonth;
    }

    // @Basic
    // @Column(name = "V5NAME_DistributorName", nullable = true, length = 255)
    public String getV5NameDistributorName() {
        return v5NameDistributorName;
    }

    public void setV5NameDistributorName(String v5NameDistributorName) {
        this.v5NameDistributorName = v5NameDistributorName;
    }

    // @Basic
    // @Column(name = "V5ENDT_EntryDate", nullable = true, length = 15)
    public String getV5EndtEntryDate() {
        return v5EndtEntryDate;
    }

    public void setV5EndtEntryDate(String v5EndtEntryDate) {
        this.v5EndtEntryDate = v5EndtEntryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bor999WkVital5Promo that = (Bor999WkVital5Promo) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (v5IdDistributorId != null ? !v5IdDistributorId.equals(that.v5IdDistributorId) : that.v5IdDistributorId != null)
            return false;
        if (v5OrdOrderNumber != null ? !v5OrdOrderNumber.equals(that.v5OrdOrderNumber) : that.v5OrdOrderNumber != null)
            return false;
        if (v5OrdtOrderDate != null ? !v5OrdtOrderDate.equals(that.v5OrdtOrderDate) : that.v5OrdtOrderDate != null)
            return false;
        if (v5PyrProcessYear != null ? !v5PyrProcessYear.equals(that.v5PyrProcessYear) : that.v5PyrProcessYear != null)
            return false;
        if (v5PmoProcessMonth != null ? !v5PmoProcessMonth.equals(that.v5PmoProcessMonth) : that.v5PmoProcessMonth != null)
            return false;
        if (v5NameDistributorName != null ? !v5NameDistributorName.equals(that.v5NameDistributorName) : that.v5NameDistributorName != null)
            return false;
        if (v5EndtEntryDate != null ? !v5EndtEntryDate.equals(that.v5EndtEntryDate) : that.v5EndtEntryDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (v5IdDistributorId != null ? v5IdDistributorId.hashCode() : 0);
        result = 31 * result + (v5OrdOrderNumber != null ? v5OrdOrderNumber.hashCode() : 0);
        result = 31 * result + (v5OrdtOrderDate != null ? v5OrdtOrderDate.hashCode() : 0);
        result = 31 * result + (v5PyrProcessYear != null ? v5PyrProcessYear.hashCode() : 0);
        result = 31 * result + (v5PmoProcessMonth != null ? v5PmoProcessMonth.hashCode() : 0);
        result = 31 * result + (v5NameDistributorName != null ? v5NameDistributorName.hashCode() : 0);
        result = 31 * result + (v5EndtEntryDate != null ? v5EndtEntryDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"Bor999WkVital5Promo\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"v5IdDistributorId\":\"" + v5IdDistributorId + "\""
                + ",                         \"v5OrdOrderNumber\":\"" + v5OrdOrderNumber + "\""
                + ",                         \"v5OrdtOrderDate\":\"" + v5OrdtOrderDate + "\""
                + ",                         \"v5PyrProcessYear\":\"" + v5PyrProcessYear + "\""
                + ",                         \"v5PmoProcessMonth\":\"" + v5PmoProcessMonth + "\""
                + ",                         \"v5NameDistributorName\":\"" + v5NameDistributorName + "\""
                + ",                         \"v5EndtEntryDate\":\"" + v5EndtEntryDate + "\""
                + "}}";
    }
}
