package com.mob.demo.dubbox;

import com.mob.web.entity.ClientErrorCode;
import com.mob.web.entity.MobException;

/**
 * dubbo服务类不仅可以在项目内被@Autowired方式直接使用，还可以在其他dubbo项目中被使用。使用tcp通信。
 *
 * **：！！！ 一定要将service接口和dto实体类写到 api jar模块中，他人才能正常使用！
 *
 * User: zhouzhipeng
 * Date: 2017/7/27:12:10
 */

@com.alibaba.dubbo.config.annotation.Service
public class DubboDemoServiceImpl implements DubboDemoService {
    @Override
    public String test(String a) {
        if(true){
            throw new MobException(ClientErrorCode._4002,"非法请求");
        }
        return "test :"+a;
    }
}
