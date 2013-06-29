/** 
 * @author Abhijith Nagaraja
 * 
 * This demo shows the use of our widget and forms.
 * */
package com.abhi.web.app.client.client;

import com.abhi.web.app.client.client.widgets.FieldSet;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Gwt_form_layout implements EntryPoint {
	private static final String CONST_40_PCT = 40 + Unit.PCT.getType();
	private String CONST_SIZE_100_PCT = 100 + Unit.PCT.getType();
	TextBox forenameBox;
	private TextBox surnameBox;

	public void onModuleLoad() {
		Label forenameLabel = new Label();
		forenameLabel.setText("Forename: ");
		forenameLabel
				.setAutoHorizontalAlignment(HasHorizontalAlignment.ALIGN_LOCALE_END);
		forenameLabel.setSize(CONST_SIZE_100_PCT, CONST_SIZE_100_PCT);
		forenameBox = new TextBox();
		forenameBox.setSize(CONST_SIZE_100_PCT, CONST_SIZE_100_PCT);
		HorizontalPanel forenamePanel = new HorizontalPanel();
		forenamePanel.setSize(CONST_SIZE_100_PCT, CONST_SIZE_100_PCT);
		forenamePanel.add(forenameLabel);
		forenamePanel.add(forenameBox);
		forenamePanel.setCellWidth(forenameLabel, CONST_40_PCT);

		Label surnameLabel = new Label();
		surnameLabel.setText("Surname: ");
		surnameLabel
				.setAutoHorizontalAlignment(HasHorizontalAlignment.ALIGN_LOCALE_END);
		surnameLabel.setSize(CONST_SIZE_100_PCT, CONST_SIZE_100_PCT);
		surnameBox = new TextBox();
		surnameBox.setSize(CONST_SIZE_100_PCT, CONST_SIZE_100_PCT);
		HorizontalPanel surnamePanel = new HorizontalPanel();
		surnamePanel.setSize(CONST_SIZE_100_PCT, CONST_SIZE_100_PCT);
		surnamePanel.add(surnameLabel);
		surnamePanel.add(surnameBox);
		surnamePanel.setCellWidth(surnameLabel, CONST_40_PCT);

		Button saveButton = new Button();
		saveButton.setText("Save");
		saveButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				Window.alert("Welcome " + getForename() + " " + getSurname());
			}
		});

		VerticalPanel container = new VerticalPanel();
		container.setSize(CONST_SIZE_100_PCT, CONST_SIZE_100_PCT);
		container.setSpacing(15);
		container.add(forenamePanel);
		container.add(surnamePanel);
		container.add(saveButton);
		container.setCellHorizontalAlignment(saveButton,
				HasHorizontalAlignment.ALIGN_CENTER);

		FieldSet groupBox = new FieldSet();
		groupBox.setCaption("My Group");
		groupBox.add(container);
		groupBox.setSize(300 + Unit.PX.getType(), 150 + Unit.PX.getType());
		RootLayoutPanel.get().add(groupBox);
	}

	public String getForename() {
		return forenameBox.getValue();
	}

	public String getSurname() {
		return surnameBox.getValue();
	}
}
