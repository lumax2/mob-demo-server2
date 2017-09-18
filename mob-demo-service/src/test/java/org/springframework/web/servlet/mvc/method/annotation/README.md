## spring-webmvc 定制说明

### 调整自定义参数解析器和返回值解析器位置顺序(优先级提前)
### 修改方式：修改test文件夹下RequestMappingHandlerAdapter，生成class文件再替换到原jar中对应路径。
```java
private List<HandlerMethodArgumentResolver> getDefaultArgumentResolvers() {
		List<HandlerMethodArgumentResolver> resolvers = new ArrayList<HandlerMethodArgumentResolver>();

		//edit by zhouzhipeng: custome first!!
		// Custom arguments
		if (getCustomArgumentResolvers() != null) {
			resolvers.addAll(getCustomArgumentResolvers());
		}

	
```

```java
	private List<HandlerMethodReturnValueHandler> getDefaultReturnValueHandlers() {
		List<HandlerMethodReturnValueHandler> handlers = new ArrayList<HandlerMethodReturnValueHandler>();

		//edit by zhouzhipeng ,custom first!!
		// Custom return value types
		if (getCustomReturnValueHandlers() != null) {
			handlers.addAll(getCustomReturnValueHandlers());
		}


	
```