package org.works.model;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration(locations = { "classpath:model/applicationContext-model-registry.xml" })
public class DomainModelTest extends AbstractTestNGSpringContextTests {

	@Test
	public void testModuleStartup() {
	}
}
