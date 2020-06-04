package com.changhong.sei.help.dao;

import com.changhong.sei.help.entity.Notification;
import com.changhong.sei.core.dao.BaseEntityDao;
import org.springframework.stereotype.Repository;

/**
 * 通知(Notification)数据库访问类
 *
 * @author sei
 * @since 2020-06-04 10:12:17
 */
@Repository
public interface NotificationDao extends BaseEntityDao<Notification> {

}