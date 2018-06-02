# SortingAlgorithms

#### 项目介绍
排序算法实现,文件结构：  

- Sorting:排序算法父类  
- BubbleSorting:冒泡排序算法  
- SelectionSorting: 选择排序算法 
- QuickSorting: 快速排序算法  
- InsertionSorting: 直接插入排序算法 
- BinaryInsertionSorting: 二分法插入排序算法   
- ShellSorting: 希尔排序算法   
- SortingAlgorithmsMain: 工程测试验证主类

#### 软件架构

1. 所有排序算法需要继承Sorting父类，实现sort方法。
2. sort方法采取了泛型参数。
3. 所有待排数据列表中的数据对象需要实现Comparable接口（基本类型包装器对象已经实现了该接口）。
4. main方法测试类采用工厂方法和策略模式创建各个排序算法并进行排序。

#### 参与贡献

- seagle(yuanxiudong66@sina.com)


