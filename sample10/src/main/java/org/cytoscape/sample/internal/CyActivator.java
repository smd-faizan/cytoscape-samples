package org.cytoscape.sample.internal;

import org.cytoscape.sample.internal.Sample10TaskFactory;


import org.osgi.framework.BundleContext;

import org.cytoscape.service.util.AbstractCyActivator;
import org.cytoscape.task.NetworkViewTaskFactory;

import java.util.Properties;



public class CyActivator extends AbstractCyActivator {
	public CyActivator() {
		super();
	}


	public void start(BundleContext bc) {

		Sample10TaskFactory sample10TaskFactory = new Sample10TaskFactory();
		
		
		Properties sample10TaskFactoryProps = new Properties();
		sample10TaskFactoryProps.setProperty("preferredMenu","Apps");
		sample10TaskFactoryProps.setProperty("menuGravity","11.0");
		sample10TaskFactoryProps.setProperty("title","Sample 10");
		registerService(bc,sample10TaskFactory,NetworkViewTaskFactory.class, sample10TaskFactoryProps);

		

	}
}

