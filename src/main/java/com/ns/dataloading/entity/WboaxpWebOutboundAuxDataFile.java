package com.ns.dataloading.entity;

import javax.persistence.*;

@Entity
@Table(name = "WBOAXP_WebOutboundAuxDataFile")
public class WboaxpWebOutboundAuxDataFile {
    private Long id;
    private Long watrnTrans;
    private Long waseqSequence;
    private String wanameName;
    private String wavaluValue;

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
    @Column(name = "WATRN_Trans", nullable = true)
    public Long getWatrnTrans() {
        return watrnTrans;
    }

    public void setWatrnTrans(Long watrnTrans) {
        this.watrnTrans = watrnTrans;
    }

    @Basic
    @Column(name = "WASEQ_Sequence", nullable = true)
    public Long getWaseqSequence() {
        return waseqSequence;
    }

    public void setWaseqSequence(Long waseqSequence) {
        this.waseqSequence = waseqSequence;
    }

    @Basic
    @Column(name = "WANAME_Name", nullable = true, length = 255)
    public String getWanameName() {
        return wanameName;
    }

    public void setWanameName(String wanameName) {
        this.wanameName = wanameName;
    }

    @Basic
    @Column(name = "WAVALU_Value", nullable = true, length = 255)
    public String getWavaluValue() {
        return wavaluValue;
    }

    public void setWavaluValue(String wavaluValue) {
        this.wavaluValue = wavaluValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WboaxpWebOutboundAuxDataFile that = (WboaxpWebOutboundAuxDataFile) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (watrnTrans != null ? !watrnTrans.equals(that.watrnTrans) : that.watrnTrans != null) return false;
        if (waseqSequence != null ? !waseqSequence.equals(that.waseqSequence) : that.waseqSequence != null)
            return false;
        if (wanameName != null ? !wanameName.equals(that.wanameName) : that.wanameName != null) return false;
        if (wavaluValue != null ? !wavaluValue.equals(that.wavaluValue) : that.wavaluValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (watrnTrans != null ? watrnTrans.hashCode() : 0);
        result = 31 * result + (waseqSequence != null ? waseqSequence.hashCode() : 0);
        result = 31 * result + (wanameName != null ? wanameName.hashCode() : 0);
        result = 31 * result + (wavaluValue != null ? wavaluValue.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"WboaxpWebOutboundAuxDataFile\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"watrnTrans\":\"" + watrnTrans + "\""
                + ",                         \"waseqSequence\":\"" + waseqSequence + "\""
                + ",                         \"wanameName\":\"" + wanameName + "\""
                + ",                         \"wavaluValue\":\"" + wavaluValue + "\""
                + "}}";
    }
}
