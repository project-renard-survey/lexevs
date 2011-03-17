/**
 * 
 */
package org.cts2.internal.profile.read;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.net.URI;
import java.net.URISyntaxException;

import javax.annotation.Resource;

import org.cts2.internal.profile.read.LexEvsValueSetDefinitionReadService;
import org.cts2.profile.BaseService;
import org.cts2.test.BaseCts2UnitTest;
import org.cts2.valueset.PropertyQueryReference;
import org.cts2.valueset.ValueSetDefinition;
import org.cts2.valueset.ValueSetDefinitionEntry;
import org.junit.Test;

/**
 * 
 *	@author <A HREF="mailto:dwarkanath.sridhar@mayo.edu">Sridhar Dwarkanath</A>
 * 	
 *
 */
public class LexEvsValueSetDefinitionReadServiceTest extends BaseCts2UnitTest {

	@Resource
	private LexEvsValueSetDefinitionReadService lexEvsValueSetDefinitionReadService;
	
	@Resource
	private BaseService baseService;
	
	@Test
	public void testInit(){
		assertNotNull(lexEvsValueSetDefinitionReadService);
	}
	
	/**
	 * Test method for {@link org.cts2.internal.profile.read.LexEvsValueSetDefinitionReadService#exists(java.net.URI, org.cts2.service.core.ReadContext)}.
	 * @throws URISyntaxException 
	 */
//	@Test
//	public void testExists() throws URISyntaxException {
//		lexEvsValueSetDefinitionReadService.exists(new URI("SRITEST:AUTO:Ford"), null);
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link org.cts2.internal.profile.read.LexEvsValueSetDefinitionReadService#existsDefinitionForValueSet(org.cts2.core.NameOrURI, org.cts2.core.NameOrURI, org.cts2.service.core.ReadContext)}.
//	 */
//	@Test
//	public void testExistsDefinitionForValueSet() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link org.cts2.internal.profile.read.LexEvsValueSetDefinitionReadService#getDefinitionForValueSet(org.cts2.core.NameOrURI, org.cts2.core.NameOrURI, org.cts2.service.core.QueryControl, org.cts2.service.core.ReadContext)}.
//	 */
//	@Test
//	public void testGetDefinitionForValueSet() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link org.cts2.internal.profile.read.LexEvsValueSetDefinitionReadService#getEntities(java.net.URI, org.cts2.core.NameOrURIList, org.cts2.core.VersionTagReference, org.cts2.service.core.QueryControl, org.cts2.service.core.ReadContext)}.
//	 */
//	@Test
//	public void testGetEntities() {
//		fail("Not yet implemented");
//	}

	/**
	 * Test method for {@link org.cts2.internal.profile.read.LexEvsValueSetDefinitionReadService#read(java.net.URI, org.cts2.service.core.QueryControl, org.cts2.service.core.ReadContext)}.
	 * @throws URISyntaxException 
	 */
	@Test
	public void testRead() throws URISyntaxException {
		ValueSetDefinition vsd = this.lexEvsValueSetDefinitionReadService.read(new URI("CTS2TESTVSD"), null, null);
		
		System.out.println("vsd.about : " + vsd.getAbout());
		System.out.println("vsd.formal name : " + vsd.getFormalName());
		
		for (ValueSetDefinitionEntry de : vsd.getEntry())
		{
			System.out.println("ENTRY TYPE : " + de.getEntryType());
			System.out.println("OPERATOR : " + de.getOperator());
		}
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.cts2.internal.profile.read.LexEvsValueSetDefinitionReadService#resolve(java.net.URI, org.cts2.core.NameOrURIList, org.cts2.core.VersionTagReference, org.cts2.service.core.QueryControl, org.cts2.service.core.ReadContext)}.
	 */
	@Test
	public void testResolve() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.cts2.internal.profile.read.LexEvsValueSetDefinitionReadService#main(java.lang.String[])}.
	 */
	@Test
	public void testMain() {
		fail("Not yet implemented");
	}

}
