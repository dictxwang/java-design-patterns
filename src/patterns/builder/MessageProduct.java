package patterns.builder;

public class MessageProduct implements IProduct {

	MessageNormal normalMessage = null;
	MessageError errorMessage = null;
	MessageWarning warningMessage = null;
	
	public void showAllMsg() {
		normalMessage.showMsgInfo();
		errorMessage.showMsgInfo();
		warningMessage.showMsgInfo();
	}

	/**
	 * @return the normalMessage
	 */
	public MessageNormal getNormalMessage() {
		return normalMessage;
	}

	/**
	 * @param normalMessage the normalMessage to set
	 */
	public void setNormalMessage(MessageNormal normalMessage) {
		this.normalMessage = normalMessage;
	}

	/**
	 * @return the errorMessage
	 */
	public MessageError getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(MessageError errorMessage) {
		this.errorMessage = errorMessage;
	}

	/**
	 * @return the warningMessage
	 */
	public MessageWarning getWarningMessage() {
		return warningMessage;
	}

	/**
	 * @param warningMessage the warningMessage to set
	 */
	public void setWarningMessage(MessageWarning warningMessage) {
		this.warningMessage = warningMessage;
	}
}
