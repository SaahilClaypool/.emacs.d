_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/SimpleBeanInfo.java
    public Image loadImage(final String resourceName) {

    /**
     * This is a utility method to help in loading icon images.
     * It takes the name of a resource file associated with the
     * current object's class file and loads an image object
     * from that file.  Typically images will be GIFs.
     * <p>
     * @param resourceName  A pathname relative to the directory
     *          holding the class file of the current class.  For example,
     *          "wombat.gif".
     * @return  an image object.  May be null if the load failed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/SimpleBeanInfo.java
    public Image getIcon(int iconKind) {

    /**
     * Claim there are no icons available.  You can override
     * this if you want to provide icons for your bean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/SimpleBeanInfo.java
    public BeanInfo[] getAdditionalBeanInfo() {

    /**
     * Claim there are no other relevant BeanInfo objects.  You
     * may override this if you want to (for example) return a
     * BeanInfo for a base class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/SimpleBeanInfo.java
    public MethodDescriptor[] getMethodDescriptors() {

    /**
     * Deny knowledge of methods. You can override this
     * if you wish to provide explicit method info.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/SimpleBeanInfo.java
    public int getDefaultEventIndex() {

    /**
     * Deny knowledge of a default event. You can override this
     * if you wish to define a default event for the bean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/SimpleBeanInfo.java
    public EventSetDescriptor[] getEventSetDescriptors() {

    /**
     * Deny knowledge of event sets. You can override this
     * if you wish to provide explicit event set info.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/SimpleBeanInfo.java
    public int getDefaultPropertyIndex() {

    /**
     * Deny knowledge of a default property. You can override this
     * if you wish to define a default property for the bean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/SimpleBeanInfo.java
    public PropertyDescriptor[] getPropertyDescriptors() {

    /**
     * Deny knowledge of properties. You can override this
     * if you wish to provide explicit property info.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/SimpleBeanInfo.java
    public BeanDescriptor getBeanDescriptor() {

    /**
     * Deny knowledge about the class and customizer of the bean.
     * You can override this if you wish to provide explicit info.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/SimpleBeanInfo.java
public class SimpleBeanInfo implements BeanInfo {

/**
 * This is a support class to make it easier for people to provide
 * BeanInfo classes.
 * <p>
 * It defaults to providing "noop" information, and can be selectively
 * overriden to provide more explicit information on chosen topics.
 * When the introspector sees the "noop" values, it will apply low
 * level introspection and design patterns to automatically analyze
 * the target bean.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/SimpleBeanInfo.java
    public Image loadImage(final String resourceName) {

    /**
     * This is a utility method to help in loading icon images.
     * It takes the name of a resource file associated with the
     * current object's class file and loads an image object
     * from that file.  Typically images will be GIFs.
     * <p>
     * @param resourceName  A pathname relative to the directory
     *          holding the class file of the current class.  For example,
     *          "wombat.gif".
     * @return  an image object.  May be null if the load failed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/SimpleBeanInfo.java
    public Image getIcon(int iconKind) {

    /**
     * Claim there are no icons available.  You can override
     * this if you want to provide icons for your bean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/SimpleBeanInfo.java
    public BeanInfo[] getAdditionalBeanInfo() {

    /**
     * Claim there are no other relevant BeanInfo objects.  You
     * may override this if you want to (for example) return a
     * BeanInfo for a base class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/SimpleBeanInfo.java
    public MethodDescriptor[] getMethodDescriptors() {

    /**
     * Deny knowledge of methods. You can override this
     * if you wish to provide explicit method info.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/SimpleBeanInfo.java
    public int getDefaultEventIndex() {

    /**
     * Deny knowledge of a default event. You can override this
     * if you wish to define a default event for the bean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/SimpleBeanInfo.java
    public EventSetDescriptor[] getEventSetDescriptors() {

    /**
     * Deny knowledge of event sets. You can override this
     * if you wish to provide explicit event set info.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/SimpleBeanInfo.java
    public int getDefaultPropertyIndex() {

    /**
     * Deny knowledge of a default property. You can override this
     * if you wish to define a default property for the bean.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/SimpleBeanInfo.java
    public PropertyDescriptor[] getPropertyDescriptors() {

    /**
     * Deny knowledge of properties. You can override this
     * if you wish to provide explicit property info.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/SimpleBeanInfo.java
    public BeanDescriptor getBeanDescriptor() {

    /**
     * Deny knowledge about the class and customizer of the bean.
     * You can override this if you wish to provide explicit info.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/beans/SimpleBeanInfo.java
public class SimpleBeanInfo implements BeanInfo {

/**
 * This is a support class to make it easier for people to provide
 * BeanInfo classes.
 * <p>
 * It defaults to providing "noop" information, and can be selectively
 * overriden to provide more explicit information on chosen topics.
 * When the introspector sees the "noop" values, it will apply low
 * level introspection and design patterns to automatically analyze
 * the target bean.
 */
