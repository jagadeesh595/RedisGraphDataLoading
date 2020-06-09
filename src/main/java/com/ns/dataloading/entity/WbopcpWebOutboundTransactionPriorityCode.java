package com.ns.dataloading.entity;

import javax.persistence.*;

@Entity
@Table(name = "WBOPCP_WebOutboundTransactionPriorityCode", schema = "Aug18", catalog = "")
public class WbopcpWebOutboundTransactionPriorityCode {
    private Long id;
    private String wvtrcdTransCode;
    private String wvptycPriorityCode;

    @Id
    @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "WVTRCD_TransCode", nullable = true, length = 15)
    public String getWvtrcdTransCode() {
        return wvtrcdTransCode;
    }

    public void setWvtrcdTransCode(String wvtrcdTransCode) {
        this.wvtrcdTransCode = wvtrcdTransCode;
    }

    @Basic
    @Column(name = "WVPTYC_PriorityCode", nullable = true, length = 1)
    public String getWvptycPriorityCode() {
        return wvptycPriorityCode;
    }

    public void setWvptycPriorityCode(String wvptycPriorityCode) {
        this.wvptycPriorityCode = wvptycPriorityCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WbopcpWebOutboundTransactionPriorityCode that = (WbopcpWebOutboundTransactionPriorityCode) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (wvtrcdTransCode != null ? !wvtrcdTransCode.equals(that.wvtrcdTransCode) : that.wvtrcdTransCode != null)
            return false;
        if (wvptycPriorityCode != null ? !wvptycPriorityCode.equals(that.wvptycPriorityCode) : that.wvptycPriorityCode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (wvtrcdTransCode != null ? wvtrcdTransCode.hashCode() : 0);
        result = 31 * result + (wvptycPriorityCode != null ? wvptycPriorityCode.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"WbopcpWebOutboundTransactionPriorityCode\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"wvtrcdTransCode\":\"" + wvtrcdTransCode + "\""
                + ",                         \"wvptycPriorityCode\":\"" + wvptycPriorityCode + "\""
                + "}}";
    }
}
