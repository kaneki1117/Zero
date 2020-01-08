简单工厂：
简单工厂并不算是一种模式 更像是一种编程习惯


在orderPizza方法中 根据不同的type创建不同类型的pizza
if(type == cheese)  new CheesePizza
if(type == clam)  new CheesePizza

写在之前的逻辑中 无法对修改关闭，每增加一种 就需要修改代码；

提出PizzaFactory简单工厂，在简单工厂初始化。同时，其他的（比如披萨店菜单）需要获取Pizza也能从这边获取。

