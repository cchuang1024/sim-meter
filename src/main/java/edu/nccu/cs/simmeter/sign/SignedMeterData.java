package edu.nccu.cs.simmeter.sign;

import edu.nccu.cs.simmeter.normal.MeterData;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class SignedMeterData {
    private MeterData meterData;
    private String signature;
}
