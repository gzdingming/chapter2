package org.smart4j.chapter2.model;/** * @ClassName Customer * @Description TODO * @Author mac * @Date 2019-05-02 09:23 PM * Version 1.0 **/public class Customer {    /**     * ID     */    private long id;    /**     * Name     */    private String name;    /**     * contact     */    private String contact;    /**     * telephone     */    private String telephone;    /**     * email     */    private String email;    /**     * remark     */    private String remark;    public long getId() {        return id;    }    public void setId(long id) {        this.id = id;    }    public String getName() {        return name;    }    public void setName(String name) {        this.name = name;    }    public String getContact() {        return contact;    }    public void setContact(String contact) {        this.contact = contact;    }    public String getTelephone() {        return telephone;    }    public void setTelephone(String telephone) {        this.telephone = telephone;    }    public String getEmail() {        return email;    }    public void setEmail(String email) {        this.email = email;    }    public String getRemark() {        return remark;    }    public void setRemark(String remark) {        this.remark = remark;    }}