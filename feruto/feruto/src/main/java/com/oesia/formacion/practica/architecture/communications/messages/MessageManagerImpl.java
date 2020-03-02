package com.oesia.formacion.practica.architecture.communications.messages;

import java.util.ArrayList;
import java.util.List;

import com.oesia.formacion.practica.architecture.communications.MessageManager;

public class MessageManagerImpl implements MessageManager {

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
				String[] MessageComplete = spliterMessage[i].split("\\|");
				for (int j = 1; j < MessageComplete.length; j++) {
					if (j == 1) {
						resultOfMessage = MessageComplete[j];
					} else {

						resultOfMessage = resultOfMessage + "|" + MessageComplete[j];

					}
				}

			} else if (i > 0) {
				String[] MessageComplete = spliterMessage[i].split("\\|");
				for (int j = 0; j < MessageComplete.length; j++) {

					if (j == 1) {
						resultOfMessage = MessageComplete[j];
					} else {

						resultOfMessage = resultOfMessage + "|" + MessageComplete[j];

					}

				}

			}
			if (parseMessages == "") {
				parseMessages = resultOfMessage;
			} else {
				parseMessages = parseMessages + "*" + resultOfMessage;
			}
		}

		List<String> listOfMessages= new ArrayList<String>();

		String[] arrayParseMessages = parseMessages.split("\\*");

		for (int k = 0; k < arrayParseMessages.length; k++) {

			listOfMessages.add(arrayParseMessages[k]);
		}

		Message messageObject = new Message(typeOfMessage, listOfMessages);

		System.out.println(messageObject);

//		MessageFactory factory = new MessageFactory();
//		factory.create(splitedMessage[i]);

	}

	@Override
	public void send(String message) {
		// TODO Auto-generated method stub

	}

}
