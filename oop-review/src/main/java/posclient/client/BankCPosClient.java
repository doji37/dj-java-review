package posclient.client;


import model.pos.PosClientRequest;
import model.pos.PosClientResponse;
import posclient.AbstractPosClient;

public class BankCPosClient extends AbstractPosClient {

    // return dummy response
    @Override
    public PosClientResponse auth(PosClientRequest posClientRequest) {
        return new PosClientResponse(0, "1345", posClientRequest.getRequestedAmount());
    }

    // return dummy response
    @Override
    public PosClientResponse auth3D(PosClientRequest posClientRequest) {
        return new PosClientResponse(0, "23", posClientRequest.getRequestedAmount());
    }

}
