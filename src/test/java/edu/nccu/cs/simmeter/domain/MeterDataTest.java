package edu.nccu.cs.simmeter.domain;

import edu.nccu.cs.simmeter.util.DataConverter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MeterDataTest {

    @Test
    public void testBuildMeterData() {
        MeterData meterData = MeterData.builder()
                                       .power(1000L)
                                       .energy(10L)
                                       .build();

        assertThat(meterData).hasFieldOrPropertyWithValue("power", 1000L);
        assertThat(meterData).hasFieldOrPropertyWithValue("energy", 10L);

        String result = DataConverter.from(meterData)
                                     .toJson()
                                     .getResult();

        System.out.println(result);
    }
}
