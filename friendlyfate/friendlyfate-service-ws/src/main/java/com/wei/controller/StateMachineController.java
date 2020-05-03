package com.wei.controller;

import com.wei.config.env.EnvironmentHelper;
import com.wei.controller.user.Test;
import com.wei.statemachine.EnumStateMachineType;
import com.wei.statemachine.StateMachineService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wei.peng
 * @descripe SpringBootProject
 * @Date 2019/7/1 0001.
 */
@Api(description = "状态机模块")
@RestController
@RequestMapping(value = "/api/friendlyFate")
public class StateMachineController {
    @Autowired
    private EnvironmentHelper helper;
    private static final Logger log = LoggerFactory.getLogger(StateMachineController.class);
    @Autowired
    private StateMachineService stateMachineService;

    @ApiOperation(value = "/state",httpMethod = "GET")
    @RequestMapping(value = "/state",method = RequestMethod.GET)
    public String getStateMachine(@ApiParam(name = "state",value = "状态",required = true)@RequestParam(value = "state",name = "state")String state,
                                  @ApiParam(name = "event",value = "事件",required = true)@RequestParam(value = "event",name = "event")String event,
                                  @ApiParam(name = "enumType",value = "枚举类型",required = true)@RequestParam(value = "enumType",name = "enumType")int enumType
                                    ){
        System.out.println(helper.getActiveProfiles());
        log.debug("getStateMachine method: param: state={}, event = {}",state,event);
        String newState = stateMachineService.sendEvent(EnumStateMachineType.values()[enumType], state, event);
        return newState;
    }

}
