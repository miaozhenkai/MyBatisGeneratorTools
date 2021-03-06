package com.wy.usashop.pojo;

import java.util.Date;

public class Xmorder {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xmorder.oid
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    private String oid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xmorder.uid
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    private Integer uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xmorder.addressId
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    private Integer addressId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xmorder.totalprice
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    private Double totalprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xmorder.remarks
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    private String remarks;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xmorder.status
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xmorder.odate
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    private Date odate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xmorder.oid
     *
     * @return the value of xmorder.oid
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    public String getOid() {
        return oid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xmorder.oid
     *
     * @param oid the value for xmorder.oid
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xmorder.uid
     *
     * @return the value of xmorder.uid
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xmorder.uid
     *
     * @param uid the value for xmorder.uid
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xmorder.addressId
     *
     * @return the value of xmorder.addressId
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    public Integer getAddressId() {
        return addressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xmorder.addressId
     *
     * @param addressId the value for xmorder.addressId
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xmorder.totalprice
     *
     * @return the value of xmorder.totalprice
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    public Double getTotalprice() {
        return totalprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xmorder.totalprice
     *
     * @param totalprice the value for xmorder.totalprice
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    public void setTotalprice(Double totalprice) {
        this.totalprice = totalprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xmorder.remarks
     *
     * @return the value of xmorder.remarks
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xmorder.remarks
     *
     * @param remarks the value for xmorder.remarks
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xmorder.status
     *
     * @return the value of xmorder.status
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xmorder.status
     *
     * @param status the value for xmorder.status
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xmorder.odate
     *
     * @return the value of xmorder.odate
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    public Date getOdate() {
        return odate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xmorder.odate
     *
     * @param odate the value for xmorder.odate
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    public void setOdate(Date odate) {
        this.odate = odate;
    }
}