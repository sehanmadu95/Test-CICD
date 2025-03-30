/**
 * @author SEHAN MADUSHANKA
 * @email sehanmadushanka0714@gmail.com
 * @contact +94776925883
 * @created 3/29/2025
 * <p>
 * Description: Controller class handles ...
 */

package com.example.testCI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String welcome() {
        return "Hello World Testing 2!!!!!";
    }

    @GetMapping("/test2")
    public String test2() {
        return "Hello World Testing 2!!!!!";
    }
}
