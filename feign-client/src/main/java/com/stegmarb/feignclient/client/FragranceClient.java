package com.stegmarb.feignclient.client;

import com.stegmarb.feignclient.model.Fragrance;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "fragrance", url = "localhost:8081")
public interface FragranceClient {

    @RequestMapping(method = RequestMethod.GET, value = "/fragrance/{name}", consumes = "application/json")
    Fragrance getFragrance(@PathVariable String name);
}
