package com.mango.es.mangoes;

import com.mango.es.mangoes.service.IndexService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MangoEsApplicationTests {

    @Autowired
    IndexService indexService;

    @Test
    void contextLoads() {
        indexService.getDocument();
    }

}
