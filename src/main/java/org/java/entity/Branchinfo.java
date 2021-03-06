package org.java.entity;

import javax.persistence.*;
import java.io.Serializable;

public class Branchinfo implements Serializable {
    /**
     * 机构id
     */
    @Id
    @Column(name = "branchId")
    private Integer branchid;

    /**
     * 机构名称
     */
    @Column(name = "branchName")
    private String branchname;

    /**
     * 机构简称
     */
    @Column(name = "branchShortName")
    private String branchshortname;

    /**
     * 获取机构id
     *
     * @return branchId - 机构id
     */
    public Integer getBranchid() {
        return branchid;
    }

    /**
     * 设置机构id
     *
     * @param branchid 机构id
     */
    public void setBranchid(Integer branchid) {
        this.branchid = branchid;
    }

    /**
     * 获取机构名称
     *
     * @return branchName - 机构名称
     */
    public String getBranchname() {
        return branchname;
    }

    /**
     * 设置机构名称
     *
     * @param branchname 机构名称
     */
    public void setBranchname(String branchname) {
        this.branchname = branchname;
    }

    /**
     * 获取机构简称
     *
     * @return branchShortName - 机构简称
     */
    public String getBranchshortname() {
        return branchshortname;
    }

    /**
     * 设置机构简称
     *
     * @param branchshortname 机构简称
     */
    public void setBranchshortname(String branchshortname) {
        this.branchshortname = branchshortname;
    }
}