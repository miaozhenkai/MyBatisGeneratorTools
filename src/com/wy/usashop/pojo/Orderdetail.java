package com.wy.usashop.pojo;

public class Orderdetail {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdetail.odid
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    private Integer odid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdetail.oid
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    private String oid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdetail.pid
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    private Integer pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdetail.pnumber
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    private Integer pnumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdetail.ptotal
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    private Double ptotal;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdetail.odid
     *
     * @return the value of orderdetail.odid
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    public Integer getOdid() {
        return odid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdetail.odid
     *
     * @param odid the value for orderdetail.odid
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    public void setOdid(Integer odid) {
        this.odid = odid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdetail.oid
     *
     * @return the value of orderdetail.oid
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    public String getOid() {
        return oid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdetail.oid
     *
     * @param oid the value for orderdetail.oid
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdetail.pid
     *
     * @return the value of orderdetail.pid
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdetail.pid
     *
     * @param pid the value for orderdetail.pid
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdetail.pnumber
     *
     * @return the value of orderdetail.pnumber
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    public Integer getPnumber() {
        return pnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdetail.pnumber
     *
     * @param pnumber the value for orderdetail.pnumber
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    public void setPnumber(Integer pnumber) {
        this.pnumber = pnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdetail.ptotal
     *
     * @return the value of orderdetail.ptotal
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    public Double getPtotal() {
        return ptotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdetail.ptotal
     *
     * @param ptotal the value for orderdetail.ptotal
     *
     * @mbg.generated Wed Apr 29 15:36:29 CST 2020
     */
    public void setPtotal(Double ptotal) {
        this.ptotal = ptotal;
    }
}