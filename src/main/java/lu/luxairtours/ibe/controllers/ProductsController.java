package lu.luxairtours.ibe.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.FileCopyUtils; 

import java.io.InputStream;

import java.nio.charset.StandardCharsets;

@RestController
public class ProductsController {

	@RequestMapping(path = "/offers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getOffers() throws Exception {

        Resource resource = new ClassPathResource("classpath:offers.txt");
        InputStream inputStream = resource.getInputStream();

        byte[] byteData = FileCopyUtils.copyToByteArray(inputStream);
        return new String(byteData, StandardCharsets.UTF_8);
	}

	@RequestMapping(path = "/products", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String getProducts() throws Exception {

        Resource resource = new ClassPathResource("classpath:products.txt");
        InputStream inputStream = resource.getInputStream();

        byte[] byteData = FileCopyUtils.copyToByteArray(inputStream);
        return new String(byteData, StandardCharsets.UTF_8);
	}
}
