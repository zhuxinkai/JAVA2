/*
类与类之间最常见的关系主要有三种：
依赖，（uses-a)  , 聚合（has-a), 和继承 （is-a);





在线书店订单系统的主要功能是： 注册用户可以登录到网上书店选购图书，在线填写订单，并支付购书款时。
按用户留下的地址邮寄图书。
可以在这个系统中建立几个类，有图书（book),账户 （account) ,订单（ order) , 地址（ address)等

1.1 依赖
订单类（order) 需要访问用户帐户类 （account) ,所以在订单类中需要引用账户类。即订单类依赖账户类，但图书类不需要依赖账户类。

如果修改账户类，会影响到订单类。依赖的实质就是类中的方法可以操作另一个类的实例。
在实际的承诺涉及中，建议尽量减少互相依赖类的数量。

1.2 聚合

订单类包含了 图书类，因为订单类必须知道所有图书。

1.3 继承
































*/
