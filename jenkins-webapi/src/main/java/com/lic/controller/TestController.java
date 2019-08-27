package com.lic.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @author :25808-lic
 * @date :2019/8/26,10:19
 */
@Api(tags = "小程序-排班信息")
@RestController
@RequestMapping("/test")
public class TestController {

    @ApiOperation(value = "jenkins测", notes = "")
    @PostMapping("/jenkins")
    public Boolean listMonthSchedule() {
        return Boolean.TRUE;
    }
}
