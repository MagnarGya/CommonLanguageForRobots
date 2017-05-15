/*
 * generated by Xtext
 */
package org.xtext.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.xtext.ui.internal.CommonlangActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class CommonlangExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return CommonlangActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return CommonlangActivator.getInstance().getInjector(CommonlangActivator.ORG_XTEXT_COMMONLANG);
	}
	
}
