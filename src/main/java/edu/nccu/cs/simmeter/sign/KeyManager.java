package edu.nccu.cs.simmeter.sign;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KeyManager {

    @Getter
    private KeyPair keyPair;

    public KeyManager() {
        try {
            KeyPairGenerator g = KeyPairGenerator.getInstance("DSA", "BC");
            g.initialize(1024);
            this.keyPair = g.generateKeyPair();
        } catch (NoSuchAlgorithmException | NoSuchProviderException e) {
            log.error(e.getMessage());
        }
    }
}
