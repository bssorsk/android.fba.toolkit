/*
 * This text is generated automatically, do not delete it. 'FBA Toolkit', www.profi1c.ru
 */
package com.sample.app2.db;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.List;

import ru.profi1c.engine.meta.Catalog;
import ru.profi1c.engine.meta.MetadataField;
import ru.profi1c.engine.meta.MetadataFieldType;
import ru.profi1c.engine.meta.MetadataObject;
import ru.profi1c.engine.meta.TablePart;

/**
 * Справочник 'Характеристики номенклатуры'
 * @author Сидоров Сидор Петрович (sidor_sidoroff@mail.ru)
 *
 */
@DatabaseTable(tableName=CatalogHarakteristikiNomenklaturi.TABLE_NAME, daoClass = CatalogHarakteristikiNomenklaturiDao.class) 
@MetadataObject(type=MetadataObject.TYPE_CATALOG, name=CatalogHarakteristikiNomenklaturi.META_NAME)
public class CatalogHarakteristikiNomenklaturi extends Catalog {
	
	/**
	 * Имя таблицы в базе данных
	 */
	public static final String TABLE_NAME = "CatalogHarakteristikiNomenklaturi";
	
	/**
	 * Имя метаданных объекта в 1С (не изменять)
	 */
	public static final String META_NAME = "ХарактеристикиНоменклатуры";
		
	private static final long serialVersionUID = 1L;
    
	/**
	 * Владелец
	 */
	@DatabaseField(columnName = Catalog.FIELD_NAME_OWNER, foreign = true)
	@MetadataField(type=MetadataFieldType.REF,name=Catalog.FIELD_NAME_OWNER,description="Владелец")
	private CatalogNomenklatura owner;

	@Override
	public Catalog getOwner() {
		return owner;
	}

	@Override
	public void setOwner(Catalog catalogRef) {
    	owner = (CatalogNomenklatura) catalogRef;
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
