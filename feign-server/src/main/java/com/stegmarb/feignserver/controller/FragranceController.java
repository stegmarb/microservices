package com.stegmarb.feignserver.controller;

import com.stegmarb.feignserver.model.Fragrance;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FragranceController {

    Logger logger = LoggerFactory.getLogger(FragranceController.class);

    @GetMapping("/fragrance/{name}")
    public Fragrance listFragrances(@PathVariable String name) {
        logger.info("Request arrived");
        return new Fragrance(name, "Giorgio Armani", 2000, Arrays.asList("bergamot", "lavender"), Arrays.asList("sandalwood", "geranium"), Arrays.asList("patchouli", "ambroxan"), false);
    }
}
