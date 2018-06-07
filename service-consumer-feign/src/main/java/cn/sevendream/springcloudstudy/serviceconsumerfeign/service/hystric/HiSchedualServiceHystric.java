package cn.sevendream.springcloudstudy.serviceconsumerfeign.service.hystric;

import cn.sevendream.springcloudstudy.serviceconsumerfeign.service.HiSchedualService;
import org.springframework.stereotype.Component;

@Component
public class HiSchedualServiceHystric implements HiSchedualService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry!!! "+name;
    }
}