package com.oesia.formacion.practica.architecture.communications;

import com.oesia.formacion.practica.architecture.communications.messages.Message;

public interface MessageManager {

	void recive(String message);

	void send(Message message);
}
