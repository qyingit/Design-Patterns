桥接模式：
1. 将实现与抽象放在两个不同的类层次中，
让两个层次可以独立改变，是一种结构型设计模式
2. bridge基于类的最小设计模式，通过使用封装,聚合跟继承等行为让不同的类
承担不同的职责，主要特点把抽象与行为实现分开，从而保持各个部分的独立及功能扩展


桥接模式代替多层继承方案，减少子类的个数，降低系统的管理和维护成本
桥接模式增加系统的理解和设计难度,由于聚合关系建立在抽象层，要求
开发者针对程序抽象进行设计
桥接模式要能正确的识别出系统两个独立变化的维度

常见的应用场景
jdbc驱动程序
银行转账系统
    转账分类
    转账用户分类
消息管理系统
    消息类型:及时消息，延时消息
    消息分类:手机短信,邮件信息,qq消息
