package com.tusdao.catalogmanager.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="com.tusdao.catalogmanager.model.DatabaseManagerTable")
public class DatabaseManagerTable {
    /**
     *  id
     */
    @ApiModelProperty(value="")
    private Long id;

    /**
     * 库id dm_id
     */
    @ApiModelProperty(value="库id")
    private Long dmId;

    /**
     * 数据库类型 dm_type
     */
    @ApiModelProperty(value="数据库类型")
    private Integer dmType;

    /**
     * 数据库名称 dm_name
     */
    @ApiModelProperty(value="数据库名称")
    private String dmName;

    /**
     * 表名称 dt_name
     */
    @ApiModelProperty(value="表名称")
    private String dtName;

    /**
     * 是否删除(0否，1删除) is_delete
     */
    @ApiModelProperty(value="是否删除(0否，1删除)")
    private Integer isDelete;

    /**
     * 库表描述 description
     */
    @ApiModelProperty(value="库表描述")
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDmId() {
        return dmId;
    }

    public void setDmId(Long dmId) {
        this.dmId = dmId;
    }

    public Integer getDmType() {
        return dmType;
    }

    public void setDmType(Integer dmType) {
        this.dmType = dmType;
    }

    public String getDmName() {
        return dmName;
    }

    public void setDmName(String dmName) {
        this.dmName = dmName == null ? null : dmName.trim();
    }

    public String getDtName() {
        return dtName;
    }

    public void setDtName(String dtName) {
        this.dtName = dtName == null ? null : dtName.trim();
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}