package the.flash.protocol.request;

import lombok.Data;
import the.flash.protocol.Packet;

import static the.flash.protocol.command.Command.LOGIN_REQUEST;

@Data
public class LoginRequestPacket extends Packet {
    private String userName;

    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Byte getCommand() {

        return LOGIN_REQUEST;
    }
}
