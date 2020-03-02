package com.oesia.formacion.practica.architecture.communications.messages;

import java.util.List;

public class Message<E> {
	private String messageType;
	private List<E> messages;

	public Message(String messageType, List<E> messages) {
		super();
		this.messageType = messageType;
		this.messages = messages;
	}

	public String getMessageType() {
		return messageType;
	}

	public List<E> getMessages() {
		return messages;
	}

	@Override
	public String toString() {
		return "Message [messageType=" + messageType + ", messages=" + messages + "]";
	}

	
	
}
