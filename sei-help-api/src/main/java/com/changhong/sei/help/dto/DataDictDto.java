package com.changhong.sei.help.dto;

import com.changhong.sei.core.dto.BaseEntityDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.io.Serializable;

/**
 * 数据字典(DataDict)DTO类
 *
 * @author sei
 * @since 2020-06-04 10:11:55
 */
@ApiModel(description = "数据字典DTO")
public class DataDictDto extends BaseEntityDto {
private static final long serialVersionUID = 802981547858000380L;
    /**
     * 代码
     */
    @ApiModelProperty(value = "代码")
    private String code;
    /**
     * 是否冻结
     */
    @ApiModelProperty(value = "是否冻结")
    private Boolean frozen;
    /**
     * 名称
     */
    @ApiModelProperty(value = "名称")
    private String name;
    /**
     * 排序
     */
    @ApiModelProperty(value = "排序")
    private Integer rank;
    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String remark;

        
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
        
    public Boolean getFrozen() {
        return frozen;
    }

    public void setFrozen(Boolean frozen) {
        this.frozen = frozen;
    }
        
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        
    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }
        
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}