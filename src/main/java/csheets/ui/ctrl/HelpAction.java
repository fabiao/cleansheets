/*
 * Copyright (c) 2005 Einar Pehrson <einar@pehrson.nu>.
 *
 * This file is part of
 * CleanSheets - a spreadsheet application for the Java platform.
 *
 * CleanSheets is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * CleanSheets is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with CleanSheets; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package csheets.ui.ctrl;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.KeyStroke;

import csheets.CleanSheets;

/**
 * An action for displaying the help.
 * @author Einar Pehrson
 */
@SuppressWarnings("serial")
public class HelpAction extends BaseAction {

	/**
	 * Creates a new help action.
	 */
	public HelpAction() {}

	protected String getName() {
		return "Contents...";
	}

	protected void defineProperties() {
		setEnabled(false);
		putValue(MNEMONIC_KEY, KeyEvent.VK_C);
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
		putValue(SMALL_ICON, new ImageIcon(CleanSheets.class.getResource("res/img/help.gif")));
	}

	public void actionPerformed(ActionEvent e) {}
}