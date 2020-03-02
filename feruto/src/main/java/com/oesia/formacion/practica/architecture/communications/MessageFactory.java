package com.oesia.formacion.practica.architecture.communications;

import java.util.ArrayList;
import java.util.List;

import com.oesia.formacion.practica.architecture.communications.messages.Message;
import com.oesia.formacion.practica.architecture.communications.messages.put.PutMessageInfo;
import com.oesia.formacion.practica.architecture.communications.messages.stock.StockMessageInfo;
import com.oesia.formacion.practica.architecture.domain.managers.article.ArticleManager;
import com.oesia.formacion.practica.architecture.domain.model.Article;
import com.oesia.formacion.practica.context.ContextFactory;


public class MessageFactory {

	private static final int WORK_ORDER = 0;
	private static final int ARTICLE_VENDOR = 1;
	private static final int ID_ARTICLE = 2;
	private static final int DESCRIPTION_ARTICLE = 3;
	private static final int ID_COLOR = 4;
	private static final int ID_SIZE = 5;
	private static final int UNDS = 6;


	public static Message create(Message message) {

		String workOrder = "";

		switch (message.getMessageType()) {

		case "INFO":

			try {

				List<String> listMessages = message.getMessages();
				List<StockMessageInfo> stock = new ArrayList<StockMessageInfo>();

				Message m = new Message("STOCK", new ArrayList<Article>());
				for (String mess : listMessages) {

					StockMessageInfo s = getStock(mess);
					stock.add(s);

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

					putMessage = new PutMessageInfo(Integer.valueOf(messValue[WORK_ORDER]),Integer.valueOf(messValue[ARTICLE_VENDOR]),
							Integer.valueOf(messValue[ID_ARTICLE]), messValue[DESCRIPTION_ARTICLE],
							Integer.valueOf(messValue[ID_COLOR]), Integer.valueOf(messValue[ID_SIZE]),
							Integer.valueOf(messValue[UNDS]));

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
	
	private static StockMessageInfo getStock(String message) {

		ArticleManager articleManager = ContextFactory.getContext().get(ArticleManager.class);
		Article article = articleManager.findArticleById(Integer.valueOf(message));
		StockMessageInfo stock = new StockMessageInfo(article.getId(), article.getColour(), article.getSize(),
		article.getStock(), article.getDescription());
		
		return stock;

	}

}
