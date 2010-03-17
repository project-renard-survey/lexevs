/*
 * Copyright: (c) 2004-2009 Mayo Foundation for Medical Education and 
 * Research (MFMER). All rights reserved. MAYO, MAYO CLINIC, and the
 * triple-shield Mayo logo are trademarks and service marks of MFMER.
 *
 * Except as contained in the copyright notice above, or as used to identify 
 * MFMER as the author of this software, the trade names, trademarks, service
 * marks, or product names of the copyright holder shall not be used in
 * advertising, promotion or otherwise in connection with this software without
 * prior written authorization of the copyright holder.
 * 
 * Licensed under the Eclipse Public License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at 
 * 
 * 		http://www.eclipse.org/legal/epl-v10.html
 * 
 */
package org.lexevs.dao.database.access.property;

import java.util.List;

import org.LexGrid.commonTypes.Property;
import org.LexGrid.commonTypes.PropertyQualifier;
import org.LexGrid.commonTypes.Source;
import org.LexGrid.concepts.PropertyLink;
import org.lexevs.dao.database.access.LexGridSchemaVersionAwareDao;
import org.lexevs.dao.database.access.property.batch.PropertyBatchInsertItem;

/**
 * The Interface PropertyDao.
 * 
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
public interface PropertyDao extends LexGridSchemaVersionAwareDao {
	
	/**
	 * The Enum PropertyType.
	 * 
	 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
	 */
	public enum PropertyType {
		/** The CODINGSCHEME. */
		CODINGSCHEME,
		/** The VALUEDOMAIN. */
		VALUEDOMAIN,
		/** The ENTITY. */
		ENTITY}
	
	/**
	 * Gets the all properties of parent.
	 * 
	 * @param codingSchemeId the coding scheme id
	 * @param parentId the parent id
	 * @param type the type
	 * 
	 * @return the all properties of parent
	 */
	public List<Property> getAllPropertiesOfParent(String codingSchemeId,
			String parentId, PropertyType type);
	
	public List<Property> getAllHistoryPropertiesOfParentByRevisionId(String codingSchemeId,
			String parentId, String revisionId, PropertyType type);


	/**
	 * Insert property qualifier.
	 * 
	 * @param codingSchemeId the coding scheme id
	 * @param propertyId the property id
	 * @param qualifier the qualifier
	 */
	public void insertPropertyQualifier(
			String codingSchemeId, 
			String propertyId,
			PropertyQualifier qualifier);
	
	/**
	 * Insert property.
	 * 
	 * @param codingSchemeId the coding scheme id
	 * @param parentId the parent id
	 * @param type the type
	 * @param property the property
	 * 
	 * @return the string
	 */
	public String insertProperty(
			String codingSchemeId, 
			String parentId,
			PropertyType type,
			Property property);
	
	public String insertHistoryProperty(
			String codingSchemeId, 
			String parentId,
			String propertyId,
			PropertyType type,
			Property property);
	
	/**
	 * Insert property source.
	 * 
	 * @param codingSchemeId the coding scheme id
	 * @param propertyId the property id
	 * @param source the source
	 */
	public void insertPropertySource(String codingSchemeId, String propertyId, Source source);
	
	/**
	 * Insert property usage context.
	 * 
	 * @param codingSchemeId the coding scheme id
	 * @param propertyId the property id
	 * @param usageContext the usage context
	 */
	public void insertPropertyUsageContext(String codingSchemeId, String propertyId, String usageContext);
	
	/**
	 * Delete all entity properties of coding scheme.
	 * 
	 * @param codingSchemeId the coding scheme id
	 */
	public void deleteAllEntityPropertiesOfCodingScheme(
			String codingSchemeId);
	
	/**
	 * Insert batch properties.
	 * 
	 * @param codingSchemeId the coding scheme id
	 * @param type the type
	 * @param batch the batch
	 */
	public void insertBatchProperties(
			String codingSchemeId, 
			PropertyType type,
			List<PropertyBatchInsertItem> batch);
	
	/**
	 * Insert property link.
	 * 
	 * @param codingSchemeId the coding scheme id
	 * @param propertyId the property id
	 * @param propertyLink the property link
	 */
	public void insertPropertyLink(
			String codingSchemeId, 
			String propertyId,
			PropertyLink propertyLink);
	
	
	/**
	 * Update property.
	 * 
	 * @param codingSchemeId the coding scheme id
	 * @param parentId the parent id
	 * @param propertyId the property id
	 * @param type the type
	 * @param property the property
	 */
	public void updateProperty(
			String codingSchemeId, 
			String parentId,
			String propertyId,
			PropertyType type,
			Property property);
	

	
	
	
}

