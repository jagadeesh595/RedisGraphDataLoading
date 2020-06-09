package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;

@RedisHash("WBOTCP_WebOutboundTransactionControl")
public class WbotcpWebOutboundTransactionControl implements Serializable {
    private Long id;
    private String wcnetiNetworkId;
    private Long wcbegStart;
    private Long wcendEnd;
    private Long wctrnTrans;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "WCNETI_NetworkId", nullable = true, length = 15)
    public String getWcnetiNetworkId() {
        return wcnetiNetworkId;
    }

    public void setWcnetiNetworkId(String wcnetiNetworkId) {
        this.wcnetiNetworkId = wcnetiNetworkId;
    }

    // @Basic
    // @Column(name = "WCBEG_Start", nullable = true)
    public Long getWcbegStart() {
        return wcbegStart;
    }

    public void setWcbegStart(Long wcbegStart) {
        this.wcbegStart = wcbegStart;
    }

    // @Basic
    // @Column(name = "WCEND_End", nullable = true)
    public Long getWcendEnd() {
        return wcendEnd;
    }

    public void setWcendEnd(Long wcendEnd) {
        this.wcendEnd = wcendEnd;
    }

    // @Basic
    // @Column(name = "WCTRN_Trans", nullable = true)
    public Long getWctrnTrans() {
        return wctrnTrans;
    }

    public void setWctrnTrans(Long wctrnTrans) {
        this.wctrnTrans = wctrnTrans;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WbotcpWebOutboundTransactionControl that = (WbotcpWebOutboundTransactionControl) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (wcnetiNetworkId != null ? !wcnetiNetworkId.equals(that.wcnetiNetworkId) : that.wcnetiNetworkId != null)
            return false;
        if (wcbegStart != null ? !wcbegStart.equals(that.wcbegStart) : that.wcbegStart != null) return false;
        if (wcendEnd != null ? !wcendEnd.equals(that.wcendEnd) : that.wcendEnd != null) return false;
        if (wctrnTrans != null ? !wctrnTrans.equals(that.wctrnTrans) : that.wctrnTrans != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (wcnetiNetworkId != null ? wcnetiNetworkId.hashCode() : 0);
        result = 31 * result + (wcbegStart != null ? wcbegStart.hashCode() : 0);
        result = 31 * result + (wcendEnd != null ? wcendEnd.hashCode() : 0);
        result = 31 * result + (wctrnTrans != null ? wctrnTrans.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"WbotcpWebOutboundTransactionControl\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"wcnetiNetworkId\":\"" + wcnetiNetworkId + "\""
                + ",                         \"wcbegStart\":\"" + wcbegStart + "\""
                + ",                         \"wcendEnd\":\"" + wcendEnd + "\""
                + ",                         \"wctrnTrans\":\"" + wctrnTrans + "\""
                + "}}";
    }
}
