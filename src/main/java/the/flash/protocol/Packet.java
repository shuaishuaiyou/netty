package the.flash.protocol;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public abstract class Packet {
    /**
     * 协议版本
     */
    @JSONField(deserialize = false, serialize = false)
    private Byte version = 1;

    public Byte getVersion() {
        return version;
    }

    public void setVersion(Byte version) {
        this.version = version;
    }

    @JSONField(serialize = false)
    public abstract Byte getCommand();
}
