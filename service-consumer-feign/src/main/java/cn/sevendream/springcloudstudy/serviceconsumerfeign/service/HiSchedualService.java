package cn.sevendream.springcloudstudy.serviceconsumerfeign.service;

import cn.sevendream.springcloudstudy.serviceconsumerfeign.service.hystric.HiSchedualServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-provider",fallback = HiSchedualServiceHystric.class)
public interface HiSchedualService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
