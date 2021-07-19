# ff14_auto_spring
Spring 重构 C语言版的 ff14_auto

具有C语言版的所有功能，进一步支持 JSON 和 YAML 格式的曲谱文件。

和C语言版的不同之处是，它会判断连在一起的音符是否合法。如果不合法还会提醒你出错音符的具体位置，非常人性化。

### JSON 示例

```json
[
  {
    "clef": "C",
    "bpm": 120,
    "notes": [
      "1",
      "1",
      "5",
      "5",
      "6",
      "6",
      "5"
    ]
  },
  {
    "clef": "D",
    "bpm": 120,
    "notes": [
      "4",
      "4",
      "3",
      "3",
      "2",
      "2",
      "1"
    ]
  }
]
```

### YAML 示例

```yaml
-
  clef: "C"
  bpm: 120
  notes: 
    - "1"
    - "2"
    - "3"
    - "4"
-
  clef: "D"
  bpm: 120
  notes:
    - "1"
    - "2"
    - "3"

```
手写的话，相比原格式和JSON，我更推荐写YAML。VS Code 装一个yaml插件就能自动缩进，自动补全 ‘-’，写起来非常舒服。

当然以后会更新自动写谱（刚填一坑又挖一坑的我是鉴）