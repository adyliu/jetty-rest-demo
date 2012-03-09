package info.imxylz.study.jetty.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * a rest demo (spring 3.x)
 * 
 * @author adyliu (imxylz@gmail.com)
 * @since 2012-3-9
 */
@Controller
public class DemoController {

    @ResponseBody
    @RequestMapping("/index/{name}/")
    public String index(@PathVariable("name") String name) {
        return "Welcome, " + name;
    }
    @ResponseBody
    @RequestMapping("")
    public String index() {
        return "This is a rest demo";
    }
}
