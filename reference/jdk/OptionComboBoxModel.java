_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/OptionComboBoxModel.java
    public Option getInitialSelection() {

    /**
     * Fetches the Option item that represents that was
     * initially set to a selected state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/OptionComboBoxModel.java
    public void setInitialSelection(Option option) {

    /**
     * Stores the Option that has been marked its
     * selected attribute set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/OptionComboBoxModel.java
class OptionComboBoxModel<E> extends DefaultComboBoxModel<E> implements Serializable {

/**
 * OptionComboBoxModel extends the capabilities of the DefaultComboBoxModel,
 * to store the Option that is initially marked as selected.
 * This is stored, in order to enable an accurate reset of the
 * ComboBox that represents the SELECT form element when the
 * user requests a clear/reset.  Given that a combobox only allow
 * for one item to be selected, the last OPTION that has the
 * attribute set wins.
 *
  @author Sunita Mani
 */
