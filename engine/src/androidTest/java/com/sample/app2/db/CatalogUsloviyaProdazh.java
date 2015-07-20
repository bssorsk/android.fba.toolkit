/*
 * This text is generated automatically, do not delete it. 'FBA Toolkit', www.profi1c.ru
 */
package com.sample.app2.db;

import com.j256.ormlite.table.DatabaseTable;

import java.util.List;

import ru.profi1c.engine.meta.Catalog;
import ru.profi1c.engine.meta.MetadataObject;
import ru.profi1c.engine.meta.TablePart;

/**
 * Справочник 'Условия продаж'
 * @author Сидоров Сидор Петрович (sidor_sidoroff@mail.ru)
 *
 */
@DatabaseTable(tableName=CatalogUsloviyaProdazh.TABLE_NAME, daoClass = CatalogUsloviyaProdazhDao.class) 
@MetadataObject(type=MetadataObject.TYPE_CATALOG, name=CatalogUsloviyaProdazh.META_NAME)
public class CatalogUsloviyaProdazh extends Catalog {
	
	/**
	 * Имя таблицы в базе данных
	 */
	public static final String TABLE_NAME = "CatalogUsloviyaProdazh";
	
	/**
	 * Имя метаданных объекта в 1С (не изменять)
	 */
	public static final String META_NAME = "УсловияПродаж";
		
	private static final long serialVersionUID = 1L;


	@Override
	public Catalog getOwner() {
		return null;
	}

	@Override
	public void setOwner(Catalog catalogRef) {
    	
	}
	
	@Override
	public List<Class<? extends TablePart>> getTabularSections() {
		return null;
	}
	
	@Override
	public String getMetaName() {
		return META_NAME;
	}
	
	@Override
	public String getPresentation() {
		return getDescription();
	}
}
