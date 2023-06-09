package com.changhong.sei.help.dto;

import com.changhong.sei.core.dto.BaseEntityDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.beans.Transient;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;

/**
 * 评论(Comment)DTO类
 *
 * @author sei
 * @since 2020-06-04 10:09:46
 */
@ApiModel(description = "评论DTO")
public class CommentDto extends BaseEntityDto {
private static final long serialVersionUID = -55697659277985866L;
    /**
     * 评论内容
     */
    @NotBlank
    @ApiModelProperty(value = "评论内容")
    private String content;
    /**
     * 话题
     */
    @NotNull
    @ApiModelProperty(value = "话题")
    private TopicDto topic;
    /**
     * 是否匿名
     */
    @ApiModelProperty(value = "是否匿名")
    private Boolean anonymous = Boolean.FALSE;
    /**
     * 前端显示用户
     */
    @ApiModelProperty(value = "前端显示用户")
    private String userInfo;
    /**
     * 上层评论id
     */
    @ApiModelProperty(value = "上层评论id")
    private String parentId;
    /**
     * 上层评论
     */
    @ApiModelProperty(value = "上层评论")
    private CommentDto parentComment;
    /**
     * 附件数量
     */
    @ApiModelProperty(value = "附件数量")
    private Integer docCount = 0;
    /**
     * 是否加精
     */
    @ApiModelProperty(value = "是否加精")
    private Boolean good = Boolean.FALSE;
    /**
     * 点赞数量
     */
    @ApiModelProperty(value = "点赞数量")
    private Integer likeCount = 0;
    /**
     * 文档id列表
     */
    @ApiModelProperty(value = "文档id列表")
    private HashSet<String> docIds;
    /**
     * 当前用户是否已经点赞
     */
    @ApiModelProperty(value = "当前用户是否已经点赞")
    private Boolean liked = Boolean.FALSE;

    /**
     * 创建者
     */
    @ApiModelProperty(value = "创建者id")
    protected String creatorId;

    /**
     * 创建者
     */
    @ApiModelProperty(value = "创建者")
    protected String creatorName;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    protected Date createdDate;
        
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
        
    public Boolean getAnonymous() {
        return anonymous;
    }

    public void setAnonymous(Boolean anonymous) {
        this.anonymous = anonymous;
    }
        
    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }
        
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
        
    public Integer getDocCount() {
        return docCount;
    }

    public void setDocCount(Integer docCount) {
        this.docCount = docCount;
    }
        
    public Boolean getGood() {
        return good;
    }

    public void setGood(Boolean good) {
        this.good = good;
    }
        
    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public HashSet<String> getDocIds() {
        return docIds;
    }

    public void setDocIds(HashSet<String> docIds) {
        this.docIds = docIds;
    }

    public Boolean getLiked() {
        return liked;
    }

    public void setLiked(Boolean liked) {
        this.liked = liked;
    }

    public TopicDto getTopic() {
        return topic;
    }

    public void setTopic(TopicDto topic) {
        this.topic = topic;
    }

    public CommentDto getParentComment() {
        return parentComment;
    }

    public void setParentComment(CommentDto parentComment) {
        this.parentComment = parentComment;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }
}