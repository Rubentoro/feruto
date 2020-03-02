package com.oesia.formacion.practica.context;

import java.util.LinkedHashMap;
import java.util.Map;

import com.oesia.formacion.practica.architecture.communications.MessageManager;
import com.oesia.formacion.practica.architecture.communications.messages.MessageManagerImpl;
import com.oesia.formacion.practica.architecture.domain.managers.article.ArticleManager;
import com.oesia.formacion.practica.architecture.domain.managers.article.ArticleManagerImpl;
import com.oesia.formacion.practica.architecture.persistence.entities.article.ArticleEntity;

// Esto lo deberíamos hacer con algún framework de inyección de dependencias
public class Context {

	private final Map<Class<?>, Object> registry;

	Context() {
		registry = new LinkedHashMap<Class<?>, Object>();
	}

	// Aquí inicializamos todas nuestras clases
	public void start() {
		set(ArticleManager.class, new ArticleManagerImpl(get(ArticleEntity.class)));
		set(MessageManager.class, new MessageManagerImpl());

	}

	public <O> void set(Class<? super O> type, O instance) {
		registry.put(type, instance);
	}

	@SuppressWarnings("unchecked")
	public <O> O get(Class<O> type) {
		O instance = (O) registry.get(type);
		return instance;
	}
}
