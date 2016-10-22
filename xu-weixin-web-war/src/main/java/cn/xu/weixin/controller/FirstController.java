package cn.xu.weixin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author 徐杨健
 * @Date: 2016/10/22 17:13
 */
@Controller
@RequestMapping("/first")
public class FirstController {


    @ResponseBody
    @RequestMapping(value = "/firstAnswer")
    public Map<String, Object> queryList(){
        Map<String, Object> map = new HashMap<>();
        map.put("name", "xuyangjian");
        map.put("sex", "man");
        return map;
    }
}
