package xiao.yang.cachdemo.controller;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Cacheable(cacheNames="emp",key = "#key")
    @GetMapping("put/{id}")
    public Object put(@PathVariable("id") String key){
        System.out.println(key);
        return "xxx"+key;
    }


}
