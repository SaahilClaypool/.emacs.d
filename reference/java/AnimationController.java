_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/java/swing/plaf/windows/AnimationController.java
class AnimationController implements ActionListener, PropertyChangeListener {

/**
 * A class to help mimic Vista theme animations.  The only kind of
 * animation it handles for now is 'transition' animation (this seems
 * to be the only animation which Vista theme can do). This is when
 * one picture fadein over another one in some period of time.
 * According to
 * https://connect.microsoft.com/feedback/ViewFeedback.aspx?FeedbackID=86852&SiteID=4
 * The animations are all linear.
 *
 * This class has a number of responsibilities.
 * <ul>
 *   <li> It trigger rapaint for the UI components involved in the animation
 *   <li> It tracks the animation state for every UI component involved in the
 *        animation and paints {@code Skin} in new {@code State} over the
 *        {@code Skin} in last {@code State} using
 *        {@code AlphaComposite.SrcOver.derive(alpha)} where {code alpha}
 *        depends on the state of animation
 * </ul>
 *
 * @author Igor Kushnirskiy
 */
