package v1;

import java.util.ArrayList;
import java.util.Collections;

public class Card {
	private String mask;
	private int value;
	private int icon;
	private String iconMask;
	private boolean isShow;

	// Card建構子
	public Card(String mask, int value, int icon, String iconMask, boolean isShow) {
		this.mask = mask;
		this.value = value;
		this.icon = icon;
		this.iconMask = iconMask;
		this.isShow = isShow;
	}

	public boolean isShow() {
		return isShow;
	}

	public void setShow(boolean isShow) {
		this.isShow = isShow;
	}

	public int getIcon() {
		return icon;
	}

	public void setIcon(int icon) {
		this.icon = icon;
	}

	public String getIconMask() {
		return iconMask;
	}

	public void setIconMask(String iconMask) {
		this.iconMask = iconMask;
	}

	public String getMask() {
		return mask;
	}

	public void setMask(String mask) {
		this.mask = mask;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
