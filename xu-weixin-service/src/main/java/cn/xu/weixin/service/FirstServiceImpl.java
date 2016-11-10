package cn.xu.weixin.service;

import org.springframework.stereotype.Service;

/**
 * Created by USER-20160603SD$ on 2016/11/10.
 */
@Service("FirstServiceImpl")
public class FirstServiceImpl implements FirstService {
    @Override
    public String getMeg() {
        return "第一个service";
    }
}
