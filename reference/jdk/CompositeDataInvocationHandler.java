_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/CompositeDataInvocationHandler.java
    public CompositeData getCompositeData() {

    /**
       Return the {@code CompositeData} that was supplied to the
       constructor.
       @return the {@code CompositeData} that this handler is backed
       by.  This is never null.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/CompositeDataInvocationHandler.java
    CompositeDataInvocationHandler(CompositeData compositeData,
                                   MXBeanLookup lookup) {

    /**
       <p>Construct a handler backed by the given {@code
       CompositeData}.</p>

       @param compositeData the {@code CompositeData} that will supply
       information to getters.

       @throws IllegalArgumentException if {@code compositeData}
       is null.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/CompositeDataInvocationHandler.java
public class CompositeDataInvocationHandler implements InvocationHandler {

/**
   <p>An {@link InvocationHandler} that forwards getter methods to a
   {@link CompositeData}.  If you have an interface that contains
   only getter methods (such as {@code String getName()} or
   {@code boolean isActive()}) then you can use this class in
   conjunction with the {@link Proxy} class to produce an implementation
   of the interface where each getter returns the value of the
   corresponding item in a {@code CompositeData}.</p>

   <p>For example, suppose you have an interface like this:

   <blockquote>
   <pre>
   public interface NamedNumber {
       public int getNumber();
       public String getName();
   }
   </pre>
   </blockquote>

   and a {@code CompositeData} constructed like this:

   <blockquote>
   <pre>
   CompositeData cd =
       new {@link CompositeDataSupport}(
           someCompositeType,
           new String[] {"number", "name"},
           new Object[] {<b>5</b>, "five"}
       );
   </pre>
   </blockquote>

   then you can construct an object implementing {@code NamedNumber}
   and backed by the object {@code cd} like this:

   <blockquote>
   <pre>
   InvocationHandler handler =
       new CompositeDataInvocationHandler(cd);
   NamedNumber nn = (NamedNumber)
       Proxy.newProxyInstance(NamedNumber.class.getClassLoader(),
                              new Class[] {NamedNumber.class},
                              handler);
   </pre>
   </blockquote>

   A call to {@code nn.getNumber()} will then return <b>5</b>.

   <p>If the first letter of the property defined by a getter is a
   capital, then this handler will look first for an item in the
   {@code CompositeData} beginning with a capital, then, if that is
   not found, for an item beginning with the corresponding lowercase
   letter or code point.  For a getter called {@code getNumber()}, the
   handler will first look for an item called {@code Number}, then for
   {@code number}.  If the getter is called {@code getnumber()}, then
   the item must be called {@code number}.</p>

   <p>If the method given to {@link #invoke invoke} is the method
   {@code boolean equals(Object)} inherited from {@code Object}, then
   it will return true if and only if the argument is a {@code Proxy}
   whose {@code InvocationHandler} is also a {@code
   CompositeDataInvocationHandler} and whose backing {@code
   CompositeData} is equal (not necessarily identical) to this
   object's.  If the method given to {@code invoke} is the method
   {@code int hashCode()} inherited from {@code Object}, then it will
   return a value that is consistent with this definition of {@code
   equals}: if two objects are equal according to {@code equals}, then
   they will have the same {@code hashCode}.</p>

   @since 1.6
*/
