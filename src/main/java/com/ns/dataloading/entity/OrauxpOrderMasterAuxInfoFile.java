package com.ns.dataloading.entity;

import javax.persistence.*;

@Entity
@Table(name = "ORAUXP_OrderMasterAuxInfoFile")
public class OrauxpOrderMasterAuxInfoFile {
    private Long id;
    private Integer oapyrYearOfOrder;
    private Integer oapmoMonthOfOrder;
    private Long oaseqSequenceNumber;
    private Long oaordOrderNumber;
    private String oanameName;
    private String oavaluValue;

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
    @Column(name = "OAPYR_YearOfOrder", nullable = true)
    public Integer getOapyrYearOfOrder() {
        return oapyrYearOfOrder;
    }

    public void setOapyrYearOfOrder(Integer oapyrYearOfOrder) {
        this.oapyrYearOfOrder = oapyrYearOfOrder;
    }

    @Basic
    @Column(name = "OAPMO_MonthOfOrder", nullable = true)
    public Integer getOapmoMonthOfOrder() {
        return oapmoMonthOfOrder;
    }

    public void setOapmoMonthOfOrder(Integer oapmoMonthOfOrder) {
        this.oapmoMonthOfOrder = oapmoMonthOfOrder;
    }

    @Basic
    @Column(name = "OASEQ_SequenceNumber", nullable = true)
    public Long getOaseqSequenceNumber() {
        return oaseqSequenceNumber;
    }

    public void setOaseqSequenceNumber(Long oaseqSequenceNumber) {
        this.oaseqSequenceNumber = oaseqSequenceNumber;
    }

    @Basic
    @Column(name = "OAORD_OrderNumber", nullable = false)
    public Long getOaordOrderNumber() {
        return oaordOrderNumber;
    }

    public void setOaordOrderNumber(Long oaordOrderNumber) {
        this.oaordOrderNumber = oaordOrderNumber;
    }

    @Basic
    @Column(name = "OANAME_Name", nullable = true, length = 255)
    public String getOanameName() {
        return oanameName;
    }

    public void setOanameName(String oanameName) {
        this.oanameName = oanameName;
    }

    @Basic
    @Column(name = "OAVALU_Value", nullable = true, length = 255)
    public String getOavaluValue() {
        return oavaluValue;
    }

    public void setOavaluValue(String oavaluValue) {
        this.oavaluValue = oavaluValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrauxpOrderMasterAuxInfoFile that = (OrauxpOrderMasterAuxInfoFile) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (oapyrYearOfOrder != null ? !oapyrYearOfOrder.equals(that.oapyrYearOfOrder) : that.oapyrYearOfOrder != null)
            return false;
        if (oapmoMonthOfOrder != null ? !oapmoMonthOfOrder.equals(that.oapmoMonthOfOrder) : that.oapmoMonthOfOrder != null)
            return false;
        if (oaseqSequenceNumber != null ? !oaseqSequenceNumber.equals(that.oaseqSequenceNumber) : that.oaseqSequenceNumber != null)
            return false;
        if (oaordOrderNumber != null ? !oaordOrderNumber.equals(that.oaordOrderNumber) : that.oaordOrderNumber != null)
            return false;
        if (oanameName != null ? !oanameName.equals(that.oanameName) : that.oanameName != null) return false;
        if (oavaluValue != null ? !oavaluValue.equals(that.oavaluValue) : that.oavaluValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (oapyrYearOfOrder != null ? oapyrYearOfOrder.hashCode() : 0);
        result = 31 * result + (oapmoMonthOfOrder != null ? oapmoMonthOfOrder.hashCode() : 0);
        result = 31 * result + (oaseqSequenceNumber != null ? oaseqSequenceNumber.hashCode() : 0);
        result = 31 * result + (oaordOrderNumber != null ? oaordOrderNumber.hashCode() : 0);
        result = 31 * result + (oanameName != null ? oanameName.hashCode() : 0);
        result = 31 * result + (oavaluValue != null ? oavaluValue.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"OrauxpOrderMasterAuxInfoFile\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"oapyrYearOfOrder\":\"" + oapyrYearOfOrder + "\""
                + ",                         \"oapmoMonthOfOrder\":\"" + oapmoMonthOfOrder + "\""
                + ",                         \"oaseqSequenceNumber\":\"" + oaseqSequenceNumber + "\""
                + ",                         \"oaordOrderNumber\":\"" + oaordOrderNumber + "\""
                + ",                         \"oanameName\":\"" + oanameName + "\""
                + ",                         \"oavaluValue\":\"" + oavaluValue + "\""
                + "}}";
    }
}
