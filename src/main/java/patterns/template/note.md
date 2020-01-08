模板方法模式：
在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中。

例子：
咖啡和茶的冲泡方法都是 煮沸 冲泡 饮料倒入被子 加调料（可选）。
而模板实现 煮沸 和 饮料倒入 不同的子类 实现不同的冲泡 和 加调料的方法。

JDK 使用：
特殊例子：Arrays.sort() 方法 要求参数 实现Comparable 接口 并实现CompareTo方法  可以看成是模板方法；

InputStream 中的read()方法 由各个子类实现，而InputStream 本身的read(byte b[], int off, int len)方法中，
调用了read()方法

重点：
钩子的情况；
模板方法final标志 防止被修改顺序等 
