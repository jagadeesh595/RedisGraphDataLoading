package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;

@RedisHash("WBOTRP_WebOutboundTransFilecopy")
public class WbotrpWebOutboundTransFileCopy implements Serializable {
    private Long id;
    private Long wotrnTrans;
    private String wotrscTrasnSourceCo;
    private String woptycPriorityCode;
    private String wotrcdTransCode;
    private String wostspSubmitTimeStamp;
    private String wortspReceiveTimeStamp;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "WOTRN_Trans", nullable = true)
    public Long getWotrnTrans() {
        return wotrnTrans;
    }

    public void setWotrnTrans(Long wotrnTrans) {
        this.wotrnTrans = wotrnTrans;
    }

    // @Basic
    // @Column(name = "WOTRSC_TrasnSourceCo", nullable = true, length = 15)
    public String getWotrscTrasnSourceCo() {
        return wotrscTrasnSourceCo;
    }

    public void setWotrscTrasnSourceCo(String wotrscTrasnSourceCo) {
        this.wotrscTrasnSourceCo = wotrscTrasnSourceCo;
    }

    // @Basic
    // @Column(name = "WOPTYC_PriorityCode", nullable = true, length = 1)
    public String getWoptycPriorityCode() {
        return woptycPriorityCode;
    }

    public void setWoptycPriorityCode(String woptycPriorityCode) {
        this.woptycPriorityCode = woptycPriorityCode;
    }

    // @Basic
    // @Column(name = "WOTRCD_TransCode", nullable = true, length = 15)
    public String getWotrcdTransCode() {
        return wotrcdTransCode;
    }

    public void setWotrcdTransCode(String wotrcdTransCode) {
        this.wotrcdTransCode = wotrcdTransCode;
    }

    // @Basic
    // @Column(name = "WOSTSP_SubmitTimeStamp", nullable = true, length = 255)
    public String getWostspSubmitTimeStamp() {
        return wostspSubmitTimeStamp;
    }

    public void setWostspSubmitTimeStamp(String wostspSubmitTimeStamp) {
        this.wostspSubmitTimeStamp = wostspSubmitTimeStamp;
    }

    // @Basic
    // @Column(name = "WORTSP_ReceiveTimeStamp", nullable = true, length = 255)
    public String getWortspReceiveTimeStamp() {
        return wortspReceiveTimeStamp;
    }

    public void setWortspReceiveTimeStamp(String wortspReceiveTimeStamp) {
        this.wortspReceiveTimeStamp = wortspReceiveTimeStamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WbotrpWebOutboundTransFileCopy that = (WbotrpWebOutboundTransFileCopy) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (wotrnTrans != null ? !wotrnTrans.equals(that.wotrnTrans) : that.wotrnTrans != null) return false;
        if (wotrscTrasnSourceCo != null ? !wotrscTrasnSourceCo.equals(that.wotrscTrasnSourceCo) : that.wotrscTrasnSourceCo != null)
            return false;
        if (woptycPriorityCode != null ? !woptycPriorityCode.equals(that.woptycPriorityCode) : that.woptycPriorityCode != null)
            return false;
        if (wotrcdTransCode != null ? !wotrcdTransCode.equals(that.wotrcdTransCode) : that.wotrcdTransCode != null)
            return false;
        if (wostspSubmitTimeStamp != null ? !wostspSubmitTimeStamp.equals(that.wostspSubmitTimeStamp) : that.wostspSubmitTimeStamp != null)
            return false;
        if (wortspReceiveTimeStamp != null ? !wortspReceiveTimeStamp.equals(that.wortspReceiveTimeStamp) : that.wortspReceiveTimeStamp != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (wotrnTrans != null ? wotrnTrans.hashCode() : 0);
        result = 31 * result + (wotrscTrasnSourceCo != null ? wotrscTrasnSourceCo.hashCode() : 0);
        result = 31 * result + (woptycPriorityCode != null ? woptycPriorityCode.hashCode() : 0);
        result = 31 * result + (wotrcdTransCode != null ? wotrcdTransCode.hashCode() : 0);
        result = 31 * result + (wostspSubmitTimeStamp != null ? wostspSubmitTimeStamp.hashCode() : 0);
        result = 31 * result + (wortspReceiveTimeStamp != null ? wortspReceiveTimeStamp.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"WbotrpWebOutboundTransFileCopy\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"wotrnTrans\":\"" + wotrnTrans + "\""
                + ",                         \"wotrscTrasnSourceCo\":\"" + wotrscTrasnSourceCo + "\""
                + ",                         \"woptycPriorityCode\":\"" + woptycPriorityCode + "\""
                + ",                         \"wotrcdTransCode\":\"" + wotrcdTransCode + "\""
                + ",                         \"wostspSubmitTimeStamp\":\"" + wostspSubmitTimeStamp + "\""
                + ",                         \"wortspReceiveTimeStamp\":\"" + wortspReceiveTimeStamp + "\""
                + "}}";
    }
}
