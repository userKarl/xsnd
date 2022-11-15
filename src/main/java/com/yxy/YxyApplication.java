package com.yxy;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.redtorch.trader.entity.SubscribeReq;
import xyz.redtorch.trader.gateway.Gateway;
import xyz.redtorch.trader.gateway.GatewaySetting;
import xyz.redtorch.utils.CommonUtil;

import java.lang.reflect.Constructor;
import java.util.HashSet;

/**
 * 说明
 *
 * @author yangxin
 * @date 2022/11/15 9:22
 */
@Slf4j
@RestController
@SpringBootApplication
public class YxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(YxyApplication.class, args);
    }

    @PostMapping("/sub/{symbol}")
    public void sub(@PathVariable String symbol){
        GatewaySetting gatewaySetting=new GatewaySetting();
        gatewaySetting.setGatewayID("9999.simnow.187.10030");
        gatewaySetting.setGatewayDisplayName("simnow");
        gatewaySetting.setUserID("084127");
        gatewaySetting.setPassword("*jt7uofEhfTm");
        gatewaySetting.setBrokerID("9999");
        gatewaySetting.setTdAddress("tcp://180.168.146.187:10130");
        gatewaySetting.setMdAddress("tcp://180.168.146.187:10211");
        gatewaySetting.setGatewayClassName("xyz.redtorch.trader.gateway.ctp.CtpGateway");
        String gatewayClassName = gatewaySetting.getGatewayClassName();

        try {
            Class<?> clazz = Class.forName(gatewayClassName);
            Constructor<?> c = clazz.getConstructor(GatewaySetting.class);
            Gateway gateway = (Gateway) c.newInstance(gatewaySetting);
            gateway.connect();
            gateway.subscribe(symbol);

        } catch (Exception e) {
            log.error("MAIN_ENGINE:创建接口{}实例发生异常,GatewaySetting{}", gatewayClassName, JSON.toJSONString(gatewaySetting),
                    e);
        }
    }
}
