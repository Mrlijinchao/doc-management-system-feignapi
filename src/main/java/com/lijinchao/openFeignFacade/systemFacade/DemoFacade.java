package com.lijinchao.openFeignFacade.systemFacade;

import org.springframework.web.bind.annotation.GetMapping;

public interface DemoFacade {

    @GetMapping("/name")
    String getName();

}
