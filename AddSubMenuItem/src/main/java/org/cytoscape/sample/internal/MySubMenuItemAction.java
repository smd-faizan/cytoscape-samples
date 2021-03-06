package org.cytoscape.sample.internal;

import java.awt.event.ActionEvent;

import org.cytoscape.application.swing.AbstractCyAction;
import org.cytoscape.application.swing.CySwingApplication;
import javax.swing.JOptionPane;

public class MySubMenuItemAction extends AbstractCyAction {

	private CySwingApplication desktopApp;

	public MySubMenuItemAction(CySwingApplication desktopApp){
		// Add a sub-menu item -- Apps->Sample04->sample04
		super("My Sub MenuItem...");
		setPreferredMenu("Apps.My MenuItem");
		//setMenuGravity(2.0f);
		
		this.desktopApp = desktopApp;
	}
	
	/**
	 *  DOCUMENT ME!
	 *
	 * @param e DOCUMENT ME!
	 */
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this.desktopApp.getJFrame(), "My sub menuitem is clicked", "My message", 
				JOptionPane.INFORMATION_MESSAGE);
	}
}
