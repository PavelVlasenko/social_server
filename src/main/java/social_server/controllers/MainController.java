package social_server.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by SBT-Vlasenko-PV on 22.08.2016.
 */
@RestController
public class MainController {

    private static Logger log = LoggerFactory.getLogger(MainController.class);

    @RequestMapping(value = "/test")
    public String test() {
        log.info("Access /test");

        return "success";
    }
}
