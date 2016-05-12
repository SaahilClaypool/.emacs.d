_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/Painter.java
@Deprecated

/**
 * This class is preserved for backward compatibility with JDK 6.
 *
 * @deprecated Use {@link javax.swing.Painter} instead.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/java/swing/Painter.java
@Deprecated

/**
 * This class is preserved for backward compatibility with JDK 6.
 *
 * @deprecated Use {@link javax.swing.Painter} instead.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/Painter.java
public interface Painter<T> {

/**
 * <p>A painting delegate. The Painter interface defines exactly one method,
 * <code>paint</code>. It is used in situations where the developer can change
 * the painting routine of a component without having to resort to subclassing
 * the component. It is also generically useful when doing any form of painting
 * delegation.</p>
 *
 * <p><code>Painter</code>s are simply encapsulations of Java2D code and make
 * it fairly trivial to reuse existing <code>Painter</code>s or to combine
 * them together. Implementations of this interface are also trivial to write,
 * such that if you can't find a <code>Painter</code> that does what you need,
 * you can write one with minimal effort. Writing a <code>Painter</code> requires
 * knowledge of Java2D.</p>
 *
 * <p>A <code>Painter</code> may be created with a type parameter. This type will be
 * expected in the <code>paint</code> method. For example, you may wish to write a
 * <code>Painter</code> that only works with subclasses of {@link java.awt.Component}.
 * In that case, when the <code>Painter</code> is declared, you may declare that
 * it requires a <code>Component</code>, allowing the paint method to be type safe. Ex:
 * <pre>
 * {@code
 * Painter<Component> p = new Painter<Component>() {
 *     public void paint(Graphics2D g, Component c, int width, int height) {
 *         g.setColor(c.getBackground());
 *         //and so forth
 *     }
 * }
 * }
 * </pre>
 *
 * <p>This interface makes no guarantees of threadsafety.</p>
 *
 * @author rbair
 */
