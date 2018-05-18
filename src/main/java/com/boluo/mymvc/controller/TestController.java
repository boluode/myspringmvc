package com.boluo.mymvc.controller;

import com.boluo.mymvc.model.HelloModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * mymvc - com.boluo.mymvc.controller
 *
 * @author liyanlong
 * @date 2018/5/7 18:28.
 * @since JDK 1.8
 */
@Controller
public class TestController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
	public Object index() {
        HelloModel helloModel = new HelloModel();
		return helloModel;
	}

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public Object test() {
        HelloModel helloModel = new HelloModel();
        return helloModel;
    }
}
