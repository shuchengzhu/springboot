package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Modle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 缩略图:最少1张,最多5张
     */
    private String tup;

    /**
     * 压缩包地址
     */
    private String pack;

    /**
     * 所属会员
     */
    private Integer member;

    /**
     * 价格
     */
    private Integer pay;

    /**
     * 上传时间
     */
    private Date uploadtime;

    /**
     * 审核时间
     */
    private Date exatime;

    /**
     * 类型(模型,贴图,Vray材质,光域网)
     */
    private Integer typeid;

    /**
     * 一级分类
     */
    private Integer classone;

    /**
     * 二级分类
     */
    private Integer classtwo;

    /**
     * 三级分类
     */
    private Integer classthree;

    /**
     * 风格(后端可自定义)
     */
    private Integer styleid;

    /**
     * 材质(后端可自定义)
     */
    private Integer materialid;

    /**
     * 点击量
     */
    @Column(name = "browsing_num")
    private Integer browsingNum;

    /**
     * 下载量
     */
    @Column(name = "download_num")
    private Integer downloadNum;

    /**
     * 收藏量
     */
    @Column(name = "collection_num")
    private Integer collectionNum;

    /**
     * 关键字(用户添加)
     */
    private String keyword;

    /**
     * 审批状态(0:未审核,1:审核中,2:审核通过,3:驳回)
     */
    private Integer exatetatus;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 3d版本
     */
    private String dmax;

    /**
     * 图片地址
     */
    @Column(name = "tup_re")
    private String tupRe;

    /**
     * 说明或介绍(用户添加)
     */
    private String remacks;

    /**
     * 来源设计师(用于名家判断)
     */
    private String doctor;

    /**
     * 搜索匹配集合
     */
    private String search;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取缩略图:最少1张,最多5张
     *
     * @return tup - 缩略图:最少1张,最多5张
     */
    public String getTup() {
        return tup;
    }

    /**
     * 设置缩略图:最少1张,最多5张
     *
     * @param tup 缩略图:最少1张,最多5张
     */
    public void setTup(String tup) {
        this.tup = tup;
    }

    /**
     * 获取压缩包地址
     *
     * @return pack - 压缩包地址
     */
    public String getPack() {
        return pack;
    }

    /**
     * 设置压缩包地址
     *
     * @param pack 压缩包地址
     */
    public void setPack(String pack) {
        this.pack = pack;
    }

    /**
     * 获取所属会员
     *
     * @return member - 所属会员
     */
    public Integer getMember() {
        return member;
    }

    /**
     * 设置所属会员
     *
     * @param member 所属会员
     */
    public void setMember(Integer member) {
        this.member = member;
    }

    /**
     * 获取价格
     *
     * @return pay - 价格
     */
    public Integer getPay() {
        return pay;
    }

    /**
     * 设置价格
     *
     * @param pay 价格
     */
    public void setPay(Integer pay) {
        this.pay = pay;
    }

    /**
     * 获取上传时间
     *
     * @return uploadtime - 上传时间
     */
    public Date getUploadtime() {
        return uploadtime;
    }

    /**
     * 设置上传时间
     *
     * @param uploadtime 上传时间
     */
    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }

    /**
     * 获取审核时间
     *
     * @return exatime - 审核时间
     */
    public Date getExatime() {
        return exatime;
    }

    /**
     * 设置审核时间
     *
     * @param exatime 审核时间
     */
    public void setExatime(Date exatime) {
        this.exatime = exatime;
    }

    /**
     * 获取类型(模型,贴图,Vray材质,光域网)
     *
     * @return typeid - 类型(模型,贴图,Vray材质,光域网)
     */
    public Integer getTypeid() {
        return typeid;
    }

    /**
     * 设置类型(模型,贴图,Vray材质,光域网)
     *
     * @param typeid 类型(模型,贴图,Vray材质,光域网)
     */
    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    /**
     * 获取一级分类
     *
     * @return classone - 一级分类
     */
    public Integer getClassone() {
        return classone;
    }

    /**
     * 设置一级分类
     *
     * @param classone 一级分类
     */
    public void setClassone(Integer classone) {
        this.classone = classone;
    }

    /**
     * 获取二级分类
     *
     * @return classtwo - 二级分类
     */
    public Integer getClasstwo() {
        return classtwo;
    }

    /**
     * 设置二级分类
     *
     * @param classtwo 二级分类
     */
    public void setClasstwo(Integer classtwo) {
        this.classtwo = classtwo;
    }

    /**
     * 获取三级分类
     *
     * @return classthree - 三级分类
     */
    public Integer getClassthree() {
        return classthree;
    }

    /**
     * 设置三级分类
     *
     * @param classthree 三级分类
     */
    public void setClassthree(Integer classthree) {
        this.classthree = classthree;
    }

    /**
     * 获取风格(后端可自定义)
     *
     * @return styleid - 风格(后端可自定义)
     */
    public Integer getStyleid() {
        return styleid;
    }

    /**
     * 设置风格(后端可自定义)
     *
     * @param styleid 风格(后端可自定义)
     */
    public void setStyleid(Integer styleid) {
        this.styleid = styleid;
    }

    /**
     * 获取材质(后端可自定义)
     *
     * @return materialid - 材质(后端可自定义)
     */
    public Integer getMaterialid() {
        return materialid;
    }

    /**
     * 设置材质(后端可自定义)
     *
     * @param materialid 材质(后端可自定义)
     */
    public void setMaterialid(Integer materialid) {
        this.materialid = materialid;
    }

    /**
     * 获取点击量
     *
     * @return browsing_num - 点击量
     */
    public Integer getBrowsingNum() {
        return browsingNum;
    }

    /**
     * 设置点击量
     *
     * @param browsingNum 点击量
     */
    public void setBrowsingNum(Integer browsingNum) {
        this.browsingNum = browsingNum;
    }

    /**
     * 获取下载量
     *
     * @return download_num - 下载量
     */
    public Integer getDownloadNum() {
        return downloadNum;
    }

    /**
     * 设置下载量
     *
     * @param downloadNum 下载量
     */
    public void setDownloadNum(Integer downloadNum) {
        this.downloadNum = downloadNum;
    }

    /**
     * 获取收藏量
     *
     * @return collection_num - 收藏量
     */
    public Integer getCollectionNum() {
        return collectionNum;
    }

    /**
     * 设置收藏量
     *
     * @param collectionNum 收藏量
     */
    public void setCollectionNum(Integer collectionNum) {
        this.collectionNum = collectionNum;
    }

    /**
     * 获取关键字(用户添加)
     *
     * @return keyword - 关键字(用户添加)
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * 设置关键字(用户添加)
     *
     * @param keyword 关键字(用户添加)
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * 获取审批状态(0:未审核,1:审核中,2:审核通过,3:驳回)
     *
     * @return exatetatus - 审批状态(0:未审核,1:审核中,2:审核通过,3:驳回)
     */
    public Integer getExatetatus() {
        return exatetatus;
    }

    /**
     * 设置审批状态(0:未审核,1:审核中,2:审核通过,3:驳回)
     *
     * @param exatetatus 审批状态(0:未审核,1:审核中,2:审核通过,3:驳回)
     */
    public void setExatetatus(Integer exatetatus) {
        this.exatetatus = exatetatus;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取3d版本
     *
     * @return dmax - 3d版本
     */
    public String getDmax() {
        return dmax;
    }

    /**
     * 设置3d版本
     *
     * @param dmax 3d版本
     */
    public void setDmax(String dmax) {
        this.dmax = dmax;
    }

    /**
     * 获取图片地址
     *
     * @return tup_re - 图片地址
     */
    public String getTupRe() {
        return tupRe;
    }

    /**
     * 设置图片地址
     *
     * @param tupRe 图片地址
     */
    public void setTupRe(String tupRe) {
        this.tupRe = tupRe;
    }

    /**
     * 获取说明或介绍(用户添加)
     *
     * @return remacks - 说明或介绍(用户添加)
     */
    public String getRemacks() {
        return remacks;
    }

    /**
     * 设置说明或介绍(用户添加)
     *
     * @param remacks 说明或介绍(用户添加)
     */
    public void setRemacks(String remacks) {
        this.remacks = remacks;
    }

    /**
     * 获取来源设计师(用于名家判断)
     *
     * @return doctor - 来源设计师(用于名家判断)
     */
    public String getDoctor() {
        return doctor;
    }

    /**
     * 设置来源设计师(用于名家判断)
     *
     * @param doctor 来源设计师(用于名家判断)
     */
    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    /**
     * 获取搜索匹配集合
     *
     * @return search - 搜索匹配集合
     */
    public String getSearch() {
        return search;
    }

    /**
     * 设置搜索匹配集合
     *
     * @param search 搜索匹配集合
     */
    public void setSearch(String search) {
        this.search = search;
    }
}
