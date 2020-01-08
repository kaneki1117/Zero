状态模式：
允许对象在内部状态改变时 改变他的行为，对象看起来好像修改了它的类。


例子：
糖果机： 有四种状态 NoQuarters HasQuarter Sold SoldOut
四个动作：
投入25分 NoQuarters -> HasQuarter
退回25分 HasQuarter -> NoQuarters
转动曲柄 HasQuarter -> Sold
发糖果   Sold -> NoQuarters

insertQuarter ejectQuarter turnCrank release 

初始时 4个动作对应4个函数；if else 嵌套 这种写法 没有遵循开放关闭原则 同时也没有把改变的部分包装起来等缺点。

修改后：
NoQuarterState
HasQuarterState
SoldState
SoldOutState
每个State下 都有4种动作 对应的状态。
State 的构造函数中 传入糖果机.


重点：
与策略模式的区别：
状态模式 将一群行为封装在对象中。用于多个条件判断的替代方案。
策略模式 不同组合的对象来改变行为，用于除了继承之外的一个弹性方案。

某个Context对象通常只有一个最适当的策略对象 而 随着时间流逝 状态模式各个状态游走改变 反映Context内部的状态。