/** 
 * @author Abhijith Nagaraja
 * 
 * {@link FieldSet} is used to group the related widgets into one panel and also sets the caption or title for it.
 * */

package com.abhi.web.app.client.client.widgets;

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.FlowPanel;

public class FieldSet extends FlowPanel {

  private Element legend;

	public FieldSet() {
		Element fieldset = DOM.createFieldSet();
		this.legend = DOM.createLegend();
		DOM.appendChild(fieldset, legend);
		super.setElement(fieldset);
	}

	/**
	 * @return the caption that is set.
	 */
	public String getCaption() {
		return DOM.getInnerText(this.legend);
	}

	/**
	 * @param caption
	 *            : The title of the {@link FieldSet}
	 */
	public void setCaption(String caption) {
		DOM.setInnerText(this.legend, caption);
	}

	/**
	 * Do not override this method. This is necessary as, only one element can be set to the {@link DOM} and we want that to be {@link FieldSet}
	 */
	@Override
	protected void setElement(Element elem) {
		// Do Nothing
	}
}
