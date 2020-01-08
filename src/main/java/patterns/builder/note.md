生成器模式：
封装一个产品的构造过程，并允许按步骤构造；

例子:
进行输出文本，输出内容可能是XML YML TXT格式；
每种格式都是由 头部 Head 主体Body 文件尾Foot
最终输出成文件。

重点：
1.Builder接口，定义了如何构建各个部件，以及如何将部件装配到产品中去；
2.Director知道如何构建产品，也就是负责整体的构建算法，并且是分步骤进行。
（联想汽车的组装过程，Builder负责构建出轮子Wheel Engine等；
Director 对这些部件进行组装）

PersonalQuestion：感觉可以用模板方法替代？
