组合模式:
部分整体模式,创建了对象组的树形结构,将对象组合成树状结构
表示整体-部分的层次关系
依据树型结构组合对象，表示部分以及整体层次
这种类型的设计模式属性结构型模式
组合模式使得用户对单个对象和组合对象的访问具有一致性

注意事项和细节
简化客户端操作，不用考虑整体或部分叶子节点的问题
2具有较强的扩展性,更改组合对象，只需要调整内部层次关系,客户端不用改动
3客户端不用理会里面的组成细节,容易添加节点或者叶子节点从而创建复杂的树型结构
4需要遍历组织机构，或者而处理对象有树形结构,就适合组合模式
5具有较高的抽象性,如果叶子节点有差异的化,比如很多方法与树型都不一样，就不适合使用组合模式
