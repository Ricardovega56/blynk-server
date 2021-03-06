package cc.blynk.server.core.protocol.model.messages.appllication;

import cc.blynk.server.core.protocol.model.messages.StringMessage;

import static cc.blynk.server.core.protocol.enums.Command.SET_WIDGET_PROPERTY;

/**
 * The Blynk Project.
 * Created by Dmitriy Dumanskiy.
 * Created on 2/1/2015.
 */
public class SetWidgetPropertyMessage extends StringMessage {

    public SetWidgetPropertyMessage(int messageId, String body) {
        super(messageId, SET_WIDGET_PROPERTY, body.length(), body);
    }

    @Override
    public String toString() {
        return "SetWidgetPropertyMessage{" + super.toString() + "}";
    }
}
