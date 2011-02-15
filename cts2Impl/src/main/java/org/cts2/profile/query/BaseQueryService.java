/*
 * Copyright: (c) 2004-2011 Mayo Foundation for Medical Education and 
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
package org.cts2.profile.query;

import org.cts2.core.Directory;
import org.cts2.core.Filter;
import org.cts2.service.core.QueryControl;
import org.cts2.service.core.ReadContext;
import org.cts2.uri.DirectoryURI;

/**
 * The Interface BaseQueryService.
 *
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
public interface BaseQueryService<T extends Directory> {

	/**
	 * Resolve.
	 *
	 * @param directoryUri the directory uri
	 * @param queryControl the query control
	 * @param readContext the read context
	 * @return the t
	 */
	public T resolve(DirectoryURI<T> directoryUri, QueryControl queryControl, ReadContext readContext);
	
	/**
	 * Count.
	 *
	 * @param directoryUri the directory uri
	 * @param readContext the read context
	 * @return the int
	 */
	public int count(DirectoryURI<T> directoryUri, ReadContext readContext);
	
	/**
	 * Restrict.
	 *
	 * @param directoryUri the directory uri
	 * @param filter the filter
	 * @return the t
	 */
	public T restrict(DirectoryURI<T> directoryUri, Filter filter);


}
