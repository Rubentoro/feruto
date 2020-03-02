package com.oesia.formacion.practica.architecture.communications;

import java.util.ArrayList;
import java.util.List;

import com.oesia.formacion.practica.architecture.communications.messages.Message;
import com.oesia.formacion.practica.architecture.communications.messages.put.PutMessageInfo;
import com.oesia.formacion.practica.architecture.domain.managers.article.ArticleManager;
import com.oesia.formacion.practica.architecture.domain.model.Article;
import com.oesia.formacion.practica.context.ContextFactory;


public class MessageFactory {

	private static final int WORK_ORDER = 0;
	private static final int ARTICLE_VENDOR = 1;
	private static final int ID_ARTICLE = 2;
	private static final int ID_COLOR = 3;
	private static final int ID_SIZE = 4;
	private static final int UNDS = 5;

	private static final int WORK_ORDER_OPTIONAL = 0;
	private static final int ARTICLE_VENDOR_OPTIONAL = 1;
	private static final int ID_ARTICLE_OPTIONAL = 2;
	private static final int DESCRIPTION_ARTICLE_OPTIONAL = 3;
	private static final int ID_COLOR_OPTIONAL = 4;
	private static final int ID_SIZE_OPTIONAL = 5;
	private static final int UNDS_OPTIONAL = 6;

	public static Message create(Message message) {

		String workOrder = "";

		switch (message.getMessageType()) {

		case "INFO":

			try {

				List<String> listMessages = message.getMessages();
				List<Article> stock = new ArrayList<Article>();

				Message m = new Message("STOCK", new ArrayList<Article>());
				for (String mess : listMessages) {

					ArticleManager man = ContextFactory.getContext().get(ArticleManager.class);
					Article a = man.findArticleById(Integer.valueOf(mess));
					stock.add(a);

				}

				m.getMessages().addAll(stock);

				return m;

			} catch (Exception e) {
				List<String> listaKo = new ArrayList<String>();
				listaKo.add(workOrder);
				Message<String> ko = new Message<>("KO", listaKo);
				return ko;

			}

		case "PUT":
			try {
				PutMessageInfo putMessage = null;
				List<String> listMessages = message.getMessages();

				for (String mess : listMessages) {
					String[] messValue = mess.split("\\|");
					workOrder = messValue[WORK_ORDER];

					putMessage = new PutMessageInfo(Integer.valueOf(messValue[WORK_ORDER_OPTIONAL]),Integer.valueOf(messValue[ARTICLE_VENDOR_OPTIONAL]),
							Integer.valueOf(messValue[ID_ARTICLE_OPTIONAL]), messValue[DESCRIPTION_ARTICLE_OPTIONAL],
							Integer.valueOf(messValue[ID_COLOR_OPTIONAL]), Integer.valueOf(messValue[ID_SIZE_OPTIONAL]),
							Integer.valueOf(messValue[UNDS_OPTIONAL]));

					putMessage.addArticle();

				}

				List<String> listOk = new ArrayList<String>();
				listOk.add(workOrder);
				Message<String> ok = new Message<>("OK", listOk);
				return ok;
			} catch (Exception e) {
				List<String> listaKo = new ArrayList<String>();
				listaKo.add(workOrder);
				Message<String> ko = new Message<>("KO", listaKo);
				return ko;

			}

		default:
			throw new IllegalArgumentException("not value");
		}

	}
}
