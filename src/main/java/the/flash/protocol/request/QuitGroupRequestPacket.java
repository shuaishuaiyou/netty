package the.flash.protocol.request;

import lombok.Data;
import the.flash.protocol.Packet;

import static the.flash.protocol.command.Command.QUIT_GROUP_REQUEST;

@Data
public class QuitGroupRequestPacket extends Packet {

    private String groupId;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public Byte getCommand() {

        return QUIT_GROUP_REQUEST;
    }
}
