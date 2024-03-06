package model.pos;


import model.AbstractPosClientRequest;

import java.math.BigDecimal;

public class PosClientRequest extends AbstractPosClientRequest {
    public PosClientRequest(BigDecimal requestedAmount) {
        super(requestedAmount);
    }
}

