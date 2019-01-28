package the.flash.protocol.request;

import lombok.Data;
import the.flash.protocol.Packet;

import static the.flash.protocol.command.Command.JOIN_GROUP_REQUEST;

@Data
public class JoinGroupRequestPacket extends Packet {

    private String groupId;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public Byte getCommand() {

        return JOIN_GROUP_REQUEST;
    }
}
