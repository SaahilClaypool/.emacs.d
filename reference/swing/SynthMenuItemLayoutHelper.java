_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/synth/SynthMenuItemLayoutHelper.java
class SynthMenuItemLayoutHelper extends MenuItemLayoutHelper {

/**
 * Calculates preferred size and layouts synth menu items.
 *
 * All JMenuItems (and JMenus) include enough space for the insets
 * plus one or more elements.  When we say "label" below, we mean
 * "icon and/or text."
 *
 * Cases to consider for SynthMenuItemUI (visualized here in a
 * LTR orientation; the RTL case would be reversed):
 *                   label
 *      check icon + label
 *      check icon + label + accelerator
 *                   label + accelerator
 *
 * Cases to consider for SynthMenuUI (again visualized here in a
 * LTR orientation):
 *                   label + arrow
 *
 * Note that in the above scenarios, accelerator and arrow icon are
 * mutually exclusive.  This means that if a popup menu contains a mix
 * of JMenus and JMenuItems, we only need to allow enough space for
 * max(maxAccelerator, maxArrow), and both accelerators and arrow icons
 * can occupy the same "column" of space in the menu.
 */
