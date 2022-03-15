package edu.nccu.cs.simmeter.sign;

import java.security.KeyPair;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class SignedMeterDataServiceTest {

    @Autowired
    private SignedMeterDataService service;
    @Autowired
    private KeyPair keyPair;

    @Test
    public void testGetSignedMeterDataNow(){
        SignedMeterData signed = service.getSignedMeterNow();
        Assertions.assertThat(signed).isNotNull();
        log.info("signed meter data: {}", signed);
    }
}
