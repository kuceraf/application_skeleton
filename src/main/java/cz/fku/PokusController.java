package cz.fku;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Filip on 04.11.2016.
 */
@Controller
public class PokusController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String test() {
        return "Ahoj";
    }
}
