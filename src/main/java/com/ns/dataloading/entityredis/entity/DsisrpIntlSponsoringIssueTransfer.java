package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;

@RedisHash("DSISRP_IntlSponsoringIssueTransfer")
public class DsisrpIntlSponsoringIssueTransfer implements Serializable {
    private Long id;
    private String isictyIssuingcountry;
    private String isrctyRecipientcountry;
    private String issctySponsoreecountry;
    private Long isctlDistributorctl;
    private Long isseqSequencenumber;
    private Long isctycDistcountrycode;
    private Long isdidDistributorid;
    private String isisadIntlSponRecAdded;
    private String istrnsTransactionstatus;
    private String istrncTransactioncode;
    private String istrndTransactiondata;
    private Long idtsntDatesent;
    private Long idtproDateprocessed;
    private String iloaddLoadedY;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "ISICTY_Issuingcountry", nullable = true, length = 15)
    public String getIsictyIssuingcountry() {
        return isictyIssuingcountry;
    }

    public void setIsictyIssuingcountry(String isictyIssuingcountry) {
        this.isictyIssuingcountry = isictyIssuingcountry;
    }

    // @Basic
    // @Column(name = "ISRCTY_recipientcountry", nullable = true, length = 15)
    public String getIsrctyRecipientcountry() {
        return isrctyRecipientcountry;
    }

    public void setIsrctyRecipientcountry(String isrctyRecipientcountry) {
        this.isrctyRecipientcountry = isrctyRecipientcountry;
    }

    // @Basic
    // @Column(name = "ISSCTY_sponsoreecountry", nullable = true, length = 15)
    public String getIssctySponsoreecountry() {
        return issctySponsoreecountry;
    }

    public void setIssctySponsoreecountry(String issctySponsoreecountry) {
        this.issctySponsoreecountry = issctySponsoreecountry;
    }

    // @Basic
    // @Column(name = "ISCTL_distributorctl", nullable = false)
    public Long getIsctlDistributorctl() {
        return isctlDistributorctl;
    }

    public void setIsctlDistributorctl(Long isctlDistributorctl) {
        this.isctlDistributorctl = isctlDistributorctl;
    }

    // @Basic
    // @Column(name = "ISSEQ_sequencenumber", nullable = true)
    public Long getIsseqSequencenumber() {
        return isseqSequencenumber;
    }

    public void setIsseqSequencenumber(Long isseqSequencenumber) {
        this.isseqSequencenumber = isseqSequencenumber;
    }

    // @Basic
    // @Column(name = "ISCTYC_distcountrycode", nullable = true)
    public Long getIsctycDistcountrycode() {
        return isctycDistcountrycode;
    }

    public void setIsctycDistcountrycode(Long isctycDistcountrycode) {
        this.isctycDistcountrycode = isctycDistcountrycode;
    }

    // @Basic
    // @Column(name = "ISDID_distributorid", nullable = true)
    public Long getIsdidDistributorid() {
        return isdidDistributorid;
    }

    public void setIsdidDistributorid(Long isdidDistributorid) {
        this.isdidDistributorid = isdidDistributorid;
    }

    // @Basic
    // @Column(name = "ISISAD_IntlSponRecAdded", nullable = true, length = 1)
    public String getIsisadIntlSponRecAdded() {
        return isisadIntlSponRecAdded;
    }

    public void setIsisadIntlSponRecAdded(String isisadIntlSponRecAdded) {
        this.isisadIntlSponRecAdded = isisadIntlSponRecAdded;
    }

    // @Basic
    // @Column(name = "ISTRNS_transactionstatus", nullable = true, length = 1)
    public String getIstrnsTransactionstatus() {
        return istrnsTransactionstatus;
    }

    public void setIstrnsTransactionstatus(String istrnsTransactionstatus) {
        this.istrnsTransactionstatus = istrnsTransactionstatus;
    }

    // @Basic
    // @Column(name = "ISTRNC_transactioncode", nullable = true, length = 15)
    public String getIstrncTransactioncode() {
        return istrncTransactioncode;
    }

    public void setIstrncTransactioncode(String istrncTransactioncode) {
        this.istrncTransactioncode = istrncTransactioncode;
    }

    // @Basic
    // @Column(name = "ISTRND_transactiondata", nullable = true, length = 511)
    public String getIstrndTransactiondata() {
        return istrndTransactiondata;
    }

    public void setIstrndTransactiondata(String istrndTransactiondata) {
        this.istrndTransactiondata = istrndTransactiondata;
    }

    // @Basic
    // @Column(name = "IDTSNT_datesent", nullable = true)
    public Long getIdtsntDatesent() {
        return idtsntDatesent;
    }

    public void setIdtsntDatesent(Long idtsntDatesent) {
        this.idtsntDatesent = idtsntDatesent;
    }

    // @Basic
    // @Column(name = "IDTPRO_dateprocessed", nullable = true)
    public Long getIdtproDateprocessed() {
        return idtproDateprocessed;
    }

    public void setIdtproDateprocessed(Long idtproDateprocessed) {
        this.idtproDateprocessed = idtproDateprocessed;
    }

    // @Basic
    // @Column(name = "ILOADD_loaded_y", nullable = true, length = 1)
    public String getIloaddLoadedY() {
        return iloaddLoadedY;
    }

    public void setIloaddLoadedY(String iloaddLoadedY) {
        this.iloaddLoadedY = iloaddLoadedY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DsisrpIntlSponsoringIssueTransfer that = (DsisrpIntlSponsoringIssueTransfer) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (isictyIssuingcountry != null ? !isictyIssuingcountry.equals(that.isictyIssuingcountry) : that.isictyIssuingcountry != null)
            return false;
        if (isrctyRecipientcountry != null ? !isrctyRecipientcountry.equals(that.isrctyRecipientcountry) : that.isrctyRecipientcountry != null)
            return false;
        if (issctySponsoreecountry != null ? !issctySponsoreecountry.equals(that.issctySponsoreecountry) : that.issctySponsoreecountry != null)
            return false;
        if (isctlDistributorctl != null ? !isctlDistributorctl.equals(that.isctlDistributorctl) : that.isctlDistributorctl != null)
            return false;
        if (isseqSequencenumber != null ? !isseqSequencenumber.equals(that.isseqSequencenumber) : that.isseqSequencenumber != null)
            return false;
        if (isctycDistcountrycode != null ? !isctycDistcountrycode.equals(that.isctycDistcountrycode) : that.isctycDistcountrycode != null)
            return false;
        if (isdidDistributorid != null ? !isdidDistributorid.equals(that.isdidDistributorid) : that.isdidDistributorid != null)
            return false;
        if (isisadIntlSponRecAdded != null ? !isisadIntlSponRecAdded.equals(that.isisadIntlSponRecAdded) : that.isisadIntlSponRecAdded != null)
            return false;
        if (istrnsTransactionstatus != null ? !istrnsTransactionstatus.equals(that.istrnsTransactionstatus) : that.istrnsTransactionstatus != null)
            return false;
        if (istrncTransactioncode != null ? !istrncTransactioncode.equals(that.istrncTransactioncode) : that.istrncTransactioncode != null)
            return false;
        if (istrndTransactiondata != null ? !istrndTransactiondata.equals(that.istrndTransactiondata) : that.istrndTransactiondata != null)
            return false;
        if (idtsntDatesent != null ? !idtsntDatesent.equals(that.idtsntDatesent) : that.idtsntDatesent != null)
            return false;
        if (idtproDateprocessed != null ? !idtproDateprocessed.equals(that.idtproDateprocessed) : that.idtproDateprocessed != null)
            return false;
        if (iloaddLoadedY != null ? !iloaddLoadedY.equals(that.iloaddLoadedY) : that.iloaddLoadedY != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (isictyIssuingcountry != null ? isictyIssuingcountry.hashCode() : 0);
        result = 31 * result + (isrctyRecipientcountry != null ? isrctyRecipientcountry.hashCode() : 0);
        result = 31 * result + (issctySponsoreecountry != null ? issctySponsoreecountry.hashCode() : 0);
        result = 31 * result + (isctlDistributorctl != null ? isctlDistributorctl.hashCode() : 0);
        result = 31 * result + (isseqSequencenumber != null ? isseqSequencenumber.hashCode() : 0);
        result = 31 * result + (isctycDistcountrycode != null ? isctycDistcountrycode.hashCode() : 0);
        result = 31 * result + (isdidDistributorid != null ? isdidDistributorid.hashCode() : 0);
        result = 31 * result + (isisadIntlSponRecAdded != null ? isisadIntlSponRecAdded.hashCode() : 0);
        result = 31 * result + (istrnsTransactionstatus != null ? istrnsTransactionstatus.hashCode() : 0);
        result = 31 * result + (istrncTransactioncode != null ? istrncTransactioncode.hashCode() : 0);
        result = 31 * result + (istrndTransactiondata != null ? istrndTransactiondata.hashCode() : 0);
        result = 31 * result + (idtsntDatesent != null ? idtsntDatesent.hashCode() : 0);
        result = 31 * result + (idtproDateprocessed != null ? idtproDateprocessed.hashCode() : 0);
        result = 31 * result + (iloaddLoadedY != null ? iloaddLoadedY.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"DsisrpIntlSponsoringIssueTransfer\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"isictyIssuingcountry\":\"" + isictyIssuingcountry + "\""
                + ",                         \"isrctyRecipientcountry\":\"" + isrctyRecipientcountry + "\""
                + ",                         \"issctySponsoreecountry\":\"" + issctySponsoreecountry + "\""
                + ",                         \"isctlDistributorctl\":\"" + isctlDistributorctl + "\""
                + ",                         \"isseqSequencenumber\":\"" + isseqSequencenumber + "\""
                + ",                         \"isctycDistcountrycode\":\"" + isctycDistcountrycode + "\""
                + ",                         \"isdidDistributorid\":\"" + isdidDistributorid + "\""
                + ",                         \"isisadIntlSponRecAdded\":\"" + isisadIntlSponRecAdded + "\""
                + ",                         \"istrnsTransactionstatus\":\"" + istrnsTransactionstatus + "\""
                + ",                         \"istrncTransactioncode\":\"" + istrncTransactioncode + "\""
                + ",                         \"istrndTransactiondata\":\"" + istrndTransactiondata + "\""
                + ",                         \"idtsntDatesent\":\"" + idtsntDatesent + "\""
                + ",                         \"idtproDateprocessed\":\"" + idtproDateprocessed + "\""
                + ",                         \"iloaddLoadedY\":\"" + iloaddLoadedY + "\""
                + "}}";
    }
}
