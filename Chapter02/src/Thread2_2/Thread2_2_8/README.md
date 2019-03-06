## 细化验证3个结论

- 当多个线程同时执行synchronized(x){}同步代码块时呈同步效果；

- 当其他线程执行x对象中的synchronized同步方法使呈同步效果；

- 当其他线程执行x对象方法里面的synchronized(this)代码块时也呈现同步效果。