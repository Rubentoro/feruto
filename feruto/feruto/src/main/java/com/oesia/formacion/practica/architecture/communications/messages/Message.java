package com.oesia.formacion.practica.architecture.communications.messages;

import java.util.List;

public class Message {
	private String messageType;
	private List<String> messages;

	public Message(String messageType, List<String> messages) {
		super();
		this.messageType = messageType;
		this.messages = messages;
	}

	public String getMessageType() {
		return messageType;
	}

	public List<String> getMessages() {
		return messages;
	}

	@Override
	public String toString() {
		return "Message [messageType=" + messageType + ", messages=" + messages + "]";
	}

	
	
}
