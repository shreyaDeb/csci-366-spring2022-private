package edu.montana.csci.csci366.strweb.ops;

import org.junit.jupiter.api.Test;

import static edu.montana.csci.csci366.strweb.ops.TestingUtils.strings;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sha256TransformerTest {

    @Test
    void testLineLengthWorks() {
        Sha256Transformer transformer = new Sha256Transformer(strings("a", "b", "c"));
        assertEquals(strings("ca978112ca1bbdcafac231b39a23dc4da786eff8147c4e72b9807785afee48bb",
                             "3e23e8160039594a33894f6564e1b1348bbd7a0088d42c4acb73eeaed59c009d",
                             "2e7d2c03a9507ae265ecf5b5356885a53393a2029d241394997265a1a25aefc6"), transformer.toSha256Hashes());

        transformer = new Sha256Transformer(strings("c", "b", "a"));
        assertEquals(strings("2e7d2c03a9507ae265ecf5b5356885a53393a2029d241394997265a1a25aefc6",
                "3e23e8160039594a33894f6564e1b1348bbd7a0088d42c4acb73eeaed59c009d",
                "ca978112ca1bbdcafac231b39a23dc4da786eff8147c4e72b9807785afee48bb"), transformer.toSha256Hashes());
    }


}
