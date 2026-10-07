# LeetCode 题解（Java）

用 Java 刷 LeetCode 的记录，每题一个文件。

## 题目列表

| # | 题目 | 解法 | 时间 | 空间 | 代码 |
|---|------|------|------|------|------|
| 1 | [两数之和](https://leetcode.cn/problems/two-sum/) | 哈希表 | O(n) | O(n) | [TwoSum.java](src/TwoSum.java) |
| 27 | [移除元素](https://leetcode.cn/problems/remove-element/) | 数组搬移 | O(n²) | O(1) | [RemoveElement.java](src/RemoveElement.java) |

## 环境

- JDK 25
- IntelliJ IDEA

## 目录结构

```
leetcode/
├── src/              # 所有题解
│   ├── TwoSum.java
│   └── RemoveElement.java
├── .gitignore
└── README.md
```

## 约定

- 文件名用题目的英文名，大驼峰，如 `TwoSum.java`
- 每题一个类，类名与文件名一致
- 提交信息格式：`添加 XXX 题解`
