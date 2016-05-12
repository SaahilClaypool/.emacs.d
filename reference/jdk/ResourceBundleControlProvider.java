_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/spi/ResourceBundleControlProvider.java
public interface ResourceBundleControlProvider {

/**
 * An interface for service providers that provide implementations of {@link
 * java.util.ResourceBundle.Control}. The <a
 * href="../ResourceBundle.html#default_behavior">default resource bundle loading
 * behavior</a> of the {@code ResourceBundle.getBundle} factory methods that take
 * no {@link java.util.ResourceBundle.Control} instance can be modified with {@code
 * ResourceBundleControlProvider} implementations.
 *
 * <p>Provider implementations must be packaged using the <a
 * href="../../../../technotes/guides/extensions/index.html">Java Extension
 * Mechanism</a> as installed extensions. Refer to {@link java.util.ServiceLoader}
 * for the extension packaging. Any installed {@code
 * ResourceBundleControlProvider} implementations are loaded using {@link
 * java.util.ServiceLoader} at the {@code ResourceBundle} class loading time.
 *
 * @author Masayoshi Okutsu
 * @since 1.8
 * @see ResourceBundle#getBundle(String, java.util.Locale, ClassLoader, ResourceBundle.Control)
 *      ResourceBundle.getBundle
 * @see java.util.ServiceLoader#loadInstalled(Class)
 */
