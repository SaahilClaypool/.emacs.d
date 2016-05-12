_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/threadpool/ThreadPoolManager.java
    public int getThreadPoolChooserNumericId(String componentId);

    /**
     * Gets the numeric index associated with the componentId specified for a
     * ThreadPoolChooser. This method would help the component call the more
     * efficient implementation i.e. getThreadPoolChooser(int componentIndex)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/threadpool/ThreadPoolManager.java
    public void setThreadPoolChooser(String componentId, ThreadPoolChooser aThreadPoolChooser);

    /**
     * Sets a ThreadPoolChooser for a particular componentId in the ThreadPoolManager. This
     * would enable any component to add a ThreadPoolChooser for their specific use
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/threadpool/ThreadPoolManager.java
    public ThreadPoolChooser getThreadPoolChooser(int componentIndex);

    /**
     * Return an instance of ThreadPoolChooser based on the componentIndex that was
     * passed as argument. This is added for improved performance so that the caller
     * does not have to pay the cost of computing hashcode for the componentId
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/threadpool/ThreadPoolManager.java
    public ThreadPoolChooser getThreadPoolChooser(String componentId);

    /**
     * Return an instance of ThreadPoolChooser based on the componentId that was
     * passed as argument
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/threadpool/ThreadPoolManager.java
    public ThreadPool getDefaultThreadPool();

    /**
    * Returns the first instance of ThreadPool in the ThreadPoolManager
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/threadpool/ThreadPoolManager.java
    public String getThreadPoolStringId(int numericIdForThreadpool);

    /**
    * Return a String Id for a numericId of a threadpool managed by the threadpool
    * manager
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/threadpool/ThreadPoolManager.java
    public int  getThreadPoolNumericId(String threadpoolId);

    /**
    * This method is used to return the numeric id of the threadpool, given a String
    * threadpoolId. This is used by the POA interceptors to add the numeric threadpool
    * Id, as a tagged component in the IOR. This is used to provide the functionality of
    * dedicated threadpool for EJB beans
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/threadpool/ThreadPoolManager.java
    public ThreadPool getThreadPool(int numericIdForThreadpool) throws NoSuchThreadPoolException;

    /**
    * This method will return an instance of the threadpool given a numeric threadpoolId.
    * This method will be used by the ORB to support the functionality of
    * dedicated threadpool for EJB beans
    *
    * @throws NoSuchThreadPoolException thrown when invalidnumericIdForThreadpool is passed
    * as a parameter
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/threadpool/ThreadPoolManager.java
    public ThreadPool getThreadPool(String threadpoolId) throws NoSuchThreadPoolException;

    /**
    * This method will return an instance of the threadpool given a threadpoolId,
    * that can be used by any component in the app. server.
    *
    * @throws NoSuchThreadPoolException thrown when invalid threadpoolId is passed
    * as a parameter
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/threadpool/ThreadPoolManager.java
    public int getThreadPoolChooserNumericId(String componentId);

    /**
     * Gets the numeric index associated with the componentId specified for a
     * ThreadPoolChooser. This method would help the component call the more
     * efficient implementation i.e. getThreadPoolChooser(int componentIndex)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/threadpool/ThreadPoolManager.java
    public void setThreadPoolChooser(String componentId, ThreadPoolChooser aThreadPoolChooser);

    /**
     * Sets a ThreadPoolChooser for a particular componentId in the ThreadPoolManager. This
     * would enable any component to add a ThreadPoolChooser for their specific use
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/threadpool/ThreadPoolManager.java
    public ThreadPoolChooser getThreadPoolChooser(int componentIndex);

    /**
     * Return an instance of ThreadPoolChooser based on the componentIndex that was
     * passed as argument. This is added for improved performance so that the caller
     * does not have to pay the cost of computing hashcode for the componentId
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/threadpool/ThreadPoolManager.java
    public ThreadPoolChooser getThreadPoolChooser(String componentId);

    /**
     * Return an instance of ThreadPoolChooser based on the componentId that was
     * passed as argument
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/threadpool/ThreadPoolManager.java
    public ThreadPool getDefaultThreadPool();

    /**
    * Returns the first instance of ThreadPool in the ThreadPoolManager
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/threadpool/ThreadPoolManager.java
    public String getThreadPoolStringId(int numericIdForThreadpool);

    /**
    * Return a String Id for a numericId of a threadpool managed by the threadpool
    * manager
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/threadpool/ThreadPoolManager.java
    public int  getThreadPoolNumericId(String threadpoolId);

    /**
    * This method is used to return the numeric id of the threadpool, given a String
    * threadpoolId. This is used by the POA interceptors to add the numeric threadpool
    * Id, as a tagged component in the IOR. This is used to provide the functionality of
    * dedicated threadpool for EJB beans
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/threadpool/ThreadPoolManager.java
    public ThreadPool getThreadPool(int numericIdForThreadpool) throws NoSuchThreadPoolException;

    /**
    * This method will return an instance of the threadpool given a numeric threadpoolId.
    * This method will be used by the ORB to support the functionality of
    * dedicated threadpool for EJB beans
    *
    * @throws NoSuchThreadPoolException thrown when invalidnumericIdForThreadpool is passed
    * as a parameter
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/threadpool/ThreadPoolManager.java
    public ThreadPool getThreadPool(String threadpoolId) throws NoSuchThreadPoolException;

    /**
    * This method will return an instance of the threadpool given a threadpoolId,
    * that can be used by any component in the app. server.
    *
    * @throws NoSuchThreadPoolException thrown when invalid threadpoolId is passed
    * as a parameter
    */
