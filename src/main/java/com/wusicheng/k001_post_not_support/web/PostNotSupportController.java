package com.wusicheng.k001_post_not_support.web;

import com.wusicheng.k001_post_not_support.domain.Human;
import com.wusicheng.k001_post_not_support.domain.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class PostNotSupportController {

    @RequestMapping(method = RequestMethod.GET)
    public String save(){
        return "post_not_support";
    }

    @RequestMapping(value = "/postNotSupport/save", method = RequestMethod.POST)
    @ResponseBody
    public Response save(@RequestBody Human human) {
        System.out.println(human);
        return Response.success();
    }
}
