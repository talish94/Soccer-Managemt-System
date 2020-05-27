package IO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

    static Logger logger = LoggerFactory.getLogger(LoggingController.class);

    public static Logger getLogger() {
        return logger;
    }

//    @RequestMapping("/")
//    public String index() {
//        logger.trace("A TRACE Message");
//        logger.debug("A DEBUG Message");
//        logger.info("An INFO Message");
//        logger.warn("A WARN Message");
//        logger.error("An ERROR Message");
//
//        return "Howdy! Check out the Logs to see the output...";
//    }
}