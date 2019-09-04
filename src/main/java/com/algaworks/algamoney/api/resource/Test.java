package com.algaworks.algamoney.api.resource;

import com.algaworks.algamoney.api.config.property.AlgamoneyApiProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class Test {

    @Autowired
    private AlgamoneyApiProperty algamoneyApiProperty;

    @GetMapping
    public ResponseEntity<Boolean> isHttps() {
        return ResponseEntity.ok().body(algamoneyApiProperty.getSeguranca().isEnableHttps());
    }
}
