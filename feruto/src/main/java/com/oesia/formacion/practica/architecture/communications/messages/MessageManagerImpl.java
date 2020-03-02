package com.oesia.formacion.practica.architecture.communications.messages;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.oesia.formacion.practica.architecture.communications.MessageFactory;
import com.oesia.formacion.practica.architecture.communications.MessageManager;
import com.oesia.formacion.practica.remote.RemoteSender;

public class MessageManagerImpl implements MessageManager {
	private static final Logger LOGGER = Logger.getLogger(RemoteSender.class);

	@Override
	public void recive(String message) {

		System.out.println(message);

		String[] spliterMessage = message.split("\\*");

		String[] processingTypeOfMessage = spliterMessage[0].split("\\|");
		String typeOfMessage = processingTypeOfMessage[0];

		String parseMessages = "";

		for (int i = 0; i < spliterMessage.length; i++) {
			String resultOfMessage = "";
			
			if (i == 0) {
				//TODO: Podríais usar el split de arriba de forma mas generica y en el bucle
				//tratar de forma distinta el primer mensaje
				String[] MessageComplete = spliterMessage[i].split("\\|");
				for (int j = 1; j < MessageComplete.length; j++) {
					if (j == 1) {
						resultOfMessage = MessageComplete[j];
					} else {
						//TODO:Queda feo reconstruir un dato que tenías inicialmente
						resultOfMessage = resultOfMessage.concat("|").concat(MessageComplete[j]);

					}
				}

			} else if (i > 0) {
				String[] MessageComplete = spliterMessage[i].split("\\|");
				for (int j = 0; j < MessageComplete.length; j++) {

					if (j == 0) {
						resultOfMessage = MessageComplete[j];
					} else {

						resultOfMessage = resultOfMessage.concat("|").concat(MessageComplete[j]);

					}

				}

			}
			if (parseMessages.isEmpty()) {
				parseMessages = resultOfMessage;
			} else {
				parseMessages = parseMessages.concat("*").concat(resultOfMessage) ;
			}
		}

		List<String> listOfMessages= new ArrayList<String>();

		//TODO: La idea era tenerlo en varios arrays que representen varios mensajes
		//, se podía hacer todo ejecutando el for anterior una vez (lista de listas)
		String[] arrayParseMessages = parseMessages.split("\\*");

		for (int k = 0; k < arrayParseMessages.length; k++) {

			listOfMessages.add(arrayParseMessages[k]);
		}

		Message messageObject = new Message(typeOfMessage, listOfMessages);

		System.out.println(messageObject);

		MessageFactory factory = new MessageFactory();
		Message messageSend = factory.create(messageObject);
		
		send(messageSend);

	}

	@Override
	public void send(Message message) {
		
		LOGGER.info(String.format("[" + message.getMessageType() + "|" + message.getMessages() + "]"));
	}

}
