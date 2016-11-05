package cz.fku.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Filip on 04.11.2016.
 *
 * Maps to <protocol>://<hostname>:<port>/<context-root>/<servlet-mapping><url-pattern>/testEcho/{testId}
 * e.g.: http://localhost:7001/app/api/testEcho/1
 */
@RestController
@RequestMapping("/testEcho")
public class TestController {
    @RequestMapping(value = "/{testId}", method = RequestMethod.GET)
    public String test(@PathVariable String testId) {
//      return value is automatically bound to the web response body
        return testId;
    }
}
