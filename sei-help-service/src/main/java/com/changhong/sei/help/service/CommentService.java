package com.changhong.sei.help.service;

import com.changhong.sei.help.entity.Comment;
import com.changhong.sei.help.dao.CommentDao;
import com.changhong.sei.core.dao.BaseEntityDao;
import com.changhong.sei.core.service.BaseEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 评论(Comment)业务逻辑实现类
 *
 * @author sei
 * @since 2020-06-04 10:09:46
 */
@Service("commentService")
public class CommentService extends BaseEntityService<Comment> {
    @Autowired
    private CommentDao dao;

    @Override
    protected BaseEntityDao<Comment> getDao() {
        return dao;
    }

}