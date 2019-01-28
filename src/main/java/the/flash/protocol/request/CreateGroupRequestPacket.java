package the.flash.protocol.request;

import lombok.Data;
import the.flash.protocol.Packet;

import java.util.List;

import static the.flash.protocol.command.Command.CREATE_GROUP_REQUEST;

@Data
public class CreateGroupRequestPacket extends Packet {

    private List<String> userIdList;

    public List<String> getUserIdList() {
        return userIdList;
    }

    public void setUserIdList(List<String> userIdList) {
        this.userIdList = userIdList;
    }

    @Override
    public Byte getCommand() {

        return CREATE_GROUP_REQUEST;
    }
}
