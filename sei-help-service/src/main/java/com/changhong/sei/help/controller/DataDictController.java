package com.changhong.sei.help.controller;

import com.changhong.sei.help.api.DataDictApi;
import com.changhong.sei.help.dto.DataDictDto;
import com.changhong.sei.help.entity.DataDict;
import com.changhong.sei.help.service.DataDictService;
import com.changhong.sei.core.controller.BaseEntityController;
import com.changhong.sei.core.service.BaseEntityService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import io.swagger.annotations.Api;

/**
 * 数据字典(DataDict)控制类
 *
 * @author sei
 * @since 2020-06-04 10:11:55
 */
@RestController
@Api(value = "DataDictApi", tags = "数据字典服务")
@RequestMapping(path = "dataDict", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class DataDictController extends BaseEntityController<DataDict, DataDictDto> implements DataDictApi {
    /**
     * 数据字典服务对象
     */
    @Autowired
    private DataDictService service;

    @Override
    public BaseEntityService<DataDict> getService() {
        return service;
    }


}