## 线程优先级

在操作系统中线程可以划分优先级，优先级较高的线程得到的CPU资源较多，也就是CPU优先执行优先级较高
的线程对象中的任务。

设置线程优先级使用setPrioity()方法，JDK源码如下：
```
public final void setPriority(int newPriority) {
    ThreadGroup g;
    checkAccess();
    if (newPriority > MAX_PRIORITY || newPriority < MIN_PRIORITY) {
        throw new IllegalArgumentException();
    }
    if((g = getThreadGroup()) != null) {
        if (newPriority > g.getMaxPriority()) {
            newPriority = g.getMaxPriority();
        }
        setPriority0(priority = newPriority);
    }
}

/**
 * The minimum priority that a thread can have.
 */
public final static int MIN_PRIORITY = 1;

/**
 * The default priority that is assigned to a thread.
 */
public final static int NORM_PRIORITY = 5;

/**
 * The maximum priority that a thread can have.
 */
public final static int MAX_PRIORITY = 10;
```
如果设置优先级不在1~10之间将抛出IllegalArgumentException异常。
